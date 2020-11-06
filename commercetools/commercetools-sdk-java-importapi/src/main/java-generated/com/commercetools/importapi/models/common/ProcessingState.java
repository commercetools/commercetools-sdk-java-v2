package com.commercetools.importapi.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This enumeration describes the processing state of an import operation.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public enum ProcessingState {

    /**
    	<p>The validation of the import resource failed.</p>
    	
    */
    @JsonProperty("ValidationFailed")
    VALIDATION_FAILED("ValidationFailed"),
    
    /**
    	<p>This is an initial state of the import resource, it might contain unresolved references and needs to be resolved further.</p>
    	
    */
    @JsonProperty("Unresolved")
    UNRESOLVED("Unresolved"),
    
    /**
    	<p>Wait for a master variant to arrive. The product import has required attributes and thus requires a master variant that provides those.</p>
    	
    */
    @JsonProperty("WaitForMasterVariant")
    WAIT_FOR_MASTER_VARIANT("WaitForMasterVariant"),
    
    /**
    	<p>The import resource was imported successfully.</p>
    	
    */
    @JsonProperty("Imported")
    IMPORTED("Imported"),
    
    /**
    	<p>The import resource is being deleted.</p>
    	
    */
    @JsonProperty("Delete")
    DELETE("Delete"),
    
    /**
    	<p>The import resource was deleted successfully.</p>
    	
    */
    @JsonProperty("Deleted")
    DELETED("Deleted"),
    
    /**
    	<p>The import resource couldn't be imported or deleted after several retries.</p>
    	
    */
    @JsonProperty("Rejected")
    REJECTED("Rejected");

    private final String jsonName;

    private ProcessingState(final String jsonName) {
        this.jsonName = jsonName;
    }

    public String getJsonName() {
        return jsonName;
    }

    public static Optional<ProcessingState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
}
