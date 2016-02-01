//
// PostVote.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class PostVote: JSONEncodable {

    /** Cause variable name */
    public var cause: String?
    /** Effect variable name */
    public var effect: String?
    /** Vote: 0 (for implausible) or 1 (for plausible) */
    public var vote: Bool?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["cause"] = self.cause
        nillableDictionary["effect"] = self.effect
        nillableDictionary["vote"] = self.vote
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
