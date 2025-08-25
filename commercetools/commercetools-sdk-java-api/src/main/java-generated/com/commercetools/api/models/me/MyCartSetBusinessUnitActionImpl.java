
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
 *  <p>Updates the Business Unit on the Cart. The Cart must have an existing Business Unit assigned already.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetBusinessUnitActionImpl implements MyCartSetBusinessUnitAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartSetBusinessUnitActionImpl(
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        this.action = SET_BUSINESS_UNIT;
    }

    /**
     * create empty instance
     */
    public MyCartSetBusinessUnitActionImpl() {
        this.action = SET_BUSINESS_UNIT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the <span>Store</span> that is set on the Cart. Additionally, the authenticated user must be an <span>Associate</span> in the <span>Business Unit</span>.</p>
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

        MyCartSetBusinessUnitActionImpl that = (MyCartSetBusinessUnitActionImpl) o;

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

    @Override
    public MyCartSetBusinessUnitAction copyDeep() {
        return MyCartSetBusinessUnitAction.deepCopy(this);
    }
}
