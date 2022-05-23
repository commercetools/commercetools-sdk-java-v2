
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   PaymentSetCustomerAction paymentSetCustomerAction = PaymentSetCustomerAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetCustomerActionBuilder implements Builder<PaymentSetCustomerAction> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public PaymentSetCustomerActionBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

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

    /**
     * builds PaymentSetCustomerAction without checking for non null required values
     */
    public PaymentSetCustomerAction buildUnchecked() {
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
