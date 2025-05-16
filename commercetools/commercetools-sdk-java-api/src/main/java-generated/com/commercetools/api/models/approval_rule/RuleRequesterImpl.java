
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
 * RuleRequester
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleRequesterImpl implements RuleRequester, ModelBase {

    private com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RuleRequesterImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleKeyReference associateRole) {
        this.associateRole = associateRole;
    }

    /**
     * create empty instance
     */
    public RuleRequesterImpl() {
    }

    /**
     *  <p>The Associate Role that an Associate must hold for the Approval Rule to apply to the Orders they create.</p>
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

        RuleRequesterImpl that = (RuleRequesterImpl) o;

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
    public RuleRequester copyDeep() {
        return RuleRequester.deepCopy(this);
    }
}
