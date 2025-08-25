
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Updating the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> on a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAssociateChangedMessage" rel="nofollow">BusinessUnitAssociateChanged</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAssociateActionImpl implements BusinessUnitChangeAssociateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeAssociateActionImpl(
            @JsonProperty("associate") final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        this.action = CHANGE_ASSOCIATE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitChangeAssociateActionImpl() {
        this.action = CHANGE_ASSOCIATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New version of an existing Associate.</p>
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

        BusinessUnitChangeAssociateActionImpl that = (BusinessUnitChangeAssociateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(associate, that.associate)
                .append(action, that.action)
                .append(associate, that.associate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(associate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("associate", associate)
                .build();
    }

    @Override
    public BusinessUnitChangeAssociateAction copyDeep() {
        return BusinessUnitChangeAssociateAction.deepCopy(this);
    }
}
