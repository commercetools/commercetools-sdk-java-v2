
package com.commercetools.api.models.me;

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
 *  <p>Changing the parent of a Business Unit generates a BusinessUnitParentChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitChangeParentUnitActionImpl implements MyBusinessUnitChangeParentUnitAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitChangeParentUnitActionImpl(
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        this.action = CHANGE_PARENT_UNIT;
    }

    /**
     * create empty instance
     */
    public MyBusinessUnitChangeParentUnitActionImpl() {
        this.action = CHANGE_PARENT_UNIT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New parent unit of the Business Unit. The new parent unit must have the same top-level unit as the old parent unit.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
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

        MyBusinessUnitChangeParentUnitActionImpl that = (MyBusinessUnitChangeParentUnitActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parentUnit, that.parentUnit)
                .append(action, that.action)
                .append(parentUnit, that.parentUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parentUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("parentUnit", parentUnit)
                .build();
    }

    @Override
    public MyBusinessUnitChangeParentUnitAction copyDeep() {
        return MyBusinessUnitChangeParentUnitAction.deepCopy(this);
    }
}
