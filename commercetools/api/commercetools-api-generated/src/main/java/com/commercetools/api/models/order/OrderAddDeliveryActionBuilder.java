package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.OrderAddDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderAddDeliveryActionBuilder {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;
    
    @Nullable
    private com.commercetools.api.models.common.Address address;
    
    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    public OrderAddDeliveryActionBuilder items(@Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }
    
    public OrderAddDeliveryActionBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    public OrderAddDeliveryActionBuilder parcels(@Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems(){
        return this.items;
    }
    
    @Nullable
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels(){
        return this.parcels;
    }

    public OrderAddDeliveryAction build() {
        return new OrderAddDeliveryActionImpl(items, address, parcels);
    }

    public static OrderAddDeliveryActionBuilder of() {
        return new OrderAddDeliveryActionBuilder();
    }

    public static OrderAddDeliveryActionBuilder of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionBuilder builder = new OrderAddDeliveryActionBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
