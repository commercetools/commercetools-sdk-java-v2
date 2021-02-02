
package com.commercetools.api.models.common;

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
}
