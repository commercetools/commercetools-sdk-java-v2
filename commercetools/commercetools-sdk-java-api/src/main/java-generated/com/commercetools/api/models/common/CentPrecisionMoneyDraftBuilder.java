
package com.commercetools.api.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CentPrecisionMoneyDraftBuilder {

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
