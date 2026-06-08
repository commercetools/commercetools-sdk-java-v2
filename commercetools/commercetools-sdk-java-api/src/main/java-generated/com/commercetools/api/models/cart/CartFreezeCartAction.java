
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Freezes the Cart based on the provided <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a>.</p>
 *  <p>The following behavior occurs:</p>
 *  <ul>
 *   <li>Changes the Cart State from <code>Active</code> to <code>Frozen</code>.</li>
 *   <li>Sets the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a> on the Cart's <code>freezeStrategy</code> field.</li>
 *   <li>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartFrozenMessage" rel="nofollow">CartFrozen</a> Message.</li>
 *  </ul>
 *  <p>If the Cart is empty, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("freezeCart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartFreezeCartActionImpl.class)
public interface CartFreezeCartAction extends CartUpdateAction {

    /**
     * discriminator value for CartFreezeCartAction
     */
    String FREEZE_CART = "freezeCart";

    /**
     *  <p>Strategy that determines the freezing behavior.</p>
     * @return strategy
     */

    @JsonProperty("strategy")
    public FreezeStrategy getStrategy();

    /**
     *  <p>Strategy that determines the freezing behavior.</p>
     * @param strategy value to be set
     */

    public void setStrategy(final FreezeStrategy strategy);

    /**
     * factory method
     * @return instance of CartFreezeCartAction
     */
    public static CartFreezeCartAction of() {
        return new CartFreezeCartActionImpl();
    }

    /**
     * factory method to create a shallow copy CartFreezeCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartFreezeCartAction of(final CartFreezeCartAction template) {
        CartFreezeCartActionImpl instance = new CartFreezeCartActionImpl();
        instance.setStrategy(template.getStrategy());
        return instance;
    }

    public CartFreezeCartAction copyDeep();

    /**
     * factory method to create a deep copy of CartFreezeCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartFreezeCartAction deepCopy(@Nullable final CartFreezeCartAction template) {
        if (template == null) {
            return null;
        }
        CartFreezeCartActionImpl instance = new CartFreezeCartActionImpl();
        instance.setStrategy(template.getStrategy());
        return instance;
    }

    /**
     * builder factory method for CartFreezeCartAction
     * @return builder
     */
    public static CartFreezeCartActionBuilder builder() {
        return CartFreezeCartActionBuilder.of();
    }

    /**
     * create builder for CartFreezeCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartFreezeCartActionBuilder builder(final CartFreezeCartAction template) {
        return CartFreezeCartActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartFreezeCartAction(Function<CartFreezeCartAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartFreezeCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartFreezeCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartFreezeCartAction>";
            }
        };
    }
}
