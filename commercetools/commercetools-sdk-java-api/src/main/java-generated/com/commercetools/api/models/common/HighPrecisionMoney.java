
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyImpl.class)
public interface HighPrecisionMoney extends TypedMoney {

    String HIGH_PRECISION = "highPrecision";

    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    public void setPreciseAmount(final Long preciseAmount);

    public static HighPrecisionMoney of() {
        return new HighPrecisionMoneyImpl();
    }

    public static HighPrecisionMoney of(final HighPrecisionMoney template) {
        HighPrecisionMoneyImpl instance = new HighPrecisionMoneyImpl();
        instance.setFractionDigits(template.getFractionDigits());
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public static HighPrecisionMoneyBuilder builder() {
        return HighPrecisionMoneyBuilder.of();
    }

    public static HighPrecisionMoneyBuilder builder(final HighPrecisionMoney template) {
        return HighPrecisionMoneyBuilder.of(template);
    }

    default <T> T withHighPrecisionMoney(Function<HighPrecisionMoney, T> helper) {
        return helper.apply(this);
    }
}
