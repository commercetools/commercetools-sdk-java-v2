package com.commercetools.api.models.order;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetParcelItemsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelItemsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelItemsAction orderSetParcelItemsAction = OrderSetParcelItemsAction.builder()
 *             .parcelId("{parcelId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetParcelItemsActionBuilder implements Builder<OrderSetParcelItemsAction> {

    
    
    private String parcelId;
    
    
    
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    
    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder parcelId( final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }
    
    
    
    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder items( final com.commercetools.api.models.order.DeliveryItem ...items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }
    
    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder items( final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }
    
    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder plusItems( final com.commercetools.api.models.order.DeliveryItem ...items) {
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
    
    public OrderSetParcelItemsActionBuilder plusItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder withItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder addItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }
    
    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */
    
    public OrderSetParcelItemsActionBuilder setItems(Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
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
    
    
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }

    /**
     * builds OrderSetParcelItemsAction with checking for non-null required values
     * @return OrderSetParcelItemsAction
     */
    public OrderSetParcelItemsAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelItemsAction.class + ": parcelId is missing");
        Objects.requireNonNull(items, OrderSetParcelItemsAction.class + ": items is missing");
        return new OrderSetParcelItemsActionImpl(parcelId, items);
    }
    
    /**
     * builds OrderSetParcelItemsAction without checking for non-null required values
     * @return OrderSetParcelItemsAction
     */
    public OrderSetParcelItemsAction buildUnchecked() {
        return new OrderSetParcelItemsActionImpl(parcelId, items);
    }

    /**
     * factory method for an instance of OrderSetParcelItemsActionBuilder
     * @return builder 
     */
    public static OrderSetParcelItemsActionBuilder of() {
        return new OrderSetParcelItemsActionBuilder();
    }

    /**
     * create builder for OrderSetParcelItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelItemsActionBuilder of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionBuilder builder = new OrderSetParcelItemsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
