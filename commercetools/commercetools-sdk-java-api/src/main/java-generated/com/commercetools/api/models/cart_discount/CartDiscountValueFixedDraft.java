package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftImpl;

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
 *  <p>Sets the DiscountedLineItemPrice of the CartDiscountLineItemsTarget or CartDiscountCustomLineItemsTarget to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixedDraft cartDiscountValueFixedDraft = CartDiscountValueFixedDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueFixedDraftImpl.class)
public interface CartDiscountValueFixedDraft extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueFixedDraft> {

    /**
     * discriminator value for CartDiscountValueFixedDraft
     */
    String FIXED = "fixed";

    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param money values to be set
     */
    
    @JsonIgnore
    public void setMoney(final Money ...money);
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param money values to be set
     */
    
    public void setMoney(final List<Money> money);

    /**
     * factory method
     * @return instance of CartDiscountValueFixedDraft
     */
    public static CartDiscountValueFixedDraft of(){
        return new CartDiscountValueFixedDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountValueFixedDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueFixedDraft of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftImpl instance = new CartDiscountValueFixedDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueFixedDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueFixedDraft deepCopy(@Nullable final CartDiscountValueFixedDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueFixedDraftImpl instance = new CartDiscountValueFixedDraftImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream().map(com.commercetools.api.models.common.Money::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueFixedDraft
     * @return builder
     */
    public static CartDiscountValueFixedDraftBuilder builder() {
        return CartDiscountValueFixedDraftBuilder.of();
    }
    
    /**
     * create builder for CartDiscountValueFixedDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueFixedDraftBuilder builder(final CartDiscountValueFixedDraft template) {
        return CartDiscountValueFixedDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueFixedDraft(Function<CartDiscountValueFixedDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixedDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixedDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueFixedDraft>";
            }
        };
    }
}
