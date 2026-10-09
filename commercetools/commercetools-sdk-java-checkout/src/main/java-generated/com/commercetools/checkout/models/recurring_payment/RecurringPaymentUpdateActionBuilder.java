
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentUpdateActionBuilder {

    public com.commercetools.checkout.models.recurring_payment.RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder addPaymentMethodConfigurationBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentAddPaymentMethodConfigurationUpdateActionBuilder
                .of();
    }

    public com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetKeyUpdateActionBuilder setKeyBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetKeyUpdateActionBuilder.of();
    }

    public com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder setPaymentMethodConfigurationBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetPaymentMethodConfigurationUpdateActionBuilder
                .of();
    }

    public com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetRecurringOrderUpdateActionBuilder setRecurringOrderBuilder() {
        return com.commercetools.checkout.models.recurring_payment.RecurringPaymentSetRecurringOrderUpdateActionBuilder
                .of();
    }

    /**
     * factory method for an instance of RecurringPaymentUpdateActionBuilder
     * @return builder
     */
    public static RecurringPaymentUpdateActionBuilder of() {
        return new RecurringPaymentUpdateActionBuilder();
    }

}
