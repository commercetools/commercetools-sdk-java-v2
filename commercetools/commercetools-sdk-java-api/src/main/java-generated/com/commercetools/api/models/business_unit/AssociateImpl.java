
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Associate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateImpl implements Associate, ModelBase {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> associateRoleAssignments;

    @Deprecated
    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles;

    private com.commercetools.api.models.customer.CustomerReference customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateImpl(
            @JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> associateRoleAssignments,
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer) {
        this.associateRoleAssignments = associateRoleAssignments;
        this.roles = roles;
        this.customer = customer;
    }

    /**
     * create empty instance
     */
    public AssociateImpl() {
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     */
    @Deprecated
    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> getRoles() {
        return this.roles;
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    public void setAssociateRoleAssignments(
            final com.commercetools.api.models.business_unit.AssociateRoleAssignment... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
    }

    public void setAssociateRoleAssignments(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignment> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
    }

    @Deprecated
    public void setRoles(final com.commercetools.api.models.business_unit.AssociateRoleDeprecated... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    @Deprecated
    public void setRoles(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles) {
        this.roles = roles;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateImpl that = (AssociateImpl) o;

        return new EqualsBuilder().append(associateRoleAssignments, that.associateRoleAssignments)
                .append(roles, that.roles)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRoleAssignments).append(roles).append(customer).toHashCode();
    }

}
