
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("changeTarget")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeTargetActionImpl.class)
public interface CartDiscountChangeTargetAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeTargetAction
     */
    String CHANGE_TARGET = "changeTarget";

    /**
     *  <p>New value to set.</p>
     *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">CartDiscountValueRelative</a>, if <code>applicationMode</code> is set, the target must be <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>. If <code>applicationMode</code> is <code>ProportionateDistribution</code> or <code>EvenDistribution</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> must be non-empty. If either conditions are not met, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @return target
     */
    @NotNull
    @Valid
    @JsonProperty("target")
    public CartDiscountTarget getTarget();

    /**
     *  <p>New value to set.</p>
     *  <p>For a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">CartDiscountValueRelative</a>, if <code>applicationMode</code> is set, the target must be <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>. If <code>applicationMode</code> is <code>ProportionateDistribution</code> or <code>EvenDistribution</code>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> must be non-empty. If either conditions are not met, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned.</p>
     * @param target value to be set
     */

    public void setTarget(final CartDiscountTarget target);

    /**
     * factory method
     * @return instance of CartDiscountChangeTargetAction
     */
    public static CartDiscountChangeTargetAction of() {
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

    public CartDiscountChangeTargetAction copyDeep();

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
        instance.setTarget(
            com.commercetools.api.models.cart_discount.CartDiscountTarget.deepCopy(template.getTarget()));
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
