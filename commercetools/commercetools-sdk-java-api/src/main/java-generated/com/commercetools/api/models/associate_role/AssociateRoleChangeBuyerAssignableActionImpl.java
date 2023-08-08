
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
 *  <p>Changing the <code>buyerAssignable</code> value of an AssociateRole generates an AssociateRoleBuyerAssignableChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleChangeBuyerAssignableActionImpl
        implements AssociateRoleChangeBuyerAssignableAction, ModelBase {

    private String action;

    private Boolean buyerAssignable;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleChangeBuyerAssignableActionImpl(@JsonProperty("buyerAssignable") final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
        this.action = CHANGE_BUYER_ASSIGNABLE;
    }

    /**
     * create empty instance
     */
    public AssociateRoleChangeBuyerAssignableActionImpl() {
        this.action = CHANGE_BUYER_ASSIGNABLE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The new value of the <code>buyerAssignable</code> field of the AssociateRole.</p>
     */

    public Boolean getBuyerAssignable() {
        return this.buyerAssignable;
    }

    public void setBuyerAssignable(final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleChangeBuyerAssignableActionImpl that = (AssociateRoleChangeBuyerAssignableActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(buyerAssignable, that.buyerAssignable)
                .append(action, that.action)
                .append(buyerAssignable, that.buyerAssignable)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(buyerAssignable).toHashCode();
    }

}
