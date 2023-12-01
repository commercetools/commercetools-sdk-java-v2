
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
 * AssociateRoleAssignment
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleAssignmentImpl implements AssociateRoleAssignment, ModelBase {

    private com.commercetools.history.models.common.KeyReference associateRole;

    private com.commercetools.history.models.common.AssociateRoleInheritanceMode inheritance;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleAssignmentImpl(
            @JsonProperty("associateRole") final com.commercetools.history.models.common.KeyReference associateRole,
            @JsonProperty("inheritance") final com.commercetools.history.models.common.AssociateRoleInheritanceMode inheritance) {
        this.associateRole = associateRole;
        this.inheritance = inheritance;
    }

    /**
     * create empty instance
     */
    public AssociateRoleAssignmentImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.KeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *  <p>Determines whether an AssociateRoleAssignment can be inherited by child Business Units.</p>
     */

    public com.commercetools.history.models.common.AssociateRoleInheritanceMode getInheritance() {
        return this.inheritance;
    }

    public void setAssociateRole(final com.commercetools.history.models.common.KeyReference associateRole) {
        this.associateRole = associateRole;
    }

    public void setInheritance(final com.commercetools.history.models.common.AssociateRoleInheritanceMode inheritance) {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("associateRole", associateRole)
                .append("inheritance", inheritance)
                .build();
    }

}
