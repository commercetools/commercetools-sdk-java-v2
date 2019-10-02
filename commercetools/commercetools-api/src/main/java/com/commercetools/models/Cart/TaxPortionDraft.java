package com.commercetools.models.cart;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.TaxPortionDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxPortionDraftImpl.class)
public interface TaxPortionDraft  {

   
   
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("rate")
   public Integer getRate();
   
   @NotNull
   @Valid
   @JsonProperty("amount")
   public TypedMoney getAmount();

   public void setName(final String name);
   
   public void setRate(final Integer rate);
   
   public void setAmount(final TypedMoney amount);
   
   public static TaxPortionDraftImpl of(){
      return new TaxPortionDraftImpl();
   }
   

   public static TaxPortionDraftImpl of(final TaxPortionDraft template) {
      TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
      instance.setAmount(template.getAmount());
      instance.setRate(template.getRate());
      instance.setName(template.getName());
      return instance;
   }

}