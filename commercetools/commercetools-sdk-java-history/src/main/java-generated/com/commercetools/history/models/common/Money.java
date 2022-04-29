
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money {

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    @NotNull
    @JsonProperty("centAmount")
    public Integer getCentAmount();

    @NotNull
    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    public void setCurrencyCode(final String currencyCode);

    public void setCentAmount(final Integer centAmount);

    public void setFractionDigits(final Integer fractionDigits);

    public void setType(final MoneyType type);

    public static Money of() {
        return new MoneyImpl();
    }

    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setCentAmount(template.getCentAmount());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setType(template.getType());
        return instance;
    }

    public static MoneyBuilder builder() {
        return MoneyBuilder.of();
    }

    public static MoneyBuilder builder(final Money template) {
        return MoneyBuilder.of(template);
    }

    default <T> T withMoney(Function<Money, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Money> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Money>() {
            @Override
            public String toString() {
                return "TypeReference<Money>";
            }
        };
    }
}
