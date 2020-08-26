package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.HighPrecisionMoney;
import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.common.MoneyType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.HighPrecisionMoneyImpl.class, name = "highPrecision"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.MoneyImpl.class, name = "centPrecision")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TypedMoneyImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TypedMoney  {



    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    @NotNull
    @JsonProperty("centAmount")
    public Long getCentAmount();
    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    public void setFractionDigits(final Integer fractionDigits);

    public void setCentAmount(final Long centAmount);

    public void setCurrencyCode(final String currencyCode);



}
