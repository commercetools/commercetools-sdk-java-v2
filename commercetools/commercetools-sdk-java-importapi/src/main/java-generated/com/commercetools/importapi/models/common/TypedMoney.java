
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.HighPrecisionMoneyImpl.class, name = HighPrecisionMoney.HIGH_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.common.MoneyImpl.class, name = Money.CENT_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypedMoney {

    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

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

    default <T> T withTypedMoney(Function<TypedMoney, T> helper) {
        return helper.apply(this);
    }
}
