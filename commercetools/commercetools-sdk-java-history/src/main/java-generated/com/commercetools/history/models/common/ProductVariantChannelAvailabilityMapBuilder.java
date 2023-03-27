
package com.commercetools.history.models.common;

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
 *             .//(//Builder -> //Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantChannelAvailabilityMapBuilder implements Builder<ProductVariantChannelAvailabilityMap> {

    private Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */

    public ProductVariantChannelAvailabilityMapBuilder values(
            final Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> values) {
        this.values = values;
        return this;
    }

    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ProductVariantChannelAvailabilityMapBuilder addValue(final String key,
            final com.commercetools.history.models.common.ProductVariantChannelAvailability value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     * values of pattern properties
     * @return pattern properties
     */

    public Map<String, com.commercetools.history.models.common.ProductVariantChannelAvailability> getValues() {
        return this.values;
    }

    /**
     * builds ProductVariantChannelAvailabilityMap with checking for non-null required values
     * @return ProductVariantChannelAvailabilityMap
     */
    public ProductVariantChannelAvailabilityMap build() {
        return new ProductVariantChannelAvailabilityMapImpl(values);
    }

    /**
     * builds ProductVariantChannelAvailabilityMap without checking for non-null required values
     * @return ProductVariantChannelAvailabilityMap
     */
    public ProductVariantChannelAvailabilityMap buildUnchecked() {
        return new ProductVariantChannelAvailabilityMapImpl(values);
    }

    /**
     * factory method for an instance of ProductVariantChannelAvailabilityMapBuilder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityMapBuilder of() {
        return new ProductVariantChannelAvailabilityMapBuilder();
    }

    /**
     * create builder for ProductVariantChannelAvailabilityMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantChannelAvailabilityMapBuilder of(final ProductVariantChannelAvailabilityMap template) {
        ProductVariantChannelAvailabilityMapBuilder builder = new ProductVariantChannelAvailabilityMapBuilder();
        builder.values = template.values();
        return builder;
    }

}
