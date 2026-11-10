
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
 *  <p>Generated after a successful Product Tailoring <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringKeySetMessagePayloadImpl implements ProductTailoringKeySetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private String key;

    private String oldKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringKeySetMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("key") final String key, @JsonProperty("oldKey") final String oldKey) {
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.key = key;
        this.oldKey = oldKey;
        this.type = PRODUCT_TAILORING_KEY_SET;
    }

    /**
     * create empty instance
     */
    public ProductTailoringKeySetMessagePayloadImpl() {
        this.type = PRODUCT_TAILORING_KEY_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     */

    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     */

    public String getOldKey() {
        return this.oldKey;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setProductKey(final String productKey) {
        this.productKey = productKey;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setOldKey(final String oldKey) {
        this.oldKey = oldKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringKeySetMessagePayloadImpl that = (ProductTailoringKeySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(key, that.key)
                .append(oldKey, that.oldKey)
                .append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(key, that.key)
                .append(oldKey, that.oldKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(store)
                .append(productKey)
                .append(product)
                .append(key)
                .append(oldKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("key", key)
                .append("oldKey", oldKey)
                .build();
    }

    @Override
    public ProductTailoringKeySetMessagePayload copyDeep() {
        return ProductTailoringKeySetMessagePayload.deepCopy(this);
    }
}
