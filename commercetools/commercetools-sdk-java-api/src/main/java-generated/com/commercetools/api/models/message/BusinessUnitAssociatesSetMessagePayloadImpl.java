
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAssociatesAction" rel="nofollow">Set Associates</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociatesSetMessagePayloadImpl implements BusinessUnitAssociatesSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociatesSetMessagePayloadImpl(
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        this.type = BUSINESS_UNIT_ASSOCIATES_SET;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAssociatesSetMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ASSOCIATES_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The list of <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associates</a> that was updated on the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    public void setAssociates(final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAssociatesSetMessagePayloadImpl that = (BusinessUnitAssociatesSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(associates, that.associates)
                .append(type, that.type)
                .append(associates, that.associates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associates).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("associates", associates)
                .build();
    }

    @Override
    public BusinessUnitAssociatesSetMessagePayload copyDeep() {
        return BusinessUnitAssociatesSetMessagePayload.deepCopy(this);
    }
}
