
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
 *  <p>Generated after a successful Product Tailoring Set Name update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringNameSetMessagePayloadImpl implements ProductTailoringNameSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString oldName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringNameSetMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("oldName") final com.commercetools.api.models.common.LocalizedString oldName) {
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.name = name;
        this.oldName = oldName;
        this.type = PRODUCT_TAILORING_NAME_SET;
    }

    /**
     * create empty instance
     */
    public ProductTailoringNameSetMessagePayloadImpl() {
        this.type = PRODUCT_TAILORING_NAME_SET;
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
     *  <p>The name of the Product Tailoring after the Set Name update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>The name of the ProductTailoring before the Set Name update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getOldName() {
        return this.oldName;
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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setOldName(final com.commercetools.api.models.common.LocalizedString oldName) {
        this.oldName = oldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringNameSetMessagePayloadImpl that = (ProductTailoringNameSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(name, that.name)
                .append(oldName, that.oldName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(store)
                .append(productKey)
                .append(product)
                .append(name)
                .append(oldName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("name", name)
                .append("oldName", oldName)
                .build();
    }

}
