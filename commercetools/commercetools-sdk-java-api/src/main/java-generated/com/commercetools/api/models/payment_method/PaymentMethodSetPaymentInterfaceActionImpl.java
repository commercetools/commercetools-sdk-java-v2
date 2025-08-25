
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
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodPaymentInterfaceSetMessage" rel="nofollow">PaymentMethodPaymentInterfaceSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetPaymentInterfaceActionImpl implements PaymentMethodSetPaymentInterfaceAction, ModelBase {

    private String action;

    private String paymentInterface;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodSetPaymentInterfaceActionImpl(@JsonProperty("paymentInterface") final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        this.action = SET_PAYMENT_INTERFACE;
    }

    /**
     * create empty instance
     */
    public PaymentMethodSetPaymentInterfaceActionImpl() {
        this.action = SET_PAYMENT_INTERFACE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New payment service that processes the Payment—for example, a PSP. If empty, any existing value will be removed.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodSetPaymentInterfaceActionImpl that = (PaymentMethodSetPaymentInterfaceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentInterface, that.paymentInterface)
                .append(action, that.action)
                .append(paymentInterface, that.paymentInterface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentInterface).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentInterface", paymentInterface)
                .build();
    }

    @Override
    public PaymentMethodSetPaymentInterfaceAction copyDeep() {
        return PaymentMethodSetPaymentInterfaceAction.deepCopy(this);
    }
}
