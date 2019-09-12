package com.commercetools.models.Cart;

import com.commercetools.models.Common.Money;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.TaxPortion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxPortionBuilder {
   
   
   private com.commercetools.models.Common.Money amount;
   
   
   private java.lang.Integer rate;
   
   @Nullable
   private java.lang.String name;
   
   public TaxPortionBuilder amount( final com.commercetools.models.Common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxPortionBuilder rate( final java.lang.Integer rate) {
      this.rate = rate;
      return this;
   }
   
   public TaxPortionBuilder name(@Nullable final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }
   
   
   public java.lang.Integer getRate(){
      return this.rate;
   }
   
   @Nullable
   public java.lang.String getName(){
      return this.name;
   }

   public TaxPortion build() {
       return new TaxPortionImpl(amount, rate, name);
   }
   
   public static TaxPortionBuilder of() {
      return new TaxPortionBuilder();
   }
   
   public static TaxPortionBuilder of(final TaxPortion template) {
      TaxPortionBuilder builder = new TaxPortionBuilder();
      builder.amount = template.getAmount();
      builder.rate = template.getRate();
      builder.name = template.getName();
      return builder;
   }
   
}