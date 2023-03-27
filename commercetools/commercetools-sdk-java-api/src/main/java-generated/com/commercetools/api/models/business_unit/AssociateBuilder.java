
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
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateBuilder implements Builder<Associate> {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles;

    private com.commercetools.api.models.customer.CustomerReference customer;

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles value to be set
     * @return Builder
     */

    public AssociateBuilder roles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles value to be set
     * @return Builder
     */

    public AssociateBuilder roles(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles value to be set
     * @return Builder
     */

    public AssociateBuilder plusRoles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public AssociateBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
     * @param customer value to be set
     * @return Builder
     */

    public AssociateBuilder customer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @return roles
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRole> getRoles() {
        return this.roles;
    }

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
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
        Objects.requireNonNull(roles, Associate.class + ": roles is missing");
        Objects.requireNonNull(customer, Associate.class + ": customer is missing");
        return new AssociateImpl(roles, customer);
    }

    /**
     * builds Associate without checking for non-null required values
     * @return Associate
     */
    public Associate buildUnchecked() {
        return new AssociateImpl(roles, customer);
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
        builder.roles = template.getRoles();
        builder.customer = template.getCustomer();
        return builder;
    }

}
