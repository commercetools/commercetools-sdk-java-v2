
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
 *  <p>Generated after a successful Remove Price update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceRemovedMessagePayloadImpl implements ProductPriceRemovedMessagePayload, ModelBase {

    private String type;

    private Long variantId;

    private com.commercetools.api.models.common.Price price;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceRemovedMessagePayloadImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.price = price;
        this.staged = staged;
        this.type = PRODUCT_PRICE_REMOVED;
    }

    /**
     * create empty instance
     */
    public ProductPriceRemovedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was removed.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The Embedded Price that was removed from the ProductVariant.</p>
     */

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setPrice(final com.commercetools.api.models.common.Price price) {
        this.price = price;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceRemovedMessagePayloadImpl that = (ProductPriceRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variantId, that.variantId)
                .append(price, that.price)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(variantId).append(price).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("variantId", variantId)
                .append("price", price)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductPriceRemovedMessagePayload copyDeep() {
        return ProductPriceRemovedMessagePayload.deepCopy(this);
    }
}
