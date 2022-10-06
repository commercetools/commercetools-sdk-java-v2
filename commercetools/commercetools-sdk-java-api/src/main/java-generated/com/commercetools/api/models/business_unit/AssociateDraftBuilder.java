
package com.commercetools.api.models.business_unit;

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
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .customer(customerBuilder -> customerBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateDraftBuilder implements Builder<AssociateDraft> {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     */

    public AssociateDraftBuilder roles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     */

    public AssociateDraftBuilder roles(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     */

    public AssociateDraftBuilder plusRoles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */

    public AssociateDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */

    public AssociateDraftBuilder customer(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRole> getRoles() {
        return this.roles;
    }

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public AssociateDraft build() {
        Objects.requireNonNull(roles, AssociateDraft.class + ": roles is missing");
        Objects.requireNonNull(customer, AssociateDraft.class + ": customer is missing");
        return new AssociateDraftImpl(roles, customer);
    }

    /**
     * builds AssociateDraft without checking for non null required values
     */
    public AssociateDraft buildUnchecked() {
        return new AssociateDraftImpl(roles, customer);
    }

    public static AssociateDraftBuilder of() {
        return new AssociateDraftBuilder();
    }

    public static AssociateDraftBuilder of(final AssociateDraft template) {
        AssociateDraftBuilder builder = new AssociateDraftBuilder();
        builder.roles = template.getRoles();
        builder.customer = template.getCustomer();
        return builder;
    }

}
