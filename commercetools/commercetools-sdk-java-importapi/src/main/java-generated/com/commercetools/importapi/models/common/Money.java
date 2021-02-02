
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoneyImpl.class)
public interface Money extends TypedMoney {

    String CENT_PRECISION = "centPrecision";

    public static Money of() {
        return new MoneyImpl();
    }

    public static Money of(final Money template) {
        MoneyImpl instance = new MoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
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
