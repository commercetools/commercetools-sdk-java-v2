
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Information about all roles and permissions of an Associate in a BusinessUnit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateResponseImpl implements BusinessUnitAssociateResponse, ModelBase {

    private com.commercetools.api.models.customer.CustomerReference customer;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRole> associateRoles;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRole> inheritedAssociateRoles;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociateResponseImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("associateRoles") final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> associateRoles,
            @JsonProperty("inheritedAssociateRoles") final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> inheritedAssociateRoles,
            @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.customer = customer;
        this.associateRoles = associateRoles;
        this.inheritedAssociateRoles = inheritedAssociateRoles;
        this.permissions = permissions;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAssociateResponseImpl() {
    }

    /**
     *  <p>The Customer that acts as an Associate in the Business Unit.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Roles assigned to Associates in the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRole> getAssociateRoles() {
        return this.associateRoles;
    }

    /**
     *  <p>Roles inherited by Associates from the parent Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRole> getInheritedAssociateRoles() {
        return this.inheritedAssociateRoles;
    }

    /**
     *  <p>Permissions the Associate has in the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setAssociateRoles(final com.commercetools.api.models.associate_role.AssociateRole... associateRoles) {
        this.associateRoles = new ArrayList<>(Arrays.asList(associateRoles));
    }

    public void setAssociateRoles(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> associateRoles) {
        this.associateRoles = associateRoles;
    }

    public void setInheritedAssociateRoles(
            final com.commercetools.api.models.associate_role.AssociateRole... inheritedAssociateRoles) {
        this.inheritedAssociateRoles = new ArrayList<>(Arrays.asList(inheritedAssociateRoles));
    }

    public void setInheritedAssociateRoles(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRole> inheritedAssociateRoles) {
        this.inheritedAssociateRoles = inheritedAssociateRoles;
    }

    public void setPermissions(final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }

    public void setPermissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAssociateResponseImpl that = (BusinessUnitAssociateResponseImpl) o;

        return new EqualsBuilder().append(customer, that.customer)
                .append(associateRoles, that.associateRoles)
                .append(inheritedAssociateRoles, that.inheritedAssociateRoles)
                .append(permissions, that.permissions)
                .append(customer, that.customer)
                .append(associateRoles, that.associateRoles)
                .append(inheritedAssociateRoles, that.inheritedAssociateRoles)
                .append(permissions, that.permissions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customer)
                .append(associateRoles)
                .append(inheritedAssociateRoles)
                .append(permissions)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("customer", customer)
                .append("associateRoles", associateRoles)
                .append("inheritedAssociateRoles", inheritedAssociateRoles)
                .append("permissions", permissions)
                .build();
    }

    @Override
    public BusinessUnitAssociateResponse copyDeep() {
        return BusinessUnitAssociateResponse.deepCopy(this);
    }
}
