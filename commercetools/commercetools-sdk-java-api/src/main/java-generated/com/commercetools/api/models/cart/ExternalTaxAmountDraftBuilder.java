
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalTaxAmountDraftBuilder implements Builder<ExternalTaxAmountDraft> {

    private com.commercetools.api.models.common.Money totalGross;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    public ExternalTaxAmountDraftBuilder totalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ExternalTaxAmountDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }

    public ExternalTaxAmountDraftBuilder taxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }

    public ExternalTaxAmountDraftBuilder taxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public com.commercetools.api.models.common.Money getTotalGross() {
        return this.totalGross;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public ExternalTaxAmountDraft build() {
        Objects.requireNonNull(totalGross, ExternalTaxAmountDraft.class + ": totalGross is missing");
        Objects.requireNonNull(taxRate, ExternalTaxAmountDraft.class + ": taxRate is missing");
        return new ExternalTaxAmountDraftImpl(totalGross, taxRate);
    }

    /**
     * builds ExternalTaxAmountDraft without checking for non null required values
     */
    public ExternalTaxAmountDraft buildUnchecked() {
        return new ExternalTaxAmountDraftImpl(totalGross, taxRate);
    }

    public static ExternalTaxAmountDraftBuilder of() {
        return new ExternalTaxAmountDraftBuilder();
    }

    public static ExternalTaxAmountDraftBuilder of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftBuilder builder = new ExternalTaxAmountDraftBuilder();
        builder.totalGross = template.getTotalGross();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
