
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
 *  <p>This action generates a BusinessUnitParentChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeParentUnitActionImpl implements BusinessUnitChangeParentUnitAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeParentUnitActionImpl(
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        this.action = CHANGE_PARENT_UNIT;
    }

    /**
     * create empty instance
     */
    public BusinessUnitChangeParentUnitActionImpl() {
        this.action = CHANGE_PARENT_UNIT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New parent unit of the Business Unit. It must be associated with the same Stores, as the old parent unit.</p>
     *  <p>The Business Unit <code>inheritedAssociates</code> and <code>inheritedStores</code> field values will be eventually consistent.</p>
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

        BusinessUnitChangeParentUnitActionImpl that = (BusinessUnitChangeParentUnitActionImpl) o;

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
    public BusinessUnitChangeParentUnitAction copyDeep() {
        return BusinessUnitChangeParentUnitAction.deepCopy(this);
    }
}
