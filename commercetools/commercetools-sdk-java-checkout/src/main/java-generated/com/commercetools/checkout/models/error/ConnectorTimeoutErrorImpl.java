
package com.commercetools.checkout.models.error;

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
 *  <p>Returned when the payment <span>Connector</span> does not respond within the configured timeout of 30 seconds. The Connector may still be processing the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorTimeoutErrorImpl implements ConnectorTimeoutError, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ConnectorTimeoutErrorImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = CONNECTOR_TIMEOUT;
    }

    /**
     * create empty instance
     */
    public ConnectorTimeoutErrorImpl() {
        this.code = CONNECTOR_TIMEOUT;
    }

    /**
     *  <p>Error code, always <code>ConnectorTimeout</code>.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The connector did not respond within the configured timeout."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ConnectorTimeoutErrorImpl that = (ConnectorTimeoutErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public ConnectorTimeoutError copyDeep() {
        return ConnectorTimeoutError.deepCopy(this);
    }
}
