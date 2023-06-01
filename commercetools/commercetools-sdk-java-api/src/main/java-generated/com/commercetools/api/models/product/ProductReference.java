package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductReferenceImpl;

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
 *  <p>Reference to a Product.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductReference productReference = ProductReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference, com.commercetools.api.models.Identifiable<Product> {

    /**
     * discriminator value for ProductReference
     */
    String PRODUCT = "product";

    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Product getObj();
    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Product. Only present in responses to requests with Reference Expansion for Products.</p>
     * @param obj value to be set
     */
    
    public void setObj(final Product obj);
    
    
    /**
     *  <p>Unique identifier of the referenced Product.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    

    /**
     * factory method
     * @return instance of ProductReference
     */
    public static ProductReference of(){
        return new ProductReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductReference deepCopy(@Nullable final ProductReference template) {
        if (template == null) {
            return null;
        }
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.product.Product.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ProductReference
     * @return builder
     */
    public static ProductReferenceBuilder builder() {
        return ProductReferenceBuilder.of();
    }
    
    /**
     * create builder for ProductReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductReferenceBuilder builder(final ProductReference template) {
        return ProductReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductReference>";
            }
        };
    }
}
