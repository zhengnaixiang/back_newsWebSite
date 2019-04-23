package com.qf.newpaper.service.impl;


import com.qf.newpaper.mapper.AddNewPapeprDao;
import com.qf.newpaper.pojo.NewPaper;
import com.qf.newpaper.pojo.NewPaperType;
import com.qf.newpaper.service.AddNewPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XingDi@Jchvip.com
 * @date2019/4/1616:23
 */
@Service
public class AddNewPaperServiceImpl implements AddNewPaperService {
    @Autowired
    AddNewPapeprDao addNewPapeprDao;


    public boolean addNew(NewPaper newPaper) {
        int i = addNewPapeprDao.addNew(newPaper);
        if (i>0){
            return true;
        }
        return false;
    }
    public List<NewPaperType> showClass(){
        return addNewPapeprDao.showClass();
    }
}
