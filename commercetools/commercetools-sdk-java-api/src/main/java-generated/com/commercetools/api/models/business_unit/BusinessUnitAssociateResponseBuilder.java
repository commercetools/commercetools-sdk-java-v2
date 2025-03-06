
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociateResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateResponse businessUnitAssociateResponse = BusinessUnitAssociateResponse.builder()
 *             .customer(customerBuilder -> customerBuilder)
 *             .plusAssociateRoles(associateRolesBuilder -> associateRolesBuilder)
 *             .plusInheritedAssociateRoles(inheritedAssociateRolesBuilder -> inheritedAssociateRolesBuilder)
 *             .plusPermissions(permissionsBuilder -> permissionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateResponseBuilder implements Builder<BusinessUnitAssociateResponse> {

    private com.commercetools.api.models.customer.CustomerReference customer;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRole> associateRoles;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRole> inheritedAssociateRoles;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder customer(
            final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param associateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder associateRoles(
            final com.commercetools.api.models.associate_role.AssociateRole... associateRoles) {
        this.associateRoles = new ArrayList<>(Arrays.asList(associateRoles));
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param associateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder associateRoles(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> associateRoles) {
        this.associateRoles = associateRoles;
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param associateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder plusAssociateRoles(
            final com.commercetools.api.models.associate_role.AssociateRole... associateRoles) {
        if (this.associateRoles == null) {
            this.associateRoles = new ArrayList<>();
        }
        this.associateRoles.addAll(Arrays.asList(associateRoles));
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param builder function to build the associateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder plusAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        if (this.associateRoles == null) {
            this.associateRoles = new ArrayList<>();
        }
        this.associateRoles
                .add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param builder function to build the associateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder withAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        this.associateRoles = new ArrayList<>();
        this.associateRoles
                .add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param builder function to build the associateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder addAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return plusAssociateRoles(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @param builder function to build the associateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder setAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return associateRoles(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param inheritedAssociateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder inheritedAssociateRoles(
            final com.commercetools.api.models.associate_role.AssociateRole... inheritedAssociateRoles) {
        this.inheritedAssociateRoles = new ArrayList<>(Arrays.asList(inheritedAssociateRoles));
        return this;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param inheritedAssociateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder inheritedAssociateRoles(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> inheritedAssociateRoles) {
        this.inheritedAssociateRoles = inheritedAssociateRoles;
        return this;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param inheritedAssociateRoles value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder plusInheritedAssociateRoles(
            final com.commercetools.api.models.associate_role.AssociateRole... inheritedAssociateRoles) {
        if (this.inheritedAssociateRoles == null) {
            this.inheritedAssociateRoles = new ArrayList<>();
        }
        this.inheritedAssociateRoles.addAll(Arrays.asList(inheritedAssociateRoles));
        return this;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param builder function to build the inheritedAssociateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder plusInheritedAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        if (this.inheritedAssociateRoles == null) {
            this.inheritedAssociateRoles = new ArrayList<>();
        }
        this.inheritedAssociateRoles
                .add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param builder function to build the inheritedAssociateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder withInheritedAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRoleBuilder> builder) {
        this.inheritedAssociateRoles = new ArrayList<>();
        this.inheritedAssociateRoles
                .add(builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param builder function to build the inheritedAssociateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder addInheritedAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return plusInheritedAssociateRoles(
            builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @param builder function to build the inheritedAssociateRoles value
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder setInheritedAssociateRoles(
            Function<com.commercetools.api.models.associate_role.AssociateRoleBuilder, com.commercetools.api.models.associate_role.AssociateRole> builder) {
        return inheritedAssociateRoles(
            builder.apply(com.commercetools.api.models.associate_role.AssociateRoleBuilder.of()));
    }

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder permissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder permissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @param permissions value to be set
     * @return Builder
     */

    public BusinessUnitAssociateResponseBuilder plusPermissions(
            final com.commercetools.api.models.associate_role.Permission... permissions) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.addAll(Arrays.asList(permissions));
        return this;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     * @return customer
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     * @return associateRoles
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRole> getAssociateRoles() {
        return this.associateRoles;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     * @return inheritedAssociateRoles
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRole> getInheritedAssociateRoles() {
        return this.inheritedAssociateRoles;
    }

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     * @return permissions
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    /**
     * builds BusinessUnitAssociateResponse with checking for non-null required values
     * @return BusinessUnitAssociateResponse
     */
    public BusinessUnitAssociateResponse build() {
        Objects.requireNonNull(customer, BusinessUnitAssociateResponse.class + ": customer is missing");
        Objects.requireNonNull(associateRoles, BusinessUnitAssociateResponse.class + ": associateRoles is missing");
        Objects.requireNonNull(inheritedAssociateRoles,
            BusinessUnitAssociateResponse.class + ": inheritedAssociateRoles is missing");
        Objects.requireNonNull(permissions, BusinessUnitAssociateResponse.class + ": permissions is missing");
        return new BusinessUnitAssociateResponseImpl(customer, associateRoles, inheritedAssociateRoles, permissions);
    }

    /**
     * builds BusinessUnitAssociateResponse without checking for non-null required values
     * @return BusinessUnitAssociateResponse
     */
    public BusinessUnitAssociateResponse buildUnchecked() {
        return new BusinessUnitAssociateResponseImpl(customer, associateRoles, inheritedAssociateRoles, permissions);
    }

    /**
     * factory method for an instance of BusinessUnitAssociateResponseBuilder
     * @return builder
     */
    public static BusinessUnitAssociateResponseBuilder of() {
        return new BusinessUnitAssociateResponseBuilder();
    }

    /**
     * create builder for BusinessUnitAssociateResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateResponseBuilder of(final BusinessUnitAssociateResponse template) {
        BusinessUnitAssociateResponseBuilder builder = new BusinessUnitAssociateResponseBuilder();
        builder.customer = template.getCustomer();
        builder.associateRoles = template.getAssociateRoles();
        builder.inheritedAssociateRoles = template.getInheritedAssociateRoles();
        builder.permissions = template.getPermissions();
        return builder;
    }

}
