
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetMethodInfoNameActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public PaymentSetMethodInfoNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public PaymentSetMethodInfoNameAction build() {
        return new PaymentSetMethodInfoNameActionImpl(name);
    }

    public static PaymentSetMethodInfoNameActionBuilder of() {
        return new PaymentSetMethodInfoNameActionBuilder();
    }

    public static PaymentSetMethodInfoNameActionBuilder of(final PaymentSetMethodInfoNameAction template) {
        PaymentSetMethodInfoNameActionBuilder builder = new PaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
