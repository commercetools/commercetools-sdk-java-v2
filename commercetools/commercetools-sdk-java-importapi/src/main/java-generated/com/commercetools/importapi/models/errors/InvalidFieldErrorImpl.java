
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
*  <p>A given field is not supported.
*  This error occurs, for example, if the field <code>variants</code>, which is not supported by <a href="/product#productimport">Product Import</a>, is sent to the Product Import endpoint.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidFieldErrorImpl implements InvalidFieldError {

    private String code;

    private String message;

    private String field;

    private java.lang.Object invalidValue;

    private java.util.List<java.lang.Object> allowedValues;

    @JsonCreator
    InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field,
            @JsonProperty("invalidValue") final java.lang.Object invalidValue,
            @JsonProperty("allowedValues") final java.util.List<java.lang.Object> allowedValues) {
        this.message = message;
        this.field = field;
        this.invalidValue = invalidValue;
        this.allowedValues = allowedValues;
        this.code = INVALID_FIELD;
    }

    public InvalidFieldErrorImpl() {
        this.code = INVALID_FIELD;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    /**
    *  <p>The name of the field.</p>
    */
    public String getField() {
        return this.field;
    }

    /**
    *  <p>The invalid value.</p>
    */
    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    /**
    *  <p>The set of allowed values for the field, if any.</p>
    */
    public java.util.List<java.lang.Object> getAllowedValues() {
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

        InvalidFieldErrorImpl that = (InvalidFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
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

}
