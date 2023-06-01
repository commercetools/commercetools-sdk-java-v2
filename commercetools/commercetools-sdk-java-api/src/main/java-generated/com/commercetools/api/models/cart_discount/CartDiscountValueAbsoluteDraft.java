package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftImpl;

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
 * CartDiscountValueAbsoluteDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = CartDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CartDiscountValueAbsoluteDraftImpl.class)
public interface CartDiscountValueAbsoluteDraft extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueAbsoluteDraft> {

    /**
     * discriminator value for CartDiscountValueAbsoluteDraft
     */
    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money values to be set
     */
    
    @JsonIgnore
    public void setMoney(final Money ...money);
    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money values to be set
     */
    
    public void setMoney(final List<Money> money);

    /**
     * factory method
     * @return instance of CartDiscountValueAbsoluteDraft
     */
    public static CartDiscountValueAbsoluteDraft of(){
        return new CartDiscountValueAbsoluteDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy CartDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueAbsoluteDraft of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueAbsoluteDraft deepCopy(@Nullable final CartDiscountValueAbsoluteDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream().map(com.commercetools.api.models.common.Money::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueAbsoluteDraft
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder builder() {
        return CartDiscountValueAbsoluteDraftBuilder.of();
    }
    
    /**
     * create builder for CartDiscountValueAbsoluteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder builder(final CartDiscountValueAbsoluteDraft template) {
        return CartDiscountValueAbsoluteDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueAbsoluteDraft(Function<CartDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueAbsoluteDraft>";
            }
        };
    }
}
