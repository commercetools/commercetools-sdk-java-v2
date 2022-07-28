
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a Product image and deletes it from the Content Delivery Network (external images are not deleted). Deletion from the CDN is not instant, which means the image file itself will stay available for some time after the deletion. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveImageAction productRemoveImageAction = ProductRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveImageActionImpl.class)
public interface ProductRemoveImageAction extends ProductUpdateAction {

    String REMOVE_IMAGE = "removeImage";

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
     *  <p>The URL of the image to remove.</p>
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setImageUrl(final String imageUrl);

    public void setStaged(final Boolean staged);

    public static ProductRemoveImageAction of() {
        return new ProductRemoveImageActionImpl();
    }

    public static ProductRemoveImageAction of(final ProductRemoveImageAction template) {
        ProductRemoveImageActionImpl instance = new ProductRemoveImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImageUrl(template.getImageUrl());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemoveImageActionBuilder builder() {
        return ProductRemoveImageActionBuilder.of();
    }

    public static ProductRemoveImageActionBuilder builder(final ProductRemoveImageAction template) {
        return ProductRemoveImageActionBuilder.of(template);
    }

    default <T> T withProductRemoveImageAction(Function<ProductRemoveImageAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveImageAction>";
            }
        };
    }
}
