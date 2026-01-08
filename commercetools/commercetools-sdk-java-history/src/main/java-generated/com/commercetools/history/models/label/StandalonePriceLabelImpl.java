
package com.commercetools.history.models.label;

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
 * StandalonePriceLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceLabelImpl implements StandalonePriceLabel, ModelBase {

    private String type;

    private String key;

    private String sku;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceLabelImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku) {
        this.key = key;
        this.sku = sku;
        this.type = STANDALONE_PRICE_LABEL;
    }

    /**
     * create empty instance
     */
    public StandalonePriceLabelImpl() {
        this.type = STANDALONE_PRICE_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Standalone Price.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique Product SKU variant identifier to which the Standalone Price is associated.</p>
     */

    public String getSku() {
        return this.sku;
    }

    public void setKey(final String key) {
        this.key = key;
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

        StandalonePriceLabelImpl that = (StandalonePriceLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(type, that.type)
                .append(key, that.key)
                .append(sku, that.sku)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(sku).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("sku", sku)
                .build();
    }

    @Override
    public StandalonePriceLabel copyDeep() {
        return StandalonePriceLabel.deepCopy(this);
    }
}
