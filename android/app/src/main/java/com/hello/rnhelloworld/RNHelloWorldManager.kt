package com.hello.rnhelloworld

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.widget.TextView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class RNHelloWorldManager : SimpleViewManager<TextView>() {

    private companion object {
        const val REACT_NAME = "HelloWorld"
    }

    override fun getName(): String = REACT_NAME

    @SuppressLint("SetTextI18n")
    override fun createViewInstance(reactContext: ThemedReactContext): TextView {
        return TextView(reactContext).apply {
            text = "Hello World"
        }
    }
}
