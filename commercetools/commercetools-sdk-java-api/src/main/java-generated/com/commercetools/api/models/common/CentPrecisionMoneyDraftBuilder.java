
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CentPrecisionMoneyDraftBuilder implements Builder<CentPrecisionMoneyDraft> {

    private Long centAmount;

    private String currencyCode;

    @Nullable
    private Integer fractionDigits;

    public CentPrecisionMoneyDraftBuilder centAmount(final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }

    public CentPrecisionMoneyDraftBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public CentPrecisionMoneyDraftBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
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

    public CentPrecisionMoneyDraft build() {
        Objects.requireNonNull(centAmount, CentPrecisionMoneyDraft.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, CentPrecisionMoneyDraft.class + ": currencyCode is missing");
        return new CentPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits);
    }

    /**
     * builds CentPrecisionMoneyDraft without checking for non null required values
     */
    public CentPrecisionMoneyDraft buildUnchecked() {
        return new CentPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits);
    }

    public static CentPrecisionMoneyDraftBuilder of() {
        return new CentPrecisionMoneyDraftBuilder();
    }

    public static CentPrecisionMoneyDraftBuilder of(final CentPrecisionMoneyDraft template) {
        CentPrecisionMoneyDraftBuilder builder = new CentPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        return builder;
    }

}
