package com.example.dongyuan.ucropdemo.utils;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * Created by dong.yuan on 2017/5/19.
 */

public class FileUtil {
    /**
     * 获取diskCache的文件完整路径
     *
     * @param context    上下文
     * @param uniqueName 目录名
     * @return diskCache的文件完整路径
     */
    public static String getDiskCacheDir(Context context, String uniqueName) {
        String cachePath;
        if (Environment.MEDIA_MOUNTED.equals(Environment
                .getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            cachePath = context.getExternalCacheDir().getPath();
        } else {
            cachePath = context.getCacheDir().getPath();
        }
        File dir = new File(cachePath + File.separator + uniqueName + File.separator);
        // 判断文件夹是否存在，不存在则创建
        if (!dir.exists()) {
            dir.mkdir();
        }
        return (cachePath + File.separator + uniqueName + File.separator);
    }
}
