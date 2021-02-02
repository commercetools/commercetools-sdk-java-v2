
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetMethodInfoMethodActionBuilder {

    @Nullable
    private String method;

    public PaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
        this.method = method;
        return this;
    }

    @Nullable
    public String getMethod() {
        return this.method;
    }

    public PaymentSetMethodInfoMethodAction build() {
        return new PaymentSetMethodInfoMethodActionImpl(method);
    }

    public static PaymentSetMethodInfoMethodActionBuilder of() {
        return new PaymentSetMethodInfoMethodActionBuilder();
    }

    public static PaymentSetMethodInfoMethodActionBuilder of(final PaymentSetMethodInfoMethodAction template) {
        PaymentSetMethodInfoMethodActionBuilder builder = new PaymentSetMethodInfoMethodActionBuilder();
        builder.method = template.getMethod();
        return builder;
    }

}
