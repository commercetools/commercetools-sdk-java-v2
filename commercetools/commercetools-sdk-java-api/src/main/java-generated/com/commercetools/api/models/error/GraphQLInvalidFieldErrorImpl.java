
package com.commercetools.api.models.error;

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
 *  <p>Returned when a field has an invalid value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidFieldErrorImpl implements GraphQLInvalidFieldError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private String field;

    private java.lang.Object invalidValue;

    private java.util.List<java.lang.Object> allowedValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLInvalidFieldErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("field") final String field,
            @JsonProperty("invalidValue") final java.lang.Object invalidValue,
            @JsonProperty("allowedValues") final java.util.List<java.lang.Object> allowedValues) {
        this.values = values;
        this.field = field;
        this.invalidValue = invalidValue;
        this.allowedValues = allowedValues;
        this.code = INVALID_FIELD;
    }

    /**
     * create empty instance
     */
    public GraphQLInvalidFieldErrorImpl() {
        this.code = INVALID_FIELD;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Name of the field with the invalid value.</p>
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>Value invalid for the field.</p>
     */

    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     */

    public java.util.List<java.lang.Object> getAllowedValues() {
        return this.allowedValues;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setInvalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
    }

    public void setAllowedValues(final java.lang.Object... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
    }

    public void setAllowedValues(final java.util.List<java.lang.Object> allowedValues) {
        this.allowedValues = allowedValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLInvalidFieldErrorImpl that = (GraphQLInvalidFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(field, that.field)
                .append(invalidValue, that.invalidValue)
                .append(allowedValues, that.allowedValues)
                .append(code, that.code)
                .append(values, that.values)
                .append(field, that.field)
                .append(invalidValue, that.invalidValue)
                .append(allowedValues, that.allowedValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(field)
                .append(invalidValue)
                .append(allowedValues)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("field", field)
                .append("invalidValue", invalidValue)
                .append("allowedValues", allowedValues)
                .build();
    }

}
