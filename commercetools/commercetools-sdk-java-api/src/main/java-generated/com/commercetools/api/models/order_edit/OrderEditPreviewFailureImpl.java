
package com.commercetools.api.models.order_edit;

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
 *  <p>Result of a failed application of <code>stagedActions</code> to the Order. The data is calculated on the fly and is not queryable.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditPreviewFailureImpl implements OrderEditPreviewFailure, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditPreviewFailureImpl(
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        this.type = PREVIEW_FAILURE;
    }

    /**
     * create empty instance
     */
    public OrderEditPreviewFailureImpl() {
        this.type = PREVIEW_FAILURE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Errors returned.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditPreviewFailureImpl that = (OrderEditPreviewFailureImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(errors, that.errors)
                .append(type, that.type)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("errors", errors)
                .build();
    }

}
