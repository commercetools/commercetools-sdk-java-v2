
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetAuthorizationActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Money amount;

    @Nullable
    private java.time.ZonedDateTime until;

    public PaymentSetAuthorizationActionBuilder amount(
            @Nullable final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public PaymentSetAuthorizationActionBuilder until(@Nullable final java.time.ZonedDateTime until) {
        this.until = until;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    @Nullable
    public java.time.ZonedDateTime getUntil() {
        return this.until;
    }

    public PaymentSetAuthorizationAction build() {
        return new PaymentSetAuthorizationActionImpl(amount, until);
    }

    public static PaymentSetAuthorizationActionBuilder of() {
        return new PaymentSetAuthorizationActionBuilder();
    }

    public static PaymentSetAuthorizationActionBuilder of(final PaymentSetAuthorizationAction template) {
        PaymentSetAuthorizationActionBuilder builder = new PaymentSetAuthorizationActionBuilder();
        builder.amount = template.getAmount();
        builder.until = template.getUntil();
        return builder;
    }

}
