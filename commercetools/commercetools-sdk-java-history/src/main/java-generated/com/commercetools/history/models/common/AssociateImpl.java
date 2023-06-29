
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

/**
 * Associate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateImpl implements Associate, ModelBase {

    private java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments;

    private com.commercetools.history.models.common.Reference customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateImpl(
            @JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> associateRoleAssignments,
            @JsonProperty("customer") final com.commercetools.history.models.common.Reference customer) {
        this.associateRoleAssignments = associateRoleAssignments;
        this.customer = customer;
    }

    /**
     * create empty instance
     */
    public AssociateImpl() {
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.AssociateRoleAssignment> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getCustomer() {
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

    public void setCustomer(final com.commercetools.history.models.common.Reference customer) {
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
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRoleAssignments).append(customer).toHashCode();
    }

}
