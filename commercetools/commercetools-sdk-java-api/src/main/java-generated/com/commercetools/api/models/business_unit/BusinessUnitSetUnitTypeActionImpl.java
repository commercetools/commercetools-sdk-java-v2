
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
 *  <p>This action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitTypeSetMessage" rel="nofollow">BusinessUnitTypeSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetUnitTypeActionImpl implements BusinessUnitSetUnitTypeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetUnitTypeActionImpl(
            @JsonProperty("unitType") final com.commercetools.api.models.business_unit.BusinessUnitType unitType,
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.unitType = unitType;
        this.parentUnit = parentUnit;
        this.action = SET_UNIT_TYPE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSetUnitTypeActionImpl() {
        this.action = SET_UNIT_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     *  <p>If <code>unitType="Company"</code>, the Business Unit <code>storeMode</code>, <code>associateMode</code>, and <code>approvalRuleMode</code> field values must be <code>Explicit</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>New parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>, if <code>unitType="Division"</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    public void setUnitType(final com.commercetools.api.models.business_unit.BusinessUnitType unitType) {
        this.unitType = unitType;
    }

    public void setParentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitSetUnitTypeActionImpl that = (BusinessUnitSetUnitTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(unitType, that.unitType)
                .append(parentUnit, that.parentUnit)
                .append(action, that.action)
                .append(unitType, that.unitType)
                .append(parentUnit, that.parentUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(unitType).append(parentUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("unitType", unitType)
                .append("parentUnit", parentUnit)
                .build();
    }

    @Override
    public BusinessUnitSetUnitTypeAction copyDeep() {
        return BusinessUnitSetUnitTypeAction.deepCopy(this);
    }
}
