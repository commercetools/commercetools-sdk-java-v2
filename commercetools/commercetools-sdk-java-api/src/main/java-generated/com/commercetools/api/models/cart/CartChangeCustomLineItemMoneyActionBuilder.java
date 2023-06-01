package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemMoneyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemMoneyAction cartChangeCustomLineItemMoneyAction = CartChangeCustomLineItemMoneyAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .money(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartChangeCustomLineItemMoneyActionBuilder implements Builder<CartChangeCustomLineItemMoneyAction> {

    
    
    private String customLineItemId;
    
    
    
    private com.commercetools.api.models.common.Money money;

    
    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */
    
    public CartChangeCustomLineItemMoneyActionBuilder customLineItemId( final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartChangeCustomLineItemMoneyActionBuilder money(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CartChangeCustomLineItemMoneyActionBuilder withMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public CartChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>Value to set. Must not be empty. Can be a negative amount.</p>
     * @return money
     */
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }

    /**
     * builds CartChangeCustomLineItemMoneyAction with checking for non-null required values
     * @return CartChangeCustomLineItemMoneyAction
     */
    public CartChangeCustomLineItemMoneyAction build() {
        Objects.requireNonNull(customLineItemId, CartChangeCustomLineItemMoneyAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(money, CartChangeCustomLineItemMoneyAction.class + ": money is missing");
        return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }
    
    /**
     * builds CartChangeCustomLineItemMoneyAction without checking for non-null required values
     * @return CartChangeCustomLineItemMoneyAction
     */
    public CartChangeCustomLineItemMoneyAction buildUnchecked() {
        return new CartChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
    }

    /**
     * factory method for an instance of CartChangeCustomLineItemMoneyActionBuilder
     * @return builder 
     */
    public static CartChangeCustomLineItemMoneyActionBuilder of() {
        return new CartChangeCustomLineItemMoneyActionBuilder();
    }

    /**
     * create builder for CartChangeCustomLineItemMoneyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemMoneyActionBuilder of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionBuilder builder = new CartChangeCustomLineItemMoneyActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.money = template.getMoney();
        return builder;
    }

}
