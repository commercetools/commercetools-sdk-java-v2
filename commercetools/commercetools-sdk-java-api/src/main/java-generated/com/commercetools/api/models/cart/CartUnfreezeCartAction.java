package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUnfreezeCartActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartUnfreezeCartActionImpl.class)
public interface CartUnfreezeCartAction extends CartUpdateAction {

    /**
     * discriminator value for CartUnfreezeCartAction
     */
    String UNFREEZE_CART = "unfreezeCart";



    /**
     * factory method
     * @return instance of CartUnfreezeCartAction
     */
    public static CartUnfreezeCartAction of(){
        return new CartUnfreezeCartActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartUnfreezeCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUnfreezeCartAction of(final CartUnfreezeCartAction template) {
        CartUnfreezeCartActionImpl instance = new CartUnfreezeCartActionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CartUnfreezeCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUnfreezeCartAction deepCopy(@Nullable final CartUnfreezeCartAction template) {
        if (template == null) {
            return null;
        }
        CartUnfreezeCartActionImpl instance = new CartUnfreezeCartActionImpl();
        return instance;
    }

    /**
     * builder factory method for CartUnfreezeCartAction
     * @return builder
     */
    public static CartUnfreezeCartActionBuilder builder() {
        return CartUnfreezeCartActionBuilder.of();
    }
    
    /**
     * create builder for CartUnfreezeCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnfreezeCartActionBuilder builder(final CartUnfreezeCartAction template) {
        return CartUnfreezeCartActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUnfreezeCartAction(Function<CartUnfreezeCartAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUnfreezeCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUnfreezeCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnfreezeCartAction>";
            }
        };
    }
}
