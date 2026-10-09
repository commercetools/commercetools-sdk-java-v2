
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
 *  <p>Adds a PaymentMethodConfiguration to a RecurringPayment. Checkout only supports processing a RecurringPayment with one PaymentMethodConfiguration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl
        implements RecurringPaymentAddPaymentMethodConfigurationUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration paymentMethodConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl(
            @JsonProperty("paymentMethodConfiguration") final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration paymentMethodConfiguration) {
        this.paymentMethodConfiguration = paymentMethodConfiguration;
        this.action = ADD_PAYMENT_METHOD_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl() {
        this.action = ADD_PAYMENT_METHOD_CONFIGURATION;
    }

    /**
     *  <p>Type of update action to be performed on the RecurringPayment.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>PaymentMethod and Connector to add.</p>
     */

    public com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration getPaymentMethodConfiguration() {
        return this.paymentMethodConfiguration;
    }

    public void setPaymentMethodConfiguration(
            final com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration paymentMethodConfiguration) {
        this.paymentMethodConfiguration = paymentMethodConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl that = (RecurringPaymentAddPaymentMethodConfigurationUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(paymentMethodConfiguration, that.paymentMethodConfiguration)
                .append(action, that.action)
                .append(paymentMethodConfiguration, that.paymentMethodConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(paymentMethodConfiguration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("paymentMethodConfiguration", paymentMethodConfiguration)
                .build();
    }

    @Override
    public RecurringPaymentAddPaymentMethodConfigurationUpdateAction copyDeep() {
        return RecurringPaymentAddPaymentMethodConfigurationUpdateAction.deepCopy(this);
    }
}
