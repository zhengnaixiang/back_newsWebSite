package com.qf.userInfo.tools;

import com.qf.userInfo.pojo.UserInfo;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.UUID;

public class UserInfoUtlis {
    public static void setUser_img(CommonsMultipartFile file, UserInfo userInfo){
        String filename = file.getOriginalFilename();
        if(filename != null && !filename .equals("")){
            filename = UUID.randomUUID() + filename;
            String path = UserInfo.class.getResource("/").getPath();
            path = path.substring(0, path.indexOf("target")) + "src/main/webapp/images/" + filename;
            File save = new File(path);
            if (!save.exists()) {
                save.mkdirs();
            }
            try {
                file.transferTo(save);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String user_imageUrl = "images/" + filename;
            userInfo.setUser_imageUrl(user_imageUrl);
        }
    }
    public static void setObject(HttpServletRequest request,Object o){
        Class<?> uClass = o.getClass();
        Field[] fields = uClass.getDeclaredFields();
        try {
            for (Field f : fields) {
                f.setAccessible(true);
                String value = request.getParameter(f.getName());
                if(value != null && !"".equals(value)){
                    Class<?> type = f.getType();
                    if(type.equals(int.class)){
                        f.set(o,Integer.parseInt(value ));
                    }else {
                        f.set(o, value);
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
