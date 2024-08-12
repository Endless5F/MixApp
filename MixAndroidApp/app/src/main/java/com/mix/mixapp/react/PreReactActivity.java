package com.mix.mixapp.react;

import com.mix.mixapp.react.preloadreact.PreLoadReactActivity;

import javax.annotation.Nullable;

/**
 * Created by Song on 2017/2/13.
 */
public class PreReactActivity extends PreLoadReactActivity {

    @Nullable
    @Override
    protected String getMainComponentName() {
        return "HotRN";
    }

}
