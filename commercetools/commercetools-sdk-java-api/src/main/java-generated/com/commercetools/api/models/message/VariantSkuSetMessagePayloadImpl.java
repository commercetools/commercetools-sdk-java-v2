
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantSetSkuAction" rel="nofollow">Set SKU</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSkuSetMessagePayloadImpl implements VariantSkuSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    private String sku;

    private String oldSku;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSkuSetMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("sku") final String sku, @JsonProperty("oldSku") final String oldSku,
            @JsonProperty("staged") final Boolean staged) {
        this.product = product;
        this.sku = sku;
        this.oldSku = oldSku;
        this.staged = staged;
        this.type = VARIANT_SKU_SET;
    }

    /**
     * create empty instance
     */
    public VariantSkuSetMessagePayloadImpl() {
        this.type = VARIANT_SKU_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The SKU that was set on the Variant.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The previous SKU of the Variant.</p>
     */

    public String getOldSku() {
        return this.oldSku;
    }

    /**
     *  <p>Whether the update was only applied to the staged Variant.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setOldSku(final String oldSku) {
        this.oldSku = oldSku;
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

        VariantSkuSetMessagePayloadImpl that = (VariantSkuSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(sku, that.sku)
                .append(oldSku, that.oldSku)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(product, that.product)
                .append(sku, that.sku)
                .append(oldSku, that.oldSku)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(product)
                .append(sku)
                .append(oldSku)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .append("sku", sku)
                .append("oldSku", oldSku)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSkuSetMessagePayload copyDeep() {
        return VariantSkuSetMessagePayload.deepCopy(this);
    }
}
