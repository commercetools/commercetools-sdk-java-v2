package com.commercetools.api.models.product;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddToCategoryActionImpl;

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
 *  <p>Produces the ProductAddedToCategory Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddToCategoryAction productAddToCategoryAction = ProductAddToCategoryAction.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductAddToCategoryActionImpl.class)
public interface ProductAddToCategoryAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductAddToCategoryAction
     */
    String ADD_TO_CATEGORY = "addToCategory";

    /**
     *  <p>The Category to add.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryResourceIdentifier getCategory();
    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @return orderHint
     */
    
    @JsonProperty("orderHint")
    public String getOrderHint();
    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are updated. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are updated.</p>
     * @return staged
     */
    
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The Category to add.</p>
     * @param category value to be set
     */
    
    public void setCategory(final CategoryResourceIdentifier category);
    
    
    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     * @param orderHint value to be set
     */
    
    public void setOrderHint(final String orderHint);
    
    
    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are updated. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are updated.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductAddToCategoryAction
     */
    public static ProductAddToCategoryAction of(){
        return new ProductAddToCategoryActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductAddToCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddToCategoryAction of(final ProductAddToCategoryAction template) {
        ProductAddToCategoryActionImpl instance = new ProductAddToCategoryActionImpl();
        instance.setCategory(template.getCategory());
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductAddToCategoryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAddToCategoryAction deepCopy(@Nullable final ProductAddToCategoryAction template) {
        if (template == null) {
            return null;
        }
        ProductAddToCategoryActionImpl instance = new ProductAddToCategoryActionImpl();
        instance.setCategory(com.commercetools.api.models.category.CategoryResourceIdentifier.deepCopy(template.getCategory()));
        instance.setOrderHint(template.getOrderHint());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductAddToCategoryAction
     * @return builder
     */
    public static ProductAddToCategoryActionBuilder builder() {
        return ProductAddToCategoryActionBuilder.of();
    }
    
    /**
     * create builder for ProductAddToCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddToCategoryActionBuilder builder(final ProductAddToCategoryAction template) {
        return ProductAddToCategoryActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddToCategoryAction(Function<ProductAddToCategoryAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddToCategoryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddToCategoryAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddToCategoryAction>";
            }
        };
    }
}
