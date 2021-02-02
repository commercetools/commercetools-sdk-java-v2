
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRemoveCustomLineItemActionBuilder {

    private String customLineItemId;

    public CartRemoveCustomLineItemActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public CartRemoveCustomLineItemAction build() {
        return new CartRemoveCustomLineItemActionImpl(customLineItemId);
    }

    public static CartRemoveCustomLineItemActionBuilder of() {
        return new CartRemoveCustomLineItemActionBuilder();
    }

    public static CartRemoveCustomLineItemActionBuilder of(final CartRemoveCustomLineItemAction template) {
        CartRemoveCustomLineItemActionBuilder builder = new CartRemoveCustomLineItemActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
