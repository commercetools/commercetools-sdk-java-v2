
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Delete StandalonePrice request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDeletedMessagePayloadImpl implements StandalonePriceDeletedMessagePayload, ModelBase {

    private String type;

    @JsonCreator
    StandalonePriceDeletedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceDeletedMessagePayloadImpl that = (StandalonePriceDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
