package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.cart_discount.CartDiscountChangeTargetActionImpl;

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
 * CartDiscountChangeTargetAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeTargetAction cartDiscountChangeTargetAction = CartDiscountChangeTargetAction.builder()
 *             .target(targetBuilder -> targetBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountChangeTargetActionImpl.class)
public interface CartDiscountChangeTargetAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeTargetAction
     */
    String CHANGE_TARGET = "changeTarget";

    /**
     *  <p>New value to set.</p>
     * @return target
     */
    @NotNull
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>New value to set.</p>
     * @param target value to be set
     */
    
    public void setTarget(final CartDiscountTarget target);
    

    /**
     * factory method
     * @return instance of CartDiscountChangeTargetAction
     */
    public static CartDiscountChangeTargetAction of(){
        return new CartDiscountChangeTargetActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountChangeTargetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeTargetAction of(final CartDiscountChangeTargetAction template) {
        CartDiscountChangeTargetActionImpl instance = new CartDiscountChangeTargetActionImpl();
        instance.setTarget(template.getTarget());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountChangeTargetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountChangeTargetAction deepCopy(@Nullable final CartDiscountChangeTargetAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountChangeTargetActionImpl instance = new CartDiscountChangeTargetActionImpl();
        instance.setTarget(com.commercetools.api.models.cart_discount.CartDiscountTarget.deepCopy(template.getTarget()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeTargetAction
     * @return builder
     */
    public static CartDiscountChangeTargetActionBuilder builder() {
        return CartDiscountChangeTargetActionBuilder.of();
    }
    
    /**
     * create builder for CartDiscountChangeTargetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeTargetActionBuilder builder(final CartDiscountChangeTargetAction template) {
        return CartDiscountChangeTargetActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeTargetAction(Function<CartDiscountChangeTargetAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeTargetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeTargetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeTargetAction>";
            }
        };
    }
}
