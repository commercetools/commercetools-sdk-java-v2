
package com.commercetools.api.models.business_unit;

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
 *  <p>Adding an Associate to a Business Unit generates a BusinessUnitAssociateAdded Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddAssociateActionImpl implements BusinessUnitAddAssociateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    @JsonCreator
    BusinessUnitAddAssociateActionImpl(
            @JsonProperty("associate") final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        this.action = ADD_ASSOCIATE;
    }

    public BusinessUnitAddAssociateActionImpl() {
        this.action = ADD_ASSOCIATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Associate to add.</p>
     */

    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate() {
        return this.associate;
    }

    public void setAssociate(final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddAssociateActionImpl that = (BusinessUnitAddAssociateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(associate, that.associate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(associate).toHashCode();
    }

}
