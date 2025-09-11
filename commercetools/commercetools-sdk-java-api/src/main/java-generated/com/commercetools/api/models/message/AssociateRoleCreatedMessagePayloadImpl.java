
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/associate-roles:POST" rel="nofollow">Create AssociateRole</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleCreatedMessagePayloadImpl implements AssociateRoleCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.associate_role.AssociateRole associateRole;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleCreatedMessagePayloadImpl(
            @JsonProperty("associateRole") final com.commercetools.api.models.associate_role.AssociateRole associateRole) {
        this.associateRole = associateRole;
        this.type = ASSOCIATE_ROLE_CREATED;
    }

    /**
     * create empty instance
     */
    public AssociateRoleCreatedMessagePayloadImpl() {
        this.type = ASSOCIATE_ROLE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a> that was created.</p>
     */

    public com.commercetools.api.models.associate_role.AssociateRole getAssociateRole() {
        return this.associateRole;
    }

    public void setAssociateRole(final com.commercetools.api.models.associate_role.AssociateRole associateRole) {
        this.associateRole = associateRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleCreatedMessagePayloadImpl that = (AssociateRoleCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(associateRole, that.associateRole)
                .append(type, that.type)
                .append(associateRole, that.associateRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associateRole).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("associateRole", associateRole)
                .build();
    }

    @Override
    public AssociateRoleCreatedMessagePayload copyDeep() {
        return AssociateRoleCreatedMessagePayload.deepCopy(this);
    }
}
