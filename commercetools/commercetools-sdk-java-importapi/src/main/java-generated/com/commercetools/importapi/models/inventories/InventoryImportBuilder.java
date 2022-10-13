
package com.commercetools.importapi.models.inventories;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryImport inventoryImport = InventoryImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryImportBuilder implements Builder<InventoryImport> {

    private String key;

    private String sku;

    private Long quantityOnStock;

    @Nullable
    private Long restockableInDays;

    @Nullable
    private java.time.ZonedDateTime expectedDelivery;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>User-defined unique identifier.</p>
     */

    public InventoryImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.sku</code></p>
     */

    public InventoryImportBuilder sku(final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
     */

    public InventoryImportBuilder quantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.restockableInDays</code></p>
     */

    public InventoryImportBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.expectedDelivery</code></p>
     */

    public InventoryImportBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.supplyChannel</code></p>
     */

    public InventoryImportBuilder supplyChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.supplyChannel</code></p>
     */

    public InventoryImportBuilder supplyChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.custom</code>.</p>
     */

    public InventoryImportBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>Inventory.custom</code>.</p>
     */

    public InventoryImportBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
    }

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    @Nullable
    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public InventoryImport build() {
        Objects.requireNonNull(key, InventoryImport.class + ": key is missing");
        Objects.requireNonNull(sku, InventoryImport.class + ": sku is missing");
        Objects.requireNonNull(quantityOnStock, InventoryImport.class + ": quantityOnStock is missing");
        return new InventoryImportImpl(key, sku, quantityOnStock, restockableInDays, expectedDelivery, supplyChannel,
            custom);
    }

    /**
     * builds InventoryImport without checking for non null required values
     */
    public InventoryImport buildUnchecked() {
        return new InventoryImportImpl(key, sku, quantityOnStock, restockableInDays, expectedDelivery, supplyChannel,
            custom);
    }

    public static InventoryImportBuilder of() {
        return new InventoryImportBuilder();
    }

    public static InventoryImportBuilder of(final InventoryImport template) {
        InventoryImportBuilder builder = new InventoryImportBuilder();
        builder.key = template.getKey();
        builder.sku = template.getSku();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.supplyChannel = template.getSupplyChannel();
        builder.custom = template.getCustom();
        return builder;
    }

}
