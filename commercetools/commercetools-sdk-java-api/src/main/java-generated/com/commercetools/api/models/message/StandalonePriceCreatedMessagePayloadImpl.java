
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices:POST" rel="nofollow">Create StandalonePrice</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceCreatedMessagePayloadImpl implements StandalonePriceCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceCreatedMessagePayloadImpl(
            @JsonProperty("standalonePrice") final com.commercetools.api.models.standalone_price.StandalonePrice standalonePrice) {
        this.standalonePrice = standalonePrice;
        this.type = STANDALONE_PRICE_CREATED;
    }

    /**
     * create empty instance
     */
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Price</a> that was created.</p>
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

        return new EqualsBuilder().append(type, that.type)
                .append(standalonePrice, that.standalonePrice)
                .append(type, that.type)
                .append(standalonePrice, that.standalonePrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(standalonePrice).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("standalonePrice", standalonePrice)
                .build();
    }

    @Override
    public StandalonePriceCreatedMessagePayload copyDeep() {
        return StandalonePriceCreatedMessagePayload.deepCopy(this);
    }
}
