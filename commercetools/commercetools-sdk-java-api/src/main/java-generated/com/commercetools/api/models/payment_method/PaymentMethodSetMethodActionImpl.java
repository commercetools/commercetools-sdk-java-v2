
package com.commercetools.api.models.payment_method;

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
 *  <p>This action generates the PaymentMethodMethodSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetMethodActionImpl implements PaymentMethodSetMethodAction, ModelBase {

    private String action;

    private String method;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodSetMethodActionImpl(@JsonProperty("method") final String method) {
        this.method = method;
        this.action = SET_METHOD;
    }

    /**
     * create empty instance
     */
    public PaymentMethodSetMethodActionImpl() {
        this.action = SET_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New payment method—for example, a credit card or cash advance. If empty, any existing value will be removed.</p>
     */

    public String getMethod() {
        return this.method;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodSetMethodActionImpl that = (PaymentMethodSetMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(method, that.method)
                .append(action, that.action)
                .append(method, that.method)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(method).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("method", method)
                .build();
    }

    @Override
    public PaymentMethodSetMethodAction copyDeep() {
        return PaymentMethodSetMethodAction.deepCopy(this);
    }
}
