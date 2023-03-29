
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a ProductVariant to be imported that is persisted as a ProductVariant in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImport productVariantImport = ProductVariantImport.builder()
 *             .key("{key}")
 *             .isMasterVariant(true)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportImpl.class)
public interface ProductVariantImport extends ImportResource {

    /**
     *  <p>Maps to <code>ProductVariant.sku</code>.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>
     * @return isMasterVariant
     */
    @NotNull
    @JsonProperty("isMasterVariant")
    public Boolean getIsMasterVariant();

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>The Product to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the ProductVariant is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>Maps to <code>ProductVariant.sku</code>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>ProductVariant.isMasterVariant</code>.</p>
     * @param isMasterVariant value to be set
     */

    public void setIsMasterVariant(final Boolean isMasterVariant);

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>. The referenced attribute must be defined in an already existing ProductType in the project, or the <code>state</code> of the ImportOperation will be <code>unresolved</code>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Maps to <code>ProductVariant.images</code>.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Maps to <code>ProductVariant.assets</code>.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>If <code>publish</code> is set to either <code>true</code> or <code>false</code>, both staged and current projections are set to the same value provided by the import data. If <code>publish</code> is not set, the staged projection is set to the provided import data, but the current projection stays unchanged. However, if the import data contains no update, that is, if it matches the staged projection of the existing Product, the import induces no change in the existing Product whether <code>publish</code> is set or not.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>The Product to which this Product Variant belongs. Maps to <code>ProductVariant.product</code>. The Reference to the Product with which the ProductVariant is associated. If referenced Product does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Product is created.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     * factory method
     * @return instance of ProductVariantImport
     */
    public static ProductVariantImport of() {
        return new ProductVariantImportImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantImport of(final ProductVariantImport template) {
        ProductVariantImportImpl instance = new ProductVariantImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setIsMasterVariant(template.getIsMasterVariant());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setPublish(template.getPublish());
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantImport deepCopy(@Nullable final ProductVariantImport template) {
        if (template == null) {
            return null;
        }
        ProductVariantImportImpl instance = new ProductVariantImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setIsMasterVariant(template.getIsMasterVariant());
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
        instance.setPublish(template.getPublish());
        instance.setProduct(Optional.ofNullable(template.getProduct())
                .map(com.commercetools.importapi.models.common.ProductKeyReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantImport
     * @return builder
     */
    public static ProductVariantImportBuilder builder() {
        return ProductVariantImportBuilder.of();
    }

    /**
     * create builder for ProductVariantImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportBuilder builder(final ProductVariantImport template) {
        return ProductVariantImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantImport(Function<ProductVariantImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImport>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImport>";
            }
        };
    }
}
