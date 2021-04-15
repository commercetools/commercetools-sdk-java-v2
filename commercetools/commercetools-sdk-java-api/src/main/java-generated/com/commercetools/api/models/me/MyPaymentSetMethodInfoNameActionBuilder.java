
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentSetMethodInfoNameActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public MyPaymentSetMethodInfoNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public MyPaymentSetMethodInfoNameAction build() {
        return new MyPaymentSetMethodInfoNameActionImpl(name);
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of() {
        return new MyPaymentSetMethodInfoNameActionBuilder();
    }

    public static MyPaymentSetMethodInfoNameActionBuilder of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionBuilder builder = new MyPaymentSetMethodInfoNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
