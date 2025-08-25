
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

/**
 *  <p>Either <code>id</code> or <code>sku</code> is required to reference a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringDraft productVariantTailoringDraft = ProductVariantTailoringDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringDraftImpl.class)
public interface ProductVariantTailoringDraft extends io.vrap.rmf.base.client.Draft<ProductVariantTailoringDraft> {

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return id
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
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
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to be tailored.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the tailored Product Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media assets of the tailored Product Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final ProductTailoringAttribute... attributes);

    /**
     *  <p>Attributes of the tailored Product Variant according to the respective <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>. If provided, these Attributes are selectively merged into the <code>attributes</code> of the corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>:</p>
     *  <ul>
     *   <li>If the ProductVariant contains an Attribute with the same <code>name</code>, its <code>value</code> is overwritten,</li>
     *   <li>otherwise the Attribute and its value are added to the ProductVariant.</li>
     *  </ul>
     * @param attributes values to be set
     */

    public void setAttributes(final List<ProductTailoringAttribute> attributes);

    /**
     * factory method
     * @return instance of ProductVariantTailoringDraft
     */
    public static ProductVariantTailoringDraft of() {
        return new ProductVariantTailoringDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringDraft of(final ProductVariantTailoringDraft template) {
        ProductVariantTailoringDraftImpl instance = new ProductVariantTailoringDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public ProductVariantTailoringDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantTailoringDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringDraft deepCopy(@Nullable final ProductVariantTailoringDraft template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringDraftImpl instance = new ProductVariantTailoringDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
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
     * builder factory method for ProductVariantTailoringDraft
     * @return builder
     */
    public static ProductVariantTailoringDraftBuilder builder() {
        return ProductVariantTailoringDraftBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringDraftBuilder builder(final ProductVariantTailoringDraft template) {
        return ProductVariantTailoringDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringDraft(Function<ProductVariantTailoringDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringDraft>";
            }
        };
    }
}
