
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
     * @param roles
     * @return Builder
     */

    public AssociateBuilder roles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles
     * @return Builder
     */

    public AssociateBuilder roles(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles the Associate holds within the Business Unit.</p>
     * @param roles
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
     * @return Builder
     */

    public AssociateBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Customer that is part of the Business Unit.</p>
     * @param customer
     * @return Builder
     */

    public AssociateBuilder customer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRole> getRoles() {
        return this.roles;
    }

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public Associate build() {
        Objects.requireNonNull(roles, Associate.class + ": roles is missing");
        Objects.requireNonNull(customer, Associate.class + ": customer is missing");
        return new AssociateImpl(roles, customer);
    }

    /**
     * builds Associate without checking for non null required values
     */
    public Associate buildUnchecked() {
        return new AssociateImpl(roles, customer);
    }

    public static AssociateBuilder of() {
        return new AssociateBuilder();
    }

    public static AssociateBuilder of(final Associate template) {
        AssociateBuilder builder = new AssociateBuilder();
        builder.roles = template.getRoles();
        builder.customer = template.getCustomer();
        return builder;
    }

}
