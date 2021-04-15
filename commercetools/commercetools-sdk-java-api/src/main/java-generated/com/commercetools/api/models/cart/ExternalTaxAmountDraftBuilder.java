
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalTaxAmountDraftBuilder {

    private com.commercetools.api.models.common.Money totalGross;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    public ExternalTaxAmountDraftBuilder totalGross(final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
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
