
package com.commercetools.api.models.variant_attributes;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesChannelAvailabilityBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesChannelAvailability variantAttributesChannelAvailability = VariantAttributesChannelAvailability.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesChannelAvailabilityBuilder implements Builder<VariantAttributesChannelAvailability> {

    @Nullable
    private Boolean isOnStock;

    @Nullable
    private Long availableQuantity;

    /**
     *  <p>Indicates whether the Variant is in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param isOnStock value to be set
     * @return Builder
     */

    public VariantAttributesChannelAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     *  <p>Number of items of this Variant that are in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param availableQuantity value to be set
     * @return Builder
     */

    public VariantAttributesChannelAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     *  <p>Indicates whether the Variant is in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return isOnStock
     */

    @Nullable
    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     *  <p>Number of items of this Variant that are in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return availableQuantity
     */

    @Nullable
    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     * builds VariantAttributesChannelAvailability with checking for non-null required values
     * @return VariantAttributesChannelAvailability
     */
    public VariantAttributesChannelAvailability build() {
        return new VariantAttributesChannelAvailabilityImpl(isOnStock, availableQuantity);
    }

    /**
     * builds VariantAttributesChannelAvailability without checking for non-null required values
     * @return VariantAttributesChannelAvailability
     */
    public VariantAttributesChannelAvailability buildUnchecked() {
        return new VariantAttributesChannelAvailabilityImpl(isOnStock, availableQuantity);
    }

    /**
     * factory method for an instance of VariantAttributesChannelAvailabilityBuilder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityBuilder of() {
        return new VariantAttributesChannelAvailabilityBuilder();
    }

    /**
     * create builder for VariantAttributesChannelAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesChannelAvailabilityBuilder of(final VariantAttributesChannelAvailability template) {
        VariantAttributesChannelAvailabilityBuilder builder = new VariantAttributesChannelAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        return builder;
    }

}
