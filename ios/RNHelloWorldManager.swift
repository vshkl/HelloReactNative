//
//  RNHelloWorldManager.swift
//  Hello
//
//  Created by Pavel Vashkel on 29/11/2022.
//

import Foundation
import React

@objc(RNHelloWorldManager)
class RNHelloWorldManager : RCTViewManager {
  
  override class func requiresMainQueueSetup() -> Bool {
    true
  }
  
  override func view() -> UIView! {
    return HelloWorldView()
  }
}
