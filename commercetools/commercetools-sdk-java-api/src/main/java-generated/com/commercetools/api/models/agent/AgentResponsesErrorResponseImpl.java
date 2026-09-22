
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
 *  <p>Error response from a <span>/responses</span> request. Extends <a href="https://docs.commercetools.com/apis/ctp:api:type:ErrorResponse" rel="nofollow">ErrorResponse</a> with a <code>threadId</code> for support.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentResponsesErrorResponseImpl implements AgentResponsesErrorResponse, ModelBase {

    private Integer statusCode;

    private String message;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    private String threadId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentResponsesErrorResponseImpl(@JsonProperty("statusCode") final Integer statusCode,
            @JsonProperty("message") final String message,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors,
            @JsonProperty("threadId") final String threadId) {
        this.statusCode = statusCode;
        this.message = message;
        this.errors = errors;
        this.threadId = threadId;
    }

    /**
     * create empty instance
     */
    public AgentResponsesErrorResponseImpl() {
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
     *  <p>Errors returned for a request.</p>
     *  <p>A single error response can contain multiple errors if the errors are related to the same HTTP status code such as <code>400</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     *  <p>Identifier of the workflow run that raised the error. Present on errors raised once the workflow has started. Absent on errors raised while parsing the request, before the workflow starts.</p>
     */

    public String getThreadId() {
        return this.threadId;
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

    public void setThreadId(final String threadId) {
        this.threadId = threadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentResponsesErrorResponseImpl that = (AgentResponsesErrorResponseImpl) o;

        return new EqualsBuilder().append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(threadId, that.threadId)
                .append(statusCode, that.statusCode)
                .append(message, that.message)
                .append(errors, that.errors)
                .append(threadId, that.threadId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(statusCode)
                .append(message)
                .append(errors)
                .append(threadId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("statusCode", statusCode)
                .append("message", message)
                .append("errors", errors)
                .append("threadId", threadId)
                .build();
    }

    @Override
    public AgentResponsesErrorResponse copyDeep() {
        return AgentResponsesErrorResponse.deepCopy(this);
    }
}
