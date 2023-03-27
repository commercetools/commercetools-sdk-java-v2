
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
 *  <p>Generated after a successful Remove Associate update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateRemovedMessagePayloadImpl
        implements BusinessUnitAssociateRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.Associate associate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAssociateRemovedMessagePayloadImpl(
            @JsonProperty("associate") final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        this.type = BUSINESS_UNIT_ASSOCIATE_REMOVED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAssociateRemovedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ASSOCIATE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     */

    public com.commercetools.api.models.business_unit.Associate getAssociate() {
        return this.associate;
    }

    public void setAssociate(final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAssociateRemovedMessagePayloadImpl that = (BusinessUnitAssociateRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(associate, that.associate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associate).toHashCode();
    }

}
