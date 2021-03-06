package com.example.dongyuan.ucropdemo.constant;

import com.example.dongyuan.ucropdemo.MyApplication;
import com.example.dongyuan.ucropdemo.utils.FileUtil;

/**
 * 一些常量
 * Created by dong.yuan on 2017/5/19.
 */

public class AppConstant {
    //获得APP文件储存的根路径
    public static String APP_BASE_PATH = FileUtil.getDiskCacheDir(MyApplication.context, "ucrop");
    //头像储存路径
    public static String HEAD_PHOTO_PATH = APP_BASE_PATH + "head/";

}
