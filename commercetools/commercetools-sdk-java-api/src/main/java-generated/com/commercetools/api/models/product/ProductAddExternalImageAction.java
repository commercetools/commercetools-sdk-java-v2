
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. Produces the ProductImageAddedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddExternalImageAction productAddExternalImageAction = ProductAddExternalImageAction.builder()
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddExternalImageActionImpl.class)
public interface ProductAddExternalImageAction extends ProductUpdateAction {

    String ADD_EXTERNAL_IMAGE = "addExternalImage";

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
     *  <p>Value to add to <code>images</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setImage(final Image image);

    public void setStaged(final Boolean staged);

    public static ProductAddExternalImageAction of() {
        return new ProductAddExternalImageActionImpl();
    }

    public static ProductAddExternalImageAction of(final ProductAddExternalImageAction template) {
        ProductAddExternalImageActionImpl instance = new ProductAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddExternalImageActionBuilder builder() {
        return ProductAddExternalImageActionBuilder.of();
    }

    public static ProductAddExternalImageActionBuilder builder(final ProductAddExternalImageAction template) {
        return ProductAddExternalImageActionBuilder.of(template);
    }

    default <T> T withProductAddExternalImageAction(Function<ProductAddExternalImageAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddExternalImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddExternalImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddExternalImageAction>";
            }
        };
    }
}
