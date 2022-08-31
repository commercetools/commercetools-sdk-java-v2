
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String MOVE_IMAGE_TO_POSITION = "moveImageToPosition";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The URL of the image to update.</p>
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     */
    @NotNull
    @JsonProperty("position")
    public Long getPosition();

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setImageUrl(final String imageUrl);

    public void setPosition(final Long position);

    public void setStaged(final Boolean staged);

    public static ProductMoveImageToPositionAction of() {
        return new ProductMoveImageToPositionActionImpl();
    }

    public static ProductMoveImageToPositionAction of(final ProductMoveImageToPositionAction template) {
        ProductMoveImageToPositionActionImpl instance = new ProductMoveImageToPositionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setPosition(template.getPosition());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductMoveImageToPositionActionBuilder builder() {
        return ProductMoveImageToPositionActionBuilder.of();
    }

    public static ProductMoveImageToPositionActionBuilder builder(final ProductMoveImageToPositionAction template) {
        return ProductMoveImageToPositionActionBuilder.of(template);
    }

    default <T> T withProductMoveImageToPositionAction(Function<ProductMoveImageToPositionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductMoveImageToPositionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductMoveImageToPositionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductMoveImageToPositionAction>";
            }
        };
    }
}
