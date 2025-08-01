
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set MethodInfo Method update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoMethodSetMessagePayloadImpl
        implements PaymentMethodInfoMethodSetMessagePayload, ModelBase {

    private String type;

    private String method;

    private String oldMethod;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoMethodSetMessagePayloadImpl(@JsonProperty("method") final String method,
            @JsonProperty("oldMethod") final String oldMethod) {
        this.method = method;
        this.oldMethod = oldMethod;
        this.type = PAYMENT_METHOD_INFO_METHOD_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoMethodSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_INFO_METHOD_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Payment Method after the Set MethodInfo Method update action.</p>
     */

    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Payment Method before the Set MethodInfo Method update action.</p>
     */

    public String getOldMethod() {
        return this.oldMethod;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public void setOldMethod(final String oldMethod) {
        this.oldMethod = oldMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoMethodSetMessagePayloadImpl that = (PaymentMethodInfoMethodSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(method, that.method)
                .append(oldMethod, that.oldMethod)
                .append(type, that.type)
                .append(method, that.method)
                .append(oldMethod, that.oldMethod)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(method).append(oldMethod).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("method", method)
                .append("oldMethod", oldMethod)
                .build();
    }

    @Override
    public PaymentMethodInfoMethodSetMessagePayload copyDeep() {
        return PaymentMethodInfoMethodSetMessagePayload.deepCopy(this);
    }
}
