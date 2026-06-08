
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPriceKeyAction" rel="nofollow">Set Price Key</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceKeySetMessagePayloadImpl implements ProductPriceKeySetMessagePayload, ModelBase {

    private String type;

    private Long variantId;

    private String priceId;

    private String oldKey;

    private String key;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceKeySetMessagePayloadImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("priceId") final String priceId, @JsonProperty("oldKey") final String oldKey,
            @JsonProperty("key") final String key, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.priceId = priceId;
        this.oldKey = oldKey;
        this.key = key;
        this.staged = staged;
        this.type = PRODUCT_PRICE_KEY_SET;
    }

    /**
     * create empty instance
     */
    public ProductPriceKeySetMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_KEY_SET;
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

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPriceKeyAction" rel="nofollow">Set Price Key</a> update action.</p>
     */

    public String getOldKey() {
        return this.oldKey;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetPriceKeyAction" rel="nofollow">Set Price Key</a> update action.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setOldKey(final String oldKey) {
        this.oldKey = oldKey;
    }

    public void setKey(final String key) {
        this.key = key;
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

        ProductPriceKeySetMessagePayloadImpl that = (ProductPriceKeySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(variantId, that.variantId)
                .append(priceId, that.priceId)
                .append(oldKey, that.oldKey)
                .append(key, that.key)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(variantId, that.variantId)
                .append(priceId, that.priceId)
                .append(oldKey, that.oldKey)
                .append(key, that.key)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(variantId)
                .append(priceId)
                .append(oldKey)
                .append(key)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("variantId", variantId)
                .append("priceId", priceId)
                .append("oldKey", oldKey)
                .append("key", key)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductPriceKeySetMessagePayload copyDeep() {
        return ProductPriceKeySetMessagePayload.deepCopy(this);
    }
}
