
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryOutOfStockMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryOutOfStockMessagePayload inventoryEntryOutOfStockMessagePayload = InventoryEntryOutOfStockMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryOutOfStockMessagePayloadBuilder implements Builder<InventoryEntryOutOfStockMessagePayload> {

    private String sku;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryOutOfStockMessagePayloadBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryOutOfStockMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryOutOfStockMessagePayloadBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryOutOfStockMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntryOutOfStockMessagePayload with checking for non-null required values
     * @return InventoryEntryOutOfStockMessagePayload
     */
    public InventoryEntryOutOfStockMessagePayload build() {
        Objects.requireNonNull(sku, InventoryEntryOutOfStockMessagePayload.class + ": sku is missing");
        return new InventoryEntryOutOfStockMessagePayloadImpl(sku, supplyChannel);
    }

    /**
     * builds InventoryEntryOutOfStockMessagePayload without checking for non-null required values
     * @return InventoryEntryOutOfStockMessagePayload
     */
    public InventoryEntryOutOfStockMessagePayload buildUnchecked() {
        return new InventoryEntryOutOfStockMessagePayloadImpl(sku, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntryOutOfStockMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryOutOfStockMessagePayloadBuilder of() {
        return new InventoryEntryOutOfStockMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryOutOfStockMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryOutOfStockMessagePayloadBuilder of(
            final InventoryEntryOutOfStockMessagePayload template) {
        InventoryEntryOutOfStockMessagePayloadBuilder builder = new InventoryEntryOutOfStockMessagePayloadBuilder();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
