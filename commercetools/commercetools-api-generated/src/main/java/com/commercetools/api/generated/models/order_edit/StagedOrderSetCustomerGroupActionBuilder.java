package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomerGroupActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   public StagedOrderSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   public StagedOrderSetCustomerGroupAction build() {
       return new StagedOrderSetCustomerGroupActionImpl(customerGroup);
   }
   
   public static StagedOrderSetCustomerGroupActionBuilder of() {
      return new StagedOrderSetCustomerGroupActionBuilder();
   }
   
   public static StagedOrderSetCustomerGroupActionBuilder of(final StagedOrderSetCustomerGroupAction template) {
      StagedOrderSetCustomerGroupActionBuilder builder = new StagedOrderSetCustomerGroupActionBuilder();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }
   
}