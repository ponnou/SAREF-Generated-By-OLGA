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
import w3id.org.saref.IOffCommand;  
import w3id.org.saref.IOnCommand;  
import w3id.org.saref.IToggleCommand;  


public interface IOnOffFunction extends IActuatingFunction {


	public IRI iri();
			
	public void addHascommand_Only(IOffCommand parameter);
	public void addHascommand_Only(IOnCommand parameter);
	public void addHascommand_Only(IToggleCommand parameter);
			
	
}