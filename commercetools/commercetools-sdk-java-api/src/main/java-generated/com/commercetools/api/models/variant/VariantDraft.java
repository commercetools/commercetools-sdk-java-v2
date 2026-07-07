
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Draft for creating a new Variant. When a Variant is created, only the current version is set. The staged version is only set when the Variant is updated with different current and staged data.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantDraft variantDraft = VariantDraft.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantDraftImpl.class)
public interface VariantDraft extends io.vrap.rmf.base.client.Draft<VariantDraft> {

    /**
     *  <p>User-defined unique identifier for the Variant. This field is optional, but we strongly recommend setting it.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant will be immediately available in the current published state.</p>
     * @return publish
     */

    @JsonProperty("publish")
    public Boolean getPublish();

    /**
     *  <p>Images for the Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Variant Attributes according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Media assets for the Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>User-defined unique identifier for the Variant. This field is optional, but we strongly recommend setting it.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>ResourceIdentifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Variant belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     *  <p>Indicates whether the Variant is published. If <code>true</code>, the Variant will be immediately available in the current published state.</p>
     * @param publish value to be set
     */

    public void setPublish(final Boolean publish);

    /**
     *  <p>Images for the Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images for the Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

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
     *  <p>Media assets for the Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    /**
     *  <p>Media assets for the Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<AssetDraft> assets);

    /**
     * factory method
     * @return instance of VariantDraft
     */
    public static VariantDraft of() {
        return new VariantDraftImpl();
    }

    /**
     * factory method to create a shallow copy VariantDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantDraft of(final VariantDraft template) {
        VariantDraftImpl instance = new VariantDraftImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProduct(template.getProduct());
        instance.setPublish(template.getPublish());
        instance.setImages(template.getImages());
        instance.setAttributes(template.getAttributes());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public VariantDraft copyDeep();

    /**
     * factory method to create a deep copy of VariantDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantDraft deepCopy(@Nullable final VariantDraft template) {
        if (template == null) {
            return null;
        }
        VariantDraftImpl instance = new VariantDraftImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setPublish(template.getPublish());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
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
     * builder factory method for VariantDraft
     * @return builder
     */
    public static VariantDraftBuilder builder() {
        return VariantDraftBuilder.of();
    }

    /**
     * create builder for VariantDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDraftBuilder builder(final VariantDraft template) {
        return VariantDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantDraft(Function<VariantDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantDraft>() {
            @Override
            public String toString() {
                return "TypeReference<VariantDraft>";
            }
        };
    }
}
