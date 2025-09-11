
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/business-units:POST" rel="nofollow">Create BusinessUnit</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCreatedMessagePayloadImpl implements BusinessUnitCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnit businessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitCreatedMessagePayloadImpl(
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
        this.type = BUSINESS_UNIT_CREATED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitCreatedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> that was created.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnit getBusinessUnit() {
        return this.businessUnit;
    }

    public void setBusinessUnit(final com.commercetools.api.models.business_unit.BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitCreatedMessagePayloadImpl that = (BusinessUnitCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(businessUnit, that.businessUnit)
                .append(type, that.type)
                .append(businessUnit, that.businessUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(businessUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("businessUnit", businessUnit)
                .build();
    }

    @Override
    public BusinessUnitCreatedMessagePayload copyDeep() {
        return BusinessUnitCreatedMessagePayload.deepCopy(this);
    }
}
