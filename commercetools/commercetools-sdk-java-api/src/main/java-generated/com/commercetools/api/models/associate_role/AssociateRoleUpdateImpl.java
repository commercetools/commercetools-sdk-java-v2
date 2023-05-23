
package com.commercetools.api.models.associate_role;

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
 * AssociateRoleUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleUpdateImpl implements AssociateRoleUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> actions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    /**
     * create empty instance
     */
    public AssociateRoleUpdateImpl() {
    }

    /**
     *  <p>Expected version of the AssociateRole on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the AssociateRole.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.associate_role.AssociateRoleUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.associate_role.AssociateRoleUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleUpdateImpl that = (AssociateRoleUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
