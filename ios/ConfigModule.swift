//
//  ConfigModule.swift
//  AwesomeProject
//
//  Created by Girish Parate on 29/01/23.
//

import Foundation

@objc(ConfigModule)
class ConfigModule: NSObject {
  
  var BASE_URL = Bundle.main.object(forInfoDictionaryKey: "BASE_URL") as? String
  var BUILD_ENV = Bundle.main.object(forInfoDictionaryKey: "BUILD_ENV") as? String
  
  @objc
  static func requiresMainQueueSetup () -> Bool {
     return true
   }
  
  @objc
  func constantsToExport() -> [AnyHashable: Any]!{
     let parameters: [String: Any] = [
      "BASE_URL" : BASE_URL ?? "",
       "BUILD_ENV": BUILD_ENV ?? ""
     ]
     return parameters;
   }
  
}
