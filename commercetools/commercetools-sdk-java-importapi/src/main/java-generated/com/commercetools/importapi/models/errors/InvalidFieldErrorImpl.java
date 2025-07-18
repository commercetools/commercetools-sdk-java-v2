
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
 *  <p>A given field is not supported. This error occurs, for example, if the field <code>variants</code>, which is not supported by Product Import, is sent to the Product Import endpoint.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidFieldErrorImpl implements InvalidFieldError, ModelBase {

    private String code;

    private String message;

    private String field;

    private java.lang.Object invalidValue;

    private java.util.List<java.lang.Object> allowedValues;

    private Long resourceIndex;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field,
            @JsonProperty("invalidValue") final java.lang.Object invalidValue,
            @JsonProperty("allowedValues") final java.util.List<java.lang.Object> allowedValues,
            @JsonProperty("resourceIndex") final Long resourceIndex) {
        this.message = message;
        this.field = field;
        this.invalidValue = invalidValue;
        this.allowedValues = allowedValues;
        this.resourceIndex = resourceIndex;
        this.code = INVALID_FIELD;
    }

    /**
     * create empty instance
     */
    public InvalidFieldErrorImpl() {
        this.code = INVALID_FIELD;
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

    /**
     *  <p>The index of the resource in the import request that contains the invalid field.</p>
     */

    public Long getResourceIndex() {
        return this.resourceIndex;
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

    public void setResourceIndex(final Long resourceIndex) {
        this.resourceIndex = resourceIndex;
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
                .append(resourceIndex, that.resourceIndex)
                .append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .append(invalidValue, that.invalidValue)
                .append(allowedValues, that.allowedValues)
                .append(resourceIndex, that.resourceIndex)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(field)
                .append(invalidValue)
                .append(allowedValues)
                .append(resourceIndex)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("field", field)
                .append("invalidValue", invalidValue)
                .append("allowedValues", allowedValues)
                .append("resourceIndex", resourceIndex)
                .build();
    }

    @Override
    public InvalidFieldError copyDeep() {
        return InvalidFieldError.deepCopy(this);
    }
}
