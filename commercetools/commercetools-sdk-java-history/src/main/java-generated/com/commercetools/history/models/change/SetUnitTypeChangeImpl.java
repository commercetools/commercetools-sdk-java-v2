
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetUnitTypeChangeImpl implements SetUnitTypeChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.BusinessUnitResourceIdentifier parentUnit;

    private com.commercetools.history.models.common.BusinessUnitType previousValue;

    private com.commercetools.history.models.common.BusinessUnitType nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetUnitTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("parentUnit") final com.commercetools.history.models.common.BusinessUnitResourceIdentifier parentUnit,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.BusinessUnitType previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.BusinessUnitType nextValue) {
        this.change = change;
        this.parentUnit = parentUnit;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_UNIT_TYPE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetUnitTypeChangeImpl() {
        this.type = SET_UNIT_TYPE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>If <code>unitType="Division"</code>, reference to the new parent unit for the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     */

    public com.commercetools.history.models.common.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.BusinessUnitType getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.BusinessUnitType getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setParentUnit(final com.commercetools.history.models.common.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.BusinessUnitType previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.BusinessUnitType nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetUnitTypeChangeImpl that = (SetUnitTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(parentUnit, that.parentUnit)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(parentUnit, that.parentUnit)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(parentUnit)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("parentUnit", parentUnit)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetUnitTypeChange copyDeep() {
        return SetUnitTypeChange.deepCopy(this);
    }
}
