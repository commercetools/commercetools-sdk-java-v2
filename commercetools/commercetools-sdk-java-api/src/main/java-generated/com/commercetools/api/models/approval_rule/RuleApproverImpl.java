
package com.commercetools.api.models.approval_rule;

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
 * RuleApprover
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleApproverImpl implements RuleApprover, ModelBase {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RuleApproverImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
    }

    /**
     * create empty instance
     */
    public RuleApproverImpl() {
    }

    /**
     *  <p>The Associate Role that is allowed to approve at a given stage in the approval process.</p>
     */

    public com.commercetools.api.models.associate_role.AssociateRoleKeyReference getAssociateRole() {
        return this.associateRole;
    }

    public void setAssociateRole(
            final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RuleApproverImpl that = (RuleApproverImpl) o;

        return new EqualsBuilder().append(associateRole, that.associateRole)
                .append(associateRole, that.associateRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(associateRole).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("associateRole", associateRole)
                .build();
    }

    @Override
    public RuleApprover copyDeep() {
        return RuleApprover.deepCopy(this);
    }
}
