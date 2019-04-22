package com.qf.newpaper.controller;

import com.github.pagehelper.PageInfo;
import com.qf.newpaper.dto.*;
import com.qf.newpaper.service.AllNewsService;
import com.qf.newpaper.tools.ValidatorCheck;
import com.qf.newpaper.vo.EditNewsVo;
import com.qf.newpaper.vo.NewPaperVo;
import com.qf.newpaper.vo.NewsDeleteVo;
import com.qf.newpaper.vo.WatchNewsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Api(tags = "新闻模块")
@Controller
@RequestMapping(value = "/newpaper")
public class AllNewsController {
    @Autowired
    private AllNewsService allNewsService;

    @ApiOperation(value = "newPaper的分页信息",notes = "分页模糊查询")
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    // @ResponseBody封包，@RequestBody 解包
    public NewPaperDto<TbNewPaperDto> getReceiveList
            (HttpServletRequest request, @Valid @RequestBody NewPaperVo newPaperVo,
             BindingResult errors) {

        // 后台校验分页插件
        ValidatorCheck.checkParameter(errors);

        //service返回的数据集
        PageInfo<TbNewPaperDto> list = allNewsService.pageFuzzyselect(newPaperVo);

        List<CommentAllDto> commentAllDtos = allNewsService.commentAll();

        for (int i = 0; i <commentAllDtos.size(); i++) {
            for (int j = 0; j < list.getSize(); j++) {
                if (commentAllDtos.get(i).getNpId() == list.getList().get(j).getNpId()){
                    list.getList().get(j).setSunComment(commentAllDtos.get(i).getSunComment());
                }
            }
        }
        System.out.println(list);

        //属性拷贝，返回为给前端的回应
        List<TbNewPaperDto> data = new ArrayList<TbNewPaperDto>();
        if (list.getList() != null) {
            for (TbNewPaperDto tbNewPaperDto : list.getList()) {
                TbNewPaperDto bean = new TbNewPaperDto();

                String time = tbNewPaperDto.getNpDate().toString();
                tbNewPaperDto.setTime(time);
                System.out.println(time);

                try {
                    BeanUtils.copyProperties(tbNewPaperDto, bean);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                data.add(bean);
            }
        }
        //4.2 接口返回参数，数据库返回属性的类型，data为返回参数实体中的泛型那个
        NewPaperDto<TbNewPaperDto> newPaperDto = new NewPaperDto(data);
        /*newPaperDto.setPageSize(2);
        System.out.println(newPaperDto);*/

        //4.3 完善newPaperDto其他参数
        newPaperDto.setPageNum(newPaperVo.getPageNum());//当前页
        newPaperDto.setPageSize(newPaperVo.getPageSize());//分页数
        newPaperDto.setTotalRecord(list.getTotal());  //总页数，返回long int有长度限制 int的取值范围为: -2^31——2^31-1,即-2147483648——2147483647

        //(总记录数+分页数-1)/分页数
        long totalPage = (newPaperDto.getTotalRecord() + newPaperVo.getPageSize() - 1) / newPaperVo.getPageSize();
        newPaperDto.setTotalPage(totalPage);
        System.out.println(":" + newPaperDto);
        /*System.out.println(newPaperVo);*/
        return newPaperDto;
    }


    @ApiOperation(value = "新闻删除",notes = "新闻批量删除")
    @ResponseBody
    @RequestMapping(value = "/deleteNew",method = RequestMethod.POST)
    public NewsDeleteDto deleteNews(@RequestBody NewsDeleteVo newsDeleteVo){
        NewsDeleteDto newsDeleteDto = new NewsDeleteDto();
        System.out.println(newsDeleteVo);
        if (newsDeleteVo.getNewsid().length > 0){
            Integer integer = allNewsService.deleteNews(newsDeleteVo.getNewsid());
            newsDeleteDto.setResult(integer);
        }

        return newsDeleteDto;
    }


    @ApiOperation(value = "根据id查看新闻",notes = "新闻查看")
    @ResponseBody
    @RequestMapping(value = "/watchNews",method = RequestMethod.POST)
    public WatchNewsDto watchNews(@RequestBody WatchNewsVo watchNewsVo){
        WatchNewsDto watchNewsDto = allNewsService.watchNews(watchNewsVo.getNpId());
        System.out.println(watchNewsDto);
        return watchNewsDto;
    }


    @ApiOperation(value = "根据id查看新闻",notes = "新闻编辑")
    @ResponseBody
    @RequestMapping(value = "/watchNewss",method = RequestMethod.POST)
        public WatchNewssDto watchNewss(@RequestBody WatchNewsVo watchNewsVo){
        WatchNewssDto watchNewssDto = allNewsService.watchNewss(watchNewsVo.getNpId());
        return watchNewssDto;
    }

    @ApiOperation(value = "查询所有新闻分类",notes = "查询新闻分类")
    @ResponseBody
    @RequestMapping(value = "/watchClassName",method = RequestMethod.POST)
    public List<WatchClassNameDto> watchClassName(){
        return allNewsService.watchClassName();
    }

    @ApiOperation(value = "根据id编辑新闻",notes = "新闻编辑")
    @ResponseBody
    @RequestMapping(value = "/editNews",method = RequestMethod.POST)
    public EditNewsDto editNews(@RequestBody EditNewsVo editNewsVo){
        System.out.println(editNewsVo);
        Integer integer = allNewsService.editNews(editNewsVo);
        EditNewsDto editNewsDto = new EditNewsDto();
        editNewsDto.setResult(integer);
        System.out.println(":::" + editNewsDto);
        return editNewsDto;
    }


    @ApiOperation(value = "上传头像",notes = "上传头像")
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public Object upload(@RequestParam("file") CommonsMultipartFile uploadFile,
                          @RequestParam("npId") Integer npId) throws IOException {
        System.out.println("111111111111111" + npId);
//        String path = "F:\\class\\新建文件夹 (2)\\" + uploadFile.getOriginalFilename();
        String img = UUID.randomUUID() + uploadFile.getOriginalFilename();
        String path = "F:\\class\\第三阶段\\新建文件夹 (2)\\back_newsWebSite\\src\\main\\webapp\\images\\" + img;
        System.out.println(path);
        File file = new File(path);
        uploadFile.transferTo(file);
        Integer integer = allNewsService.editImg("images/" + img,npId);
        return "editNews";
    }
}
