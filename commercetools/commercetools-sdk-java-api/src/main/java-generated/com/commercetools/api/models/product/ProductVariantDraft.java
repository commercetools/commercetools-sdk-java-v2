
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Creates a Product Variant when included in the <code>masterVariant</code> and <code>variants</code> fields of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductDraft" rel="nofollow">ProductDraft</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDraft productVariantDraft = ProductVariantDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDraftImpl.class)
public interface ProductVariantDraft
        extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductVariantDraft> {

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Images for the Product Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>User-defined unique identifier for the ProductVariant.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraft> prices);

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images for the Product Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<AssetDraft> assets);

    /**
     * factory method
     * @return instance of ProductVariantDraft
     */
    public static ProductVariantDraft of() {
        return new ProductVariantDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantDraft of(final ProductVariantDraft template) {
        ProductVariantDraftImpl instance = new ProductVariantDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public ProductVariantDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantDraft deepCopy(@Nullable final ProductVariantDraft template) {
        if (template == null) {
            return null;
        }
        ProductVariantDraftImpl instance = new ProductVariantDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.PriceDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantDraft
     * @return builder
     */
    public static ProductVariantDraftBuilder builder() {
        return ProductVariantDraftBuilder.of();
    }

    /**
     * create builder for ProductVariantDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDraftBuilder builder(final ProductVariantDraft template) {
        return ProductVariantDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantDraft(Function<ProductVariantDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDraft>";
            }
        };
    }
}
