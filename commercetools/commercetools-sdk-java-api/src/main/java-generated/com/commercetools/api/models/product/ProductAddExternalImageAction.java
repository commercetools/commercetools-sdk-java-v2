package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddExternalImageActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. Produces the ProductImageAdded Message.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductAddExternalImageActionImpl.class)
public interface ProductAddExternalImageAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductAddExternalImageAction
     */
    String ADD_EXTERNAL_IMAGE = "addExternalImage";

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
     *  <p>Value to add to <code>images</code>.</p>
     * @return image
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();
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
     *  <p>Value to add to <code>images</code>.</p>
     * @param image value to be set
     */
    
    public void setImage(final Image image);
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductAddExternalImageAction
     */
    public static ProductAddExternalImageAction of(){
        return new ProductAddExternalImageActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddExternalImageAction of(final ProductAddExternalImageAction template) {
        ProductAddExternalImageActionImpl instance = new ProductAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductAddExternalImageAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAddExternalImageAction deepCopy(@Nullable final ProductAddExternalImageAction template) {
        if (template == null) {
            return null;
        }
        ProductAddExternalImageActionImpl instance = new ProductAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductAddExternalImageAction
     * @return builder
     */
    public static ProductAddExternalImageActionBuilder builder() {
        return ProductAddExternalImageActionBuilder.of();
    }
    
    /**
     * create builder for ProductAddExternalImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddExternalImageActionBuilder builder(final ProductAddExternalImageAction template) {
        return ProductAddExternalImageActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddExternalImageAction(Function<ProductAddExternalImageAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddExternalImageAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddExternalImageAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddExternalImageAction>";
            }
        };
    }
}
