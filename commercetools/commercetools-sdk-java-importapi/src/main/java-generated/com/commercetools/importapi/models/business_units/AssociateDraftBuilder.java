
package com.commercetools.importapi.models.business_units;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateDraft associateDraft = AssociateDraft.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateDraftBuilder implements Builder<AssociateDraft> {

    private com.commercetools.importapi.models.common.CustomerKeyReference customer;

    private java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> associateRoleAssignments;

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateDraftBuilder customer(
            Function<com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateDraftBuilder withCustomer(
            Function<com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder, com.commercetools.importapi.models.common.CustomerKeyReference> builder) {
        this.customer = builder.apply(com.commercetools.importapi.models.common.CustomerKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public AssociateDraftBuilder customer(
            final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder associateRoleAssignments(
            final com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder associateRoleAssignments(
            final java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder plusAssociateRoleAssignments(
            final com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.addAll(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder, com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder withAssociateRoleAssignments(
            Function<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder, com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder addAssociateRoleAssignments(
            Function<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder, com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder setAssociateRoleAssignments(
            Function<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder, com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @return customer
     */

    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     * @return associateRoleAssignments
     */

    public java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     * builds AssociateDraft with checking for non-null required values
     * @return AssociateDraft
     */
    public AssociateDraft build() {
        Objects.requireNonNull(customer, AssociateDraft.class + ": customer is missing");
        Objects.requireNonNull(associateRoleAssignments,
            AssociateDraft.class + ": associateRoleAssignments is missing");
        return new AssociateDraftImpl(customer, associateRoleAssignments);
    }

    /**
     * builds AssociateDraft without checking for non-null required values
     * @return AssociateDraft
     */
    public AssociateDraft buildUnchecked() {
        return new AssociateDraftImpl(customer, associateRoleAssignments);
    }

    /**
     * factory method for an instance of AssociateDraftBuilder
     * @return builder
     */
    public static AssociateDraftBuilder of() {
        return new AssociateDraftBuilder();
    }

    /**
     * create builder for AssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateDraftBuilder of(final AssociateDraft template) {
        AssociateDraftBuilder builder = new AssociateDraftBuilder();
        builder.customer = template.getCustomer();
        builder.associateRoleAssignments = template.getAssociateRoleAssignments();
        return builder;
    }

}
