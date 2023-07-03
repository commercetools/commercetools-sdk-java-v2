
package com.commercetools.history.models.common;

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

    private java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments;

    private com.commercetools.history.models.common.Reference customer;

    /**
     * set values to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder associateRoleAssignments(
            final com.commercetools.history.models.common.AssociateRoleAssignment... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     * set value to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder associateRoleAssignments(
            final java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     * add values to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public AssociateBuilder plusAssociateRoleAssignments(
            final com.commercetools.history.models.common.AssociateRoleAssignment... associateRoleAssignments) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.addAll(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     * add the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.AssociateRoleAssignmentBuilder, com.commercetools.history.models.common.AssociateRoleAssignmentBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.history.models.common.AssociateRoleAssignmentBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder withAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.AssociateRoleAssignmentBuilder, com.commercetools.history.models.common.AssociateRoleAssignmentBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.history.models.common.AssociateRoleAssignmentBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder addAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.AssociateRoleAssignmentBuilder, com.commercetools.history.models.common.AssociateRoleAssignment> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.history.models.common.AssociateRoleAssignmentBuilder.of()));
    }

    /**
     * set the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public AssociateBuilder setAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.AssociateRoleAssignmentBuilder, com.commercetools.history.models.common.AssociateRoleAssignment> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.history.models.common.AssociateRoleAssignmentBuilder.of()));
    }

    /**
     * set the value to the customer using the builder function
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the customer using the builder function
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateBuilder withCustomer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the customer
     * @param customer value to be set
     * @return Builder
     */

    public AssociateBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     * value of associateRoleAssignments}
     * @return associateRoleAssignments
     */

    public java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     * value of customer}
     * @return customer
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
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
