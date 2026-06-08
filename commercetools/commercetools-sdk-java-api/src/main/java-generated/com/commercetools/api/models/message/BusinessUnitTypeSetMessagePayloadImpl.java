
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitTypeSetMessagePayloadImpl implements BusinessUnitTypeSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitTypeSetMessagePayloadImpl(
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit,
            @JsonProperty("oldParentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit,
            @JsonProperty("unitType") final com.commercetools.api.models.business_unit.BusinessUnitType unitType,
            @JsonProperty("oldUnitType") final com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType) {
        this.parentUnit = parentUnit;
        this.oldParentUnit = oldParentUnit;
        this.unitType = unitType;
        this.oldUnitType = oldUnitType;
        this.type = BUSINESS_UNIT_TYPE_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitTypeSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_TYPE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getOldUnitType() {
        return this.oldUnitType;
    }

    public void setParentUnit(final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
    }

    public void setOldParentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
    }

    public void setUnitType(final com.commercetools.api.models.business_unit.BusinessUnitType unitType) {
        this.unitType = unitType;
    }

    public void setOldUnitType(final com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType) {
        this.oldUnitType = oldUnitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitTypeSetMessagePayloadImpl that = (BusinessUnitTypeSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(parentUnit, that.parentUnit)
                .append(oldParentUnit, that.oldParentUnit)
                .append(unitType, that.unitType)
                .append(oldUnitType, that.oldUnitType)
                .append(type, that.type)
                .append(parentUnit, that.parentUnit)
                .append(oldParentUnit, that.oldParentUnit)
                .append(unitType, that.unitType)
                .append(oldUnitType, that.oldUnitType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(parentUnit)
                .append(oldParentUnit)
                .append(unitType)
                .append(oldUnitType)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("parentUnit", parentUnit)
                .append("oldParentUnit", oldParentUnit)
                .append("unitType", unitType)
                .append("oldUnitType", oldUnitType)
                .build();
    }

    @Override
    public BusinessUnitTypeSetMessagePayload copyDeep() {
        return BusinessUnitTypeSetMessagePayload.deepCopy(this);
    }
}
