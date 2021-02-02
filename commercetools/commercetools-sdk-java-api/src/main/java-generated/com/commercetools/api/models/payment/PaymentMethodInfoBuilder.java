
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentMethodInfoBuilder {

    @Nullable
    private String paymentInterface;

    @Nullable
    private String method;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public PaymentMethodInfoBuilder paymentInterface(@Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    public PaymentMethodInfoBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

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
