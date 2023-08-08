
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
 *  <p>Generated after a successful Set Associates update action.</p>
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
     *  <p>The list of Associates that was updated on the Business Unit.</p>
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

}
