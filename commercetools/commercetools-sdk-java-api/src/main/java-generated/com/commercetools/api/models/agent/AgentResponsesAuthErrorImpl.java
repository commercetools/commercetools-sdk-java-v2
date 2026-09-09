
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Authentication or authorization failure from a <span>/responses</span> request. Uses the standard <a href="https://docs.commercetools.com/apis/ctp:api:type:AuthErrorResponse" rel="nofollow">AuthErrorResponse</a> shape (<code>statusCode</code>, <code>message</code>, <code>errors</code>, plus OAuth <code>error</code> / <code>error_description</code>) rather than the <a href="https://docs.commercetools.com/apis/ctp:api:type:AgentResponsesErrorResponse" rel="nofollow">AgentResponsesErrorResponse</a> envelope used for other errors from this endpoint.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesAuthErrorImpl implements AgentResponsesAuthError, ModelBase {

    private Integer statusCode;

    private String message;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    private String error;

    private String errorDescription;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesAuthErrorImpl(@JsonProperty("statusCode") final Integer statusCode,
            @JsonProperty("message") final String message,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors,
            @JsonProperty("error") final String error,
            @JsonProperty("error_description") final String errorDescription) {
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
        this.error = error;
        this.errorDescription = errorDescription;
    }

    /**
     * create empty instance
     */
    public AgentResponsesAuthErrorImpl() {
    }

    /**
     *  <p>HTTP status code corresponding to the error.</p>
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *  <p>First error message in the <code>errors</code> array.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Authentication and authorization-related errors returned for a request.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     *  <p>Error code as per the <span>OAuth 2.0 specification</span>. For example: <code>"access_denied"</code>.</p>
     */

    public String getError() {
        return this.error;
    }

    /**
     *  <p>Plain text description of the first error.</p>
     */

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public void setStatusCode(final Integer statusCode) {
        this.statusCode = statusCode;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public void setErrorDescription(final String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesAuthErrorImpl that = (AgentResponsesAuthErrorImpl) o;

        return new EqualsBuilder().append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(error, that.error)
                .append(errorDescription, that.errorDescription)
                .append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(error, that.error)
                .append(errorDescription, that.errorDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(statusCode)
                .append(message)
                .append(errors)
                .append(error)
                .append(errorDescription)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("statusCode", statusCode)
                .append("message", message)
                .append("errors", errors)
                .append("error", error)
                .append("errorDescription", errorDescription)
                .build();
    }

    @Override
    public AgentResponsesAuthError copyDeep() {
        return AgentResponsesAuthError.deepCopy(this);
    }
}
