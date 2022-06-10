
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
 *  <p>Generated after a successful Create StandalonePrice request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceCreatedMessagePayloadImpl implements StandalonePriceCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice;

    @JsonCreator
    StandalonePriceCreatedMessagePayloadImpl(
            @JsonProperty("standalonePrice") final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
        this.type = STANDALONE_PRICE_CREATED;
    }

    public StandalonePriceCreatedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Standalone Price as it was created.</p>
     */

    public com.commercetools.api.models.standalone_price.StandalonePrice getStandalonePrice() {
        return this.standalonePrice;
    }

    public void setStandalonePrice(
            final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceCreatedMessagePayloadImpl that = (StandalonePriceCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(standalonePrice, that.standalonePrice).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(standalonePrice).toHashCode();
    }

}
