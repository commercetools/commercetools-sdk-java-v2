
package com.commercetools.api.models.payment;

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
 * PaymentMethodInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoImpl implements PaymentMethodInfo, ModelBase {

    private String paymentInterface;

    private String method;

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentMethodInfoImpl(@JsonProperty("paymentInterface") final String paymentInterface,
            @JsonProperty("method") final String method,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.paymentInterface = paymentInterface;
        this.method = method;
        this.name = name;
    }

    /**
     * create empty instance
     */
    public PaymentMethodInfoImpl() {
    }

    /**
     *  <p>Payment service that processes the Payment (for example, a PSP). Once set, it cannot be changed. The combination of <code>paymentInterface</code> and the <code>interfaceId</code> of a Payment must be unique.</p>
     */

    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment method used, for example, credit card, or cash advance.</p>
     */

    public String getMethod() {
        return this.method;
    }

    /**
     *  <p>Localizable name of the payment method.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setPaymentInterface(final String paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void setMethod(final String method) {
        this.method = method;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentMethodInfoImpl that = (PaymentMethodInfoImpl) o;

        return new EqualsBuilder().append(paymentInterface, that.paymentInterface)
                .append(method, that.method)
                .append(name, that.name)
                .append(paymentInterface, that.paymentInterface)
                .append(method, that.method)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(paymentInterface).append(method).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("paymentInterface", paymentInterface)
                .append("method", method)
                .append("name", name)
                .build();
    }

    @Override
    public PaymentMethodInfo copyDeep() {
        return PaymentMethodInfo.deepCopy(this);
    }
}
