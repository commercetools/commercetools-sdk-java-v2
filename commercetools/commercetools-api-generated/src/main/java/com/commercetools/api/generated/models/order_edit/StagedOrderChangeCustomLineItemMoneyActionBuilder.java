package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeCustomLineItemMoneyActionBuilder {
   
   
   private String customLineItemId;
   
   
   private com.commercetools.api.generated.models.common.Money money;
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.api.generated.models.common.Money money) {
      this.money = money;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getMoney(){
      return this.money;
   }

   public StagedOrderChangeCustomLineItemMoneyAction build() {
       return new StagedOrderChangeCustomLineItemMoneyActionImpl(customLineItemId, money);
   }
   
   public static StagedOrderChangeCustomLineItemMoneyActionBuilder of() {
      return new StagedOrderChangeCustomLineItemMoneyActionBuilder();
   }
   
   public static StagedOrderChangeCustomLineItemMoneyActionBuilder of(final StagedOrderChangeCustomLineItemMoneyAction template) {
      StagedOrderChangeCustomLineItemMoneyActionBuilder builder = new StagedOrderChangeCustomLineItemMoneyActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.money = template.getMoney();
      return builder;
   }
   
}