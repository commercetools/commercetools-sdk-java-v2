
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeLineItemQuantityActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeLineItemQuantityAction stagedOrderChangeLineItemQuantityAction = StagedOrderChangeLineItemQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeLineItemQuantityActionBuilder
        implements Builder<StagedOrderChangeLineItemQuantityAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     * set the value to the quantity
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder withExternalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @param externalPrice value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     * set the value to the externalTotalPrice using the builder function
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the externalTotalPrice using the builder function
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder withExternalTotalPrice(
            Function<com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder, com.commercetools.api.models.cart.ExternalLineItemTotalPrice> builder) {
        this.externalTotalPrice = builder
                .apply(com.commercetools.api.models.cart.ExternalLineItemTotalPriceBuilder.of());
        return this;
    }

    /**
     * set the value to the externalTotalPrice
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     * value of quantity}
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Draft type that stores amounts only in cent precision for the specified currency.</p>
     * @return externalPrice
     */

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    /**
     * value of externalTotalPrice}
     * @return externalTotalPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     * builds StagedOrderChangeLineItemQuantityAction with checking for non-null required values
     * @return StagedOrderChangeLineItemQuantityAction
     */
    public StagedOrderChangeLineItemQuantityAction build() {
        Objects.requireNonNull(quantity, StagedOrderChangeLineItemQuantityAction.class + ": quantity is missing");
        return new StagedOrderChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity, externalPrice,
            externalTotalPrice);
    }

    /**
     * builds StagedOrderChangeLineItemQuantityAction without checking for non-null required values
     * @return StagedOrderChangeLineItemQuantityAction
     */
    public StagedOrderChangeLineItemQuantityAction buildUnchecked() {
        return new StagedOrderChangeLineItemQuantityActionImpl(lineItemId, lineItemKey, quantity, externalPrice,
            externalTotalPrice);
    }

    /**
     * factory method for an instance of StagedOrderChangeLineItemQuantityActionBuilder
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder of() {
        return new StagedOrderChangeLineItemQuantityActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeLineItemQuantityAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeLineItemQuantityActionBuilder of(
            final StagedOrderChangeLineItemQuantityAction template) {
        StagedOrderChangeLineItemQuantityActionBuilder builder = new StagedOrderChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
