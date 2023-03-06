
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCartTotalTaxActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCartTotalTaxAction cartSetCartTotalTaxAction = CartSetCartTotalTaxAction.builder()
 *             .externalTotalGross(externalTotalGrossBuilder -> externalTotalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCartTotalTaxActionBuilder implements Builder<CartSetCartTotalTaxAction> {

    private com.commercetools.api.models.common.Money externalTotalGross;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    /**
     *  <p>The Cart's total gross price becoming the <code>totalGross</code> field (<code>totalNet</code> + taxes) on the Cart's <code>taxedPrice</code>.</p>
     */

    public CartSetCartTotalTaxActionBuilder externalTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalTotalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Cart's total gross price becoming the <code>totalGross</code> field (<code>totalNet</code> + taxes) on the Cart's <code>taxedPrice</code>.</p>
     */

    public CartSetCartTotalTaxActionBuilder externalTotalGross(
            final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
        return this;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

    public CartSetCartTotalTaxActionBuilder externalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
        return this;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

    public CartSetCartTotalTaxActionBuilder externalTaxPortions(
            @Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
        return this;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

    public CartSetCartTotalTaxActionBuilder plusExternalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions.addAll(Arrays.asList(externalTaxPortions));
        return this;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

    public CartSetCartTotalTaxActionBuilder plusExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */

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
