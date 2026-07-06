
package com.commercetools.importapi.models.product_tailoring;

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
 *  <p>Represents the data used to import a Product Tailoring. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringImportImpl implements ProductTailoringImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.StoreKeyReference store;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    private Boolean publish;

    private java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> variants;

    private java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("store") final com.commercetools.importapi.models.common.StoreKeyReference store,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords,
            @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("variants") final java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> variants,
            @JsonProperty("attributes") final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.key = key;
        this.store = store;
        this.product = product;
        this.name = name;
        this.description = description;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.slug = slug;
        this.publish = publish;
        this.variants = variants;
        this.attributes = attributes;
    }

    /**
     * create empty instance
     */
    public ProductTailoringImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Store is created.</p>
     */

    public com.commercetools.importapi.models.common.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>The Product to which the ProductTailoring belongs. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaTitle</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaDescription</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.metaKeywords</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Maps to <code>ProductTailoring.slug</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Set to <code>true</code> to publish the ProductTailoring immediately. Otherwise, the tailored product information is just staged.</p>
     */

    public Boolean getPublish() {
        return this.publish;
    }

    /**
     *  <p>Tailored Variants of the Product.</p>
     */

    public java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Attributes of the tailored Product.</p>
     */

    public java.util.List<com.commercetools.importapi.models.productvariants.Attribute> getAttributes() {
        return this.attributes;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStore(final com.commercetools.importapi.models.common.StoreKeyReference store) {
        this.store = store;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setSlug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setVariants(
            final com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(
            final java.util.List<com.commercetools.importapi.models.product_tailoring.ProductVariantTailoringImport> variants) {
        this.variants = variants;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attribute... attributes) {
        this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }

    public void setAttributes(
            final java.util.List<com.commercetools.importapi.models.productvariants.Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringImportImpl that = (ProductTailoringImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(store, that.store)
                .append(product, that.product)
                .append(name, that.name)
                .append(description, that.description)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(slug, that.slug)
                .append(publish, that.publish)
                .append(variants, that.variants)
                .append(attributes, that.attributes)
                .append(key, that.key)
                .append(store, that.store)
                .append(product, that.product)
                .append(name, that.name)
                .append(description, that.description)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(slug, that.slug)
                .append(publish, that.publish)
                .append(variants, that.variants)
                .append(attributes, that.attributes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(store)
                .append(product)
                .append(name)
                .append(description)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(slug)
                .append(publish)
                .append(variants)
                .append(attributes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("store", store)
                .append("product", product)
                .append("name", name)
                .append("description", description)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("slug", slug)
                .append("publish", publish)
                .append("variants", variants)
                .append("attributes", attributes)
                .build();
    }

    @Override
    public ProductTailoringImport copyDeep() {
        return ProductTailoringImport.deepCopy(this);
    }
}
