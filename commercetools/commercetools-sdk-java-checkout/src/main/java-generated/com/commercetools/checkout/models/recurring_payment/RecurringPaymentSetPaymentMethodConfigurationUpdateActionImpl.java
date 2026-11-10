
package com.commercetools.checkout.models.recurring_payment;

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
 *  <p>Sets the PaymentMethodConfigurations of a RecurringPayment, replacing any existing ones. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl
        implements RecurringPaymentSetPaymentMethodConfigurationUpdateAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl(
            @JsonProperty("paymentMethodConfigurations") final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
        this.action = SET_PAYMENT_METHOD_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl() {
        this.action = SET_PAYMENT_METHOD_CONFIGURATION;
    }

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>PaymentMethod and Connector to set.</p>
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    public void setPaymentMethodConfigurations(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration... paymentMethodConfigurations) {
        this.paymentMethodConfigurations = new ArrayList<>(Arrays.asList(paymentMethodConfigurations));
    }

    public void setPaymentMethodConfigurations(
            final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.paymentMethodConfigurations = paymentMethodConfigurations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl that = (RecurringPaymentSetPaymentMethodConfigurationUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .append(action, that.action)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentMethodConfigurations).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentMethodConfigurations", paymentMethodConfigurations)
                .build();
    }

    @Override
    public RecurringPaymentSetPaymentMethodConfigurationUpdateAction copyDeep() {
        return RecurringPaymentSetPaymentMethodConfigurationUpdateAction.deepCopy(this);
    }
}
