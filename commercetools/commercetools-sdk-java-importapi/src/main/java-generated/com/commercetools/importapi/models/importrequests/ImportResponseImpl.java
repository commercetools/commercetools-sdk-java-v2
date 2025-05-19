
package com.commercetools.importapi.models.importrequests;

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
 *  <p>A list of the ID's and validation statuses of newly created ImportOperations. Used as a response at each resource-specific import endpoint, for example, at Import Categories and Import ProductTypes.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportResponseImpl implements ImportResponse, ModelBase {

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportResponseImpl(
            @JsonProperty("operationStatus") final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * create empty instance
     */
    public ImportResponseImpl() {
    }

    /**
     *
     */

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

        return new EqualsBuilder().append(operationStatus, that.operationStatus)
                .append(operationStatus, that.operationStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(operationStatus).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("operationStatus", operationStatus)
                .build();
    }

    @Override
    public ImportResponse copyDeep() {
        return ImportResponse.deepCopy(this);
    }
}
