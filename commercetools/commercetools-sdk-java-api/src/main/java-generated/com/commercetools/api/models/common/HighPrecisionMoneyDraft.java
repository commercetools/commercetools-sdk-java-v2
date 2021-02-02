
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = HighPrecisionMoneyDraftImpl.class)
public interface HighPrecisionMoneyDraft extends TypedMoneyDraft {

    String HIGH_PRECISION = "highPrecision";

    @NotNull
    @JsonProperty("preciseAmount")
    public Long getPreciseAmount();

    public void setPreciseAmount(final Long preciseAmount);

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
}
