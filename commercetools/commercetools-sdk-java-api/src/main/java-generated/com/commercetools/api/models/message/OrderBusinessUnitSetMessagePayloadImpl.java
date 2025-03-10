
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
 *  <p>Generated after a successful Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderBusinessUnitSetMessagePayloadImpl implements OrderBusinessUnitSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldbusinessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderBusinessUnitSetMessagePayloadImpl(
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit,
            @JsonProperty("oldbusinessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldbusinessUnit) {
        this.businessUnit = businessUnit;
        this.oldbusinessUnit = oldbusinessUnit;
        this.type = ORDER_BUSINESS_UNIT_SET;
    }

    /**
     * create empty instance
     */
    public OrderBusinessUnitSetMessagePayloadImpl() {
        this.type = ORDER_BUSINESS_UNIT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>BusinessUnit on the Order after the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>BusinessUnit on the Order before the Set Business Unit update action on Orders or Set Business Unit update action on Order Edits.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldbusinessUnit() {
        return this.oldbusinessUnit;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setOldbusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldbusinessUnit) {
        this.oldbusinessUnit = oldbusinessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderBusinessUnitSetMessagePayloadImpl that = (OrderBusinessUnitSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(businessUnit, that.businessUnit)
                .append(oldbusinessUnit, that.oldbusinessUnit)
                .append(type, that.type)
                .append(businessUnit, that.businessUnit)
                .append(oldbusinessUnit, that.oldbusinessUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(businessUnit).append(oldbusinessUnit).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("businessUnit", businessUnit)
                .append("oldbusinessUnit", oldbusinessUnit)
                .build();
    }

}
