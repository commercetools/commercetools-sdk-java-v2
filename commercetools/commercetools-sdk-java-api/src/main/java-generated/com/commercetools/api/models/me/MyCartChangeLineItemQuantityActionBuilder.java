package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartChangeLineItemQuantityAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartChangeLineItemQuantityAction myCartChangeLineItemQuantityAction = MyCartChangeLineItemQuantityAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartChangeLineItemQuantityActionBuilder implements Builder<MyCartChangeLineItemQuantityAction> {

    
    
    private String lineItemId;
    
    
    
    private Long quantity;
    
    
    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    
    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder externalPrice(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder withExternalPrice(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @param externalPrice value to be set
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder externalPrice(@Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }
    
    
    
    
    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder externalTotalPrice(Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder.apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder withExternalTotalPrice(Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPrice> builder) {
        this.externalTotalPrice = builder.apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @param externalTotalPrice value to be set
     * @return Builder
     */
    
    public MyCartChangeLineItemQuantityActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }
    
    

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     * @return externalPrice
     */
    
    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice(){
        return this.externalPrice;
    }
    
    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     * @return externalTotalPrice
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
        return this.externalTotalPrice;
    }

    /**
     * builds MyCartChangeLineItemQuantityAction with checking for non-null required values
     * @return MyCartChangeLineItemQuantityAction
     */
    public MyCartChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId, MyCartChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, MyCartChangeLineItemQuantityAction.class + ": quantity is missing");
        return new MyCartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }
    
    /**
     * builds MyCartChangeLineItemQuantityAction without checking for non-null required values
     * @return MyCartChangeLineItemQuantityAction
     */
    public MyCartChangeLineItemQuantityAction buildUnchecked() {
        return new MyCartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    /**
     * factory method for an instance of MyCartChangeLineItemQuantityActionBuilder
     * @return builder 
     */
    public static MyCartChangeLineItemQuantityActionBuilder of() {
        return new MyCartChangeLineItemQuantityActionBuilder();
    }

    /**
     * create builder for MyCartChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartChangeLineItemQuantityActionBuilder of(final MyCartChangeLineItemQuantityAction template) {
        MyCartChangeLineItemQuantityActionBuilder builder = new MyCartChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
