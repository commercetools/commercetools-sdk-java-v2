package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetDeliveryAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetDeliveryAddressActionBuilder {
   
   
   private String deliveryId;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   public OrderSetDeliveryAddressActionBuilder deliveryId( final String deliveryId) {
      this.deliveryId = deliveryId;
      return this;
   }
   
   public OrderSetDeliveryAddressActionBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public OrderSetDeliveryAddressAction build() {
       return new OrderSetDeliveryAddressActionImpl(deliveryId, address);
   }
   
   public static OrderSetDeliveryAddressActionBuilder of() {
      return new OrderSetDeliveryAddressActionBuilder();
   }
   
   public static OrderSetDeliveryAddressActionBuilder of(final OrderSetDeliveryAddressAction template) {
      OrderSetDeliveryAddressActionBuilder builder = new OrderSetDeliveryAddressActionBuilder();
      builder.deliveryId = template.getDeliveryId();
      builder.address = template.getAddress();
      return builder;
   }
   
}