package com.commercetools.models.Common;

import com.commercetools.models.Common.TypedMoneyDraft;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Common.Money;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MoneyBuilder {
   
   
   private java.lang.Long centAmount;
   
   
   private java.lang.String currencyCode;
   
   public MoneyBuilder centAmount( final java.lang.Long centAmount) {
      this.centAmount = centAmount;
      return this;
   }
   
   public MoneyBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }

   public Money build() {
       return new MoneyImpl(centAmount, currencyCode);
   }
   
   public static MoneyBuilder of() {
      return new MoneyBuilder();
   }
   
   public static MoneyBuilder of(final Money template) {
      MoneyBuilder builder = new MoneyBuilder();
      builder.centAmount = template.getCentAmount();
      builder.currencyCode = template.getCurrencyCode();
      return builder;
   }
   
}