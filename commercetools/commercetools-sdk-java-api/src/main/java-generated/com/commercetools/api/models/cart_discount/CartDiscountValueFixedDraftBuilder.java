package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueFixedDraftBuilder
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
public class CartDiscountValueFixedDraftBuilder implements Builder<CartDiscountValueFixedDraft> {

    
    
    private java.util.List<com.commercetools.api.models.common.Money> money;

    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder money( final com.commercetools.api.models.common.Money ...money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder money( final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder plusMoney( final com.commercetools.api.models.common.Money ...money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }
    
    
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder plusMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder withMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder addMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return plusMoney(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }
    
    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartDiscountValueFixedDraftBuilder setMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return money(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }
                    

    /**
     *  <p>Money values in different currencies. A fixed Cart Discount will only match a price if this array contains a value with the same currency. If it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     * @return money
     */
    
    
    public java.util.List<com.commercetools.api.models.common.Money> getMoney(){
        return this.money;
    }

    /**
     * builds CartDiscountValueFixedDraft with checking for non-null required values
     * @return CartDiscountValueFixedDraft
     */
    public CartDiscountValueFixedDraft build() {
        Objects.requireNonNull(money, CartDiscountValueFixedDraft.class + ": money is missing");
        return new CartDiscountValueFixedDraftImpl(money);
    }
    
    /**
     * builds CartDiscountValueFixedDraft without checking for non-null required values
     * @return CartDiscountValueFixedDraft
     */
    public CartDiscountValueFixedDraft buildUnchecked() {
        return new CartDiscountValueFixedDraftImpl(money);
    }

    /**
     * factory method for an instance of CartDiscountValueFixedDraftBuilder
     * @return builder 
     */
    public static CartDiscountValueFixedDraftBuilder of() {
        return new CartDiscountValueFixedDraftBuilder();
    }

    /**
     * create builder for CartDiscountValueFixedDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueFixedDraftBuilder of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftBuilder builder = new CartDiscountValueFixedDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
