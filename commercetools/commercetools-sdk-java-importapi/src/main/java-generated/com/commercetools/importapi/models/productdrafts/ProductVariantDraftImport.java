
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The representation of a Product Variant Draft for the import purpose.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDraftImport productVariantDraftImport = ProductVariantDraftImport.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDraftImportImpl.class)
public interface ProductVariantDraftImport {

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
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraftImport> getPrices();

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
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
    public List<Asset> getAssets();

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
    public void setPrices(final PriceDraftImport... prices);

    /**
     *  <p>The Embedded Prices for the Product Variant. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraftImport> prices);

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes according to the respective AttributeDefinition.</p>
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
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media assets for the Product Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     * factory method
     * @return instance of ProductVariantDraftImport
     */
    public static ProductVariantDraftImport of() {
        return new ProductVariantDraftImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantDraftImport of(final ProductVariantDraftImport template) {
        ProductVariantDraftImportImpl instance = new ProductVariantDraftImportImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public ProductVariantDraftImport copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantDraftImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantDraftImport deepCopy(@Nullable final ProductVariantDraftImport template) {
        if (template == null) {
            return null;
        }
        ProductVariantDraftImportImpl instance = new ProductVariantDraftImportImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productdrafts.PriceDraftImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantDraftImport
     * @return builder
     */
    public static ProductVariantDraftImportBuilder builder() {
        return ProductVariantDraftImportBuilder.of();
    }

    /**
     * create builder for ProductVariantDraftImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDraftImportBuilder builder(final ProductVariantDraftImport template) {
        return ProductVariantDraftImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantDraftImport(Function<ProductVariantDraftImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraftImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDraftImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDraftImport>";
            }
        };
    }
}
