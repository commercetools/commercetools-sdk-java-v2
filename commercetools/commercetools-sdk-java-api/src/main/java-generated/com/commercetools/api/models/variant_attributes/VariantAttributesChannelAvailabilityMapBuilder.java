
package com.commercetools.api.models.variant_attributes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesChannelAvailabilityMapBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesChannelAvailabilityMap variantAttributesChannelAvailabilityMap = VariantAttributesChannelAvailabilityMap.builder()
 *             ./^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/(/^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/Builder -> /^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$/Builder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesChannelAvailabilityMapBuilder
        implements Builder<VariantAttributesChannelAvailabilityMap> {

    private Map<String, com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailability> values = new HashMap<>();

    /**
     *  <p>The availability for a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param values properties to be set
     * @return Builder
     */

    public VariantAttributesChannelAvailabilityMapBuilder values(
            final Map<String, com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailability> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>The availability for a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public VariantAttributesChannelAvailabilityMapBuilder addValue(final String key,
            final com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailability value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>The availability for a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return pattern properties
     */

    public Map<String, com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailability> getValues() {
        return this.values;
    }

    /**
     * builds VariantAttributesChannelAvailabilityMap with checking for non-null required values
     * @return VariantAttributesChannelAvailabilityMap
     */
    public VariantAttributesChannelAvailabilityMap build() {
        return new VariantAttributesChannelAvailabilityMapImpl(values);
    }

    /**
     * builds VariantAttributesChannelAvailabilityMap without checking for non-null required values
     * @return VariantAttributesChannelAvailabilityMap
     */
    public VariantAttributesChannelAvailabilityMap buildUnchecked() {
        return new VariantAttributesChannelAvailabilityMapImpl(values);
    }

    /**
     * factory method for an instance of VariantAttributesChannelAvailabilityMapBuilder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityMapBuilder of() {
        return new VariantAttributesChannelAvailabilityMapBuilder();
    }

    /**
     * create builder for VariantAttributesChannelAvailabilityMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityMapBuilder of(
            final VariantAttributesChannelAvailabilityMap template) {
        VariantAttributesChannelAvailabilityMapBuilder builder = new VariantAttributesChannelAvailabilityMapBuilder();
        builder.values = template.values();
        return builder;
    }

}
