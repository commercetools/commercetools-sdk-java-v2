package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartAddDiscountCodeActionImpl;

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
 *  <p>Adds a DiscountCode to the Cart to activate the related Cart Discounts. Adding a Discount Code is only possible if no DirectDiscount has been applied to the Cart. Discount Codes can be added to frozen Carts, but their DiscountCodeState is then <code>DoesNotMatchCart</code>.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a limit.</p>
 *  <p>Specific Error Code: MatchingPriceNotFound</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddDiscountCodeAction cartAddDiscountCodeAction = CartAddDiscountCodeAction.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartAddDiscountCodeActionImpl.class)
public interface CartAddDiscountCodeAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddDiscountCodeAction
     */
    String ADD_DISCOUNT_CODE = "addDiscountCode";

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>code</code> of a DiscountCode.</p>
     * @param code value to be set
     */
    
    public void setCode(final String code);
    

    /**
     * factory method
     * @return instance of CartAddDiscountCodeAction
     */
    public static CartAddDiscountCodeAction of(){
        return new CartAddDiscountCodeActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartAddDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddDiscountCodeAction of(final CartAddDiscountCodeAction template) {
        CartAddDiscountCodeActionImpl instance = new CartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartAddDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddDiscountCodeAction deepCopy(@Nullable final CartAddDiscountCodeAction template) {
        if (template == null) {
            return null;
        }
        CartAddDiscountCodeActionImpl instance = new CartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    /**
     * builder factory method for CartAddDiscountCodeAction
     * @return builder
     */
    public static CartAddDiscountCodeActionBuilder builder() {
        return CartAddDiscountCodeActionBuilder.of();
    }
    
    /**
     * create builder for CartAddDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddDiscountCodeActionBuilder builder(final CartAddDiscountCodeAction template) {
        return CartAddDiscountCodeActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddDiscountCodeAction(Function<CartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddDiscountCodeAction>";
            }
        };
    }
}
