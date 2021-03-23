
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError {

    private String code;

    private String message;

    private com.commercetools.api.models.product.Attribute attribute;

    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("attribute") final com.commercetools.api.models.product.Attribute attribute) {
        this.message = message;
        this.attribute = attribute;
        this.code = DUPLICATE_ATTRIBUTE_VALUE;
    }

    public DuplicateAttributeValueErrorImpl() {
        this.code = DUPLICATE_ATTRIBUTE_VALUE;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.product.Attribute getAttribute() {
        return this.attribute;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setAttribute(final com.commercetools.api.models.product.Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateAttributeValueErrorImpl that = (DuplicateAttributeValueErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(attribute, that.attribute)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(attribute).toHashCode();
    }

}
