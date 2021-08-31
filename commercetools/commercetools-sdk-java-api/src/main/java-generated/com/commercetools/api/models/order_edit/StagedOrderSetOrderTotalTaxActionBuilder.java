
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetOrderTotalTaxActionBuilder implements Builder<StagedOrderSetOrderTotalTaxAction> {

    private com.commercetools.api.models.common.Money externalTotalGross;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalTotalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross(
            final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
        return this;
    }

    public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
        return this;
    }

    public StagedOrderSetOrderTotalTaxActionBuilder withExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        this.externalTaxPortions = new ArrayList<>();
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderSetOrderTotalTaxActionBuilder plusExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(
            @Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
        return this;
    }

    public com.commercetools.api.models.common.Money getExternalTotalGross() {
        return this.externalTotalGross;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions() {
        return this.externalTaxPortions;
    }

    public StagedOrderSetOrderTotalTaxAction build() {
        Objects.requireNonNull(externalTotalGross,
            StagedOrderSetOrderTotalTaxAction.class + ": externalTotalGross is missing");
        return new StagedOrderSetOrderTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    /**
     * builds StagedOrderSetOrderTotalTaxAction without checking for non null required values
     */
    public StagedOrderSetOrderTotalTaxAction buildUnchecked() {
        return new StagedOrderSetOrderTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder of() {
        return new StagedOrderSetOrderTotalTaxActionBuilder();
    }

    public static StagedOrderSetOrderTotalTaxActionBuilder of(final StagedOrderSetOrderTotalTaxAction template) {
        StagedOrderSetOrderTotalTaxActionBuilder builder = new StagedOrderSetOrderTotalTaxActionBuilder();
        builder.externalTotalGross = template.getExternalTotalGross();
        builder.externalTaxPortions = template.getExternalTaxPortions();
        return builder;
    }

}
