
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
 *  <p>Generated after a successful Set PaymentInterface update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodPaymentInterfaceSetMessagePayloadImpl
        implements PaymentMethodPaymentInterfaceSetMessagePayload, ModelBase {

    private String type;

    private String paymentInterface;

    private String oldPaymentInterface;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodPaymentInterfaceSetMessagePayloadImpl(@JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("oldPaymentInterface") final String oldPaymentInterface) {
        this.paymentInterface = paymentInterface;
        this.oldPaymentInterface = oldPaymentInterface;
        this.type = PAYMENT_METHOD_PAYMENT_INTERFACE_SET;
    }

    /**
     * create empty instance
     */
    public PaymentMethodPaymentInterfaceSetMessagePayloadImpl() {
        this.type = PAYMENT_METHOD_PAYMENT_INTERFACE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Payment interface of the Payment Method after the Set PaymentInterface update action.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment interface of the Payment Method before the Set PaymentInterface update action.</p>
     */

    public String getOldPaymentInterface() {
        return this.oldPaymentInterface;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void setOldPaymentInterface(final String oldPaymentInterface) {
        this.oldPaymentInterface = oldPaymentInterface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodPaymentInterfaceSetMessagePayloadImpl that = (PaymentMethodPaymentInterfaceSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(paymentInterface, that.paymentInterface)
                .append(oldPaymentInterface, that.oldPaymentInterface)
                .append(type, that.type)
                .append(paymentInterface, that.paymentInterface)
                .append(oldPaymentInterface, that.oldPaymentInterface)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(paymentInterface)
                .append(oldPaymentInterface)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("paymentInterface", paymentInterface)
                .append("oldPaymentInterface", oldPaymentInterface)
                .build();
    }

    @Override
    public PaymentMethodPaymentInterfaceSetMessagePayload copyDeep() {
        return PaymentMethodPaymentInterfaceSetMessagePayload.deepCopy(this);
    }
}
