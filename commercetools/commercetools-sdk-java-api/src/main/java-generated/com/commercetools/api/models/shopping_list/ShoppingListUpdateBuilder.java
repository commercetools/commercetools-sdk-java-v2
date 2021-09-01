
package com.commercetools.api.models.shopping_list;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListUpdateBuilder implements Builder<ShoppingListUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions;

    public ShoppingListUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ShoppingListUpdateBuilder actions(
            final com.commercetools.api.models.shopping_list.ShoppingListUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ShoppingListUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingListUpdateAction> getActions() {
        return this.actions;
    }

    public ShoppingListUpdate build() {
        Objects.requireNonNull(version, ShoppingListUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ShoppingListUpdate.class + ": actions is missing");
        return new ShoppingListUpdateImpl(version, actions);
    }

    /**
     * builds ShoppingListUpdate without checking for non null required values
     */
    public ShoppingListUpdate buildUnchecked() {
        return new ShoppingListUpdateImpl(version, actions);
    }

    public static ShoppingListUpdateBuilder of() {
        return new ShoppingListUpdateBuilder();
    }

    public static ShoppingListUpdateBuilder of(final ShoppingListUpdate template) {
        ShoppingListUpdateBuilder builder = new ShoppingListUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
