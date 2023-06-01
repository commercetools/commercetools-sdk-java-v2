package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidUntilActionImpl;

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
 * CartDiscountSetValidUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidUntilAction cartDiscountSetValidUntilAction = CartDiscountSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetValidUntilActionImpl.class)
public interface CartDiscountSetValidUntilAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetValidUntilAction
     */
    String SET_VALID_UNTIL = "setValidUntil";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validUntil
     */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     */
    
    public void setValidUntil(final ZonedDateTime validUntil);
    

    /**
     * factory method
     * @return instance of CartDiscountSetValidUntilAction
     */
    public static CartDiscountSetValidUntilAction of(){
        return new CartDiscountSetValidUntilActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetValidUntilAction of(final CartDiscountSetValidUntilAction template) {
        CartDiscountSetValidUntilActionImpl instance = new CartDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetValidUntilAction deepCopy(@Nullable final CartDiscountSetValidUntilAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetValidUntilActionImpl instance = new CartDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetValidUntilAction
     * @return builder
     */
    public static CartDiscountSetValidUntilActionBuilder builder() {
        return CartDiscountSetValidUntilActionBuilder.of();
    }
    
    /**
     * create builder for CartDiscountSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidUntilActionBuilder builder(final CartDiscountSetValidUntilAction template) {
        return CartDiscountSetValidUntilActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetValidUntilAction(Function<CartDiscountSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidUntilAction>";
            }
        };
    }
}
