package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.cart.TaxPortion;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxPortionBuilder {
   
   
   private com.commercetools.api.generated.models.common.TypedMoney amount;
   
   
   private Integer rate;
   
   @Nullable
   private String name;
   
   public TaxPortionBuilder amount( final com.commercetools.api.generated.models.common.TypedMoney amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxPortionBuilder rate( final Integer rate) {
      this.rate = rate;
      return this;
   }
   
   public TaxPortionBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmount(){
      return this.amount;
   }
   
   
   public Integer getRate(){
      return this.rate;
   }
   
   @Nullable
   public String getName(){
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