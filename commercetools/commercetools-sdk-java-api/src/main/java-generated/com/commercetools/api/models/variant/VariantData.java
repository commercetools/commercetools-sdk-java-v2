
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Contains the actual data for a Variant in either current (published) or staged (draft) state.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantData variantData = VariantData.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantDataImpl.class)
public interface VariantData {

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Images of the Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Media assets of the Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>User-defined unique SKU of the Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Images of the Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes of the Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Media assets of the Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media assets of the Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     * factory method
     * @return instance of VariantData
     */
    public static VariantData of() {
        return new VariantDataImpl();
    }

    /**
     * factory method to create a shallow copy VariantData
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantData of(final VariantData template) {
        VariantDataImpl instance = new VariantDataImpl();
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setAttributes(template.getAttributes());
        instance.setAssets(template.getAssets());
        return instance;
    }

    public VariantData copyDeep();

    /**
     * factory method to create a deep copy of VariantData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantData deepCopy(@Nullable final VariantData template) {
        if (template == null) {
            return null;
        }
        VariantDataImpl instance = new VariantDataImpl();
        instance.setSku(template.getSku());
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
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantData
     * @return builder
     */
    public static VariantDataBuilder builder() {
        return VariantDataBuilder.of();
    }

    /**
     * create builder for VariantData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantDataBuilder builder(final VariantData template) {
        return VariantDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantData(Function<VariantData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantData> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantData>() {
            @Override
            public String toString() {
                return "TypeReference<VariantData>";
            }
        };
    }
}
