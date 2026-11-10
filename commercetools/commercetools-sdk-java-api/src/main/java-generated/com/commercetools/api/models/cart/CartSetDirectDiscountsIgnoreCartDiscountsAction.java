
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Determines whether the <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> on the Cart replace the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>, or apply alongside them.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDirectDiscountsIgnoreCartDiscountsAction cartSetDirectDiscountsIgnoreCartDiscountsAction = CartSetDirectDiscountsIgnoreCartDiscountsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDirectDiscountsIgnoreCartDiscounts")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetDirectDiscountsIgnoreCartDiscountsActionImpl.class)
public interface CartSetDirectDiscountsIgnoreCartDiscountsAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetDirectDiscountsIgnoreCartDiscountsAction
     */
    String SET_DIRECT_DISCOUNTS_IGNORE_CART_DISCOUNTS = "setDirectDiscountsIgnoreCartDiscounts";

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Cart. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Cart does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Cart.</li>
     *  </ul>
     * @return directDiscountsIgnoreCartDiscounts
     */

    @JsonProperty("directDiscountsIgnoreCartDiscounts")
    public Boolean getDirectDiscountsIgnoreCartDiscounts();

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Cart. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Cart does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Cart.</li>
     *  </ul>
     * @param directDiscountsIgnoreCartDiscounts value to be set
     */

    public void setDirectDiscountsIgnoreCartDiscounts(final Boolean directDiscountsIgnoreCartDiscounts);

    /**
     * factory method
     * @return instance of CartSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsAction of() {
        return new CartSetDirectDiscountsIgnoreCartDiscountsActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetDirectDiscountsIgnoreCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsAction of(
            final CartSetDirectDiscountsIgnoreCartDiscountsAction template) {
        CartSetDirectDiscountsIgnoreCartDiscountsActionImpl instance = new CartSetDirectDiscountsIgnoreCartDiscountsActionImpl();
        instance.setDirectDiscountsIgnoreCartDiscounts(template.getDirectDiscountsIgnoreCartDiscounts());
        return instance;
    }

    public CartSetDirectDiscountsIgnoreCartDiscountsAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetDirectDiscountsIgnoreCartDiscountsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetDirectDiscountsIgnoreCartDiscountsAction deepCopy(
            @Nullable final CartSetDirectDiscountsIgnoreCartDiscountsAction template) {
        if (template == null) {
            return null;
        }
        CartSetDirectDiscountsIgnoreCartDiscountsActionImpl instance = new CartSetDirectDiscountsIgnoreCartDiscountsActionImpl();
        instance.setDirectDiscountsIgnoreCartDiscounts(template.getDirectDiscountsIgnoreCartDiscounts());
        return instance;
    }

    /**
     * builder factory method for CartSetDirectDiscountsIgnoreCartDiscountsAction
     * @return builder
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder() {
        return CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder.of();
    }

    /**
     * create builder for CartSetDirectDiscountsIgnoreCartDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder(
            final CartSetDirectDiscountsIgnoreCartDiscountsAction template) {
        return CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetDirectDiscountsIgnoreCartDiscountsAction(
            Function<CartSetDirectDiscountsIgnoreCartDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartSetDirectDiscountsIgnoreCartDiscountsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartSetDirectDiscountsIgnoreCartDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDirectDiscountsIgnoreCartDiscountsAction>";
            }
        };
    }
}
