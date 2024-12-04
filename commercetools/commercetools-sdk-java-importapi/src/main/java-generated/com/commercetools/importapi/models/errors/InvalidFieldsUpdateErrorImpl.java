
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
 *  <p>Returned when a field cannot be updated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidFieldsUpdateErrorImpl implements InvalidFieldsUpdateError, ModelBase {

    private String code;

    private String message;

    private java.util.List<String> fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidFieldsUpdateErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("fields") final java.util.List<String> fields) {
        this.message = message;
        this.fields = fields;
        this.code = INVALID_FIELD_UPDATE;
    }

    /**
     * create empty instance
     */
    public InvalidFieldsUpdateErrorImpl() {
        this.code = INVALID_FIELD_UPDATE;
    }

    /**
     *  <p>An error identifier.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The following fields are currently not supported for changes/updates"</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Fields that cannot be updated.</p>
     */

    public java.util.List<String> getFields() {
        return this.fields;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setFields(final String... fields) {
        this.fields = new ArrayList<>(Arrays.asList(fields));
    }

    public void setFields(final java.util.List<String> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidFieldsUpdateErrorImpl that = (InvalidFieldsUpdateErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(fields, that.fields)
                .append(code, that.code)
                .append(message, that.message)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("fields", fields)
                .build();
    }

}
