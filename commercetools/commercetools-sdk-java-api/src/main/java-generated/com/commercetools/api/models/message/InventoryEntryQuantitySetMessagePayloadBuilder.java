
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryQuantitySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryQuantitySetMessagePayload inventoryEntryQuantitySetMessagePayload = InventoryEntryQuantitySetMessagePayload.builder()
 *             .oldQuantityOnStock(0.3)
 *             .newQuantityOnStock(0.3)
 *             .oldAvailableQuantity(0.3)
 *             .newAvailableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryQuantitySetMessagePayloadBuilder
        implements Builder<InventoryEntryQuantitySetMessagePayload> {

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    @Nullable
    private String sku;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     * @param oldQuantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder oldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        return this;
    }

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     * @param newQuantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder newQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
        return this;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     * @param oldAvailableQuantity value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder oldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
        return this;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     * @param newAvailableQuantity value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder newAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
        return this;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for which the quantity was updated.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity was set.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity was set.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity was set.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryQuantitySetMessagePayloadBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     * @return oldQuantityOnStock
     */

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     * @return newQuantityOnStock
     */

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     * @return oldAvailableQuantity
     */

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     * @return newAvailableQuantity
     */

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for which the quantity was updated.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity was set.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntryQuantitySetMessagePayload with checking for non-null required values
     * @return InventoryEntryQuantitySetMessagePayload
     */
    public InventoryEntryQuantitySetMessagePayload build() {
        Objects.requireNonNull(oldQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": oldQuantityOnStock is missing");
        Objects.requireNonNull(newQuantityOnStock,
            InventoryEntryQuantitySetMessagePayload.class + ": newQuantityOnStock is missing");
        Objects.requireNonNull(oldAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": oldAvailableQuantity is missing");
        Objects.requireNonNull(newAvailableQuantity,
            InventoryEntryQuantitySetMessagePayload.class + ": newAvailableQuantity is missing");
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity, sku, supplyChannel);
    }

    /**
     * builds InventoryEntryQuantitySetMessagePayload without checking for non-null required values
     * @return InventoryEntryQuantitySetMessagePayload
     */
    public InventoryEntryQuantitySetMessagePayload buildUnchecked() {
        return new InventoryEntryQuantitySetMessagePayloadImpl(oldQuantityOnStock, newQuantityOnStock,
            oldAvailableQuantity, newAvailableQuantity, sku, supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntryQuantitySetMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessagePayloadBuilder of() {
        return new InventoryEntryQuantitySetMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryQuantitySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryQuantitySetMessagePayloadBuilder of(
            final InventoryEntryQuantitySetMessagePayload template) {
        InventoryEntryQuantitySetMessagePayloadBuilder builder = new InventoryEntryQuantitySetMessagePayloadBuilder();
        builder.oldQuantityOnStock = template.getOldQuantityOnStock();
        builder.newQuantityOnStock = template.getNewQuantityOnStock();
        builder.oldAvailableQuantity = template.getOldAvailableQuantity();
        builder.newAvailableQuantity = template.getNewAvailableQuantity();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
