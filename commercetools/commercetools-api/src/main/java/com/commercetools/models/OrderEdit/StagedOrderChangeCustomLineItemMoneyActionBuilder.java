package com.commercetools.models.OrderEdit;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeCustomLineItemMoneyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeCustomLineItemMoneyActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   
   private com.commercetools.models.Common.Money money;
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderChangeCustomLineItemMoneyActionBuilder money( final com.commercetools.models.Common.Money money) {
      this.money = money;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public com.commercetools.models.Common.Money getMoney(){
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