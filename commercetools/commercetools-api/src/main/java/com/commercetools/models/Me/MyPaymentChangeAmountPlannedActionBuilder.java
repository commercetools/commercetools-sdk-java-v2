package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.me.MyPaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyPaymentChangeAmountPlannedAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentChangeAmountPlannedActionBuilder {
   
   
   private com.commercetools.models.common.Money amount;
   
   public MyPaymentChangeAmountPlannedActionBuilder amount( final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }

   public MyPaymentChangeAmountPlannedAction build() {
       return new MyPaymentChangeAmountPlannedActionImpl(amount);
   }
   
   public static MyPaymentChangeAmountPlannedActionBuilder of() {
      return new MyPaymentChangeAmountPlannedActionBuilder();
   }
   
   public static MyPaymentChangeAmountPlannedActionBuilder of(final MyPaymentChangeAmountPlannedAction template) {
      MyPaymentChangeAmountPlannedActionBuilder builder = new MyPaymentChangeAmountPlannedActionBuilder();
      builder.amount = template.getAmount();
      return builder;
   }
   
}