
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
 *  <p>Generated when the selected Shipping Method does not match the Cart anymore.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodDoesNotMatchCartImpl implements ShippingMethodDoesNotMatchCart, ModelBase {

    private String code;

    private String severity;

    private String message;

    private String correlationId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodDoesNotMatchCartImpl(@JsonProperty("severity") final String severity,
            @JsonProperty("message") final String message, @JsonProperty("correlationId") final String correlationId) {
        this.severity = severity;
        this.message = message;
        this.correlationId = correlationId;
        this.code = SHIPPING_METHOD_DOES_NOT_MATCH_CART;
    }

    /**
     * create empty instance
     */
    public ShippingMethodDoesNotMatchCartImpl() {
        this.code = SHIPPING_METHOD_DOES_NOT_MATCH_CART;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>`info`</p>
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Selected shipping method no longer matches cart.</p>
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

    public void setSeverity(final String severity) {
        this.severity = severity;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCorrelationId(final String correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodDoesNotMatchCartImpl that = (ShippingMethodDoesNotMatchCartImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(severity, that.severity)
                .append(message, that.message)
                .append(correlationId, that.correlationId)
                .append(code, that.code)
                .append(severity, that.severity)
                .append(message, that.message)
                .append(correlationId, that.correlationId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(severity)
                .append(message)
                .append(correlationId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("severity", severity)
                .append("message", message)
                .append("correlationId", correlationId)
                .build();
    }

    @Override
    public ShippingMethodDoesNotMatchCart copyDeep() {
        return ShippingMethodDoesNotMatchCart.deepCopy(this);
    }
}
