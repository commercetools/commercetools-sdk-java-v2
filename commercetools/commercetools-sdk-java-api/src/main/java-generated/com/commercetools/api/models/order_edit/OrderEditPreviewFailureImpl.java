
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderEditPreviewFailureImpl implements OrderEditPreviewFailure, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    @JsonCreator
    OrderEditPreviewFailureImpl(
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        this.type = PREVIEW_FAILURE;
    }

    public OrderEditPreviewFailureImpl() {
        this.type = PREVIEW_FAILURE;
    }

    public String getType() {
        return this.type;
    }

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

        return new EqualsBuilder().append(type, that.type).append(errors, that.errors).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(errors).toHashCode();
    }

}
