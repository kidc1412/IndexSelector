package com.kidc.indexselector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;


public class ToastUtil {
    private static Toast toast;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    @SuppressLint("ShowToast")
    public static Toast showShort(Context context, CharSequence message) {
        if (null == toast) {
            toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        } else {
            toast.setText(message);
        }
        toast.show();

        return toast;
    }
}
