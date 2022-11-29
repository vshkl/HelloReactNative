//
//  RNHelloWorldManager.m
//  Hello
//
//  Created by Pavel Vashkel on 29/11/2022.
//

#import <Foundation/Foundation.h>
#import "React/RCTViewManager.h"

@interface RCT_EXTERN_MODULE(RNHelloWorldManager, RCTViewManager)
RCT_EXPORT_VIEW_PROPERTY(addressee, NSString)
@end
