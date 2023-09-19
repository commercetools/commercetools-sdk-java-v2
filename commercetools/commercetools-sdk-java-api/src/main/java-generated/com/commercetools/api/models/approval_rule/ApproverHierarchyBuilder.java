
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverHierarchyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverHierarchy approverHierarchy = ApproverHierarchy.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverHierarchyBuilder implements Builder<ApproverHierarchy> {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> tiers;

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyBuilder tiers(
            final com.commercetools.api.models.approval_rule.ApproverConjunction... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyBuilder tiers(
            final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyBuilder plusTiers(
            final com.commercetools.api.models.approval_rule.ApproverConjunction... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyBuilder plusTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers
                .add(builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyBuilder withTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers
                .add(builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyBuilder addTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverConjunction> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder.of()));
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyBuilder setTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder, com.commercetools.api.models.approval_rule.ApproverConjunction> builder) {
        return tiers(builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionBuilder.of()));
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> getTiers() {
        return this.tiers;
    }

    /**
     * builds ApproverHierarchy with checking for non-null required values
     * @return ApproverHierarchy
     */
    public ApproverHierarchy build() {
        Objects.requireNonNull(tiers, ApproverHierarchy.class + ": tiers is missing");
        return new ApproverHierarchyImpl(tiers);
    }

    /**
     * builds ApproverHierarchy without checking for non-null required values
     * @return ApproverHierarchy
     */
    public ApproverHierarchy buildUnchecked() {
        return new ApproverHierarchyImpl(tiers);
    }

    /**
     * factory method for an instance of ApproverHierarchyBuilder
     * @return builder
     */
    public static ApproverHierarchyBuilder of() {
        return new ApproverHierarchyBuilder();
    }

    /**
     * create builder for ApproverHierarchy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverHierarchyBuilder of(final ApproverHierarchy template) {
        ApproverHierarchyBuilder builder = new ApproverHierarchyBuilder();
        builder.tiers = template.getTiers();
        return builder;
    }

}
