//
// UserVariables.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class UserVariables: JSONEncodable {

    /** User ID */
    public var user: Int?
    /** Common variable id */
    public var variableId: Int?
    /** Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect */
    public var durationOfAction: Int?
    /** fillingValue */
    public var fillingValue: Int?
    /** joinWith */
    public var joinWith: String?
    /** maximumAllowedValue */
    public var maximumAllowedValue: Float?
    /** minimumAllowedValue */
    public var minimumAllowedValue: Float?
    /** onsetDelay */
    public var onsetDelay: Int?
    /** Earliest measurement startTime that should be used in analysis in ISO format */
    public var experimentStartTime: String?
    /** Latest measurement startTime that should be used in analysis in ISO format */
    public var experimentEndTime: String?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["user"] = self.user
        nillableDictionary["variableId"] = self.variableId
        nillableDictionary["durationOfAction"] = self.durationOfAction
        nillableDictionary["fillingValue"] = self.fillingValue
        nillableDictionary["joinWith"] = self.joinWith
        nillableDictionary["maximumAllowedValue"] = self.maximumAllowedValue
        nillableDictionary["minimumAllowedValue"] = self.minimumAllowedValue
        nillableDictionary["onsetDelay"] = self.onsetDelay
        nillableDictionary["experimentStartTime"] = self.experimentStartTime
        nillableDictionary["experimentEndTime"] = self.experimentEndTime
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
