
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetOrderTotalTaxActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderTotalTaxAction stagedOrderSetOrderTotalTaxAction = StagedOrderSetOrderTotalTaxAction.builder()
 *             .externalTotalGross(externalTotalGrossBuilder -> externalTotalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetOrderTotalTaxActionBuilder implements Builder<StagedOrderSetOrderTotalTaxAction> {

    private com.commercetools.api.models.common.Money externalTotalGross;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @param builder function to build the externalTotalGross value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalTotalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @param builder function to build the externalTotalGross value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder withExternalTotalGross(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.externalTotalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @param externalTotalGross value to be set
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross(
            final com.commercetools.api.models.common.Money externalTotalGross) {
        this.externalTotalGross = externalTotalGross;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param externalTaxPortions value to be set
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        this.externalTaxPortions = new ArrayList<>(Arrays.asList(externalTaxPortions));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param externalTaxPortions value to be set
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(
            @Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
        this.externalTaxPortions = externalTaxPortions;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param externalTaxPortions value to be set
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder plusExternalTaxPortions(
            @Nullable final com.commercetools.api.models.cart.TaxPortionDraft... externalTaxPortions) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions.addAll(Arrays.asList(externalTaxPortions));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the externalTaxPortions value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder plusExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        if (this.externalTaxPortions == null) {
            this.externalTaxPortions = new ArrayList<>();
        }
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the externalTaxPortions value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder withExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraftBuilder> builder) {
        this.externalTaxPortions = new ArrayList<>();
        this.externalTaxPortions
                .add(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the externalTaxPortions value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder addExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraft> builder) {
        return plusExternalTaxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()));
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the externalTaxPortions value
     * @return Builder
     */

    public StagedOrderSetOrderTotalTaxActionBuilder setExternalTaxPortions(
            Function<com.commercetools.api.models.cart.TaxPortionDraftBuilder, com.commercetools.api.models.cart.TaxPortionDraft> builder) {
        return externalTaxPortions(builder.apply(com.commercetools.api.models.cart.TaxPortionDraftBuilder.of()));
    }

    /**
     *  <p>Total gross amount of the Order (totalNet + taxes).</p>
     * @return externalTotalGross
     */

    public com.commercetools.api.models.common.Money getExternalTotalGross() {
        return this.externalTotalGross;
    }

    /**
     *  <p>Value to set.</p>
     * @return externalTaxPortions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions() {
        return this.externalTaxPortions;
    }

    /**
     * builds StagedOrderSetOrderTotalTaxAction with checking for non-null required values
     * @return StagedOrderSetOrderTotalTaxAction
     */
    public StagedOrderSetOrderTotalTaxAction build() {
        Objects.requireNonNull(externalTotalGross,
            StagedOrderSetOrderTotalTaxAction.class + ": externalTotalGross is missing");
        return new StagedOrderSetOrderTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    /**
     * builds StagedOrderSetOrderTotalTaxAction without checking for non-null required values
     * @return StagedOrderSetOrderTotalTaxAction
     */
    public StagedOrderSetOrderTotalTaxAction buildUnchecked() {
        return new StagedOrderSetOrderTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
    }

    /**
     * factory method for an instance of StagedOrderSetOrderTotalTaxActionBuilder
     * @return builder
     */
    public static StagedOrderSetOrderTotalTaxActionBuilder of() {
        return new StagedOrderSetOrderTotalTaxActionBuilder();
    }

    /**
     * create builder for StagedOrderSetOrderTotalTaxAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetOrderTotalTaxActionBuilder of(final StagedOrderSetOrderTotalTaxAction template) {
        StagedOrderSetOrderTotalTaxActionBuilder builder = new StagedOrderSetOrderTotalTaxActionBuilder();
        builder.externalTotalGross = template.getExternalTotalGross();
        builder.externalTaxPortions = template.getExternalTaxPortions();
        return builder;
    }

}
