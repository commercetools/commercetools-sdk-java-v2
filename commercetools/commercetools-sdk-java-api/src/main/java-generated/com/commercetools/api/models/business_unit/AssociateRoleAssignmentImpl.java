
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
 * AssociateRoleAssignment
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAssignmentImpl implements AssociateRoleAssignment, ModelBase {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    private com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode inheritance;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleAssignmentImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole,
            @JsonProperty("inheritance") final com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode inheritance) {
        this.associateRole = associateRole;
        this.inheritance = inheritance;
    }

    /**
     * create empty instance
     */
    public AssociateRoleAssignmentImpl() {
    }

    /**
     *  <p>Role the Associate holds within a Business Unit.</p>
     */

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Determines whether the AssociateRoleAssignment can be inherited by child Business Units.</p>
     */

    public com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode getInheritance() {
        return this.inheritance;
    }

    public void setAssociateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
    }

    public void setInheritance(
            final com.commercetools.api.models.business_unit.AssociateRoleInheritanceMode inheritance) {
        this.inheritance = inheritance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleAssignmentImpl that = (AssociateRoleAssignmentImpl) o;

        return new EqualsBuilder().append(associateRole, that.associateRole)
                .append(inheritance, that.inheritance)
                .append(associateRole, that.associateRole)
                .append(inheritance, that.inheritance)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRole).append(inheritance).toHashCode();
    }

}
