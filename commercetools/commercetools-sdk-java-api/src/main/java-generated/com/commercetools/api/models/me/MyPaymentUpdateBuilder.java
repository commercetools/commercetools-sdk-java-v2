
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyPaymentUpdateBuilder implements Builder<MyPaymentUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions;

    public MyPaymentUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyPaymentUpdateBuilder actions(final com.commercetools.api.models.me.MyPaymentUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public MyPaymentUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public MyPaymentUpdateBuilder plusActions(final com.commercetools.api.models.me.MyPaymentUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public MyPaymentUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyPaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyPaymentUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyPaymentUpdateActionBuilder.of()).build());
        return this;
    }

    public MyPaymentUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyPaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyPaymentUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyPaymentUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> getActions() {
        return this.actions;
    }

    public MyPaymentUpdate build() {
        Objects.requireNonNull(version, MyPaymentUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyPaymentUpdate.class + ": actions is missing");
        return new MyPaymentUpdateImpl(version, actions);
    }

    /**
     * builds MyPaymentUpdate without checking for non null required values
     */
    public MyPaymentUpdate buildUnchecked() {
        return new MyPaymentUpdateImpl(version, actions);
    }

    public static MyPaymentUpdateBuilder of() {
        return new MyPaymentUpdateBuilder();
    }

    public static MyPaymentUpdateBuilder of(final MyPaymentUpdate template) {
        MyPaymentUpdateBuilder builder = new MyPaymentUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
