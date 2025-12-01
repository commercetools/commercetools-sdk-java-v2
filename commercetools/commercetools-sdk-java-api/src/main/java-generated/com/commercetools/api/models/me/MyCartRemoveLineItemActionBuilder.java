
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveLineItemAction myCartRemoveLineItemAction = MyCartRemoveLineItemAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemoveLineItemActionBuilder implements Builder<MyCartRemoveLineItemAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Amount to subtract from the LineItem quantity. If omitted, the LineItem is removed from the Cart.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder quantity(@Nullable final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder withExternalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param externalPrice value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder withExternalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPrice> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @param builder function to build the shippingDetailsToRemove value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder shippingDetailsToRemove(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetailsToRemove = builder
                .apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @param builder function to build the shippingDetailsToRemove value
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder withShippingDetailsToRemove(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetailsToRemove = builder
                .apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @param shippingDetailsToRemove value to be set
     * @return Builder
     */

    public MyCartRemoveLineItemActionBuilder shippingDetailsToRemove(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetailsToRemove) {
        this.shippingDetailsToRemove = shippingDetailsToRemove;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Amount to subtract from the LineItem quantity. If omitted, the LineItem is removed from the Cart.</p>
     * @return quantity
     */

    @Nullable
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalPrice</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @return externalPrice
     */

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> and <code>totalPrice</code> to the given value when decreasing the quantity of a Line Item with the <code>ExternalTotal</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
     * @return externalTotalPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     *  <p>Container for Line Item-specific addresses to remove.</p>
     * @return shippingDetailsToRemove
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetailsToRemove() {
        return this.shippingDetailsToRemove;
    }

    /**
     * builds MyCartRemoveLineItemAction with checking for non-null required values
     * @return MyCartRemoveLineItemAction
     */
    public MyCartRemoveLineItemAction build() {
        return new MyCartRemoveLineItemActionImpl(lineItemId, lineItemKey, quantity, externalPrice, externalTotalPrice,
            shippingDetailsToRemove);
    }

    /**
     * builds MyCartRemoveLineItemAction without checking for non-null required values
     * @return MyCartRemoveLineItemAction
     */
    public MyCartRemoveLineItemAction buildUnchecked() {
        return new MyCartRemoveLineItemActionImpl(lineItemId, lineItemKey, quantity, externalPrice, externalTotalPrice,
            shippingDetailsToRemove);
    }

    /**
     * factory method for an instance of MyCartRemoveLineItemActionBuilder
     * @return builder
     */
    public static MyCartRemoveLineItemActionBuilder of() {
        return new MyCartRemoveLineItemActionBuilder();
    }

    /**
     * create builder for MyCartRemoveLineItemAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemoveLineItemActionBuilder of(final MyCartRemoveLineItemAction template) {
        MyCartRemoveLineItemActionBuilder builder = new MyCartRemoveLineItemActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        builder.shippingDetailsToRemove = template.getShippingDetailsToRemove();
        return builder;
    }

}
