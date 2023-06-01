package com.commercetools.importapi.models.order_patches;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.order_patches.ParcelItems;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelItemsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelItems parcelItems = ParcelItems.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ParcelItemsBuilder implements Builder<ParcelItems> {

    
    
    private String parcelId;
    
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    
    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */
    
    public ParcelItemsBuilder parcelId( final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }
    
    
    
    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ParcelItemsBuilder items(@Nullable final com.commercetools.importapi.models.orders.DeliveryItem ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ParcelItemsBuilder items(@Nullable final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public ParcelItemsBuilder plusItems(@Nullable final com.commercetools.importapi.models.orders.DeliveryItem ...items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }
    
    
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ParcelItemsBuilder plusItems(Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ParcelItemsBuilder withItems(Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ParcelItemsBuilder addItems(Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public ParcelItemsBuilder setItems(Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }
                    

    /**
     * value of parcelId}
     * @return parcelId
     */
    
    
    public String getParcelId(){
        return this.parcelId;
    }
    
    /**
     * value of items}
     * @return items
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems(){
        return this.items;
    }

    /**
     * builds ParcelItems with checking for non-null required values
     * @return ParcelItems
     */
    public ParcelItems build() {
        Objects.requireNonNull(parcelId, ParcelItems.class + ": parcelId is missing");
        return new ParcelItemsImpl(parcelId, items);
    }
    
    /**
     * builds ParcelItems without checking for non-null required values
     * @return ParcelItems
     */
    public ParcelItems buildUnchecked() {
        return new ParcelItemsImpl(parcelId, items);
    }

    /**
     * factory method for an instance of ParcelItemsBuilder
     * @return builder 
     */
    public static ParcelItemsBuilder of() {
        return new ParcelItemsBuilder();
    }

    /**
     * create builder for ParcelItems instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelItemsBuilder of(final ParcelItems template) {
        ParcelItemsBuilder builder = new ParcelItemsBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
