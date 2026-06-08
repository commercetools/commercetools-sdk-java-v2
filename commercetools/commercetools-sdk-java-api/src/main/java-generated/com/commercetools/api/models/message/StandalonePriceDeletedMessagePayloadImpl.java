
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
 *  <p>Generated after a successful <span>Delete StandalonePrice</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceDeletedMessagePayloadImpl implements StandalonePriceDeletedMessagePayload, ModelBase {

    private String type;

    private String sku;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceDeletedMessagePayloadImpl(@JsonProperty("sku") final String sku) {
        this.sku = sku;
        this.type = STANDALONE_PRICE_DELETED;
    }

    /**
     * create empty instance
     */
    public StandalonePriceDeletedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the deleted Standalone Price was associated.</p>
     */

    public String getSku() {
        return this.sku;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceDeletedMessagePayloadImpl that = (StandalonePriceDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(sku, that.sku)
                .append(type, that.type)
                .append(sku, that.sku)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(sku).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("sku", sku)
                .build();
    }

    @Override
    public StandalonePriceDeletedMessagePayload copyDeep() {
        return StandalonePriceDeletedMessagePayload.deepCopy(this);
    }
}
