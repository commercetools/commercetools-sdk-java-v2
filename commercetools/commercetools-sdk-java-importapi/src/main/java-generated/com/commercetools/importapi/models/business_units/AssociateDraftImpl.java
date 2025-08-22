
package com.commercetools.importapi.models.business_units;

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
 *  <p>Draft for an Associate in a Business Unit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateDraftImpl implements AssociateDraft, ModelBase {

    private com.commercetools.importapi.models.common.CustomerKeyReference customer;

    private java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> associateRoleAssignments;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateDraftImpl(
            @JsonProperty("customer") final com.commercetools.importapi.models.common.CustomerKeyReference customer,
            @JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> associateRoleAssignments) {
        this.customer = customer;
        this.associateRoleAssignments = associateRoleAssignments;
    }

    /**
     * create empty instance
     */
    public AssociateDraftImpl() {
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */

    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>The roles to assign to the Associate.</p>
     */

    public java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> getAssociateRoleAssignments() {
        return this.associateRoleAssignments;
    }

    public void setCustomer(final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
    }

    public void setAssociateRoleAssignments(
            final com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft... associateRoleAssignments) {
        this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
    }

    public void setAssociateRoleAssignments(
            final java.util.List<com.commercetools.importapi.models.business_units.AssociateRoleAssignmentDraft> associateRoleAssignments) {
        this.associateRoleAssignments = associateRoleAssignments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateDraftImpl that = (AssociateDraftImpl) o;

        return new EqualsBuilder().append(customer, that.customer)
                .append(associateRoleAssignments, that.associateRoleAssignments)
                .append(customer, that.customer)
                .append(associateRoleAssignments, that.associateRoleAssignments)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customer).append(associateRoleAssignments).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("customer", customer)
                .append("associateRoleAssignments", associateRoleAssignments)
                .build();
    }

    @Override
    public AssociateDraft copyDeep() {
        return AssociateDraft.deepCopy(this);
    }
}
