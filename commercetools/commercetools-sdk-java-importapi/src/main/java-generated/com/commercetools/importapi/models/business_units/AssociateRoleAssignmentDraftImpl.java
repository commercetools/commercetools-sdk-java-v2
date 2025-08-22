
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
 *  <p>The role of an Associate in a Business Unit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAssignmentDraftImpl implements AssociateRoleAssignmentDraft, ModelBase {

    private com.commercetools.importapi.models.common.AssociateRoleKeyReference associateRole;

    private com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode inheritance;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleAssignmentDraftImpl(
            @JsonProperty("associateRole") final com.commercetools.importapi.models.common.AssociateRoleKeyReference associateRole,
            @JsonProperty("inheritance") final com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode inheritance) {
        this.associateRole = associateRole;
        this.inheritance = inheritance;
    }

    /**
     * create empty instance
     */
    public AssociateRoleAssignmentDraftImpl() {
    }

    /**
     *  <p>The role to assign to the Associate.</p>
     */

    public com.commercetools.importapi.models.common.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Determines whether the AssociateRole is inherited. If <code>Disabled</code>, the AssociateRole is not inherited from a parent Business Unit.</p>
     */

    public com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode getInheritance() {
        return this.inheritance;
    }

    public void setAssociateRole(
            final com.commercetools.importapi.models.common.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
    }

    public void setInheritance(
            final com.commercetools.importapi.models.business_units.AssociateRoleInheritanceMode inheritance) {
        this.inheritance = inheritance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleAssignmentDraftImpl that = (AssociateRoleAssignmentDraftImpl) o;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("associateRole", associateRole)
                .append("inheritance", inheritance)
                .build();
    }

    @Override
    public AssociateRoleAssignmentDraft copyDeep() {
        return AssociateRoleAssignmentDraft.deepCopy(this);
    }
}
