
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
 * RuleRequesterDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RuleRequesterDraftImpl implements RuleRequesterDraft, ModelBase {

    private com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RuleRequesterDraftImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier associateRole) {
        this.associateRole = associateRole;
    }

    /**
     * create empty instance
     */
    public RuleRequesterDraftImpl() {
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">Associate Role</a> that an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> must hold for the Approval Rule to apply to the Orders they create.</p>
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

        RuleRequesterDraftImpl that = (RuleRequesterDraftImpl) o;

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
    public RuleRequesterDraft copyDeep() {
        return RuleRequesterDraft.deepCopy(this);
    }
}
