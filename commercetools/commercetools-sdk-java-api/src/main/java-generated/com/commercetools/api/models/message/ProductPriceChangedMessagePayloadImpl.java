
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
 *  <p>Generated after a successful Change Price update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceChangedMessagePayloadImpl implements ProductPriceChangedMessagePayload, ModelBase {

    private String type;

    private Long variantId;

    private com.commercetools.api.models.common.Price oldPrice;

    private com.commercetools.api.models.common.Price newPrice;

    private Boolean staged;

    private com.commercetools.api.models.common.Price oldStagedPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceChangedMessagePayloadImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("oldPrice") final com.commercetools.api.models.common.Price oldPrice,
            @JsonProperty("newPrice") final com.commercetools.api.models.common.Price newPrice,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("oldStagedPrice") final com.commercetools.api.models.common.Price oldStagedPrice) {
        this.variantId = variantId;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.staged = staged;
        this.oldStagedPrice = oldStagedPrice;
        this.type = PRODUCT_PRICE_CHANGED;
    }

    /**
     * create empty instance
     */
    public ProductPriceChangedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     */

    public com.commercetools.api.models.common.Price getOldPrice() {
        return this.oldPrice;
    }

    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     */

    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     */

    public com.commercetools.api.models.common.Price getOldStagedPrice() {
        return this.oldStagedPrice;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setOldPrice(final com.commercetools.api.models.common.Price oldPrice) {
        this.oldPrice = oldPrice;
    }

    public void setNewPrice(final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setOldStagedPrice(final com.commercetools.api.models.common.Price oldStagedPrice) {
        this.oldStagedPrice = oldStagedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceChangedMessagePayloadImpl that = (ProductPriceChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variantId, that.variantId)
                .append(oldPrice, that.oldPrice)
                .append(newPrice, that.newPrice)
                .append(staged, that.staged)
                .append(oldStagedPrice, that.oldStagedPrice)
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(oldPrice, that.oldPrice)
                .append(newPrice, that.newPrice)
                .append(staged, that.staged)
                .append(oldStagedPrice, that.oldStagedPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(variantId)
                .append(oldPrice)
                .append(newPrice)
                .append(staged)
                .append(oldStagedPrice)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("variantId", variantId)
                .append("oldPrice", oldPrice)
                .append("newPrice", newPrice)
                .append("staged", staged)
                .append("oldStagedPrice", oldStagedPrice)
                .build();
    }

    @Override
    public ProductPriceChangedMessagePayload copyDeep() {
        return ProductPriceChangedMessagePayload.deepCopy(this);
    }
}
