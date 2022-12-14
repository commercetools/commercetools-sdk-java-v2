
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the CartState from <code>Frozen</code> to <code>Active</code>. Reactivates a Frozen Cart. This action updates all prices in the Cart according to latest Prices on related Product Variants and Shipping Methods and by applying all discounts currently being active and applicable for the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfreezeCartAction cartUnfreezeCartAction = CartUnfreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUnfreezeCartActionImpl.class)
public interface CartUnfreezeCartAction extends CartUpdateAction {

    String UNFREEZE_CART = "unfreezeCart";

    public static CartUnfreezeCartAction of() {
        return new CartUnfreezeCartActionImpl();
    }

    public static CartUnfreezeCartAction of(final CartUnfreezeCartAction template) {
        CartUnfreezeCartActionImpl instance = new CartUnfreezeCartActionImpl();
        return instance;
    }

    public static CartUnfreezeCartActionBuilder builder() {
        return CartUnfreezeCartActionBuilder.of();
    }

    public static CartUnfreezeCartActionBuilder builder(final CartUnfreezeCartAction template) {
        return CartUnfreezeCartActionBuilder.of(template);
    }

    default <T> T withCartUnfreezeCartAction(Function<CartUnfreezeCartAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartUnfreezeCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUnfreezeCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnfreezeCartAction>";
            }
        };
    }
}
