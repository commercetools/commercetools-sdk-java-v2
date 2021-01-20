
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.PaymentSetInterfaceIdAction;
import com.commercetools.api.models.payment.PaymentUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetInterfaceIdActionBuilder {

    private String interfaceId;

    public PaymentSetInterfaceIdActionBuilder interfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    public String getInterfaceId() {
        return this.interfaceId;
    }

    public PaymentSetInterfaceIdAction build() {
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
