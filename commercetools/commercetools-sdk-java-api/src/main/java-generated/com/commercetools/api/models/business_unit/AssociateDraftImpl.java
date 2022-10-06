
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
 * AssociateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateDraftImpl implements AssociateDraft, ModelBase {

    private java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @JsonCreator
    AssociateDraftImpl(
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.roles = roles;
        this.customer = customer;
    }

    public AssociateDraftImpl() {
    }

    /**
     *  <p>Roles the Associate should hold within the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateRole> getRoles() {
        return this.roles;
    }

    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public void setRoles(final com.commercetools.api.models.business_unit.AssociateRole... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.business_unit.AssociateRole> roles) {
        this.roles = roles;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateDraftImpl that = (AssociateDraftImpl) o;

        return new EqualsBuilder().append(roles, that.roles).append(customer, that.customer).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(roles).append(customer).toHashCode();
    }

}
