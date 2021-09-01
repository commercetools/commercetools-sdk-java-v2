
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetExternalIdActionBuilder implements Builder<PaymentSetExternalIdAction> {

    @Nullable
    private String externalId;

    public PaymentSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public PaymentSetExternalIdAction build() {
        return new PaymentSetExternalIdActionImpl(externalId);
    }

    /**
     * builds PaymentSetExternalIdAction without checking for non null required values
     */
    public PaymentSetExternalIdAction buildUnchecked() {
        return new PaymentSetExternalIdActionImpl(externalId);
    }

    public static PaymentSetExternalIdActionBuilder of() {
        return new PaymentSetExternalIdActionBuilder();
    }

    public static PaymentSetExternalIdActionBuilder of(final PaymentSetExternalIdAction template) {
        PaymentSetExternalIdActionBuilder builder = new PaymentSetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
