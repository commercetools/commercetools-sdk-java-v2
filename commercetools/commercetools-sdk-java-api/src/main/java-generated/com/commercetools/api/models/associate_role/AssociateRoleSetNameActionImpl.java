
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Updating the name of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a> generates an <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRoleNameSetMessage" rel="nofollow">AssociateRoleNameSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleSetNameActionImpl implements AssociateRoleSetNameAction, ModelBase {

    private String action;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleSetNameActionImpl(@JsonProperty("name") final String name) {
        this.name = name;
        this.action = SET_NAME;
    }

    /**
     * create empty instance
     */
    public AssociateRoleSetNameActionImpl() {
        this.action = SET_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New name to set. If <code>name</code> is absent or <code>null</code>, the existing name, if any, will be removed.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleSetNameActionImpl that = (AssociateRoleSetNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(action, that.action)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("name", name)
                .build();
    }

    @Override
    public AssociateRoleSetNameAction copyDeep() {
        return AssociateRoleSetNameAction.deepCopy(this);
    }
}
