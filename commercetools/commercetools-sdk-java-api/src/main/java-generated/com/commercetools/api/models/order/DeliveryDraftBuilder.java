package com.commercetools.api.models.order;

import com.commercetools.api.models.common.AddressDraft;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.order.DeliveryDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryDraft deliveryDraft = DeliveryDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DeliveryDraftBuilder implements Builder<DeliveryDraft> {

    
    @Nullable
    private String key;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;
    
    
    @Nullable
    private com.commercetools.api.models.common.AddressDraft address;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    
    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param items value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder items(@Nullable final com.commercetools.api.models.order.DeliveryItem ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param items value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder items(@Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param items value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder plusItems(@Nullable final com.commercetools.api.models.order.DeliveryItem ...items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }
    
    
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */
    
    public DeliveryDraftBuilder plusItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */
    
    public DeliveryDraftBuilder withItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */
    
    public DeliveryDraftBuilder addItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @param builder function to build the items value
     * @return Builder
     */
    
    public DeliveryDraftBuilder setItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }
                    
    
    /**
     * set values to the parcels
     * @param parcels value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder parcels(@Nullable final com.commercetools.api.models.order.ParcelDraft ...parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }
    
    /**
     * set value to the parcels
     * @param parcels value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder parcels(@Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }
    
    /**
     * add values to the parcels
     * @param parcels value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder plusParcels(@Nullable final com.commercetools.api.models.order.ParcelDraft ...parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }
    
    
    
    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */
    
    public DeliveryDraftBuilder plusParcels(Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */
    
    public DeliveryDraftBuilder withParcels(Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */
    
    public DeliveryDraftBuilder addParcels(Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return plusParcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }
    
    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */
    
    public DeliveryDraftBuilder setParcels(Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return parcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }
                    
    
    
    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */
    
    public DeliveryDraftBuilder address(Function<com.commercetools.api.models.common.AddressDraftBuilder, com.commercetools.api.models.common.AddressDraftBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressDraftBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */
    
    public DeliveryDraftBuilder withAddress(Function<com.commercetools.api.models.common.AddressDraftBuilder, com.commercetools.api.models.common.AddressDraft> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressDraftBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the address
     * @param address value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder address(@Nullable final com.commercetools.api.models.common.AddressDraft address) {
        this.address = address;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public DeliveryDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public DeliveryDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public DeliveryDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Items which are shipped in this delivery regardless their distribution over several parcels. Can also be specified individually for each Parcel.</p>
     * @return items
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }
    
    /**
     * value of parcels}
     * @return parcels
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels(){
        return this.parcels;
    }
    
    /**
     * value of address}
     * @return address
     */
    
    @Nullable
    public com.commercetools.api.models.common.AddressDraft getAddress(){
        return this.address;
    }
    
    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds DeliveryDraft with checking for non-null required values
     * @return DeliveryDraft
     */
    public DeliveryDraft build() {
        return new DeliveryDraftImpl(key, items, parcels, address, custom);
    }
    
    /**
     * builds DeliveryDraft without checking for non-null required values
     * @return DeliveryDraft
     */
    public DeliveryDraft buildUnchecked() {
        return new DeliveryDraftImpl(key, items, parcels, address, custom);
    }

    /**
     * factory method for an instance of DeliveryDraftBuilder
     * @return builder 
     */
    public static DeliveryDraftBuilder of() {
        return new DeliveryDraftBuilder();
    }

    /**
     * create builder for DeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryDraftBuilder of(final DeliveryDraft template) {
        DeliveryDraftBuilder builder = new DeliveryDraftBuilder();
        builder.key = template.getKey();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        return builder;
    }

}
