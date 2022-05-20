
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentMethodInfoBuilder implements Builder<PaymentMethodInfo> {

    @Nullable
    private String paymentInterface;

    @Nullable
    private String method;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
    *  <p>The interface that handles the payment (usually a PSP). Cannot be changed once it has been set. The combination of Payment<code>interfaceId</code> and this field must be unique.</p>
    */

    public PaymentMethodInfoBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
    *  <p>The payment method that is used, e.g. e.g. a conventional string representing Credit Card, Cash Advance etc.</p>
    */

    public PaymentMethodInfoBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    /**
    *  <p>A human-readable, localized name for the payment method, e.g. 'Credit Card'.</p>
    */

    public PaymentMethodInfoBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
    *  <p>A human-readable, localized name for the payment method, e.g. 'Credit Card'.</p>
    */

    public PaymentMethodInfoBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public PaymentMethodInfo build() {
        return new PaymentMethodInfoImpl(paymentInterface, method, name);
    }

    /**
     * builds PaymentMethodInfo without checking for non null required values
     */
    public PaymentMethodInfo buildUnchecked() {
        return new PaymentMethodInfoImpl(paymentInterface, method, name);
    }

    public static PaymentMethodInfoBuilder of() {
        return new PaymentMethodInfoBuilder();
    }

    public static PaymentMethodInfoBuilder of(final PaymentMethodInfo template) {
        PaymentMethodInfoBuilder builder = new PaymentMethodInfoBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        builder.method = template.getMethod();
        builder.name = template.getName();
        return builder;
    }

}
