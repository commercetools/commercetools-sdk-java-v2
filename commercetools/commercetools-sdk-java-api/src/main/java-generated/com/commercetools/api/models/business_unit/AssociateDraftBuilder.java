
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateDraftBuilder implements Builder<AssociateDraft> {

    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments;

    @Deprecated
    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder associateRoleAssignments(
            @Nullable final com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder associateRoleAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateDraftBuilder plusAssociateRoleAssignments(
            @Nullable final com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.addAll(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder withAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder addAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateDraftBuilder setAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     * @param roles value to be set
     * @return Builder
     */
    @Deprecated
    public AssociateDraftBuilder roles(
            @Nullable final com.commercetools.api.models.business_unit.AssociateRoleDeprecated... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     * @param roles value to be set
     * @return Builder
     */
    @Deprecated
    public AssociateDraftBuilder roles(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     * @param roles value to be set
     * @return Builder
     */
    @Deprecated
    public AssociateDraftBuilder plusRoles(
            @Nullable final com.commercetools.api.models.business_unit.AssociateRoleDeprecated... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateDraftBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public AssociateDraftBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     * @return roles
     */
    @Deprecated
    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> getRoles() {
        return this.roles;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     * builds AssociateDraft with checking for non-null required values
     * @return AssociateDraft
     */
    public AssociateDraft build() {
        Objects.requireNonNull(customer, AssociateDraft.class + ": customer is missing");
        return new AssociateDraftImpl(associateRoleAssignments, roles, customer);
    }

    /**
     * builds AssociateDraft without checking for non-null required values
     * @return AssociateDraft
     */
    public AssociateDraft buildUnchecked() {
        return new AssociateDraftImpl(associateRoleAssignments, roles, customer);
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
        builder.associateRoleAssignments = template.getAssociateRoleAssignments();
        builder.roles = template.getRoles();
        builder.customer = template.getCustomer();
        return builder;
    }

}
