
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
 *  <p>Generated after a successful Add Price update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceAddedMessagePayloadImpl implements ProductPriceAddedMessagePayload, ModelBase {

    private String type;

    private Long variantId;

    private com.commercetools.api.models.common.Price price;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceAddedMessagePayloadImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("price") final com.commercetools.api.models.common.Price price,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.price = price;
        this.staged = staged;
        this.type = PRODUCT_PRICE_ADDED;
    }

    /**
     * create empty instance
     */
    public ProductPriceAddedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was added.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The Embedded Price that was added to the ProductVariant.</p>
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

        ProductPriceAddedMessagePayloadImpl that = (ProductPriceAddedMessagePayloadImpl) o;

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

}
