
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeAssociateModeAction" rel="nofollow">Change Associate Mode</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateModeChangedMessagePayloadImpl
        implements BusinessUnitAssociateModeChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode oldAssociateMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociateModeChangedMessagePayloadImpl(
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode,
            @JsonProperty("oldAssociateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode oldAssociateMode) {
        this.associateMode = associateMode;
        this.oldAssociateMode = oldAssociateMode;
        this.type = BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAssociateModeChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAssociateMode" rel="nofollow">BusinessUnitAssociateMode</a> of the Business Unit after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeAssociateModeAction" rel="nofollow">Change Associate Mode</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAssociateMode" rel="nofollow">BusinessUnitAssociateMode</a> of the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitChangeAssociateModeAction" rel="nofollow">Change Associate Mode</a> update action.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getOldAssociateMode() {
        return this.oldAssociateMode;
    }

    public void setAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
    }

    public void setOldAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode oldAssociateMode) {
        this.oldAssociateMode = oldAssociateMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAssociateModeChangedMessagePayloadImpl that = (BusinessUnitAssociateModeChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(associateMode, that.associateMode)
                .append(oldAssociateMode, that.oldAssociateMode)
                .append(type, that.type)
                .append(associateMode, that.associateMode)
                .append(oldAssociateMode, that.oldAssociateMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associateMode).append(oldAssociateMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("associateMode", associateMode)
                .append("oldAssociateMode", oldAssociateMode)
                .build();
    }

    @Override
    public BusinessUnitAssociateModeChangedMessagePayload copyDeep() {
        return BusinessUnitAssociateModeChangedMessagePayload.deepCopy(this);
    }
}
