package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoney;
import java.lang.Long;
import com.commercetools.models.Common.HighPrecisionMoneyImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

   
   @NotNull
   @JsonProperty("preciseAmount")
   public Long getPreciseAmount();

   public void setPreciseAmount(final Long preciseAmount);
   
   public static HighPrecisionMoneyImpl of(){
      return new HighPrecisionMoneyImpl();
   }
   

   public static HighPrecisionMoneyImpl of(final HighPrecisionMoney template) {
      HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
      instance.setCentAmount(template.getCentAmount());
      instance.setFractionDigits(template.getFractionDigits());
      instance.setCurrencyCode(template.getCurrencyCode());
      instance.setPreciseAmount(template.getPreciseAmount());
      return instance;
   }

}