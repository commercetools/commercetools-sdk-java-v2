
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
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetLineItemTotalPriceActionBuilder implements Builder<StagedOrderSetLineItemTotalPriceAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice;

    /**
     *
     * @param lineItemId value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTotalPriceActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
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
     *
     * @param externalTotalPrice value to be set
     * @return Builder
     */

    public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(
            @Nullable final com.commercetools.api.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
        this.externalTotalPrice = externalTotalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice() {
        return this.externalTotalPrice;
    }

    /**
     * builds StagedOrderSetLineItemTotalPriceAction with checking for non-null required values
     * @return StagedOrderSetLineItemTotalPriceAction
     */
    public StagedOrderSetLineItemTotalPriceAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemTotalPriceAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemTotalPriceActionImpl(lineItemId, externalTotalPrice);
    }

    /**
     * builds StagedOrderSetLineItemTotalPriceAction without checking for non-null required values
     * @return StagedOrderSetLineItemTotalPriceAction
     */
    public StagedOrderSetLineItemTotalPriceAction buildUnchecked() {
        return new StagedOrderSetLineItemTotalPriceActionImpl(lineItemId, externalTotalPrice);
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder of() {
        return new StagedOrderSetLineItemTotalPriceActionBuilder();
    }

    public static StagedOrderSetLineItemTotalPriceActionBuilder of(
            final StagedOrderSetLineItemTotalPriceAction template) {
        StagedOrderSetLineItemTotalPriceActionBuilder builder = new StagedOrderSetLineItemTotalPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTotalPrice = template.getExternalTotalPrice();
        return builder;
    }

}
