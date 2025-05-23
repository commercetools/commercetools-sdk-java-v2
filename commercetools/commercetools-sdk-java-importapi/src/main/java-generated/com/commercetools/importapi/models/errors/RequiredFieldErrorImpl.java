
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
 *  <p>A required field is missing a value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequiredFieldErrorImpl implements RequiredFieldError, ModelBase {

    private String code;

    private String message;

    private String field;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RequiredFieldErrorImpl(@JsonProperty("message") final String message, @JsonProperty("field") final String field) {
        this.message = message;
        this.field = field;
        this.code = REQUIRED_FIELD;
    }

    /**
     * create empty instance
     */
    public RequiredFieldErrorImpl() {
        this.code = REQUIRED_FIELD;
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

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setField(final String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RequiredFieldErrorImpl that = (RequiredFieldErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .append(code, that.code)
                .append(message, that.message)
                .append(field, that.field)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(field).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("field", field)
                .build();
    }

    @Override
    public RequiredFieldError copyDeep() {
        return RequiredFieldError.deepCopy(this);
    }
}
