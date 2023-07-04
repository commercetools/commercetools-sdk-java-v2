
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTotalPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTotalPriceAction stagedOrderSetLineItemTotalPriceAction = StagedOrderSetLineItemTotalPriceAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemTotalPriceActionBuilder implements Builder<StagedOrderSetLineItemTotalPriceAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTotalPriceActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTotalPriceActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     * set the value to the externalTotalPrice using the builder function
     * @param builder function to build the externalTotalPrice value
     * @return Builder
     */

    public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(
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

    public StagedOrderSetLineItemTotalPriceActionBuilder withExternalTotalPrice(
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

    public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(
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
     * value of externalTotalPrice}
     * @return externalTotalPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     * builds StagedOrderSetLineItemTotalPriceAction with checking for non-null required values
     * @return StagedOrderSetLineItemTotalPriceAction
     */
    public StagedOrderSetLineItemTotalPriceAction build() {
        return new StagedOrderSetLineItemTotalPriceActionImpl(lineItemId, lineItemKey, externalTotalPrice);
    }

    /**
     * builds StagedOrderSetLineItemTotalPriceAction without checking for non-null required values
     * @return StagedOrderSetLineItemTotalPriceAction
     */
    public StagedOrderSetLineItemTotalPriceAction buildUnchecked() {
        return new StagedOrderSetLineItemTotalPriceActionImpl(lineItemId, lineItemKey, externalTotalPrice);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemTotalPriceActionBuilder
     * @return builder
     */
    public static StagedOrderSetLineItemTotalPriceActionBuilder of() {
        return new StagedOrderSetLineItemTotalPriceActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemTotalPriceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemTotalPriceActionBuilder of(
            final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionBuilder builder = new StagedOrderSetLineItemTotalPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
