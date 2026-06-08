
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
 *  <p>Generated when a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> <code>topLevelUnit</code> is modified due to a hierarchy change after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitTopLevelUnitSetMessagePayloadImpl
        implements BusinessUnitTopLevelUnitSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldTopLevelUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitTopLevelUnitSetMessagePayloadImpl(
            @JsonProperty("topLevelUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit,
            @JsonProperty("oldTopLevelUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldTopLevelUnit) {
        this.topLevelUnit = topLevelUnit;
        this.oldTopLevelUnit = oldTopLevelUnit;
        this.type = BUSINESS_UNIT_TOP_LEVEL_UNIT_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitTopLevelUnitSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_TOP_LEVEL_UNIT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    /**
     *  <p>Top-level unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeParentUnitAction" rel="nofollow">Change Parent Unit</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldTopLevelUnit() {
        return this.oldTopLevelUnit;
    }

    public void setTopLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
    }

    public void setOldTopLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldTopLevelUnit) {
        this.oldTopLevelUnit = oldTopLevelUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitTopLevelUnitSetMessagePayloadImpl that = (BusinessUnitTopLevelUnitSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(topLevelUnit, that.topLevelUnit)
                .append(oldTopLevelUnit, that.oldTopLevelUnit)
                .append(type, that.type)
                .append(topLevelUnit, that.topLevelUnit)
                .append(oldTopLevelUnit, that.oldTopLevelUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(topLevelUnit).append(oldTopLevelUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("topLevelUnit", topLevelUnit)
                .append("oldTopLevelUnit", oldTopLevelUnit)
                .build();
    }

    @Override
    public BusinessUnitTopLevelUnitSetMessagePayload copyDeep() {
        return BusinessUnitTopLevelUnitSetMessagePayload.deepCopy(this);
    }
}
