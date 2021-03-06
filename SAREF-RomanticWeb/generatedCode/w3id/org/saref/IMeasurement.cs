///<summary> 
/// This file is automatically generated by OLGA
/// author OLGA
/// version 1.0 
///</summary> 

using RomanticWeb.Entities;
using RomanticWeb.Mapping.Attributes;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;
using System.Reflection;
using static System.Net.WebRequestMethods;

using w3id.org.saref;  
namespace w3id.org.saref
{
    [Class("https://w3id.org/saref#Measurement")]
    public interface IMeasurement : IEntity
    {
	  ///<summary> function AddIsmeasuredin_Exactly_1UnitOfMeasure</summary>  
	  ///<param name="IUnitOfMeasure"></param>
      [Collection("https://w3id.org/saref#isMeasuredIn")]
	  ICollection<IUnitOfMeasure> AddIsmeasuredin_Exactly_1UnitOfMeasure { get; set; }
	
	  ///<summary> function AddIsmeasuredin_Only_UnitOfMeasure</summary>  
	  ///<param name="IUnitOfMeasure"></param>
      [Collection("https://w3id.org/saref#isMeasuredIn")]
	  ICollection<IUnitOfMeasure> AddIsmeasuredin_Only_UnitOfMeasure { get; set; }
	
	  ///<summary> function AddRelatestoproperty_Exactly_1Property</summary>  
	  ///<param name="IProperty"></param>
      [Collection("https://w3id.org/saref#relatesToProperty")]
	  ICollection<IProperty> AddRelatestoproperty_Exactly_1Property { get; set; }
	
	  ///<summary> function AddRelatestoproperty_Only_Property</summary>  
	  ///<param name="IProperty"></param>
      [Collection("https://w3id.org/saref#relatesToProperty")]
	  ICollection<IProperty> AddRelatestoproperty_Only_Property { get; set; }
	
	  [Property("https://w3id.org/saref#hasTimestamp")]
	  DateTime Hastimestamp { get; set; }
			
	  [Property("https://w3id.org/saref#hasValue")]
	  Single Hasvalue { get; set; }
			
	}
}