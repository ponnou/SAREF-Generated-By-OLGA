/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/
package w3id.org.saref;

import saref.global.util.GLOBAL;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


import w3id.org.saref.IDevice;  
import w3id.org.saref.IMeasurement;  
	


public  class Property implements IProperty {

	IRI newInstance;
	
	public Property(String namespace, String instanceId) {
		super();
		newInstance = GLOBAL.factory.createIRI(namespace, instanceId);
		GLOBAL.model.add(newInstance, RDF.TYPE, GLOBAL.factory.createIRI("https://w3id.org/saref#Property"));
	}

	public IRI iri()
	{
		return newInstance;
	}

	
	public void addIsmeasuredbydevice_Only(IDevice parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#isMeasuredByDevice"), parameter.iri());
	}
	public void addIscontrolledbydevice_Only(IDevice parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#isControlledByDevice"), parameter.iri());
	}
	public void addRelatestomeasurement_Only(IMeasurement parameter)
	{
		GLOBAL.model.add(newInstance, GLOBAL.factory.createIRI("https://w3id.org/saref#relatesToMeasurement"), parameter.iri());
	}
	
}
