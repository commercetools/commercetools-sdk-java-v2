
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
 *             .lineItemId("{lineItemId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeLineItemQuantityActionBuilder
        implements Builder<StagedOrderChangeLineItemQuantityAction> {

    private String lineItemId;

    private Long quantity;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     * @param quantity value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param builder function to build the externalPrice value
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     * @param externalPrice value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    /**
     *
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
     *
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public StagedOrderChangeLineItemQuantityActionBuilder externalTotalPrice(
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

    /**
     * builds StagedOrderChangeLineItemQuantityAction with checking for non-null required values
     * @return StagedOrderChangeLineItemQuantityAction
     */
    public StagedOrderChangeLineItemQuantityAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderChangeLineItemQuantityAction.class + ": lineItemId is missing");
        Objects.requireNonNull(quantity, StagedOrderChangeLineItemQuantityAction.class + ": quantity is missing");
        return new StagedOrderChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    /**
     * builds StagedOrderChangeLineItemQuantityAction without checking for non-null required values
     * @return StagedOrderChangeLineItemQuantityAction
     */
    public StagedOrderChangeLineItemQuantityAction buildUnchecked() {
        return new StagedOrderChangeLineItemQuantityActionImpl(lineItemId, quantity, externalPrice, externalTotalPrice);
    }

    public static StagedOrderChangeLineItemQuantityActionBuilder of() {
        return new StagedOrderChangeLineItemQuantityActionBuilder();
    }

    public static StagedOrderChangeLineItemQuantityActionBuilder of(
            final StagedOrderChangeLineItemQuantityAction template) {
        StagedOrderChangeLineItemQuantityActionBuilder builder = new StagedOrderChangeLineItemQuantityActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.quantity = template.getQuantity();
        builder.externalPrice = template.getExternalPrice();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
