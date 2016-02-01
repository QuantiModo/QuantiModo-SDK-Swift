//
// ConnectorInfo.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class ConnectorInfo: JSONEncodable {

    /** Connector ID number */
    public var id: Int?
    /** True if the authenticated user has this connector enabled */
    public var connected: Bool?
    /** Error message. Empty if connected. */
    public var error: String?
    public var history: [ConnectorInfoHistoryItem]?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["connected"] = self.connected
        nillableDictionary["error"] = self.error
        nillableDictionary["history"] = self.history?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
