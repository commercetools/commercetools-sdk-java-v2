
package com.commercetools.checkout.models.responses;

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
 *  <p>Generated when the container element specified in the <code>expressId</code> option is not found in the DOM.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressContainerNotFoundImpl implements ExpressContainerNotFound, ModelBase {

    private String code;

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExpressContainerNotFoundImpl(@JsonProperty("severity") final String severity,
            @JsonProperty("message") final String message, @JsonProperty("correlationId") final String correlationId,
            @JsonProperty("payload") final java.lang.Object payload) {
        this.severity = severity;
        this.message = message;
        this.correlationId = correlationId;
        this.payload = payload;
        this.code = EXPRESS_CONTAINER_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public ExpressContainerNotFoundImpl() {
        this.code = EXPRESS_CONTAINER_NOT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>`error`</p>
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Express container not found.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     */

    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     *  <p>Contains the <code>id</code> of the container that was not found.</p>
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    public void setSeverity(final String severity) {
        this.severity = severity;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCorrelationId(final String correlationId) {
        this.correlationId = correlationId;
    }

    public void setPayload(final java.lang.Object payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExpressContainerNotFoundImpl that = (ExpressContainerNotFoundImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(severity, that.severity)
                .append(message, that.message)
                .append(correlationId, that.correlationId)
                .append(payload, that.payload)
                .append(code, that.code)
                .append(severity, that.severity)
                .append(message, that.message)
                .append(correlationId, that.correlationId)
                .append(payload, that.payload)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(severity)
                .append(message)
                .append(correlationId)
                .append(payload)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("severity", severity)
                .append("message", message)
                .append("correlationId", correlationId)
                .append("payload", payload)
                .build();
    }

    @Override
    public ExpressContainerNotFound copyDeep() {
        return ExpressContainerNotFound.deepCopy(this);
    }
}
