
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The import response contains an import operation for each import resource sent with an import request. Use it for tracking the progress of imports to a commercetools project.</p>
*  <p>This is a generic parent type. In practice, send a specific import request type (<code>CategoryImportRequest</code>, <code>OrderImportRequest</code>, etc.) to an import sink with a matching import type.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportResponseImpl implements ImportResponse {

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus;

    @JsonCreator
    ImportResponseImpl(
            @JsonProperty("operationStatus") final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ImportResponseImpl() {
    }

    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> getOperationStatus() {
        return this.operationStatus;
    }

    public void setOperationStatus(
            final com.commercetools.importapi.models.importoperations.ImportOperationStatus... operationStatus) {
        this.operationStatus = new ArrayList<>(Arrays.asList(operationStatus));
    }

    public void setOperationStatus(
            final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportResponseImpl that = (ImportResponseImpl) o;

        return new EqualsBuilder().append(operationStatus, that.operationStatus).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(operationStatus).toHashCode();
    }

}
