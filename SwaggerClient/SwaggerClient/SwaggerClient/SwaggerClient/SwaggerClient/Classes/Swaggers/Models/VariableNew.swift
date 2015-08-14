//
// VariableNew.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class VariableNew: JSONEncodable {

    public enum CombinationOperation: String { 
        case MEAN = "MEAN"
        case SUM = "SUM"
    }
    
    /** User-defined variable display name. */
    public var name: String?
    /** Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc. */
    public var category: String?
    /** Abbreviated name of the default unit for the variable */
    public var unit: String?
    /** How to aggregate measurements over time. */
    public var combinationOperation: CombinationOperation?
    /** Parent */
    public var parent: String?
    

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["category"] = self.category
        nillableDictionary["unit"] = self.unit
        nillableDictionary["combinationOperation"] = self.combinationOperation?.rawValue
        nillableDictionary["parent"] = self.parent
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
