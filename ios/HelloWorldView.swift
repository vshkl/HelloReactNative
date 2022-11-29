//
//  HelloWorldView.swift
//  Hello
//
//  Created by Pavel Vashkel on 29/11/2022.
//

import Foundation

class HelloWorldView : UILabel {
  
  @objc var addressee: String = "" {
    didSet {
      self.setupView()
    }
  }
  
  private func setupView() {
    if (addressee.isEmpty) {
      self.text = "Hello World!"
    } else {
      self.text = "Hello \(addressee)!"
    }
  }
}
