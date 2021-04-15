
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetCustomerActionBuilder {

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    public PaymentSetCustomerActionBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public PaymentSetCustomerAction build() {
        return new PaymentSetCustomerActionImpl(customer);
    }

    public static PaymentSetCustomerActionBuilder of() {
        return new PaymentSetCustomerActionBuilder();
    }

    public static PaymentSetCustomerActionBuilder of(final PaymentSetCustomerAction template) {
        PaymentSetCustomerActionBuilder builder = new PaymentSetCustomerActionBuilder();
        builder.customer = template.getCustomer();
        return builder;
    }

}
