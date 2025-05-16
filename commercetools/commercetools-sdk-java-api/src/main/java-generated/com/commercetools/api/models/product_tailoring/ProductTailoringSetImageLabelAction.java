
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetImageLabelAction productTailoringSetImageLabelAction = ProductTailoringSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setImageLabel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetImageLabelActionImpl.class)
public interface ProductTailoringSetImageLabelAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetImageLabelAction
     */
    String SET_IMAGE_LABEL = "setImageLabel";

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
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
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
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
     * @return instance of ProductTailoringSetImageLabelAction
     */
    public static ProductTailoringSetImageLabelAction of() {
        return new ProductTailoringSetImageLabelActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetImageLabelAction of(final ProductTailoringSetImageLabelAction template) {
        ProductTailoringSetImageLabelActionImpl instance = new ProductTailoringSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringSetImageLabelAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetImageLabelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetImageLabelAction deepCopy(
            @Nullable final ProductTailoringSetImageLabelAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetImageLabelActionImpl instance = new ProductTailoringSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetImageLabelAction
     * @return builder
     */
    public static ProductTailoringSetImageLabelActionBuilder builder() {
        return ProductTailoringSetImageLabelActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetImageLabelActionBuilder builder(
            final ProductTailoringSetImageLabelAction template) {
        return ProductTailoringSetImageLabelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetImageLabelAction(Function<ProductTailoringSetImageLabelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetImageLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetImageLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetImageLabelAction>";
            }
        };
    }
}
