package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscountSetValidFromAndUntilActionImpl;

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
 * CartDiscountSetValidFromAndUntilAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidFromAndUntilAction cartDiscountSetValidFromAndUntilAction = CartDiscountSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetValidFromAndUntilActionImpl.class)
public interface CartDiscountSetValidFromAndUntilAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetValidFromAndUntilAction
     */
    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validFrom
     */
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validUntil
     */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validFrom value to be set
     */
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     */
    
    public void setValidUntil(final ZonedDateTime validUntil);
    

    /**
     * factory method
     * @return instance of CartDiscountSetValidFromAndUntilAction
     */
    public static CartDiscountSetValidFromAndUntilAction of(){
        return new CartDiscountSetValidFromAndUntilActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetValidFromAndUntilAction of(final CartDiscountSetValidFromAndUntilAction template) {
        CartDiscountSetValidFromAndUntilActionImpl instance = new CartDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetValidFromAndUntilAction deepCopy(@Nullable final CartDiscountSetValidFromAndUntilAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetValidFromAndUntilActionImpl instance = new CartDiscountSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetValidFromAndUntilAction
     * @return builder
     */
    public static CartDiscountSetValidFromAndUntilActionBuilder builder() {
        return CartDiscountSetValidFromAndUntilActionBuilder.of();
    }
    
    /**
     * create builder for CartDiscountSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidFromAndUntilActionBuilder builder(final CartDiscountSetValidFromAndUntilAction template) {
        return CartDiscountSetValidFromAndUntilActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetValidFromAndUntilAction(Function<CartDiscountSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetValidFromAndUntilAction>";
            }
        };
    }
}
