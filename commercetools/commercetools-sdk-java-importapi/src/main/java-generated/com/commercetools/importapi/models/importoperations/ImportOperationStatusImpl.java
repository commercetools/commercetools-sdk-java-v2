
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ImportOperationStatus
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportOperationStatusImpl implements ImportOperationStatus, ModelBase {

    private String operationId;

    private com.commercetools.importapi.models.importoperations.ImportOperationState state;

    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportOperationStatusImpl(@JsonProperty("operationId") final String operationId,
            @JsonProperty("state") final com.commercetools.importapi.models.importoperations.ImportOperationState state,
            @JsonProperty("errors") final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.operationId = operationId;
        this.state = state;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public ImportOperationStatusImpl() {
    }

    /**
     *  <p>The ID of the ImportOperation.</p>
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     *  <p>The validation state of the ImportOperation.</p>
     */

    public com.commercetools.importapi.models.importoperations.ImportOperationState getState() {
        return this.state;
    }

    /**
     *  <p>The validation errors for the ImportOperation. See Errors.</p>
     */

    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setOperationId(final String operationId) {
        this.operationId = operationId;
    }

    public void setState(final com.commercetools.importapi.models.importoperations.ImportOperationState state) {
        this.state = state;
    }

    public void setErrors(final com.commercetools.importapi.models.errors.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportOperationStatusImpl that = (ImportOperationStatusImpl) o;

        return new EqualsBuilder().append(operationId, that.operationId)
                .append(state, that.state)
                .append(errors, that.errors)
                .append(operationId, that.operationId)
                .append(state, that.state)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(operationId).append(state).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("operationId", operationId)
                .append("state", state)
                .append("errors", errors)
                .build();
    }

}
