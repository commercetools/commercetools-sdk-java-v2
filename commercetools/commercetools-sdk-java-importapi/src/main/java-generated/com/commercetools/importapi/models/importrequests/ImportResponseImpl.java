package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.importoperations.ImportOperationStatus;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>The import response contains an import operation for each import resource sent with an import request. Use it for tracking the progress of imports to a commercetools project.</p>
*  <p>This is a generic parent type. In practice, send a specific import request type (<code>CategoryImportRequest</code>, <code>OrderImportRequest</code>, etc.) to an import sink with a matching import type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportResponseImpl implements ImportResponse {

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus;

    @JsonCreator
    ImportResponseImpl(@JsonProperty("operationStatus") final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
    }
    public ImportResponseImpl() {
       
    }

    
    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> getOperationStatus(){
        return this.operationStatus;
    }

    public void setOperationStatus(final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus){
        this.operationStatus = operationStatus;
    }

}
