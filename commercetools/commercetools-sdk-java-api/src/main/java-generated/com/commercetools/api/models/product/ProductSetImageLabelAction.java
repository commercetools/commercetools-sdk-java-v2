
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
 *     ProductSetImageLabelAction productSetImageLabelAction = ProductSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetImageLabelActionImpl.class)
public interface ProductSetImageLabelAction extends ProductUpdateAction {

    String SET_IMAGE_LABEL = "setImageLabel";

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The URL of the image to set the label.</p>
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("label")
    public String getLabel();

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setSku(final String sku);

    public void setVariantId(final Long variantId);

    public void setImageUrl(final String imageUrl);

    public void setLabel(final String label);

    public void setStaged(final Boolean staged);

    public static ProductSetImageLabelAction of() {
        return new ProductSetImageLabelActionImpl();
    }

    public static ProductSetImageLabelAction of(final ProductSetImageLabelAction template) {
        ProductSetImageLabelActionImpl instance = new ProductSetImageLabelActionImpl();
        instance.setSku(template.getSku());
        instance.setVariantId(template.getVariantId());
        instance.setImageUrl(template.getImageUrl());
        instance.setLabel(template.getLabel());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetImageLabelActionBuilder builder() {
        return ProductSetImageLabelActionBuilder.of();
    }

    public static ProductSetImageLabelActionBuilder builder(final ProductSetImageLabelAction template) {
        return ProductSetImageLabelActionBuilder.of(template);
    }

    default <T> T withProductSetImageLabelAction(Function<ProductSetImageLabelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetImageLabelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetImageLabelAction>";
            }
        };
    }
}
