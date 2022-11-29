//
//  RNHelloWorldManager.swift
//  Hello
//
//  Created by Pavel Vashkel on 29/11/2022.
//

import Foundation
import React

@objc(HelloWorldManager)
class HelloWorldManager : RCTViewManager {
  
  override func view() -> UIView! {
    let label = UILabel()
    label.text = "Hello World!"
    return label
  }
}
