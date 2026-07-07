
package com.commercetools.api.models.variant_attributes;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAttributesAvailabilityBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesAvailability variantAttributesAvailability = VariantAttributesAvailability.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesAvailabilityBuilder implements Builder<VariantAttributesAvailability> {

    @Nullable
    private Boolean isOnStock;

    @Nullable
    private Long availableQuantity;

    @Nullable
    private com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap channels;

    /**
     *  <p>Indicates whether the Variant is in stock.</p>
     * @param isOnStock value to be set
     * @return Builder
     */

    public VariantAttributesAvailabilityBuilder isOnStock(@Nullable final Boolean isOnStock) {
        this.isOnStock = isOnStock;
        return this;
    }

    /**
     *  <p>Number of items of this Variant that are in stock.</p>
     * @param availableQuantity value to be set
     * @return Builder
     */

    public VariantAttributesAvailabilityBuilder availableQuantity(@Nullable final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @param builder function to build the channels value
     * @return Builder
     */

    public VariantAttributesAvailabilityBuilder channels(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapBuilder> builder) {
        this.channels = builder
                .apply(
                    com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @param builder function to build the channels value
     * @return Builder
     */

    public VariantAttributesAvailabilityBuilder withChannels(
            Function<com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapBuilder, com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap> builder) {
        this.channels = builder.apply(
            com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMapBuilder.of());
        return this;
    }

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @param channels value to be set
     * @return Builder
     */

    public VariantAttributesAvailabilityBuilder channels(
            @Nullable final com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap channels) {
        this.channels = channels;
        return this;
    }

    /**
     *  <p>Indicates whether the Variant is in stock.</p>
     * @return isOnStock
     */

    @Nullable
    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     *  <p>Number of items of this Variant that are in stock.</p>
     * @return availableQuantity
     */

    @Nullable
    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     * @return channels
     */

    @Nullable
    public com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    /**
     * builds VariantAttributesAvailability with checking for non-null required values
     * @return VariantAttributesAvailability
     */
    public VariantAttributesAvailability build() {
        return new VariantAttributesAvailabilityImpl(isOnStock, availableQuantity, channels);
    }

    /**
     * builds VariantAttributesAvailability without checking for non-null required values
     * @return VariantAttributesAvailability
     */
    public VariantAttributesAvailability buildUnchecked() {
        return new VariantAttributesAvailabilityImpl(isOnStock, availableQuantity, channels);
    }

    /**
     * factory method for an instance of VariantAttributesAvailabilityBuilder
     * @return builder
     */
    public static VariantAttributesAvailabilityBuilder of() {
        return new VariantAttributesAvailabilityBuilder();
    }

    /**
     * create builder for VariantAttributesAvailability instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesAvailabilityBuilder of(final VariantAttributesAvailability template) {
        VariantAttributesAvailabilityBuilder builder = new VariantAttributesAvailabilityBuilder();
        builder.isOnStock = template.getIsOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.channels = template.getChannels();
        return builder;
    }

}
