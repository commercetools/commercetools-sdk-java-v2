package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.cart_discount.CartDiscountSetDescriptionActionImpl;

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
 * CartDiscountSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetDescriptionAction cartDiscountSetDescriptionAction = CartDiscountSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountSetDescriptionActionImpl.class)
public interface CartDiscountSetDescriptionAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    

    /**
     * factory method
     * @return instance of CartDiscountSetDescriptionAction
     */
    public static CartDiscountSetDescriptionAction of(){
        return new CartDiscountSetDescriptionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetDescriptionAction of(final CartDiscountSetDescriptionAction template) {
        CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetDescriptionAction deepCopy(@Nullable final CartDiscountSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetDescriptionActionImpl instance = new CartDiscountSetDescriptionActionImpl();
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetDescriptionAction
     * @return builder
     */
    public static CartDiscountSetDescriptionActionBuilder builder() {
        return CartDiscountSetDescriptionActionBuilder.of();
    }
    
    /**
     * create builder for CartDiscountSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetDescriptionActionBuilder builder(final CartDiscountSetDescriptionAction template) {
        return CartDiscountSetDescriptionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetDescriptionAction(Function<CartDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetDescriptionAction>";
            }
        };
    }
}
