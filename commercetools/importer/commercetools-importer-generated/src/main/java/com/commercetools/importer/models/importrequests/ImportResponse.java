package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.importoperations.ImportOperationStatus;
import com.commercetools.importer.models.importrequests.ImportResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>The import response contains an import operation for each import resource sent with an import request. Use it for tracking the progress of imports to a commercetools project.</p>
*  <p>This is a generic parent type. In practice, send a specific import request type (<code>CategoryImportRequest</code>, <code>OrderImportRequest</code>, etc.) to an import sink with a matching import type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportResponseImpl.class)
public interface ImportResponse  {

    
    @NotNull
    @Valid
    @JsonProperty("operationStatus")
    public List<ImportOperationStatus> getOperationStatus();

    public void setOperationStatus(final List<ImportOperationStatus> operationStatus);

    public static ImportResponseImpl of(){
        return new ImportResponseImpl();
    }
    

    public static ImportResponseImpl of(final ImportResponse template) {
        ImportResponseImpl instance = new ImportResponseImpl();
        instance.setOperationStatus(template.getOperationStatus());
        return instance;
    }

}
