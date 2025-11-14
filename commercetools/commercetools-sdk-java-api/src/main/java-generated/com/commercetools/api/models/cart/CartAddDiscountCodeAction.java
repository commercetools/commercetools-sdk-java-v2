
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> to the Cart to activate the related <span>Cart Discounts</span>. If the related Cart Discounts are inactive or invalid, or belong to a different Store than the Cart, a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeNonApplicableError" rel="nofollow">DiscountCodeNonApplicableError</a> is returned.</p>
 *  <p>A Discount Code can be added only if no <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a> has been applied to the Cart. For <a href="https://docs.commercetools.com/apis/ctp:api:type:FrozenCarts" rel="nofollow">frozen Carts</a>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeState" rel="nofollow">DiscountCodeState</a> must be <code>DoesNotMatchCart</code> when adding a Discount Code.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a <span>limit</span>.</p>
 *  <p>Specific Error Code: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a></p>
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
@io.vrap.rmf.base.client.utils.json.SubType("addDiscountCode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddDiscountCodeActionImpl.class)
public interface CartAddDiscountCodeAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddDiscountCodeAction
     */
    String ADD_DISCOUNT_CODE = "addDiscountCode";

    /**
     *  <p><code>code</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>code</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     * factory method
     * @return instance of CartAddDiscountCodeAction
     */
    public static CartAddDiscountCodeAction of() {
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

    public CartAddDiscountCodeAction copyDeep();

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
