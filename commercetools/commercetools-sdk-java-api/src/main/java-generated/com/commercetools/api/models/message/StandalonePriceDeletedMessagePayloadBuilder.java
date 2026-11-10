
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDeletedMessagePayload standalonePriceDeletedMessagePayload = StandalonePriceDeletedMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDeletedMessagePayloadBuilder implements Builder<StandalonePriceDeletedMessagePayload> {

    private String sku;

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the deleted Standalone Price was associated.</p>
     * @param sku value to be set
     * @return Builder
     */

    public StandalonePriceDeletedMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the deleted Standalone Price was associated.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     * builds StandalonePriceDeletedMessagePayload with checking for non-null required values
     * @return StandalonePriceDeletedMessagePayload
     */
    public StandalonePriceDeletedMessagePayload build() {
        Objects.requireNonNull(sku, StandalonePriceDeletedMessagePayload.class + ": sku is missing");
        return new StandalonePriceDeletedMessagePayloadImpl(sku);
    }

    /**
     * builds StandalonePriceDeletedMessagePayload without checking for non-null required values
     * @return StandalonePriceDeletedMessagePayload
     */
    public StandalonePriceDeletedMessagePayload buildUnchecked() {
        return new StandalonePriceDeletedMessagePayloadImpl(sku);
    }

    /**
     * factory method for an instance of StandalonePriceDeletedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder of() {
        return new StandalonePriceDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceDeletedMessagePayloadBuilder of(final StandalonePriceDeletedMessagePayload template) {
        StandalonePriceDeletedMessagePayloadBuilder builder = new StandalonePriceDeletedMessagePayloadBuilder();
        builder.sku = template.getSku();
        return builder;
    }

}
