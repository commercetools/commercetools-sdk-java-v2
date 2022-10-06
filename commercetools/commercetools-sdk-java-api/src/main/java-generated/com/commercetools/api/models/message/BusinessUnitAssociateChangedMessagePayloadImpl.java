
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
 *  <p>Generated after a successful Change Associate update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateChangedMessagePayloadImpl
        implements BusinessUnitAssociateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.business_unit.Associate associate;

    @JsonCreator
    BusinessUnitAssociateChangedMessagePayloadImpl(
            @JsonProperty("associate") final com.commercetools.api.models.business_unit.Associate associate) {
        this.associate = associate;
        this.type = BUSINESS_UNIT_ASSOCIATE_CHANGED;
    }

    public BusinessUnitAssociateChangedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ASSOCIATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Associate that was updated.</p>
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

        BusinessUnitAssociateChangedMessagePayloadImpl that = (BusinessUnitAssociateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(associate, that.associate).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(associate).toHashCode();
    }

}
