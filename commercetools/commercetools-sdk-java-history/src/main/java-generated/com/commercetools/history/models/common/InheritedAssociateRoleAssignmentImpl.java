
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
 * InheritedAssociateRoleAssignment
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InheritedAssociateRoleAssignmentImpl implements InheritedAssociateRoleAssignment, ModelBase {

    private com.commercetools.history.models.common.KeyReference associateRole;

    private com.commercetools.history.models.common.KeyReference source;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InheritedAssociateRoleAssignmentImpl(
            @JsonProperty("associateRole") final com.commercetools.history.models.common.KeyReference associateRole,
            @JsonProperty("source") final com.commercetools.history.models.common.KeyReference source) {
        this.associateRole = associateRole;
        this.source = source;
    }

    /**
     * create empty instance
     */
    public InheritedAssociateRoleAssignmentImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.KeyReference getAssociateRole() {
        return this.associateRole;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.KeyReference getSource() {
        return this.source;
    }

    public void setAssociateRole(final com.commercetools.history.models.common.KeyReference associateRole) {
        this.associateRole = associateRole;
    }

    public void setSource(final com.commercetools.history.models.common.KeyReference source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InheritedAssociateRoleAssignmentImpl that = (InheritedAssociateRoleAssignmentImpl) o;

        return new EqualsBuilder().append(associateRole, that.associateRole)
                .append(source, that.source)
                .append(associateRole, that.associateRole)
                .append(source, that.source)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRole).append(source).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("associateRole", associateRole)
                .append("source", source)
                .build();
    }

    @Override
    public InheritedAssociateRoleAssignment copyDeep() {
        return InheritedAssociateRoleAssignment.deepCopy(this);
    }
}
