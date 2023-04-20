
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryDeletedMessagePayload inventoryEntryDeletedMessagePayload = InventoryEntryDeletedMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryDeletedMessagePayloadBuilder implements Builder<InventoryEntryDeletedMessagePayload> {

    private String sku;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>The <code>sku</code> of the InventoryEntry that was deleted.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryDeletedMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryDeletedMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryDeletedMessagePayloadBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryDeletedMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the InventoryEntry that was deleted.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Reference to the Channel where the InventoryEntry was deleted.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntryDeletedMessagePayload with checking for non-null required values
     * @return InventoryEntryDeletedMessagePayload
     */
    public InventoryEntryDeletedMessagePayload build() {
        Objects.requireNonNull(sku, InventoryEntryDeletedMessagePayload.class + ": sku is missing");
        return new InventoryEntryDeletedMessagePayloadImpl(sku, supplyChannel);
    }

    /**
     * builds InventoryEntryDeletedMessagePayload without checking for non-null required values
     * @return InventoryEntryDeletedMessagePayload
     */
    public InventoryEntryDeletedMessagePayload buildUnchecked() {
        return new InventoryEntryDeletedMessagePayloadImpl(sku, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntryDeletedMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryDeletedMessagePayloadBuilder of() {
        return new InventoryEntryDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryDeletedMessagePayloadBuilder of(final InventoryEntryDeletedMessagePayload template) {
        InventoryEntryDeletedMessagePayloadBuilder builder = new InventoryEntryDeletedMessagePayloadBuilder();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
