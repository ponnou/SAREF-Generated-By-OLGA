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

import w3id.org.saref.Property;
import w3id.org.saref.IDevice;
import w3id.org.saref.IMeasurement;
	


public  class Humidity implements IHumidity {

	Map<String, List<RefId>> relations;
	
	public Humidity(String id) {
		super();
		this.id = "https://w3id.org/saref#" + id;
		relations = new HashMap<String, List<RefId>>();
		isMeasuredByDeviceOnlyDevice = new ArrayList<>();
		isControlledByDeviceOnlyDevice = new ArrayList<>();
		relatesToMeasurementOnlyMeasurement = new ArrayList<>();
		
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
		return "https://w3id.org/saref#Humidity";
	}
	
	
	
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isMeasuredByDevice") 
	private List<RefId> isMeasuredByDeviceOnlyDevice;
	public void addisMeasuredByDeviceOnly(IDevice parameter)
	{
		isMeasuredByDeviceOnlyDevice.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#isControlledByDevice") 
	private List<RefId> isControlledByDeviceOnlyDevice;
	public void addisControlledByDeviceOnly(IDevice parameter)
	{
		isControlledByDeviceOnlyDevice.add(parameter.getRefId());
	}
			
	@JsonInclude(Include.NON_EMPTY)
	@JsonldProperty("https://w3id.org/saref#relatesToMeasurement") 
	private List<RefId> relatesToMeasurementOnlyMeasurement;
	public void addrelatesToMeasurementOnly(IMeasurement parameter)
	{
		relatesToMeasurementOnlyMeasurement.add(parameter.getRefId());
	}
			
	
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isMeasuredByDevice")
	public List<RefId> getisMeasuredByDeviceDevice()
	{
		return isMeasuredByDeviceOnlyDevice;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#isControlledByDevice")
	public List<RefId> getisControlledByDeviceDevice()
	{
		return isControlledByDeviceOnlyDevice;
	}
	@JsonInclude(Include.NON_EMPTY)
	@JsonProperty("https://w3id.org/saref#relatesToMeasurement")
	public List<RefId> getrelatesToMeasurementMeasurement()
	{
		return relatesToMeasurementOnlyMeasurement;
	}
	
}
