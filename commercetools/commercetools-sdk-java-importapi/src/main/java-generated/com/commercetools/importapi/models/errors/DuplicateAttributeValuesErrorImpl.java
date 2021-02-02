
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The CombinationUnique AttributeConstraint was violated.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateAttributeValuesErrorImpl implements DuplicateAttributeValuesError {

    private String code;

    private String message;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    @JsonCreator
    DuplicateAttributeValuesErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.message = message;
        this.attributes = attributes;
        this.code = DUPLICATE_ATTRIBUTE_VALUES;
    }

    public DuplicateAttributeValuesErrorImpl() {
        this.code = DUPLICATE_ATTRIBUTE_VALUES;
    }

    public String getCode() {
        return this.code;
    }

    /**
    *  <p>The error's description.</p>
    */
    public String getMessage() {
        return this.message;
    }

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DuplicateAttributeValuesErrorImpl that = (DuplicateAttributeValuesErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(message, that.message).append(attributes,
            that.attributes).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(attributes).toHashCode();
    }

}
