
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
 *  <p>Returned when an AttributeDefinition does not exist for an Attribute <code>name</code>.</p>
 *  <p>The error is returned as a failed response to the Change AttributeDefinition Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeNameDoesNotExistErrorImpl implements AttributeNameDoesNotExistError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String invalidAttributeName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AttributeNameDoesNotExistErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("invalidAttributeName") final String invalidAttributeName) {
        this.message = message;
        this.values = values;
        this.invalidAttributeName = invalidAttributeName;
        this.code = ATTRIBUTE_NAME_DOES_NOT_EXIST;
    }

    /**
     * create empty instance
     */
    public AttributeNameDoesNotExistErrorImpl() {
        this.code = ATTRIBUTE_NAME_DOES_NOT_EXIST;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Attribute definition for $attributeName does not exist on type $typeName."</code></p>
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
     *  <p>Non-existent Attribute name.</p>
     */

    public String getInvalidAttributeName() {
        return this.invalidAttributeName;
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

    public void setInvalidAttributeName(final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeNameDoesNotExistErrorImpl that = (AttributeNameDoesNotExistErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(invalidAttributeName, that.invalidAttributeName)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(invalidAttributeName, that.invalidAttributeName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(invalidAttributeName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("invalidAttributeName", invalidAttributeName)
                .build();
    }

    @Override
    public AttributeNameDoesNotExistError copyDeep() {
        return AttributeNameDoesNotExistError.deepCopy(this);
    }
}
