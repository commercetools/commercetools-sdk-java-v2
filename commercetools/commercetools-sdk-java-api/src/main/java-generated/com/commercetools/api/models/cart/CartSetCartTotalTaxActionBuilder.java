
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartSetCartTotalTaxActionBuilder implements Builder<CartSetCartTotalTaxAction> {

    private com.commercetools.api.models.common.Money externalTotalGross;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    public CartSetCartTotalTaxActionBuilder externalTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalTotalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CartSetCartTotalTaxActionBuilder externalTotalGross(
            final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
        return this;
    }

    public CartSetCartTotalTaxActionBuilder externalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
        return this;
    }

    public CartSetCartTotalTaxActionBuilder externalTaxPortions(
            @Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
        return this;
    }

    public CartSetCartTotalTaxActionBuilder plusExternalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions.addAll(Arrays.asList(externalTaxPortions));
        return this;
    }

    public CartSetCartTotalTaxActionBuilder plusExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public CartSetCartTotalTaxActionBuilder withExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        this.externalTaxPortions = new ArrayList<>();
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.Money getExternalTotalGross() {
        return this.externalTotalGross;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions() {
        return this.externalTaxPortions;
    }

    public CartSetCartTotalTaxAction build() {
        Objects.requireNonNull(externalTotalGross, CartSetCartTotalTaxAction.class + ": externalTotalGross is missing");
        return new CartSetCartTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    /**
     * builds CartSetCartTotalTaxAction without checking for non null required values
     */
    public CartSetCartTotalTaxAction buildUnchecked() {
        return new CartSetCartTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    public static CartSetCartTotalTaxActionBuilder of() {
        return new CartSetCartTotalTaxActionBuilder();
    }

    public static CartSetCartTotalTaxActionBuilder of(final CartSetCartTotalTaxAction template) {
        CartSetCartTotalTaxActionBuilder builder = new CartSetCartTotalTaxActionBuilder();
        builder.externalTotalGross = template.getExternalTotalGross();
        builder.externalTaxPortions = template.getExternalTaxPortions();
        return builder;
    }

}
