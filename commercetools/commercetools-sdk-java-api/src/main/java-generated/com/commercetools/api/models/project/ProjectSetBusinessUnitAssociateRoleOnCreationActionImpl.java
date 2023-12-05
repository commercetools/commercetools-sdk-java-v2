
package com.commercetools.api.models.project;

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
 * ProjectSetBusinessUnitAssociateRoleOnCreationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl
        implements ProjectSetBusinessUnitAssociateRoleOnCreationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
        this.action = SET_MY_BUSINESS_UNIT_ASSOCIATE_ROLE_ON_CREATION;
    }

    /**
     * create empty instance
     */
    public ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl() {
        this.action = SET_MY_BUSINESS_UNIT_ASSOCIATE_ROLE_ON_CREATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     */

    public com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier getAssociateRole() {
        return this.associateRole;
    }

    public void setAssociateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl that = (ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(associateRole, that.associateRole)
                .append(action, that.action)
                .append(associateRole, that.associateRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(associateRole).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("associateRole", associateRole)
                .build();
    }

}
