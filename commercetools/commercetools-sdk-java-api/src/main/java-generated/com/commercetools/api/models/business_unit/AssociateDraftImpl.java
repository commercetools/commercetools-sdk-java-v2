package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft;
import com.commercetools.api.models.business_unit.AssociateRoleDeprecated;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * AssociateDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AssociateDraftImpl implements AssociateDraft, ModelBase {

    
    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments;
    
    @Deprecated
    private java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateDraftImpl(@JsonProperty("associateRoleAssignments") final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments, @JsonProperty("roles") final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles, @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.associateRoleAssignments = associateRoleAssignments;
        this.roles = roles;
        this.customer = customer;
    }
    /**
     * create empty instance
     */
    public AssociateDraftImpl() {
    }

    /**
     *  <p>Roles assigned to the Associate within a Business Unit.</p>
     */
    
    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> getAssociateRoleAssignments(){
        return this.associateRoleAssignments;
    }
    
    /**
     *  <p>Deprecated type. Use <code>associateRoleAssignment</code> instead.</p>
     */
    @Deprecated
    public java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> getRoles(){
        return this.roles;
    }
    
    /**
     *  <p>The Customer to be part of the Business Unit.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }

    
    public void setAssociateRoleAssignments(final com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft ...associateRoleAssignments){
       this.associateRoleAssignments = new ArrayList<>(Arrays.asList(associateRoleAssignments));
    }
    
    
    public void setAssociateRoleAssignments(final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleAssignmentDraft> associateRoleAssignments){
       this.associateRoleAssignments = associateRoleAssignments;
    }
    
    @Deprecated
    public void setRoles(final com.commercetools.api.models.business_unit.AssociateRoleDeprecated ...roles){
       this.roles = new ArrayList<>(Arrays.asList(roles));
    }
    
    @Deprecated
    public void setRoles(final java.util.List<com.commercetools.api.models.business_unit.AssociateRoleDeprecated> roles){
       this.roles = roles;
    }
    
    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        AssociateDraftImpl that = (AssociateDraftImpl) o;
    
        return new EqualsBuilder()
                .append(associateRoleAssignments, that.associateRoleAssignments)
                .append(roles, that.roles)
                .append(customer, that.customer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(associateRoleAssignments)
            .append(roles)
            .append(customer)
            .toHashCode();
    }

}
