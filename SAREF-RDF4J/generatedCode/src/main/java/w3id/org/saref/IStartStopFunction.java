/**
* This file is automatically generated by OLGA
* @author OLGA
* @version 1.0
*/

package w3id.org.saref;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.vocabulary.RDF;

import w3id.org.saref.IActuatingFunction;  
import w3id.org.saref.IStartCommand;  
import w3id.org.saref.IStopCommand;  


public interface IStartStopFunction extends IActuatingFunction {


	public IRI iri();
			
	public void addHascommand_Only(IStartCommand parameter);
	public void addHascommand_Only(IStopCommand parameter);
			
	
}