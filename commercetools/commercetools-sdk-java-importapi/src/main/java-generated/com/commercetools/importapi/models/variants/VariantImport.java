
package com.commercetools.importapi.models.variants;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Asset;
import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Represents the data used to import a Variant. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a> in the Project.</p>
 *  <p>This import resource is only available for Projects with <code>productCatalogModel</code> set to <code>Modular</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantImport variantImport = VariantImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantImportImpl.class)
public interface VariantImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier. If a Variant with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>VariantData.sku</code>.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant is immediately available in the current published state. Maps to <code>VariantDraft.publish</code>.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>User-defined unique identifier. If a Variant with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>VariantData.sku</code>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>Variant.product</code>.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant is immediately available in the current published state. Maps to <code>VariantDraft.publish</code>.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Maps to <code>VariantData.images</code>.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Maps to <code>VariantData.attributes</code>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Maps to <code>VariantData.assets</code>.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     * factory method
     * @return instance of VariantImport
     */
    public static VariantImport of() {
        return new VariantImportImpl();
    }

    /**
     * factory method to create a shallow copy VariantImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantImport of(final VariantImport template) {
        VariantImportImpl instance = new VariantImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProduct(template.getProduct());
        instance.setPublish(template.getPublish());
        instance.setImages(template.getImages());
        instance.setAttributes(template.getAttributes());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public VariantImport copyDeep();

    /**
     * factory method to create a deep copy of VariantImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantImport deepCopy(@Nullable final VariantImport template) {
        if (template == null) {
            return null;
        }
        VariantImportImpl instance = new VariantImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProduct(
            com.commercetools.importapi.models.common.ProductKeyReference.deepCopy(template.getProduct()));
        instance.setPublish(template.getPublish());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy)
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
     * builder factory method for VariantImport
     * @return builder
     */
    public static VariantImportBuilder builder() {
        return VariantImportBuilder.of();
    }

    /**
     * create builder for VariantImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantImportBuilder builder(final VariantImport template) {
        return VariantImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantImport(Function<VariantImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantImport> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantImport>() {
            @Override
            public String toString() {
                return "TypeReference<VariantImport>";
            }
        };
    }
}
