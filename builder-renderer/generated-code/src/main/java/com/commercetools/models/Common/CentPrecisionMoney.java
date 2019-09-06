package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Common.CentPrecisionMoneyImpl;

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
@JsonDeserialize(as = CentPrecisionMoneyImpl.class)
public interface CentPrecisionMoney extends TypedMoney {


   
   public static CentPrecisionMoneyImpl of(){
      return new CentPrecisionMoneyImpl();
   }
   

   public static CentPrecisionMoneyImpl of(final CentPrecisionMoney template) {
      CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
      instance.setCentAmount(template.getCentAmount());
      instance.setFractionDigits(template.getFractionDigits());
      instance.setCurrencyCode(template.getCurrencyCode());
      return instance;
   }

}