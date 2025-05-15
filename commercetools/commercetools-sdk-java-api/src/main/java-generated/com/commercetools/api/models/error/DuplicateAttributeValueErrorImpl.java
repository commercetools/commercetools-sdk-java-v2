
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when the <code>Unique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DuplicateAttributeValueErrorImpl implements DuplicateAttributeValueError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.product.Attribute attribute;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DuplicateAttributeValueErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("attribute") final com.commercetools.api.models.product.Attribute attribute) {
        this.message = message;
        this.values = values;
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
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Attribute can't have the same value in a different variant."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Conflicting Attributes.</p>
     */

    public com.commercetools.api.models.product.Attribute getAttribute() {
        return this.attribute;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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
                .append(values, that.values)
                .append(attribute, that.attribute)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(attribute, that.attribute)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).append(attribute).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("attribute", attribute)
                .build();
    }

    @Override
    public DuplicateAttributeValueError copyDeep() {
        return DuplicateAttributeValueError.deepCopy(this);
    }
}
