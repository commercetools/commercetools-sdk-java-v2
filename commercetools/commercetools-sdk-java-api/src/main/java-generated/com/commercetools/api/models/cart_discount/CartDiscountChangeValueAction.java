
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
 *  <p>Changes the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValue" rel="nofollow">CartDiscountValue</a> for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueRelative" rel="nofollow">relative</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueAbsolute" rel="nofollow">absolute</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueFixed" rel="nofollow">fixed price</a> CartDiscounts. Changing to <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueGiftLineItem" rel="nofollow">Gift Line Item</a> is not supported.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeValueAction cartDiscountChangeValueAction = CartDiscountChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeValueActionImpl.class)
public interface CartDiscountChangeValueAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeValueAction
     */
    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set.</p>
     *  <p>When trying to set a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueGiftLineItemDraft" rel="nofollow">CartDiscountValueGiftLineItemDraft</a> an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public CartDiscountValueDraft getValue();

    /**
     *  <p>New value to set.</p>
     *  <p>When trying to set a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountValueGiftLineItemDraft" rel="nofollow">CartDiscountValueGiftLineItemDraft</a> an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidInputError" rel="nofollow">InvalidInput</a> error is returned.</p>
     * @param value value to be set
     */

    public void setValue(final CartDiscountValueDraft value);

    /**
     * factory method
     * @return instance of CartDiscountChangeValueAction
     */
    public static CartDiscountChangeValueAction of() {
        return new CartDiscountChangeValueActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeValueAction of(final CartDiscountChangeValueAction template) {
        CartDiscountChangeValueActionImpl instance = new CartDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public CartDiscountChangeValueAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountChangeValueAction deepCopy(@Nullable final CartDiscountChangeValueAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountChangeValueActionImpl instance = new CartDiscountChangeValueActionImpl();
        instance.setValue(
            com.commercetools.api.models.cart_discount.CartDiscountValueDraft.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeValueAction
     * @return builder
     */
    public static CartDiscountChangeValueActionBuilder builder() {
        return CartDiscountChangeValueActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeValueActionBuilder builder(final CartDiscountChangeValueAction template) {
        return CartDiscountChangeValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeValueAction(Function<CartDiscountChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeValueAction>";
            }
        };
    }
}
