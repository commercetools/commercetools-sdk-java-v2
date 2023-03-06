
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeLineItemQuantityActionBuilder implements Builder<MyCartChangeLineItemQuantityAction> {

    private String lineItemId;

    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     *  <p>If <code>0</code>, the Line Item is removed from the Cart.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> to the given value when changing the quantity of a Line Item with the <code>ExternalPrice</code> LineItemPriceMode.</p>
     *  <p>The LineItem price is updated as described in LineItem Price selection.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the LineItem <code>price</code> and <code>totalPrice</code> to the given value when changing the quantity of a Line Item with the <code>ExternalTotal</code> LineItemPriceMode.</p>
     */

    public MyCartChangeLineItemQuantityActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    public MyCartChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId, MyCartChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, MyCartChangeLineItemQuantityAction.class + ": quantity is missing");
        return new MyCartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    /**
     * builds MyCartChangeLineItemQuantityAction without checking for non null required values
     */
    public MyCartChangeLineItemQuantityAction buildUnchecked() {
        return new MyCartChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    public static MyCartChangeLineItemQuantityActionBuilder of() {
        return new MyCartChangeLineItemQuantityActionBuilder();
    }

    public static MyCartChangeLineItemQuantityActionBuilder of(final MyCartChangeLineItemQuantityAction template) {
        MyCartChangeLineItemQuantityActionBuilder builder = new MyCartChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
