//
// VoteDelete.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class VoteDelete: JSONEncodable {

    /** Cause variable name for the correlation to which the vote pertains */
    public var cause: String?
    /** Effect variable name for the correlation to which the vote pertains */
    public var effect: String?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["cause"] = self.cause
        nillableDictionary["effect"] = self.effect
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
