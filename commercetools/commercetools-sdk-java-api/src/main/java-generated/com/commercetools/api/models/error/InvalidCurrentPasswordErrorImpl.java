
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

/**
 *  <p>Returned when the current password of the Customer does not match.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on Customers.</li>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on My Customer Profile.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidCurrentPasswordErrorImpl implements InvalidCurrentPasswordError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidCurrentPasswordErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.message = message;
        this.values = values;
        this.code = INVALID_CURRENT_PASSWORD;
    }

    /**
     * create empty instance
     */
    public InvalidCurrentPasswordErrorImpl() {
        this.code = INVALID_CURRENT_PASSWORD;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The given current password does not match."</code></p>
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

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidCurrentPasswordErrorImpl that = (InvalidCurrentPasswordErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).toHashCode();
    }

}
