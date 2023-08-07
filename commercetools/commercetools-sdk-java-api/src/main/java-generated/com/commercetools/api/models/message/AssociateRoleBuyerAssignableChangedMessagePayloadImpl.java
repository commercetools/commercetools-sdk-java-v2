
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

/**
 *  <p>Generated after a successful Change BuyerAssignable update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleBuyerAssignableChangedMessagePayloadImpl
        implements AssociateRoleBuyerAssignableChangedMessagePayload, ModelBase {

    private String type;

    private Boolean buyerAssignable;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleBuyerAssignableChangedMessagePayloadImpl(
            @JsonProperty("buyerAssignable") final Boolean buyerAssignable) {
        this.buyerAssignable = buyerAssignable;
        this.type = ASSOCIATE_ROLE_BUYER_ASSIGNABLE_CHANGED;
    }

    /**
     * create empty instance
     */
    public AssociateRoleBuyerAssignableChangedMessagePayloadImpl() {
        this.type = ASSOCIATE_ROLE_BUYER_ASSIGNABLE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
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

        AssociateRoleBuyerAssignableChangedMessagePayloadImpl that = (AssociateRoleBuyerAssignableChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(buyerAssignable, that.buyerAssignable)
                .append(type, that.type)
                .append(buyerAssignable, that.buyerAssignable)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(buyerAssignable).toHashCode();
    }

}
