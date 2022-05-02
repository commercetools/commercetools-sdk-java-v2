
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CentPrecisionMoneyImpl.class)
public interface CentPrecisionMoney extends TypedMoney {

    String CENT_PRECISION = "centPrecision";

    public static CentPrecisionMoney of() {
        return new CentPrecisionMoneyImpl();
    }

    public static CentPrecisionMoney of(final CentPrecisionMoney template) {
        CentPrecisionMoneyImpl instance = new CentPrecisionMoneyImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        return instance;
    }

    public static CentPrecisionMoneyBuilder builder() {
        return CentPrecisionMoneyBuilder.of();
    }

    public static CentPrecisionMoneyBuilder builder(final CentPrecisionMoney template) {
        return CentPrecisionMoneyBuilder.of(template);
    }

    default <T> T withCentPrecisionMoney(Function<CentPrecisionMoney, T> helper) {
        return helper.apply(this);
    }

    public static CentPrecisionMoney of(final javax.money.MonetaryAmount monetaryAmount) {
        return MoneyUtil.of(monetaryAmount);
    }

    public default CentPrecisionMoneyDraft toDraft() {
        return CentPrecisionMoneyDraft.of(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CentPrecisionMoney>() {
            @Override
            public String toString() {
                return "TypeReference<CentPrecisionMoney>";
            }
        };
    }
}
