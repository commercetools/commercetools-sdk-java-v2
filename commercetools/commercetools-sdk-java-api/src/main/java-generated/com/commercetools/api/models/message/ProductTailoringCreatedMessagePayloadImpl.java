
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
 *  <p>Generated after a successful Create Product Tailoring or Create Product Tailoring in Store request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringCreatedMessagePayloadImpl implements ProductTailoringCreatedMessagePayload, ModelBase {

    private String type;

    private String key;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private String productKey;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    private Boolean published;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringCreatedMessagePayloadImpl(@JsonProperty("key") final String key,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("productKey") final String productKey,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes,
            @JsonProperty("published") final Boolean published) {
        this.key = key;
        this.store = store;
        this.productKey = productKey;
        this.product = product;
        this.description = description;
        this.name = name;
        this.slug = slug;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.variants = variants;
        this.attributes = attributes;
        this.published = published;
        this.type = PRODUCT_TAILORING_CREATED;
    }

    /**
     * create empty instance
     */
    public ProductTailoringCreatedMessagePayloadImpl() {
        this.type = PRODUCT_TAILORING_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     */

    public String getKey() {
        return this.key;
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
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The metaTitle of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>The metaDescription of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>The metaKeywords of the Product Tailoring at the time of creation.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>The variants of the Product Tailoring at the time of creation.</p>
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Attributes of the tailored Product. If available, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     */

    public Boolean getPublished() {
        return this.published;
    }

    public void setKey(final String key) {
        this.key = key;
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

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setVariants(final com.commercetools.api.models.product_tailoring.ProductVariantTailoring... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoring> variants) {
        this.variants = variants;
    }

    public void setAttributes(
            final com.commercetools.api.models.product_tailoring.ProductTailoringAttribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
        this.attributes = attributes;
    }

    public void setPublished(final Boolean published) {
        this.published = published;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringCreatedMessagePayloadImpl that = (ProductTailoringCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(description, that.description)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(variants, that.variants)
                .append(attributes, that.attributes)
                .append(published, that.published)
                .append(type, that.type)
                .append(key, that.key)
                .append(store, that.store)
                .append(productKey, that.productKey)
                .append(product, that.product)
                .append(description, that.description)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(variants, that.variants)
                .append(attributes, that.attributes)
                .append(published, that.published)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(key)
                .append(store)
                .append(productKey)
                .append(product)
                .append(description)
                .append(name)
                .append(slug)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(variants)
                .append(attributes)
                .append(published)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("store", store)
                .append("productKey", productKey)
                .append("product", product)
                .append("description", description)
                .append("name", name)
                .append("slug", slug)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("variants", variants)
                .append("attributes", attributes)
                .append("published", published)
                .build();
    }

    @Override
    public ProductTailoringCreatedMessagePayload copyDeep() {
        return ProductTailoringCreatedMessagePayload.deepCopy(this);
    }
}
