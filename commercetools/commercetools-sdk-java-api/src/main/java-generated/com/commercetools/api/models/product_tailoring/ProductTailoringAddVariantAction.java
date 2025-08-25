
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Either <code>id</code> or <code>sku</code> is required to reference a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that exists. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoringAddedMessage" rel="nofollow">ProductVariantTailoringAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringAddVariantAction productTailoringAddVariantAction = ProductTailoringAddVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addVariant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringAddVariantActionImpl.class)
public interface ProductTailoringAddVariantAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringAddVariantAction
     */
    String ADD_VARIANT = "addVariant";

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return id
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>Attributes for the Product Variant Tailoring.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<ProductTailoringAttribute> getAttributes();

    /**
     *  <p>If <code>true</code> the new Product Variant Tailoring is only staged. If <code>false</code> the new Product Variant Tailoring is both current and staged.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images for the Product Variant Tailoring.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    /**
     *  <p>Media assets for the Product Variant Tailoring.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<AssetDraft> assets);

    /**
     *  <p>Attributes for the Product Variant Tailoring.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final ProductTailoringAttribute... attributes);

    /**
     *  <p>Attributes for the Product Variant Tailoring.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<ProductTailoringAttribute> attributes);

    /**
     *  <p>If <code>true</code> the new Product Variant Tailoring is only staged. If <code>false</code> the new Product Variant Tailoring is both current and staged.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringAddVariantAction
     */
    public static ProductTailoringAddVariantAction of() {
        return new ProductTailoringAddVariantActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringAddVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringAddVariantAction of(final ProductTailoringAddVariantAction template) {
        ProductTailoringAddVariantActionImpl instance = new ProductTailoringAddVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringAddVariantAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringAddVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringAddVariantAction deepCopy(@Nullable final ProductTailoringAddVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringAddVariantActionImpl instance = new ProductTailoringAddVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_tailoring.ProductTailoringAttribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringAddVariantAction
     * @return builder
     */
    public static ProductTailoringAddVariantActionBuilder builder() {
        return ProductTailoringAddVariantActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringAddVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAddVariantActionBuilder builder(final ProductTailoringAddVariantAction template) {
        return ProductTailoringAddVariantActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringAddVariantAction(Function<ProductTailoringAddVariantAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAddVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringAddVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringAddVariantAction>";
            }
        };
    }
}
