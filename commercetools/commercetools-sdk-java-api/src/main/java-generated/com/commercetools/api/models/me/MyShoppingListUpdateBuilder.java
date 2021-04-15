
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyShoppingListUpdateBuilder {

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

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyShoppingListUpdateAction> getActions() {
        return this.actions;
    }

    public MyShoppingListUpdate build() {
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
