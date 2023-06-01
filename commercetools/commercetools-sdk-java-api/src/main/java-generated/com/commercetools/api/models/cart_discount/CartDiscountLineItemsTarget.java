package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetImpl;

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
 *  <p>Discount is applied to LineItems matching the <code>predicate</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountLineItemsTarget cartDiscountLineItemsTarget = CartDiscountLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountLineItemsTargetImpl.class)
public interface CartDiscountLineItemsTarget extends CartDiscountTarget {

    /**
     * discriminator value for CartDiscountLineItemsTarget
     */
    String LINE_ITEMS = "lineItems";

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Valid LineItem target predicate.</p>
     * @param predicate value to be set
     */
    
    public void setPredicate(final String predicate);
    

    /**
     * factory method
     * @return instance of CartDiscountLineItemsTarget
     */
    public static CartDiscountLineItemsTarget of(){
        return new CartDiscountLineItemsTargetImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountLineItemsTarget of(final CartDiscountLineItemsTarget template) {
        CartDiscountLineItemsTargetImpl instance = new CartDiscountLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountLineItemsTarget deepCopy(@Nullable final CartDiscountLineItemsTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountLineItemsTargetImpl instance = new CartDiscountLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for CartDiscountLineItemsTarget
     * @return builder
     */
    public static CartDiscountLineItemsTargetBuilder builder() {
        return CartDiscountLineItemsTargetBuilder.of();
    }
    
    /**
     * create builder for CartDiscountLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountLineItemsTargetBuilder builder(final CartDiscountLineItemsTarget template) {
        return CartDiscountLineItemsTargetBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountLineItemsTarget(Function<CartDiscountLineItemsTarget, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountLineItemsTarget>";
            }
        };
    }
}
