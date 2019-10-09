package com.commercetools.models.cart;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.TaxPortionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxPortionDraftBuilder {
   
   
   private com.commercetools.models.common.TypedMoney amount;
   
   
   private Integer rate;
   
   @Nullable
   private String name;
   
   public TaxPortionDraftBuilder amount( final com.commercetools.models.common.TypedMoney amount) {
      this.amount = amount;
      return this;
   }
   
   public TaxPortionDraftBuilder rate( final Integer rate) {
      this.rate = rate;
      return this;
   }
   
   public TaxPortionDraftBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.common.TypedMoney getAmount(){
      return this.amount;
   }
   
   
   public Integer getRate(){
      return this.rate;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }

   public TaxPortionDraft build() {
       return new TaxPortionDraftImpl(amount, rate, name);
   }
   
   public static TaxPortionDraftBuilder of() {
      return new TaxPortionDraftBuilder();
   }
   
   public static TaxPortionDraftBuilder of(final TaxPortionDraft template) {
      TaxPortionDraftBuilder builder = new TaxPortionDraftBuilder();
      builder.amount = template.getAmount();
      builder.rate = template.getRate();
      builder.name = template.getName();
      return builder;
   }
   
}