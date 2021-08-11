
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class HighPrecisionMoneyDraftBuilder implements Builder<HighPrecisionMoneyDraft> {

    private Long centAmount;

    private String currencyCode;

    @Nullable
    private Integer fractionDigits;

    private Long preciseAmount;

    public HighPrecisionMoneyDraftBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }

    public HighPrecisionMoneyDraftBuilder preciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public HighPrecisionMoneyDraft build() {
        Objects.requireNonNull(centAmount, HighPrecisionMoneyDraft.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, HighPrecisionMoneyDraft.class + ": currencyCode is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoneyDraft.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * builds HighPrecisionMoneyDraft without checking for non null required values
     */
    public HighPrecisionMoneyDraft buildUnchecked() {
        return new HighPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    public static HighPrecisionMoneyDraftBuilder of() {
        return new HighPrecisionMoneyDraftBuilder();
    }

    public static HighPrecisionMoneyDraftBuilder of(final HighPrecisionMoneyDraft template) {
        HighPrecisionMoneyDraftBuilder builder = new HighPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
