
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantChannelAvailabilityMapBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantChannelAvailabilityMap productVariantChannelAvailabilityMap = ProductVariantChannelAvailabilityMap.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantChannelAvailabilityMapBuilder implements Builder<ProductVariantChannelAvailabilityMap> {

    public ProductVariantChannelAvailabilityMap build() {
        return new ProductVariantChannelAvailabilityMapImpl();
    }

    /**
     * builds ProductVariantChannelAvailabilityMap without checking for non null required values
     */
    public ProductVariantChannelAvailabilityMap buildUnchecked() {
        return new ProductVariantChannelAvailabilityMapImpl();
    }

    public static ProductVariantChannelAvailabilityMapBuilder of() {
        return new ProductVariantChannelAvailabilityMapBuilder();
    }

    public static ProductVariantChannelAvailabilityMapBuilder of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapBuilder builder = new ProductVariantChannelAvailabilityMapBuilder();
        return builder;
    }

}
