
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

/**
 *  <p>Generated after a successful Change Parent Unit update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitParentUnitChangedMessagePayloadImpl
        implements BusinessUnitParentUnitChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitParentUnitChangedMessagePayloadImpl(
            @JsonProperty("oldParentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit,
            @JsonProperty("newParentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.oldParentUnit = oldParentUnit;
        this.newParentUnit = newParentUnit;
        this.type = BUSINESS_UNIT_PARENT_UNIT_CHANGED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitParentUnitChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_PARENT_UNIT_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getNewParentUnit() {
        return this.newParentUnit;
    }

    public void setOldParentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
    }

    public void setNewParentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference newParentUnit) {
        this.newParentUnit = newParentUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitParentUnitChangedMessagePayloadImpl that = (BusinessUnitParentUnitChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldParentUnit, that.oldParentUnit)
                .append(newParentUnit, that.newParentUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(oldParentUnit).append(newParentUnit).toHashCode();
    }

}
