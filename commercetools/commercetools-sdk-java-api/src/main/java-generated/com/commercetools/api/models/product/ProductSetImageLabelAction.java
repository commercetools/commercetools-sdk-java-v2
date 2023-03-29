
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetImageLabelAction productSetImageLabelAction = ProductSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetImageLabelActionImpl.class)
public interface ProductSetImageLabelAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetImageLabelAction
     */
    String SET_IMAGE_LABEL = "setImageLabel";

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The URL of the image to set the label.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */

    @JsonProperty("label")
    public String getLabel();

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The URL of the image to set the label.</p>
     * @param imageUrl value to be set
     */

    public void setImageUrl(final String imageUrl);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     */

    public void setLabel(final String label);

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetImageLabelAction
     */
    public static ProductSetImageLabelAction of() {
        return new ProductSetImageLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetImageLabelAction of(final ProductSetImageLabelAction template) {
        ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetImageLabelAction deepCopy(@Nullable final ProductSetImageLabelAction template) {
        if (template == null) {
            return null;
        }
        ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetImageLabelAction
     * @return builder
     */
    public static ProductSetImageLabelActionBuilder builder() {
        return ProductSetImageLabelActionBuilder.of();
    }

    /**
     * create builder for ProductSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetImageLabelActionBuilder builder(final ProductSetImageLabelAction template) {
        return ProductSetImageLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetImageLabelAction(Function<ProductSetImageLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetImageLabelAction ofUnset(final Long variantId, final String imageUrl,
            final Boolean staged) {
        return ProductSetImageLabelActionBuilder.of().variantId(variantId).imageUrl(imageUrl).staged(staged).build();
    }

    public static ProductSetImageLabelAction ofUnsetStaged(final Long variantId, final String imageUrl) {
        return ProductSetImageLabelActionBuilder.of().variantId(variantId).imageUrl(imageUrl).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetImageLabelAction>";
            }
        };
    }
}
