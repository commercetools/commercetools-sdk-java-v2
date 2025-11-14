
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Associate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateImpl implements Associate, ModelBase {

    private java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments;

    private java.util.List<com.commercetools.history.models.common.AssociateRoleDeprecated> roles;

    private com.commercetools.history.models.common.CustomerReference customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateImpl(
            @JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments,
            @JsonProperty("roles") final java.util.List<com.commercetools.history.models.common.AssociateRoleDeprecated> roles,
            @JsonProperty("customer") final com.commercetools.history.models.common.CustomerReference customer) {
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

    public java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignments</code> instead.</p>
     */

    public java.util.List<com.commercetools.history.models.common.AssociateRoleDeprecated> getRoles() {
        return this.roles;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that acts as an Associate in the Business Unit.</p>
     */

    public com.commercetools.history.models.common.CustomerReference getCustomer() {
        return this.customer;
    }

    public void setAssociateRoleAssignments(
            final com.commercetools.history.models.common.AssociateRoleAssignment... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
    }

    public void setAssociateRoleAssignments(
            final java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
    }

    public void setRoles(final com.commercetools.history.models.common.AssociateRoleDeprecated... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.history.models.common.AssociateRoleDeprecated> roles) {
        this.roles = roles;
    }

    public void setCustomer(final com.commercetools.history.models.common.CustomerReference customer) {
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
                .append(associateRoleAssignments, that.associateRoleAssignments)
                .append(roles, that.roles)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRoleAssignments).append(roles).append(customer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("associateRoleAssignments", associateRoleAssignments)
                .append("roles", roles)
                .append("customer", customer)
                .build();
    }

    @Override
    public Associate copyDeep() {
        return Associate.deepCopy(this);
    }
}
