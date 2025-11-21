
package com.commercetools.checkout.models.application;

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
 * PaymentsConfiguration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentsConfigurationImpl implements PaymentsConfiguration, ModelBase {

    private String paymentReturnUrl;

    private com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentsConfigurationImpl(@JsonProperty("paymentReturnUrl") final String paymentReturnUrl,
            @JsonProperty("activePaymentComponentType") final com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType) {
        this.paymentReturnUrl = paymentReturnUrl;
        this.activePaymentComponentType = activePaymentComponentType;
    }

    /**
     * create empty instance
     */
    public PaymentsConfigurationImpl() {
    }

    /**
     *  <p>URL where the buyer will be redirected back to after an offsite payment.</p>
     */

    public String getPaymentReturnUrl() {
        return this.paymentReturnUrl;
    }

    /**
     *  <p>Indicates the type of payment components that the Application will use.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentComponentType getActivePaymentComponentType() {
        return this.activePaymentComponentType;
    }

    public void setPaymentReturnUrl(final String paymentReturnUrl) {
        this.paymentReturnUrl = paymentReturnUrl;
    }

    public void setActivePaymentComponentType(
            final com.commercetools.checkout.models.payment_integration.PaymentComponentType activePaymentComponentType) {
        this.activePaymentComponentType = activePaymentComponentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentsConfigurationImpl that = (PaymentsConfigurationImpl) o;

        return new EqualsBuilder().append(paymentReturnUrl, that.paymentReturnUrl)
                .append(activePaymentComponentType, that.activePaymentComponentType)
                .append(paymentReturnUrl, that.paymentReturnUrl)
                .append(activePaymentComponentType, that.activePaymentComponentType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(paymentReturnUrl).append(activePaymentComponentType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("paymentReturnUrl", paymentReturnUrl)
                .append("activePaymentComponentType", activePaymentComponentType)
                .build();
    }

    @Override
    public PaymentsConfiguration copyDeep() {
        return PaymentsConfiguration.deepCopy(this);
    }
}
