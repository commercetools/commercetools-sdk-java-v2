
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
*  <p>The <code>Unique</code> <a href="/../api/projects/productTypes#attributeconstraint-enum">Attribute Constraint</a> was violated.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError {

    private String code;

    private String message;

    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("attribute") final com.commercetools.importapi.models.productvariants.Attribute attribute) {
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

    /**
    *  <p>The attribute in conflict.</p>
    */
    public com.commercetools.importapi.models.productvariants.Attribute getAttribute() {
        return this.attribute;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setAttribute(final com.commercetools.importapi.models.productvariants.Attribute attribute) {
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
