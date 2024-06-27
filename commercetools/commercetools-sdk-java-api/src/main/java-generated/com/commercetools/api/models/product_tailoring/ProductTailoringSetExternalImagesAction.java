
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. Produces the ProductTailoringImagesSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetExternalImagesAction productTailoringSetExternalImagesAction = ProductTailoringSetExternalImagesAction.builder()
 *             .plusImages(imagesBuilder -> imagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetExternalImagesActionImpl.class)
public interface ProductTailoringSetExternalImagesAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetExternalImagesAction
     */
    String SET_IMAGES = "setImages";

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @return images
     */
    @NotNull
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Value to set to <code>images</code>.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetExternalImagesAction
     */
    public static ProductTailoringSetExternalImagesAction of() {
        return new ProductTailoringSetExternalImagesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetExternalImagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetExternalImagesAction of(final ProductTailoringSetExternalImagesAction template) {
        ProductTailoringSetExternalImagesActionImpl instance = new ProductTailoringSetExternalImagesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImages(template.getImages());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetExternalImagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetExternalImagesAction deepCopy(
            @Nullable final ProductTailoringSetExternalImagesAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetExternalImagesActionImpl instance = new ProductTailoringSetExternalImagesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetExternalImagesAction
     * @return builder
     */
    public static ProductTailoringSetExternalImagesActionBuilder builder() {
        return ProductTailoringSetExternalImagesActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetExternalImagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetExternalImagesActionBuilder builder(
            final ProductTailoringSetExternalImagesAction template) {
        return ProductTailoringSetExternalImagesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetExternalImagesAction(
            Function<ProductTailoringSetExternalImagesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetExternalImagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetExternalImagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetExternalImagesAction>";
            }
        };
    }
}
