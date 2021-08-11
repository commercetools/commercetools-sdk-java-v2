
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetStatusInterfaceCodeActionBuilder implements Builder<PaymentSetStatusInterfaceCodeAction> {

    @Nullable
    private String interfaceCode;

    public PaymentSetStatusInterfaceCodeActionBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    public PaymentSetStatusInterfaceCodeAction build() {
        return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
    }

    /**
     * builds PaymentSetStatusInterfaceCodeAction without checking for non null required values
     */
    public PaymentSetStatusInterfaceCodeAction buildUnchecked() {
        return new PaymentSetStatusInterfaceCodeActionImpl(interfaceCode);
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of() {
        return new PaymentSetStatusInterfaceCodeActionBuilder();
    }

    public static PaymentSetStatusInterfaceCodeActionBuilder of(final PaymentSetStatusInterfaceCodeAction template) {
        PaymentSetStatusInterfaceCodeActionBuilder builder = new PaymentSetStatusInterfaceCodeActionBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
