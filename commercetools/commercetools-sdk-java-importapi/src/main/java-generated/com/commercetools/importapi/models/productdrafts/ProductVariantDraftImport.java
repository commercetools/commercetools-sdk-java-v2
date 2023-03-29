
package com.commercetools.importapi.models.productdrafts;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraftImport> getPrices();

    /**
     *
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     * set sku
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set prices
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraftImport... prices);

    /**
     * set prices
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraftImport> prices);

    /**
     * set attributes
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     * set attributes
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * set images
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     * set images
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     * set assets
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     * set assets
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
