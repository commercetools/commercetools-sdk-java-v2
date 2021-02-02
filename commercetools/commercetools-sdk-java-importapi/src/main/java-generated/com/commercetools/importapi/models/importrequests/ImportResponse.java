
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.importoperations.ImportOperationStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The import response contains an import operation for each import resource sent with an import request. Use it for tracking the progress of imports to a commercetools project.</p>
*  <p>This is a generic parent type. In practice, send a specific import request type (<code>CategoryImportRequest</code>, <code>OrderImportRequest</code>, etc.) to an import sink with a matching import type.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportResponseImpl.class)
public interface ImportResponse {

    @NotNull
    @Valid
    @JsonProperty("operationStatus")
    public List<ImportOperationStatus> getOperationStatus();

    @JsonIgnore
    public void setOperationStatus(final ImportOperationStatus... operationStatus);

    public void setOperationStatus(final List<ImportOperationStatus> operationStatus);

    public static ImportResponse of() {
        return new ImportResponseImpl();
    }

    public static ImportResponse of(final ImportResponse template) {
        ImportResponseImpl instance = new ImportResponseImpl();
        instance.setOperationStatus(template.getOperationStatus());
        return instance;
    }

    public static ImportResponseBuilder builder() {
        return ImportResponseBuilder.of();
    }

    public static ImportResponseBuilder builder(final ImportResponse template) {
        return ImportResponseBuilder.of(template);
    }

    default <T> T withImportResponse(Function<ImportResponse, T> helper) {
        return helper.apply(this);
    }
}
