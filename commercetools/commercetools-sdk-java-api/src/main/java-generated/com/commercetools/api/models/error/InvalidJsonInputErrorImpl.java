
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
 *  <p>Returned when an invalid JSON input has been sent. Either the JSON is syntactically incorrect or does not conform to the expected shape (for example is missing a required field).</p>
 *  <p>The client application should validate the input according to the constraints described in the error message before sending the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidJsonInputErrorImpl implements InvalidJsonInputError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String detailedErrorMessage;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InvalidJsonInputErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("detailedErrorMessage") final String detailedErrorMessage) {
        this.message = message;
        this.values = values;
        this.detailedErrorMessage = detailedErrorMessage;
        this.code = INVALID_JSON_INPUT;
    }

    /**
     * create empty instance
     */
    public InvalidJsonInputErrorImpl() {
        this.code = INVALID_JSON_INPUT;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Request body does not contain valid JSON."</code></p>
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
     *  <p>Further explanation about why the JSON is invalid.</p>
     */

    public String getDetailedErrorMessage() {
        return this.detailedErrorMessage;
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

    public void setDetailedErrorMessage(final String detailedErrorMessage) {
        this.detailedErrorMessage = detailedErrorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InvalidJsonInputErrorImpl that = (InvalidJsonInputErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(detailedErrorMessage, that.detailedErrorMessage)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(detailedErrorMessage, that.detailedErrorMessage)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(detailedErrorMessage)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("detailedErrorMessage", detailedErrorMessage)
                .build();
    }

}
