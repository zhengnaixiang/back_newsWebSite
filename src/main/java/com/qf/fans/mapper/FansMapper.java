package com.qf.fans.mapper;

import com.qf.fans.dto.FansDto;
import com.qf.fans.vo.FansVo;

import java.util.List;


public interface FansMapper {

    /**
     * 获取粉丝列表数，并按照粉丝数进行降序输出
     * @return
     */
    public List<FansDto> getAllFansData(FansVo fansVo);
}
