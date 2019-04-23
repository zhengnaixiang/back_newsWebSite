package com.qf.newpaper.service;



import com.qf.newpaper.pojo.NewPaper;
import com.qf.newpaper.pojo.NewPaperType;

import java.util.List;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1616:22
 */
public interface AddNewPaperService {
    public boolean addNew(NewPaper newPaper);
    public List<NewPaperType> showClass();
}
