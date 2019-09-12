package com.commercetools.models.Common;

import com.commercetools.models.Common.CentPrecisionMoney;
import com.commercetools.models.Common.HighPrecisionMoney;
import com.commercetools.models.Common.MoneyType;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Common.CentPrecisionMoneyImpl.class, name = "centPrecision"),
   @JsonSubTypes.Type(value = com.commercetools.models.Common.HighPrecisionMoneyImpl.class, name = "highPrecision")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TypedMoney  {

   
   @NotNull
   @JsonProperty("fractionDigits")
   public Integer getFractionDigits();
   
   @NotNull
   @JsonProperty("centAmount")
   public Long getCentAmount();
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currencyCode")
   public String getCurrencyCode();

   public void setFractionDigits(final Integer fractionDigits);
   
   public void setCentAmount(final Long centAmount);
   
   public void setCurrencyCode(final String currencyCode);
   


}