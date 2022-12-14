
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changes the CartState from <code>Active</code> to <code>Frozen</code>. Results in a Frozen Cart. Fails with InvalidOperation error when the Cart is empty.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartFreezeCartAction cartFreezeCartAction = CartFreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartFreezeCartActionImpl.class)
public interface CartFreezeCartAction extends CartUpdateAction {

    String FREEZE_CART = "freezeCart";

    public static CartFreezeCartAction of() {
        return new CartFreezeCartActionImpl();
    }

    public static CartFreezeCartAction of(final CartFreezeCartAction template) {
        CartFreezeCartActionImpl instance = new CartFreezeCartActionImpl();
        return instance;
    }

    public static CartFreezeCartActionBuilder builder() {
        return CartFreezeCartActionBuilder.of();
    }

    public static CartFreezeCartActionBuilder builder(final CartFreezeCartAction template) {
        return CartFreezeCartActionBuilder.of(template);
    }

    default <T> T withCartFreezeCartAction(Function<CartFreezeCartAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartFreezeCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartFreezeCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartFreezeCartAction>";
            }
        };
    }
}
