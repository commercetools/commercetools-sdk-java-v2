
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetKeyActionBuilder {

    @Nullable
    private String key;

    public PaymentSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public PaymentSetKeyAction build() {
        return new PaymentSetKeyActionImpl(key);
    }

    public static PaymentSetKeyActionBuilder of() {
        return new PaymentSetKeyActionBuilder();
    }

    public static PaymentSetKeyActionBuilder of(final PaymentSetKeyAction template) {
        PaymentSetKeyActionBuilder builder = new PaymentSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
