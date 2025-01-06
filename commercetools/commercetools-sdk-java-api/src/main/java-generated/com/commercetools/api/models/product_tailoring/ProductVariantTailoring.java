
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The tailoring of a ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoring productVariantTailoring = ProductVariantTailoring.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringImpl.class)
public interface ProductVariantTailoring {

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding ProductVariant in total.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding ProductVariant in total.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding ProductVariant:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<ProductTailoringAttribute> getAttributes();

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding ProductVariant in total.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the tailored Product Variant. If present, these images will override the images of the corresponding ProductVariant in total.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding ProductVariant in total.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media assets of the tailored Product Variant. If present, these assets will override the assets of the corresponding ProductVariant in total.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding ProductVariant:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final ProductTailoringAttribute... attributes);

    /**
     *  <p>Attributes of the tailored Product Variant. If present, these Attributes are selectively merged into the <code>attributes</code> of the corresponding ProductVariant:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes values to be set
     */

    public void setAttributes(final List<ProductTailoringAttribute> attributes);

    /**
     * factory method
     * @return instance of ProductVariantTailoring
     */
    public static ProductVariantTailoring of() {
        return new ProductVariantTailoringImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoring
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoring of(final ProductVariantTailoring template) {
        ProductVariantTailoringImpl instance = new ProductVariantTailoringImpl();
        instance.setId(template.getId());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantTailoring
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoring deepCopy(@Nullable final ProductVariantTailoring template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringImpl instance = new ProductVariantTailoringImpl();
        instance.setId(template.getId());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoringAttribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantTailoring
     * @return builder
     */
    public static ProductVariantTailoringBuilder builder() {
        return ProductVariantTailoringBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoring instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringBuilder builder(final ProductVariantTailoring template) {
        return ProductVariantTailoringBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoring(Function<ProductVariantTailoring, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoring> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoring>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoring>";
            }
        };
    }
}
