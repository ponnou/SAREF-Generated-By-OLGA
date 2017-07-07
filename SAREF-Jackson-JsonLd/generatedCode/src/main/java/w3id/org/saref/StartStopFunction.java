/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package w3id.org.saref;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldLink;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldPropertyType;

import saref.jsonld.util.RefId;

import w3id.org.saref.IStartCommand;  
import w3id.org.saref.IStopCommand;  
import w3id.org.saref.ActuatingFunction;
import w3id.org.saref.Function;
import w3id.org.saref.ICommand;
	


public  class StartStopFunction implements IStartStopFunction {

	Map<String, List<RefId>> relations;
	
	public StartStopFunction(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		hasCommandOnlyStartCommand = new ArrayList<>();
		hasCommandOnlyStopCommand = new ArrayList<>();
		hasCommandMinCommand = new ArrayList<>();
		
	}

	@JsonldId
	public String id;
	
	@JsonIgnore
	public RefId getRefId()
	{
		return new RefId(id);
	}
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("@type")
	public String getType()
	{
		return "https://w3id.org/saref#StartStopFunction";
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandOnlyStartCommand;
	public void addhasCommandOnly(IStartCommand parameter)
	{
		hasCommandOnlyStartCommand.add(parameter.getRefId());
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandOnlyStopCommand;
	public void addhasCommandOnly(IStopCommand parameter)
	{
		hasCommandOnlyStopCommand.add(parameter.getRefId());
	}
			
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#hasCommand") 
	private List<RefId> hasCommandMinCommand;
	public void addhasCommandMin1(ICommand parameter)
	{
		hasCommandMinCommand.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#hasCommand")
	public List<RefId> gethasCommandCommand()
	{
		return hasCommandMinCommand;
	}
	
}