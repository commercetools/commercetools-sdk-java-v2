package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemoveVariantActionImpl;

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
 *  <p>Either <code>id</code> or <code>sku</code> is required. Produces the ProductVariantDeleted Message. If the Product Variant to remove is part of a ProductSelectionAssignment its SKU will be automatically removed from the respective ProductVariantSelection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveVariantAction productRemoveVariantAction = ProductRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductRemoveVariantActionImpl.class)
public interface ProductRemoveVariantAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductRemoveVariantAction
     */
    String REMOVE_VARIANT = "removeVariant";

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public Long getId();
    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove.</p>
     * @param id value to be set
     */
    
    public void setId(final Long id);
    
    
    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is removed. If <code>false</code>, both the current and staged ProductVariant is removed.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductRemoveVariantAction
     */
    public static ProductRemoveVariantAction of(){
        return new ProductRemoveVariantActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductRemoveVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductRemoveVariantAction of(final ProductRemoveVariantAction template) {
        ProductRemoveVariantActionImpl instance = new ProductRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductRemoveVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductRemoveVariantAction deepCopy(@Nullable final ProductRemoveVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductRemoveVariantActionImpl instance = new ProductRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductRemoveVariantAction
     * @return builder
     */
    public static ProductRemoveVariantActionBuilder builder() {
        return ProductRemoveVariantActionBuilder.of();
    }
    
    /**
     * create builder for ProductRemoveVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveVariantActionBuilder builder(final ProductRemoveVariantAction template) {
        return ProductRemoveVariantActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductRemoveVariantAction(Function<ProductRemoveVariantAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveVariantAction>";
            }
        };
    }
}
