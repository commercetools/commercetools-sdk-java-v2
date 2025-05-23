
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
 *  <p>Generated after a successful Add ProductVariant update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantAddedMessagePayloadImpl implements ProductVariantAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductVariant variant;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantAddedMessagePayloadImpl(
            @JsonProperty("variant") final com.commercetools.api.models.product.ProductVariant variant,
            @JsonProperty("staged") final Boolean staged) {
        this.variant = variant;
        this.staged = staged;
        this.type = PRODUCT_VARIANT_ADDED;
    }

    /**
     * create empty instance
     */
    public ProductVariantAddedMessagePayloadImpl() {
        this.type = PRODUCT_VARIANT_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     */

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
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

        ProductVariantAddedMessagePayloadImpl that = (ProductVariantAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variant, that.variant)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(variant, that.variant)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(variant).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("variant", variant)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductVariantAddedMessagePayload copyDeep() {
        return ProductVariantAddedMessagePayload.deepCopy(this);
    }
}
