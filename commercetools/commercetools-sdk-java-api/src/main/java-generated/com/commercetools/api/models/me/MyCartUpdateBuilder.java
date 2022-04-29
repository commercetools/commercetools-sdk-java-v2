
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCartUpdateBuilder implements Builder<MyCartUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> actions;

    public MyCartUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyCartUpdateBuilder actions(final com.commercetools.api.models.me.MyCartUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public MyCartUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public MyCartUpdateBuilder plusActions(final com.commercetools.api.models.me.MyCartUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public MyCartUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyCartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCartUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCartUpdateActionBuilder.of()).build());
        return this;
    }

    public MyCartUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyCartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCartUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCartUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> getActions() {
        return this.actions;
    }

    public MyCartUpdate build() {
        Objects.requireNonNull(version, MyCartUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyCartUpdate.class + ": actions is missing");
        return new MyCartUpdateImpl(version, actions);
    }

    /**
     * builds MyCartUpdate without checking for non null required values
     */
    public MyCartUpdate buildUnchecked() {
        return new MyCartUpdateImpl(version, actions);
    }

    public static MyCartUpdateBuilder of() {
        return new MyCartUpdateBuilder();
    }

    public static MyCartUpdateBuilder of(final MyCartUpdate template) {
        MyCartUpdateBuilder builder = new MyCartUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
