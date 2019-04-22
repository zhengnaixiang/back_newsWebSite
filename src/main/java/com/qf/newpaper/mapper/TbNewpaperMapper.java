package com.qf.newpaper.mapper;

import com.qf.newpaper.dto.*;
import com.qf.newpaper.vo.EditNewsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbNewpaperMapper {
    /**
     * 分页查询
     * @param orderStr
     * @param searchName
     * @return
     */
    public List<TbNewPaperDto> pageFuzzyselect
            (@Param("orderStr") String orderStr, @Param("search") String searchName);
    /*
    SELECT * FROM(SELECT b.*,class_name FROM(SELECT a.*,count(np_id)AS sunComment FROM (SELECT
 		np.np_id,np.np_title,np.user_alias,np.np_date,np.np_likes
 		FROM newpaper np
INNER JOIN
		`comment` c ON np.np_id = c.np_id WHERE np.np_status = 1 AND c.`status` = 1 ORDER BY np.np_id )as a GROUP BY np_id)AS b
		INNER JOIN class c1,class_newpaper cn,newpaper np1 WHERE b.np_id = cn.np_id AND c1.class_id = cn.class_id GROUP BY np_id)AS q
		WHERE np_title LIKE'%江南%'
*/

    /**
     * 根据 id 批量删除新闻
     * @param ids
     * @return
     */
    public Integer deleteNews(@Param("ids") String[] ids);
    /*update newpaper np,`comment` co set np.np_status = 0,co.`status` = 0
    where np.np_id in
        <foreach collection="ids" item="id" open="(" close=")" separator=",">
            #{id}
        </foreach>
    and co.np_id in
        <foreach collection="ids" item="id" open="(" close=")" separator=",">
            #{id}
        </foreach>*/


    /**
     * 查看新闻
     * @param npId
     * @return
     */
    public WatchNewsDto watchNews(@Param("npId") Integer npId);
    /*SELECT np.np_title AS title,np.np_content AS newContent,np.np_image AS img,
    np.np_date AS time,np.np_likes AS likes,COUNT(np.np_id) AS commentNum
    FROM newpaper np,`comment` c
    WHERE c.np_id = #{npId}
    AND c.np_id = np.np_id GROUP BY np_titl*/

    /**
     * 根据新闻id查询所有评论
     * @param npId
     * @return
     */
    public List<TbUserCommentDto> newsComment(@Param("npId") Integer npId);
    /*SELECT c.common_content AS commonContent,c.common_date AS commonDate,u.user_imageUrl AS userImageurl
    FROM `comment` c,userinfo u
    WHERE c.np_id = #{npId}
    AND c.user_id = u.user_id*/

    /**
     * 查看新闻
     * @param npId
     * @return
     */
    public WatchNewssDto watchNewss(@Param("npId") Integer npId);
    /*SELECT np.np_title AS title,np.np_content AS newContent,np.np_image AS img,c.class_name AS className
    FROM newpaper np, class c, class_newpaper cn
            WHERE
            np.np_id = #{npId} AND c.class_id = (SELECT class_id FROM class_newpaper WHERE np_id = #{npId} )
    GROUP BY np.np_id*/

    /**
     * 查看新闻分类
     * @return
     */
    public List<WatchClassNameDto> WatchClassName();
    /*SELECT class_name AS className FROM class*/

    /**
     * 修改新闻
     * @param editNewsVo
     * @return
     */
    public Integer editNews(EditNewsVo editNewsVo);


    public Integer editImg(@Param("img") String img,@Param("npId") Integer npId);

    public List<CommentAllDto> commentAll();
}
