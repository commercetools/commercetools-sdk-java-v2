package com.commercetools.ml.models.image_search;

import com.commercetools.ml.models.common.ProductVariant;
import com.commercetools.ml.models.image_search.ResultItemImpl;

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
 *  <p>An image URL and the product variants it is contained in. If no matching images are found, ResultItem is not present.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ResultItem resultItem = ResultItem.builder()
 *             .imageUrl("{imageUrl}")
 *             .plusProductVariants(productVariantsBuilder -> productVariantsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ResultItemImpl.class)
public interface ResultItem  {


    /**
     *  <p>The URL of the image.</p>
     * @return imageUrl
     */
    @NotNull
    @JsonProperty("imageUrl")
    public String getImageUrl();
    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @return productVariants
     */
    @NotNull
    @Valid
    @JsonProperty("productVariants")
    public List<ProductVariant> getProductVariants();

    /**
     *  <p>The URL of the image.</p>
     * @param imageUrl value to be set
     */
    
    public void setImageUrl(final String imageUrl);
    
    
    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param productVariants values to be set
     */
    
    @JsonIgnore
    public void setProductVariants(final ProductVariant ...productVariants);
    /**
     *  <p>An array of product variants containing the image URL.</p>
     * @param productVariants values to be set
     */
    
    public void setProductVariants(final List<ProductVariant> productVariants);

    /**
     * factory method
     * @return instance of ResultItem
     */
    public static ResultItem of(){
        return new ResultItemImpl();
    }
    

    /**
     * factory method to create a shallow copy ResultItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static ResultItem of(final ResultItem template) {
        ResultItemImpl instance = new ResultItemImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setProductVariants(template.getProductVariants());
        return instance;
    }

    /**
     * factory method to create a deep copy of ResultItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ResultItem deepCopy(@Nullable final ResultItem template) {
        if (template == null) {
            return null;
        }
        ResultItemImpl instance = new ResultItemImpl();
        instance.setImageUrl(template.getImageUrl());
        instance.setProductVariants(Optional.ofNullable(template.getProductVariants())
                .map(t -> t.stream().map(com.commercetools.ml.models.common.ProductVariant::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ResultItem
     * @return builder
     */
    public static ResultItemBuilder builder() {
        return ResultItemBuilder.of();
    }
    
    /**
     * create builder for ResultItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ResultItemBuilder builder(final ResultItem template) {
        return ResultItemBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withResultItem(Function<ResultItem, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ResultItem> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ResultItem>() {
            @Override
            public String toString() {
                return "TypeReference<ResultItem>";
            }
        };
    }
}
