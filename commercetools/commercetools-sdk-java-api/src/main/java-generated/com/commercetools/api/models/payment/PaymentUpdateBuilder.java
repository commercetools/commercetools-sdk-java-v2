
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions;

    public PaymentUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public PaymentUpdateBuilder actions(final com.commercetools.api.models.payment.PaymentUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public PaymentUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions() {
        return this.actions;
    }

    public PaymentUpdate build() {
        return new PaymentUpdateImpl(version, actions);
    }

    public static PaymentUpdateBuilder of() {
        return new PaymentUpdateBuilder();
    }

    public static PaymentUpdateBuilder of(final PaymentUpdate template) {
        PaymentUpdateBuilder builder = new PaymentUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
