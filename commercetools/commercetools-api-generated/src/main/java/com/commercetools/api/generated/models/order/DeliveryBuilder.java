package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.Parcel;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.Delivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DeliveryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   
   private String id;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.Parcel> parcels;
   
   public DeliveryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public DeliveryBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public DeliveryBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public DeliveryBuilder items( final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items) {
      this.items = items;
      return this;
   }
   
   public DeliveryBuilder parcels( final java.util.List<com.commercetools.api.generated.models.order.Parcel> parcels) {
      this.parcels = parcels;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.Parcel> getParcels(){
      return this.parcels;
   }

   public Delivery build() {
       return new DeliveryImpl(createdAt, address, id, items, parcels);
   }
   
   public static DeliveryBuilder of() {
      return new DeliveryBuilder();
   }
   
   public static DeliveryBuilder of(final Delivery template) {
      DeliveryBuilder builder = new DeliveryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.address = template.getAddress();
      builder.id = template.getId();
      builder.items = template.getItems();
      builder.parcels = template.getParcels();
      return builder;
   }
   
}