
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
 *     ProductMoveImageToPositionAction productMoveImageToPositionAction = ProductMoveImageToPositionAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .position(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductMoveImageToPositionActionImpl.class)
public interface ProductMoveImageToPositionAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductMoveImageToPositionAction
     */
    String MOVE_IMAGE_TO_POSITION = "moveImageToPosition";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The URL of the image to update.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @return position
     */
    @NotNull
    @JsonProperty("position")
    public Long getPosition();

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The URL of the image to update.</p>
     * @param imageUrl value to be set
     */

    public void setImageUrl(final String imageUrl);

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @param position value to be set
     */

    public void setPosition(final Long position);

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductMoveImageToPositionAction
     */
    public static ProductMoveImageToPositionAction of() {
        return new ProductMoveImageToPositionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductMoveImageToPositionAction of(final ProductMoveImageToPositionAction template) {
        ProductMoveImageToPositionActionImpl instance = new ProductMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductMoveImageToPositionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductMoveImageToPositionAction deepCopy(@Nullable final ProductMoveImageToPositionAction template) {
        if (template == null) {
            return null;
        }
        ProductMoveImageToPositionActionImpl instance = new ProductMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductMoveImageToPositionAction
     * @return builder
     */
    public static ProductMoveImageToPositionActionBuilder builder() {
        return ProductMoveImageToPositionActionBuilder.of();
    }

    /**
     * create builder for ProductMoveImageToPositionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductMoveImageToPositionActionBuilder builder(final ProductMoveImageToPositionAction template) {
        return ProductMoveImageToPositionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductMoveImageToPositionAction(Function<ProductMoveImageToPositionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductMoveImageToPositionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductMoveImageToPositionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductMoveImageToPositionAction>";
            }
        };
    }
}
