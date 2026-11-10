
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraft.builder()
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryDraftBuilder implements Builder<InventoryEntryDraft> {

    private String sku;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private Long quantityOnStock;

    @Nullable
    private Integer minCartQuantity;

    @Nullable
    private Integer maxCartQuantity;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    @Nullable
    private Integer reservationExpirationInMinutes;

    @Nullable
    private com.commercetools.api.models.inventory.InventoryEntryStockLevels stockLevels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @param sku value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing InventoryEntries with the <span>Import API</span> and the <span>Merchant Center</span>.</p>
     * @param key value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntryDraftBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Overall amount of stock. See <span>Inventory checks and consistency</span> for consistency information.</p>
     * @param quantityOnStock value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder quantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p>Minimum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @param minCartQuantity value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder minCartQuantity(@Nullable final Integer minCartQuantity) {
        this.minCartQuantity = minCartQuantity;
        return this;
    }

    /**
     *  <p>Maximum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @param maxCartQuantity value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder maxCartQuantity(@Nullable final Integer maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
        return this;
    }

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @param restockableInDays value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *  <p>Date and time of the next restock.</p>
     * @param expectedDelivery value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    /**
     *  <p>Expiration time of <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> reservations associated with this InventoryEntry.</p>
     *  <ul>
     *   <li>A Reservation is <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> if it was created for a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> that is using the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode.</li>
     *   <li>If this field is empty, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>-level reservation expiration time applies.</li>
     *  </ul>
     * @param reservationExpirationInMinutes value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder reservationExpirationInMinutes(
            @Nullable final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @param builder function to build the stockLevels value
     * @return Builder
     */

    public InventoryEntryDraftBuilder stockLevels(
            Function<com.commercetools.api.models.inventory.InventoryEntryStockLevelsBuilder, com.commercetools.api.models.inventory.InventoryEntryStockLevelsBuilder> builder) {
        this.stockLevels = builder.apply(com.commercetools.api.models.inventory.InventoryEntryStockLevelsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @param builder function to build the stockLevels value
     * @return Builder
     */

    public InventoryEntryDraftBuilder withStockLevels(
            Function<com.commercetools.api.models.inventory.InventoryEntryStockLevelsBuilder, com.commercetools.api.models.inventory.InventoryEntryStockLevels> builder) {
        this.stockLevels = builder.apply(com.commercetools.api.models.inventory.InventoryEntryStockLevelsBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @param stockLevels value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder stockLevels(
            @Nullable final com.commercetools.api.models.inventory.InventoryEntryStockLevels stockLevels) {
        this.stockLevels = stockLevels;
        return this;
    }

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public InventoryEntryDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public InventoryEntryDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
     * @param custom value to be set
     * @return Builder
     */

    public InventoryEntryDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @return sku
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing InventoryEntries with the <span>Import API</span> and the <span>Merchant Center</span>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Overall amount of stock. See <span>Inventory checks and consistency</span> for consistency information.</p>
     * @return quantityOnStock
     */

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p>Minimum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @return minCartQuantity
     */

    @Nullable
    public Integer getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Maximum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @return maxCartQuantity
     */

    @Nullable
    public Integer getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @return restockableInDays
     */

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     *  <p>Date and time of the next restock.</p>
     * @return expectedDelivery
     */

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    /**
     *  <p>Expiration time of <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> reservations associated with this InventoryEntry.</p>
     *  <ul>
     *   <li>A Reservation is <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> if it was created for a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> that is using the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode.</li>
     *   <li>If this field is empty, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>-level reservation expiration time applies.</li>
     *  </ul>
     * @return reservationExpirationInMinutes
     */

    @Nullable
    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @return stockLevels
     */

    @Nullable
    public com.commercetools.api.models.inventory.InventoryEntryStockLevels getStockLevels() {
        return this.stockLevels;
    }

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds InventoryEntryDraft with checking for non-null required values
     * @return InventoryEntryDraft
     */
    public InventoryEntryDraft build() {
        Objects.requireNonNull(sku, InventoryEntryDraft.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock, InventoryEntryDraft.class + ": quantityOnStock is missing");
        return new InventoryEntryDraftImpl(sku, key, supplyChannel, quantityOnStock, minCartQuantity, maxCartQuantity,
            restockableInDays, expectedDelivery, reservationExpirationInMinutes, stockLevels, custom);
    }

    /**
     * builds InventoryEntryDraft without checking for non-null required values
     * @return InventoryEntryDraft
     */
    public InventoryEntryDraft buildUnchecked() {
        return new InventoryEntryDraftImpl(sku, key, supplyChannel, quantityOnStock, minCartQuantity, maxCartQuantity,
            restockableInDays, expectedDelivery, reservationExpirationInMinutes, stockLevels, custom);
    }

    /**
     * factory method for an instance of InventoryEntryDraftBuilder
     * @return builder
     */
    public static InventoryEntryDraftBuilder of() {
        return new InventoryEntryDraftBuilder();
    }

    /**
     * create builder for InventoryEntryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryDraftBuilder of(final InventoryEntryDraft template) {
        InventoryEntryDraftBuilder builder = new InventoryEntryDraftBuilder();
        builder.sku = template.getSku();
        builder.key = template.getKey();
        builder.supplyChannel = template.getSupplyChannel();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.minCartQuantity = template.getMinCartQuantity();
        builder.maxCartQuantity = template.getMaxCartQuantity();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.reservationExpirationInMinutes = template.getReservationExpirationInMinutes();
        builder.stockLevels = template.getStockLevels();
        builder.custom = template.getCustom();
        return builder;
    }

}
