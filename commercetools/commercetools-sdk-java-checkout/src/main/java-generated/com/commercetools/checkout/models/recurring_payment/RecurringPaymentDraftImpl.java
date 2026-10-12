
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
 *  <p>Draft type to create a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:RecurringPayment" rel="nofollow">RecurringPayment</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentDraftImpl implements RecurringPaymentDraft, ModelBase {

    private String key;

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    private java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringPaymentDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("recurringOrder") final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder,
            @JsonProperty("paymentMethodConfigurations") final java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> paymentMethodConfigurations) {
        this.key = key;
        this.recurringOrder = recurringOrder;
        this.paymentMethodConfigurations = paymentMethodConfigurations;
    }

    /**
     * create empty instance
     */
    public RecurringPaymentDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the RecurringPayment.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> whose future payments must be processed using Checkout.</p>
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     *  <p>PaymentMethod and Connector to use to pay the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>. Checkout only supports processing this array with one PaymentMethodConfiguration.</p>
     */

    public java.util.List<com.commercetools.checkout.models.recurring_payment.PaymentMethodConfiguration> getPaymentMethodConfigurations() {
        return this.paymentMethodConfigurations;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setRecurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
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

        RecurringPaymentDraftImpl that = (RecurringPaymentDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(recurringOrder, that.recurringOrder)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .append(key, that.key)
                .append(recurringOrder, that.recurringOrder)
                .append(paymentMethodConfigurations, that.paymentMethodConfigurations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(recurringOrder)
                .append(paymentMethodConfigurations)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("recurringOrder", recurringOrder)
                .append("paymentMethodConfigurations", paymentMethodConfigurations)
                .build();
    }

    @Override
    public RecurringPaymentDraft copyDeep() {
        return RecurringPaymentDraft.deepCopy(this);
    }
}
