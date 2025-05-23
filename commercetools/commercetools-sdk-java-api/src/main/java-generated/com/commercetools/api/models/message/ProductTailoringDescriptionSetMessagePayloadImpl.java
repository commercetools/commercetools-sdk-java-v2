
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
 *  <p>Generated after a successful Product Tailoring Set Description update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringDescriptionSetMessagePayloadImpl
        implements ProductTailoringDescriptionSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString oldDescription;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringDescriptionSetMessagePayloadImpl(
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("oldDescription") final com.commercetools.api.models.common.LocalizedString oldDescription) {
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.description = description;
        this.oldDescription = oldDescription;
        this.type = PRODUCT_TAILORING_DESCRIPTION_SET;
    }

    /**
     * create empty instance
     */
    public ProductTailoringDescriptionSetMessagePayloadImpl() {
        this.type = PRODUCT_TAILORING_DESCRIPTION_SET;
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
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getOldDescription() {
        return this.oldDescription;
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

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setOldDescription(final com.commercetools.api.models.common.LocalizedString oldDescription) {
        this.oldDescription = oldDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringDescriptionSetMessagePayloadImpl that = (ProductTailoringDescriptionSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(description, that.description)
                .append(oldDescription, that.oldDescription)
                .append(type, that.type)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(description, that.description)
                .append(oldDescription, that.oldDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(store)
                .append(productKey)
                .append(product)
                .append(description)
                .append(oldDescription)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("description", description)
                .append("oldDescription", oldDescription)
                .build();
    }

    @Override
    public ProductTailoringDescriptionSetMessagePayload copyDeep() {
        return ProductTailoringDescriptionSetMessagePayload.deepCopy(this);
    }
}
