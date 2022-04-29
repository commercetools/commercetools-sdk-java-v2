
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCustomerUpdateBuilder implements Builder<MyCustomerUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyCustomerUpdateAction> actions;

    public MyCustomerUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyCustomerUpdateBuilder actions(final com.commercetools.api.models.me.MyCustomerUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public MyCustomerUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyCustomerUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public MyCustomerUpdateBuilder plusActions(
            final com.commercetools.api.models.me.MyCustomerUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public MyCustomerUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyCustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCustomerUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCustomerUpdateActionBuilder.of()).build());
        return this;
    }

    public MyCustomerUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyCustomerUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCustomerUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCustomerUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyCustomerUpdateAction> getActions() {
        return this.actions;
    }

    public MyCustomerUpdate build() {
        Objects.requireNonNull(version, MyCustomerUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyCustomerUpdate.class + ": actions is missing");
        return new MyCustomerUpdateImpl(version, actions);
    }

    /**
     * builds MyCustomerUpdate without checking for non null required values
     */
    public MyCustomerUpdate buildUnchecked() {
        return new MyCustomerUpdateImpl(version, actions);
    }

    public static MyCustomerUpdateBuilder of() {
        return new MyCustomerUpdateBuilder();
    }

    public static MyCustomerUpdateBuilder of(final MyCustomerUpdate template) {
        MyCustomerUpdateBuilder builder = new MyCustomerUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
