package com.ilop.view;

import android.content.Context;

/**
 * @author skygge
 * @date 1/11/22.
 * GitHub：javofxu@github.com
 * email：skygge@yeah.net
 * description：一个打钩的小动画
 */
class DisplayUtil {

    static int dp2px(Context context, float dpValue) {
        if (context == null) return (int) (dpValue * 1.5f + 0.5f);
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
