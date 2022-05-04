
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Money draft object to store an amount of a fraction of the smallest indivisible unit of the specified currency.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyDraftImpl.class)
public interface HighPrecisionMoneyDraft extends TypedMoneyDraft {

    String HIGH_PRECISION = "highPrecision";

    /**
    *  <p>amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
    */
    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    @JsonProperty("centAmount")
    public Long getCentAmount();

    public void setPreciseAmount(final Long preciseAmount);

    public void setCentAmount(final Long centAmount);

    public static HighPrecisionMoneyDraft of() {
        return new HighPrecisionMoneyDraftImpl();
    }

    public static HighPrecisionMoneyDraft of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public static HighPrecisionMoneyDraftBuilder builder() {
        return HighPrecisionMoneyDraftBuilder.of();
    }

    public static HighPrecisionMoneyDraftBuilder builder(final HighPrecisionMoneyDraft template) {
        return HighPrecisionMoneyDraftBuilder.of(template);
    }

    default <T> T withHighPrecisionMoneyDraft(Function<HighPrecisionMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    public static HighPrecisionMoneyDraft of(javax.money.MonetaryAmount monetaryAmount, final int fractionDigits) {
        return MoneyUtil.draftOf(monetaryAmount, fractionDigits);
    }

    public static HighPrecisionMoneyDraft of(final HighPrecisionMoney template) {
        HighPrecisionMoneyDraftImpl instance = new HighPrecisionMoneyDraftImpl();
        instance.setCentAmount(template.getCentAmount());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setFractionDigits(template.getFractionDigits());
        instance.setPreciseAmount(template.getPreciseAmount());
        return instance;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<HighPrecisionMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<HighPrecisionMoneyDraft>";
            }
        };
    }
}
