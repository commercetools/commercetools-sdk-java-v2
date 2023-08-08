
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Associate associate = Associate.builder()
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateBuilder implements Builder<Associate> {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> associateRoleAssignments;

    private com.commercetools.api.models.customer.CustomerReference customer;

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder associateRoleAssignments(
            final com.commercetools.api.models.business_unit.AssociateRoleAssignment... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder associateRoleAssignments(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder plusAssociateRoleAssignments(
            final com.commercetools.api.models.business_unit.AssociateRoleAssignment... associateRoleAssignments) {
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

    public AssociateBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder withAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder addAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignment> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder.of()));
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder setAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignment> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentBuilder.of()));
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public AssociateBuilder customer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     * builds Associate with checking for non-null required values
     * @return Associate
     */
    public Associate build() {
        Objects.requireNonNull(associateRoleAssignments, Associate.class + ": associateRoleAssignments is missing");
        Objects.requireNonNull(customer, Associate.class + ": customer is missing");
        return new AssociateImpl(associateRoleAssignments, customer);
    }

    /**
     * builds Associate without checking for non-null required values
     * @return Associate
     */
    public Associate buildUnchecked() {
        return new AssociateImpl(associateRoleAssignments, customer);
    }

    /**
     * factory method for an instance of AssociateBuilder
     * @return builder
     */
    public static AssociateBuilder of() {
        return new AssociateBuilder();
    }

    /**
     * create builder for Associate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateBuilder of(final Associate template) {
        AssociateBuilder builder = new AssociateBuilder();
        builder.associateRoleAssignments = template.getAssociateRoleAssignments();
        builder.customer = template.getCustomer();
        return builder;
    }

}
