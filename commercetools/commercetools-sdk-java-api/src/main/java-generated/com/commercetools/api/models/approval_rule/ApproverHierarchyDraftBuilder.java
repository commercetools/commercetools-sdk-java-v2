
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverHierarchyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverHierarchyDraft approverHierarchyDraft = ApproverHierarchyDraft.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverHierarchyDraftBuilder implements Builder<ApproverHierarchyDraft> {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> tiers;

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder tiers(
            final com.commercetools.api.models.approval_rule.ApproverConjunctionDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder tiers(
            final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder plusTiers(
            final com.commercetools.api.models.approval_rule.ApproverConjunctionDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder plusTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder withTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder addTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> builder) {
        return plusTiers(
            builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder.of()));
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ApproverHierarchyDraftBuilder setTiers(
            Function<com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> builder) {
        return tiers(builder.apply(com.commercetools.api.models.approval_rule.ApproverConjunctionDraftBuilder.of()));
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> getTiers() {
        return this.tiers;
    }

    /**
     * builds ApproverHierarchyDraft with checking for non-null required values
     * @return ApproverHierarchyDraft
     */
    public ApproverHierarchyDraft build() {
        Objects.requireNonNull(tiers, ApproverHierarchyDraft.class + ": tiers is missing");
        return new ApproverHierarchyDraftImpl(tiers);
    }

    /**
     * builds ApproverHierarchyDraft without checking for non-null required values
     * @return ApproverHierarchyDraft
     */
    public ApproverHierarchyDraft buildUnchecked() {
        return new ApproverHierarchyDraftImpl(tiers);
    }

    /**
     * factory method for an instance of ApproverHierarchyDraftBuilder
     * @return builder
     */
    public static ApproverHierarchyDraftBuilder of() {
        return new ApproverHierarchyDraftBuilder();
    }

    /**
     * create builder for ApproverHierarchyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverHierarchyDraftBuilder of(final ApproverHierarchyDraft template) {
        ApproverHierarchyDraftBuilder builder = new ApproverHierarchyDraftBuilder();
        builder.tiers = template.getTiers();
        return builder;
    }

}
