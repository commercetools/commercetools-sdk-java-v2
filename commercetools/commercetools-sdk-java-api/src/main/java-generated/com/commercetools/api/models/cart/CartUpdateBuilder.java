
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions;

    public CartUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public CartUpdateBuilder actions(final com.commercetools.api.models.cart.CartUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public CartUpdateBuilder actions(final java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.cart.CartUpdateAction> getActions() {
        return this.actions;
    }

    public CartUpdate build() {
        return new CartUpdateImpl(version, actions);
    }

    public static CartUpdateBuilder of() {
        return new CartUpdateBuilder();
    }

    public static CartUpdateBuilder of(final CartUpdate template) {
        CartUpdateBuilder builder = new CartUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
