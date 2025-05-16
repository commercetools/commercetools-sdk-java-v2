
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Contains the Product Variant to be used in the LineItemImportDraft.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantImportDraft productVariantImportDraft = ProductVariantImportDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantImportDraftImpl.class)
public interface ProductVariantImportDraft extends io.vrap.rmf.base.client.Draft<ProductVariantImportDraft> {

    /**
     *  <p>The <code>id</code> of the ProductVariant. Required if you do not set a value for <code>sku</code>. If set, you must specify a <code>productId</code> in the LineItemImportDraft also.</p>
     * @return id
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant. Required if you do not set a value for <code>id</code>.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>The <code>id</code> of the ProductVariant. Required if you do not set a value for <code>sku</code>. If set, you must specify a <code>productId</code> in the LineItemImportDraft also.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>The <code>sku</code> of the ProductVariant. Required if you do not set a value for <code>id</code>.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    /**
     *  <p>The Prices of the Product Variant if you want to override the <code>prices</code> property in the referenced ProductVariant. If not set, the <code>prices</code> from the referenced ProductVariant are used in the resulting Order. If set, each Price must have its unique price scope (same <code>value.currencyCode</code>, <code>country</code>, <code>customerGroup</code>, <code>channel</code>, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    public void setPrices(final List<PriceDraft> prices);

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>The Attributes of the Product Variant if you want to override the <code>attributes</code> property in the referenced ProductVariant. If not set, the <code>attributes</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>The Images of the Product Variant if you want to override the <code>images</code> property in the referenced ProductVariant. If not set, the <code>images</code> from the referenced ProductVariant are copied to the resulting Order.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     * factory method
     * @return instance of ProductVariantImportDraft
     */
    public static ProductVariantImportDraft of() {
        return new ProductVariantImportDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantImportDraft of(final ProductVariantImportDraft template) {
        ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    public ProductVariantImportDraft copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantImportDraft deepCopy(@Nullable final ProductVariantImportDraft template) {
        if (template == null) {
            return null;
        }
        ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
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
        return instance;
    }

    /**
     * builder factory method for ProductVariantImportDraft
     * @return builder
     */
    public static ProductVariantImportDraftBuilder builder() {
        return ProductVariantImportDraftBuilder.of();
    }

    /**
     * create builder for ProductVariantImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantImportDraftBuilder builder(final ProductVariantImportDraft template) {
        return ProductVariantImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantImportDraft(Function<ProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantImportDraft>";
            }
        };
    }
}
