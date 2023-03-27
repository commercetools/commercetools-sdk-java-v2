
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartRemoveDiscountCodeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveDiscountCodeAction cartRemoveDiscountCodeAction = CartRemoveDiscountCodeAction.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveDiscountCodeActionImpl.class)
public interface CartRemoveDiscountCodeAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveDiscountCodeAction
     */
    String REMOVE_DISCOUNT_CODE = "removeDiscountCode";

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>Discount Code to remove from the Cart.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     * factory method
     * @return instance of CartRemoveDiscountCodeAction
     */
    public static CartRemoveDiscountCodeAction of() {
        return new CartRemoveDiscountCodeActionImpl();
    }

    /**
     * factory method to copy an instance of CartRemoveDiscountCodeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveDiscountCodeAction of(final CartRemoveDiscountCodeAction template) {
        CartRemoveDiscountCodeActionImpl instance = new CartRemoveDiscountCodeActionImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    /**
     * builder factory method for CartRemoveDiscountCodeAction
     * @return builder
     */
    public static CartRemoveDiscountCodeActionBuilder builder() {
        return CartRemoveDiscountCodeActionBuilder.of();
    }

    /**
     * create builder for CartRemoveDiscountCodeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveDiscountCodeActionBuilder builder(final CartRemoveDiscountCodeAction template) {
        return CartRemoveDiscountCodeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveDiscountCodeAction(Function<CartRemoveDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveDiscountCodeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveDiscountCodeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveDiscountCodeAction>";
            }
        };
    }
}
