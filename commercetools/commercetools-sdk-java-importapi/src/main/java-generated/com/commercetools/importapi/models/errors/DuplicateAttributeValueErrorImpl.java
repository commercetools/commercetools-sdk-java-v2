
package com.commercetools.importapi.models.errors;

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
 *  <p>The <code>Unique</code> AttributeConstraintEnum was violated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError, ModelBase {

    private String code;

    private String message;

    private com.commercetools.importapi.models.productvariants.Attribute attribute;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("attribute") final com.commercetools.importapi.models.productvariants.Attribute attribute) {
        this.message = message;
        this.attribute = attribute;
        this.code = DUPLICATE_ATTRIBUTE_VALUE;
    }

    /**
     * create empty instance
     */
    public DuplicateAttributeValueErrorImpl() {
        this.code = DUPLICATE_ATTRIBUTE_VALUE;
    }

    /**
     *  <p>An error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     */

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
                .append(code, that.code)
                .append(message, that.message)
                .append(attribute, that.attribute)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(attribute).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("attribute", attribute)
                .build();
    }

}
