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
    [Class("https://w3id.org/saref#Sensor")]
    public interface ISensor  : IFunctionRelated
    {
	  ///<summary> function AddHasfunction_Some_SensingFunction</summary>  
	  ///<param name="ISensingFunction"></param>
      [Collection("https://w3id.org/saref#hasFunction")]
	  ICollection<ISensingFunction> AddHasfunction_Some_SensingFunction { get; set; }
	
	}
}