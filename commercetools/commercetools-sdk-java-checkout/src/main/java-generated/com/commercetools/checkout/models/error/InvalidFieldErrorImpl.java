
package com.commercetools.checkout.models.error;

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
public class InvalidFieldErrorImpl implements InvalidFieldError, ModelBase {

    private String code;

    private String message;

    private String field;

    private java.lang.Object invalidValue;

    private java.util.List<String> allowedValues;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field,
            @JsonProperty("invalidValue") final java.lang.Object invalidValue,
            @JsonProperty("allowedValues") final java.util.List<String> allowedValues) {
        this.message = message;
        this.field = field;
        this.invalidValue = invalidValue;
        this.allowedValues = allowedValues;
        this.code = INVALID_FIELD;
    }

    /**
     * create empty instance
     */
    public InvalidFieldErrorImpl() {
        this.code = INVALID_FIELD;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The value $invalidValue is not valid for field $field."</code></p>
     */

    public String getMessage() {
        return this.message;
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

    public java.util.List<String> getAllowedValues() {
        return this.allowedValues;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setField(final String field) {
        this.field = field;
    }

    public void setInvalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
    }

    public void setAllowedValues(final String... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
    }

    public void setAllowedValues(final java.util.List<String> allowedValues) {
        this.allowedValues = allowedValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidFieldErrorImpl that = (InvalidFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .append(invalidValue, that.invalidValue)
                .append(allowedValues, that.allowedValues)
                .append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .append(invalidValue, that.invalidValue)
                .append(allowedValues, that.allowedValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(field)
                .append(invalidValue)
                .append(allowedValues)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("field", field)
                .append("invalidValue", invalidValue)
                .append("allowedValues", allowedValues)
                .build();
    }

    @Override
    public InvalidFieldError copyDeep() {
        return InvalidFieldError.deepCopy(this);
    }
}
