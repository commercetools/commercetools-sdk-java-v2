
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InheritedAssociateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InheritedAssociate inheritedAssociate = InheritedAssociate.builder()
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InheritedAssociateBuilder implements Builder<InheritedAssociate> {

    private java.util.List<com.commercetools.history.models.common.InheritedAssociateRoleAssignment> associateRoleAssignments;

    private com.commercetools.history.models.common.Reference customer;

    /**
     * set values to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public InheritedAssociateBuilder associateRoleAssignments(
            final com.commercetools.history.models.common.InheritedAssociateRoleAssignment... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     * set value to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public InheritedAssociateBuilder associateRoleAssignments(
            final java.util.List<com.commercetools.history.models.common.InheritedAssociateRoleAssignment> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     * add values to the associateRoleAssignments
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public InheritedAssociateBuilder plusAssociateRoleAssignments(
            final com.commercetools.history.models.common.InheritedAssociateRoleAssignment... associateRoleAssignments) {
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

    public InheritedAssociateBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder, com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder.of())
                        .build());
        return this;
    }

    /**
     * set the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public InheritedAssociateBuilder withAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder, com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments
                .add(builder.apply(com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder.of())
                        .build());
        return this;
    }

    /**
     * add the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public InheritedAssociateBuilder addAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder, com.commercetools.history.models.common.InheritedAssociateRoleAssignment> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder.of()));
    }

    /**
     * set the value to the associateRoleAssignments using the builder function
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public InheritedAssociateBuilder setAssociateRoleAssignments(
            Function<com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder, com.commercetools.history.models.common.InheritedAssociateRoleAssignment> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.history.models.common.InheritedAssociateRoleAssignmentBuilder.of()));
    }

    /**
     * set the value to the customer using the builder function
     * @param builder function to build the customer value
     * @return Builder
     */

    public InheritedAssociateBuilder customer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the customer using the builder function
     * @param builder function to build the customer value
     * @return Builder
     */

    public InheritedAssociateBuilder withCustomer(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.customer = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the customer
     * @param customer value to be set
     * @return Builder
     */

    public InheritedAssociateBuilder customer(final com.commercetools.history.models.common.Reference customer) {
        this.customer = customer;
        return this;
    }

    /**
     * value of associateRoleAssignments}
     * @return associateRoleAssignments
     */

    public java.util.List<com.commercetools.history.models.common.InheritedAssociateRoleAssignment> getAssociateRoleAssignments() {
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
     * builds InheritedAssociate with checking for non-null required values
     * @return InheritedAssociate
     */
    public InheritedAssociate build() {
        Objects.requireNonNull(associateRoleAssignments,
            InheritedAssociate.class + ": associateRoleAssignments is missing");
        Objects.requireNonNull(customer, InheritedAssociate.class + ": customer is missing");
        return new InheritedAssociateImpl(associateRoleAssignments, customer);
    }

    /**
     * builds InheritedAssociate without checking for non-null required values
     * @return InheritedAssociate
     */
    public InheritedAssociate buildUnchecked() {
        return new InheritedAssociateImpl(associateRoleAssignments, customer);
    }

    /**
     * factory method for an instance of InheritedAssociateBuilder
     * @return builder
     */
    public static InheritedAssociateBuilder of() {
        return new InheritedAssociateBuilder();
    }

    /**
     * create builder for InheritedAssociate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InheritedAssociateBuilder of(final InheritedAssociate template) {
        InheritedAssociateBuilder builder = new InheritedAssociateBuilder();
        builder.associateRoleAssignments = template.getAssociateRoleAssignments();
        builder.customer = template.getCustomer();
        return builder;
    }

}
