
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetDiscountedPriceAction" rel="nofollow">Set Discounted Embedded Price</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDiscountedPriceChangeImpl implements SetDiscountedPriceChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.DiscountedPrice previousValue;

    private com.commercetools.history.models.common.DiscountedPrice nextValue;

    private String catalogData;

    private String variant;

    private String priceId;

    private com.commercetools.history.models.common.Price price;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDiscountedPriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.DiscountedPrice previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.DiscountedPrice nextValue,
            @JsonProperty("catalogData") final String catalogData, @JsonProperty("variant") final String variant,
            @JsonProperty("priceId") final String priceId,
            @JsonProperty("price") final com.commercetools.history.models.common.Price price) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.catalogData = catalogData;
        this.variant = variant;
        this.priceId = priceId;
        this.price = price;
        this.type = SET_DISCOUNTED_PRICE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetDiscountedPriceChangeImpl() {
        this.type = SET_DISCOUNTED_PRICE_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.DiscountedPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.DiscountedPrice getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Embedded Price of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     */

    public com.commercetools.history.models.common.Price getPrice() {
        return this.price;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.DiscountedPrice previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.DiscountedPrice nextValue) {
        this.nextValue = nextValue;
    }

    public void setCatalogData(final String catalogData) {
        this.catalogData = catalogData;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setPrice(final com.commercetools.history.models.common.Price price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDiscountedPriceChangeImpl that = (SetDiscountedPriceChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(priceId, that.priceId)
                .append(price, that.price)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(catalogData, that.catalogData)
                .append(variant, that.variant)
                .append(priceId, that.priceId)
                .append(price, that.price)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(catalogData)
                .append(variant)
                .append(priceId)
                .append(price)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("catalogData", catalogData)
                .append("variant", variant)
                .append("priceId", priceId)
                .append("price", price)
                .build();
    }

    @Override
    public SetDiscountedPriceChange copyDeep() {
        return SetDiscountedPriceChange.deepCopy(this);
    }
}
