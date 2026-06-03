
package com.commercetools.importapi.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents the data of a Product Variant to be tailored for a Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringImport productVariantTailoringImport = ProductVariantTailoringImport.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringImportImpl.class)
public interface ProductVariantTailoringImport {

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.images</code>.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.assets</code>.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Maps to <code>ProductVariantTailoring.attributes</code>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of ProductVariantTailoringImport
     */
    public static ProductVariantTailoringImport of() {
        return new ProductVariantTailoringImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringImport of(final ProductVariantTailoringImport template) {
        ProductVariantTailoringImportImpl instance = new ProductVariantTailoringImportImpl();
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public ProductVariantTailoringImport copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantTailoringImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringImport deepCopy(@Nullable final ProductVariantTailoringImport template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringImportImpl instance = new ProductVariantTailoringImportImpl();
        instance.setSku(template.getSku());
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
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantTailoringImport
     * @return builder
     */
    public static ProductVariantTailoringImportBuilder builder() {
        return ProductVariantTailoringImportBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringImportBuilder builder(final ProductVariantTailoringImport template) {
        return ProductVariantTailoringImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringImport(Function<ProductVariantTailoringImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductVariantTailoringImport> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductVariantTailoringImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringImport>";
            }
        };
    }
}
