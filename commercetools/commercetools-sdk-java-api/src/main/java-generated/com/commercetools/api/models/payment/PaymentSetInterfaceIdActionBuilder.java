
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetInterfaceIdActionBuilder implements Builder<PaymentSetInterfaceIdAction> {

    private String interfaceId;

    public PaymentSetInterfaceIdActionBuilder interfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public PaymentSetInterfaceIdAction build() {
        Objects.requireNonNull(interfaceId, PaymentSetInterfaceIdAction.class + ": interfaceId is missing");
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    /**
     * builds PaymentSetInterfaceIdAction without checking for non null required values
     */
    public PaymentSetInterfaceIdAction buildUnchecked() {
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    public static PaymentSetInterfaceIdActionBuilder of() {
        return new PaymentSetInterfaceIdActionBuilder();
    }

    public static PaymentSetInterfaceIdActionBuilder of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionBuilder builder = new PaymentSetInterfaceIdActionBuilder();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
