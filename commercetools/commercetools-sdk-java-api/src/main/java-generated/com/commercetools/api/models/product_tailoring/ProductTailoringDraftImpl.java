
package com.commercetools.api.models.product_tailoring;

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
 *  <p>Contains the information to be tailored for a Product.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringDraftImpl implements ProductTailoringDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.common.LocalizedString slug;

    private Boolean publish;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> variants;

    private java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("publish") final Boolean publish,
            @JsonProperty("variants") final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> variants,
            @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> attributes) {
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
    public ProductTailoringDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the ProductTailoring.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Store to which the ProductTailoring belongs.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>ResourceIdentifier of the Product the ProductTailoring belongs to.</p>
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Tailored name of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Tailored description of the Product.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Tailored title of the Product that is used by search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Tailored description of the Product that is used by search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Tailored keywords related to the Product that are used by search engines.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>User-defined identifier used in a deep-link URL for the ProductTailoring. Matches the pattern <code>[a-zA-Z0-9_\\-]{2,256}</code>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
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

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> getVariants() {
        return this.variants;
    }

    /**
     *  <p>Attributes of the tailored Product. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding Product. If the Product contains an Attribute with the same <code>name</code>, then its <code>value</code> is overwritten. Otherwise, the Attribute and its <code>value</code> are added to the Product.</p>
     */

    public java.util.List<com.commercetools.api.models.product_tailoring.ProductTailoringAttribute> getAttributes() {
        return this.attributes;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setPublish(final Boolean publish) {
        this.publish = publish;
    }

    public void setVariants(
            final com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft... variants) {
        this.variants = new ArrayList<>(Arrays.asList(variants));
    }

    public void setVariants(
            final java.util.List<com.commercetools.api.models.product_tailoring.ProductVariantTailoringDraft> variants) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTailoringDraftImpl that = (ProductTailoringDraftImpl) o;

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
    public ProductTailoringDraft copyDeep() {
        return ProductTailoringDraft.deepCopy(this);
    }
}
