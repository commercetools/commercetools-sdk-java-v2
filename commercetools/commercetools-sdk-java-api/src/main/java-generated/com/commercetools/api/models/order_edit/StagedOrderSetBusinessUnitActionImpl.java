
package com.commercetools.api.models.order_edit;

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
 *  <p>Updates the Business Unit on the Order. Setting the Order's <code>businessUnit</code> does not recalculate prices or discounts on the Order.</p>
 *  <p>Produces the OrderBusinessUnitSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetBusinessUnitActionImpl implements StagedOrderSetBusinessUnitAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetBusinessUnitActionImpl(
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        this.action = SET_BUSINESS_UNIT;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetBusinessUnitActionImpl() {
        this.action = SET_BUSINESS_UNIT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New Business Unit to assign to the Order. If empty, any existing value is removed.</p>
     *  <p>If the referenced Business Unit does not exist, a ReferencedResourceNotFound error is returned.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetBusinessUnitActionImpl that = (StagedOrderSetBusinessUnitActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(businessUnit, that.businessUnit)
                .append(action, that.action)
                .append(businessUnit, that.businessUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(businessUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("businessUnit", businessUnit)
                .build();
    }

}
