
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyShoppingListUpdateBuilder implements Builder<MyShoppingListUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> actions;

    public MyShoppingListUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public MyShoppingListUpdateBuilder actions(
            final com.commercetools.api.models.me.MyShoppingListUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public MyShoppingListUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public MyShoppingListUpdateBuilder plusActions(
            final com.commercetools.api.models.me.MyShoppingListUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public MyShoppingListUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyShoppingListUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder.of()).build());
        return this;
    }

    public MyShoppingListUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyShoppingListUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyShoppingListUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> getActions() {
        return this.actions;
    }

    public MyShoppingListUpdate build() {
        Objects.requireNonNull(version, MyShoppingListUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyShoppingListUpdate.class + ": actions is missing");
        return new MyShoppingListUpdateImpl(version, actions);
    }

    /**
     * builds MyShoppingListUpdate without checking for non null required values
     */
    public MyShoppingListUpdate buildUnchecked() {
        return new MyShoppingListUpdateImpl(version, actions);
    }

    public static MyShoppingListUpdateBuilder of() {
        return new MyShoppingListUpdateBuilder();
    }

    public static MyShoppingListUpdateBuilder of(final MyShoppingListUpdate template) {
        MyShoppingListUpdateBuilder builder = new MyShoppingListUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
