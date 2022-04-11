
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentUpdateBuilder implements Builder<PaymentUpdate> {

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

    public PaymentUpdateBuilder plusActions(final com.commercetools.api.models.payment.PaymentUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public PaymentUpdateBuilder plusActions(
            Function<com.commercetools.api.models.payment.PaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment.PaymentUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.payment.PaymentUpdateActionBuilder.of()).build());
        return this;
    }

    public PaymentUpdateBuilder withActions(
            Function<com.commercetools.api.models.payment.PaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.payment.PaymentUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.payment.PaymentUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions() {
        return this.actions;
    }

    public PaymentUpdate build() {
        Objects.requireNonNull(version, PaymentUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, PaymentUpdate.class + ": actions is missing");
        return new PaymentUpdateImpl(version, actions);
    }

    /**
     * builds PaymentUpdate without checking for non null required values
     */
    public PaymentUpdate buildUnchecked() {
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
