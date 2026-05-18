
package com.commercetools.history.models.label;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceLabel standalonePriceLabel = StandalonePriceLabel.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceLabelBuilder implements Builder<StandalonePriceLabel> {

    @Nullable
    private String key;

    private String sku;

    /**
     *  <p>User-defined unique identifier of the Standalone Price.</p>
     * @param key value to be set
     * @return Builder
     */

    public StandalonePriceLabelBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique Product SKU variant identifier to which the Standalone Price is associated.</p>
     * @param sku value to be set
     * @return Builder
     */

    public StandalonePriceLabelBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Standalone Price.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique Product SKU variant identifier to which the Standalone Price is associated.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     * builds StandalonePriceLabel with checking for non-null required values
     * @return StandalonePriceLabel
     */
    public StandalonePriceLabel build() {
        Objects.requireNonNull(sku, StandalonePriceLabel.class + ": sku is missing");
        return new StandalonePriceLabelImpl(key, sku);
    }

    /**
     * builds StandalonePriceLabel without checking for non-null required values
     * @return StandalonePriceLabel
     */
    public StandalonePriceLabel buildUnchecked() {
        return new StandalonePriceLabelImpl(key, sku);
    }

    /**
     * factory method for an instance of StandalonePriceLabelBuilder
     * @return builder
     */
    public static StandalonePriceLabelBuilder of() {
        return new StandalonePriceLabelBuilder();
    }

    /**
     * create builder for StandalonePriceLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceLabelBuilder of(final StandalonePriceLabel template) {
        StandalonePriceLabelBuilder builder = new StandalonePriceLabelBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        return builder;
    }

}
