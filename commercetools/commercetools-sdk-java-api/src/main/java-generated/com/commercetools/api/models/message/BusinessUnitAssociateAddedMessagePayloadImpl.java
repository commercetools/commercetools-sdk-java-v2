
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddAssociateAction" rel="nofollow">Add Associate</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateAddedMessagePayloadImpl
        implements BusinessUnitAssociateAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociateAddedMessagePayloadImpl(
            @JsonProperty("associate") final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        this.type = BUSINESS_UNIT_ASSOCIATE_ADDED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAssociateAddedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ASSOCIATE_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     */

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    public void setAssociate(final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAssociateAddedMessagePayloadImpl that = (BusinessUnitAssociateAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(associate, that.associate)
                .append(type, that.type)
                .append(associate, that.associate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("associate", associate)
                .build();
    }

    @Override
    public BusinessUnitAssociateAddedMessagePayload copyDeep() {
        return BusinessUnitAssociateAddedMessagePayload.deepCopy(this);
    }
}
