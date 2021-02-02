
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartChangeCustomLineItemQuantityActionBuilder {

    private String customLineItemId;

    private Long quantity;

    public CartChangeCustomLineItemQuantityActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public CartChangeCustomLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public CartChangeCustomLineItemQuantityAction build() {
        return new CartChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    public static CartChangeCustomLineItemQuantityActionBuilder of() {
        return new CartChangeCustomLineItemQuantityActionBuilder();
    }

    public static CartChangeCustomLineItemQuantityActionBuilder of(
            final CartChangeCustomLineItemQuantityAction template) {
        CartChangeCustomLineItemQuantityActionBuilder builder = new CartChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
