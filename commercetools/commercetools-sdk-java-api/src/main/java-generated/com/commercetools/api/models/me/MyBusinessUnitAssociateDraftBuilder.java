
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitAssociateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAssociateDraft myBusinessUnitAssociateDraft = MyBusinessUnitAssociateDraft.builder()
 *             .version(0.3)
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusAssociateRoleAssignments(associateRoleAssignmentsBuilder -> associateRoleAssignmentsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitAssociateDraftBuilder implements Builder<MyBusinessUnitAssociateDraft> {

    private Long version;

    private com.commercetools.api.models.me.MyCustomerDraft customer;

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments;

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder customer(
            Function<com.commercetools.api.models.me.MyCustomerDraftBuilder, com.commercetools.api.models.me.MyCustomerDraftBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.me.MyCustomerDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder withCustomer(
            Function<com.commercetools.api.models.me.MyCustomerDraftBuilder, com.commercetools.api.models.me.MyCustomerDraft> builder) {
        this.customer = builder.apply(com.commercetools.api.models.me.MyCustomerDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder customer(
            final com.commercetools.api.models.me.MyCustomerDraft customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder associateRoleAssignments(
            final com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder associateRoleAssignments(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param associateRoleAssignments value to be set
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder plusAssociateRoleAssignments(
            final com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.addAll(Arrays.asList(associateRoleAssignments));
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder plusAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder> builder) {
        if (this.associateRoleAssignments == null) {
            this.associateRoleAssignments = new ArrayList<>();
        }
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder withAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder> builder) {
        this.associateRoleAssignments = new ArrayList<>();
        this.associateRoleAssignments.add(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder addAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> builder) {
        return plusAssociateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @param builder function to build the associateRoleAssignments value
     * @return Builder
     */

    public MyBusinessUnitAssociateDraftBuilder setAssociateRoleAssignments(
            Function<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder, com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> builder) {
        return associateRoleAssignments(
            builder.apply(com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Customer to create and assign to the Business Unit.</p>
     * @return customer
     */

    public com.commercetools.api.models.me.MyCustomerDraft getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Roles assigned to the new Associate within a Business Unit.</p>
     * @return associateRoleAssignments
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     * builds MyBusinessUnitAssociateDraft with checking for non-null required values
     * @return MyBusinessUnitAssociateDraft
     */
    public MyBusinessUnitAssociateDraft build() {
        Objects.requireNonNull(version, MyBusinessUnitAssociateDraft.class + ": version is missing");
        Objects.requireNonNull(customer, MyBusinessUnitAssociateDraft.class + ": customer is missing");
        Objects.requireNonNull(associateRoleAssignments,
            MyBusinessUnitAssociateDraft.class + ": associateRoleAssignments is missing");
        return new MyBusinessUnitAssociateDraftImpl(version, customer, associateRoleAssignments);
    }

    /**
     * builds MyBusinessUnitAssociateDraft without checking for non-null required values
     * @return MyBusinessUnitAssociateDraft
     */
    public MyBusinessUnitAssociateDraft buildUnchecked() {
        return new MyBusinessUnitAssociateDraftImpl(version, customer, associateRoleAssignments);
    }

    /**
     * factory method for an instance of MyBusinessUnitAssociateDraftBuilder
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder of() {
        return new MyBusinessUnitAssociateDraftBuilder();
    }

    /**
     * create builder for MyBusinessUnitAssociateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitAssociateDraftBuilder of(final MyBusinessUnitAssociateDraft template) {
        MyBusinessUnitAssociateDraftBuilder builder = new MyBusinessUnitAssociateDraftBuilder();
        builder.version = template.getVersion();
        builder.customer = template.getCustomer();
        builder.associateRoleAssignments = template.getAssociateRoleAssignments();
        return builder;
    }

}
