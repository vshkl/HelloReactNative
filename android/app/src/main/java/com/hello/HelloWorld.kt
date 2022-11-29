package com.hello

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManager

object HelloWorld {

  class Manager : SimpleViewManager<TextView>() {

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

  class Package : ReactPackage {

    override fun createNativeModules(
      reactContetx: ReactApplicationContext,
    ): MutableList<NativeModule> {
      return mutableListOf()
    }

    override fun createViewManagers(
      reactApplicationContext: ReactApplicationContext,
    ): MutableList<ViewManager<out View, out ReactShadowNode<*>>> {
      return mutableListOf(
        Manager(),
      )
    }
  }
}
