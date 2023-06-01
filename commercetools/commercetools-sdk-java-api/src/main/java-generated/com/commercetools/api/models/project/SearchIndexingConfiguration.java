package com.commercetools.api.models.project;

import com.commercetools.api.models.project.SearchIndexingConfigurationValues;
import com.commercetools.api.models.project.SearchIndexingConfigurationImpl;

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
 *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchIndexingConfiguration searchIndexingConfiguration = SearchIndexingConfiguration.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SearchIndexingConfigurationImpl.class)
public interface SearchIndexingConfiguration  {


    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @return products
     */
    @Valid
    @JsonProperty("products")
    public SearchIndexingConfigurationValues getProducts();
    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @return orders
     */
    @Valid
    @JsonProperty("orders")
    public SearchIndexingConfigurationValues getOrders();

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @param products value to be set
     */
    
    public void setProducts(final SearchIndexingConfigurationValues products);
    
    
    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @param orders value to be set
     */
    
    public void setOrders(final SearchIndexingConfigurationValues orders);
    

    /**
     * factory method
     * @return instance of SearchIndexingConfiguration
     */
    public static SearchIndexingConfiguration of(){
        return new SearchIndexingConfigurationImpl();
    }
    

    /**
     * factory method to create a shallow copy SearchIndexingConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchIndexingConfiguration of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(template.getProducts());
        instance.setOrders(template.getOrders());
        return instance;
    }

    /**
     * factory method to create a deep copy of SearchIndexingConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchIndexingConfiguration deepCopy(@Nullable final SearchIndexingConfiguration template) {
        if (template == null) {
            return null;
        }
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(com.commercetools.api.models.project.SearchIndexingConfigurationValues.deepCopy(template.getProducts()));
        instance.setOrders(com.commercetools.api.models.project.SearchIndexingConfigurationValues.deepCopy(template.getOrders()));
        return instance;
    }

    /**
     * builder factory method for SearchIndexingConfiguration
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder builder() {
        return SearchIndexingConfigurationBuilder.of();
    }
    
    /**
     * create builder for SearchIndexingConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder builder(final SearchIndexingConfiguration template) {
        return SearchIndexingConfigurationBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchIndexingConfiguration(Function<SearchIndexingConfiguration, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<SearchIndexingConfiguration>";
            }
        };
    }
}
