package com.qf.newpaper.mapper;



import com.qf.newpaper.pojo.NewPaper;
import com.qf.newpaper.pojo.NewPaperType;

import java.util.List;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1615:03
 */
public interface AddNewPapeprDao {
    public int addNew(NewPaper newPaper);

    public List<NewPaperType> showClass();
}
