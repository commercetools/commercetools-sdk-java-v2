
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Draft type that stores amounts in cent precision for the specified currency.
*  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money extends com.commercetools.api.models.common.MonetaryAmountConvertable {

    /**
    *  <p>amount in the smallest indivisible unit of a currency, such as</p>
    *  <ul>
    *  <li>cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as 500).</li>
    *  <li>the value in the major unit for currencies without minor units, like JPY (5 JPY is specified as 5).</li>
    *  </ul>
    */
    @NotNull
    @JsonProperty("centAmount")
    public Long getCentAmount();

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    @NotNull
    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    public void setCentAmount(final Long centAmount);

    public void setCurrencyCode(final String currencyCode);

    public static Money of() {
        return new MoneyImpl();
    }

    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
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

    public default TypedMoneyDraft toDraft() {
        if (this instanceof TypedMoneyDraft) {
            return (TypedMoneyDraft) this;
        }
        return TypedMoneyDraft.centPrecisionBuilder()
                .centAmount(this.getCentAmount())
                .currencyCode(this.getCurrencyCode())
                .build();
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
