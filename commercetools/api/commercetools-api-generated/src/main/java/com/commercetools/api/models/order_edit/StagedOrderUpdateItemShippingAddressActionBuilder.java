package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderUpdateItemShippingAddressActionBuilder {
   
   
   private com.commercetools.api.models.common.Address address;
   
   public StagedOrderUpdateItemShippingAddressActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   
   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   public StagedOrderUpdateItemShippingAddressAction build() {
       return new StagedOrderUpdateItemShippingAddressActionImpl(address);
   }
   
   public static StagedOrderUpdateItemShippingAddressActionBuilder of() {
      return new StagedOrderUpdateItemShippingAddressActionBuilder();
   }
   
   public static StagedOrderUpdateItemShippingAddressActionBuilder of(final StagedOrderUpdateItemShippingAddressAction template) {
      StagedOrderUpdateItemShippingAddressActionBuilder builder = new StagedOrderUpdateItemShippingAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}
