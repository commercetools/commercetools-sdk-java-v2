
package com.commercetools.history.models.change_history;

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
 * ErrorResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ErrorResponseImpl implements ErrorResponse, ModelBase {

    private Integer statusCode;

    private String message;

    private String error;

    private String errorDescription;

    private java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ErrorResponseImpl(@JsonProperty("statusCode") final Integer statusCode,
            @JsonProperty("message") final String message, @JsonProperty("error") final String error,
            @JsonProperty("error_description") final String errorDescription,
            @JsonProperty("errors") final java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors) {
        this.statusCode = statusCode;
        this.message = message;
        this.error = error;
        this.errorDescription = errorDescription;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public ErrorResponseImpl() {
    }

    /**
     *
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *
     */

    public String getError() {
        return this.error;
    }

    /**
     *
     */

    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.change_history.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public void setErrorDescription(final String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public void setErrors(final com.commercetools.history.models.change_history.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.history.models.change_history.ErrorObject> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ErrorResponseImpl that = (ErrorResponseImpl) o;

        return new EqualsBuilder().append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(error, that.error)
                .append(errorDescription, that.errorDescription)
                .append(errors, that.errors)
                .append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(error, that.error)
                .append(errorDescription, that.errorDescription)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(statusCode)
                .append(message)
                .append(error)
                .append(errorDescription)
                .append(errors)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("statusCode", statusCode)
                .append("message", message)
                .append("error", error)
                .append("errorDescription", errorDescription)
                .append("errors", errors)
                .build();
    }

    @Override
    public ErrorResponse copyDeep() {
        return ErrorResponse.deepCopy(this);
    }
}
