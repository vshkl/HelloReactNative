package com.hello.rnhelloworld

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class RNHelloWorldPackage : ReactPackage {

    override fun createNativeModules(
        reactContetx: ReactApplicationContext,
    ): MutableList<NativeModule> {
        return mutableListOf()
    }

    override fun createViewManagers(
        reactApplicationContext: ReactApplicationContext,
    ): MutableList<ViewManager<out View, out ReactShadowNode<*>>> {
        return mutableListOf(
            RNHelloWorldManager(),
        )
    }
}