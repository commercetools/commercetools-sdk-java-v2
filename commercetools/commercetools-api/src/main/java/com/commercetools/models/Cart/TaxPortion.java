package com.commercetools.models.cart;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.TaxPortionImpl;

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
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion  {

   
   
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
   
   public static TaxPortionImpl of(){
      return new TaxPortionImpl();
   }
   

   public static TaxPortionImpl of(final TaxPortion template) {
      TaxPortionImpl instance = new TaxPortionImpl();
      instance.setAmount(template.getAmount());
      instance.setRate(template.getRate());
      instance.setName(template.getName());
      return instance;
   }

}