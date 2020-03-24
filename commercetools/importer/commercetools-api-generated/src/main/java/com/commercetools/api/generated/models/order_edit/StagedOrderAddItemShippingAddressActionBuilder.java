package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddItemShippingAddressActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   public StagedOrderAddItemShippingAddressActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }

   public StagedOrderAddItemShippingAddressAction build() {
       return new StagedOrderAddItemShippingAddressActionImpl(address);
   }
   
   public static StagedOrderAddItemShippingAddressActionBuilder of() {
      return new StagedOrderAddItemShippingAddressActionBuilder();
   }
   
   public static StagedOrderAddItemShippingAddressActionBuilder of(final StagedOrderAddItemShippingAddressAction template) {
      StagedOrderAddItemShippingAddressActionBuilder builder = new StagedOrderAddItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}