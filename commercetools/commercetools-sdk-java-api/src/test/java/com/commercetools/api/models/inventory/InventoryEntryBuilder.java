package com.commercetools.api.models.inventory;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.inventory.InventoryEntry;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InventoryEntryBuilder {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    
    private String sku;
    
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    
    
    private Long quantityOnStock;
    
    
    
    private Long availableQuantity;
    
    
    @Nullable
    private Long restockableInDays;
    
    
    @Nullable
    private java.time.ZonedDateTime expectedDelivery;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    
    public InventoryEntryBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    public InventoryEntryBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    public InventoryEntryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    public InventoryEntryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    public InventoryEntryBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    public InventoryEntryBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    public InventoryEntryBuilder sku( final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    public InventoryEntryBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }
    
    
    public InventoryEntryBuilder quantityOnStock( final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
        return this;
    }
    
    
    public InventoryEntryBuilder availableQuantity( final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }
    
    
    public InventoryEntryBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }
    
    
    public InventoryEntryBuilder expectedDelivery(@Nullable final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }
    
    
    public InventoryEntryBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    
    
    public String getId(){
        return this.id;
    }
    
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    
    
    public Long getQuantityOnStock(){
        return this.quantityOnStock;
    }
    
    
    
    public Long getAvailableQuantity(){
        return this.availableQuantity;
    }
    
    
    @Nullable
    public Long getRestockableInDays(){
        return this.restockableInDays;
    }
    
    
    @Nullable
    public java.time.ZonedDateTime getExpectedDelivery(){
        return this.expectedDelivery;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    public InventoryEntry build() {
        return new InventoryEntryImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sku, supplyChannel, quantityOnStock, availableQuantity, restockableInDays, expectedDelivery, custom);
    }

    public static InventoryEntryBuilder of() {
        return new InventoryEntryBuilder();
    }

    public static InventoryEntryBuilder of(final InventoryEntry template) {
        InventoryEntryBuilder builder = new InventoryEntryBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sku = template.getSku();
        builder.supplyChannel = template.getSupplyChannel();
        builder.quantityOnStock = template.getQuantityOnStock();
        builder.availableQuantity = template.getAvailableQuantity();
        builder.restockableInDays = template.getRestockableInDays();
        builder.expectedDelivery = template.getExpectedDelivery();
        builder.custom = template.getCustom();
        return builder;
    }

}
