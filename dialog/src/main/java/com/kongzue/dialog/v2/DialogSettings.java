package com.kongzue.dialog.v2;

import android.support.annotation.ColorInt;
import android.support.annotation.IdRes;

import com.kongzue.dialog.util.BaseDialog;
import com.kongzue.dialog.util.ModalBaseDialog;

import java.util.ArrayList;
import java.util.List;

public class DialogSettings {
    
    public static final int THEME_LIGHT = 0;
    public static final int THEME_DARK = 1;
    
    public static final int TYPE_MATERIAL = 0;
    public static final int TYPE_KONGZUE = 1;
    public static final int TYPE_IOS = 2;
    
    //是否打印日志
    public static boolean DEBUGMODE = true;
    
    /*
     *  决定等待框、提示框以及iOS风格的对话框是否启用模糊背景
     */
    public static boolean use_blur = true;
    
    /*
     *  决定对话框的默认样式
     *  请使用 TYPE_MATERIAL、TYPE_KONGZUE、TYPE_IOS 赋值
     */
    public static int type = 0;
    
    /*
     *  决定对话框的模式（亮色和暗色两种）
     *  请使用 THEME_LIGHT、THEME_DARK 赋值
     */
    public static int dialog_theme = 0;
    
    /*
     *  决定对话框的默认背景色
     */
    public static int dialog_background_color = -1;
    
    /*
     *  决定提示框的模式（亮色和暗色两种）
     *  请使用 THEME_LIGHT、THEME_DARK 赋值
     */
    public static int tip_theme = 1;
    
    
    //文字大小设定
    //注意，此值必须大于0才生效，否则使用默认值。另外，我们使用的是dp单位，非sp单位，若有特殊需要请自行转换
    //另外，暂时不支持Material风格对话框设定字体大小
    /*
     *  决定对话框标题字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int dialog_title_text_size = 0;
    /*
     *  决定对话框内容文字字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int dialog_message_text_size = 0;
    /*
     *  决定输入框输入文本字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int dialog_input_text_size = 0;
    /*
     *  决定输入框按钮字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int dialog_button_text_size = 0;
    /*
     *  决定提示框字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int tip_text_size = 0;
    /*
     *  决定菜单文字字样大小（单位：dp）
     *  当值<=0时使用默认大小
     */
    public static int dialog_menu_text_size = 0;
    
    /*
     *  决定iOS风格时，默认按钮文字颜色(Color)
     *  当值=-1时使用默认蓝色
     */
    public static int ios_normal_button_color = -1;
    
    /*
     *  决定对话框组件默认是否可点击遮罩区域关闭
     */
    public static boolean dialog_cancelable_default = false;
    
    /*
     *  决定 Notification 默认字号（单位：dp）
     *  当值=-1时使用默认字号
     */
    public static int notification_text_size = -1;
    
    /*
     *  决定 Notification 默认文字颜色
     *  当值=-1时使用默认颜色
     */
    public static int notification_text_color = -1;
    
    /*
     *  此方法用于关闭所有已加载的 Dialog
     *  建议将它加在你的 Activity 的 onDestroy() 里调用
     */
    public static void unloadAllDialog(){
        BaseDialog.unloadAllDialog();
    }
}
