package com.commercetools.ml.models.category_recommendations;


import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaImpl;

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
 * ProjectCategoryRecommendationMeta
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendationMeta projectCategoryRecommendationMeta = ProjectCategoryRecommendationMeta.builder()
 *             .plusGeneralCategoryNames(generalCategoryNamesBuilder -> generalCategoryNamesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProjectCategoryRecommendationMetaImpl.class)
public interface ProjectCategoryRecommendationMeta  {


    /**
     *  <p>The product name that was used to generate recommendations.</p>
     * @return productName
     */
    
    @JsonProperty("productName")
    public String getProductName();
    /**
     *  <p>The product image that was used to generate recommendations.</p>
     * @return productImageUrl
     */
    
    @JsonProperty("productImageUrl")
    public String getProductImageUrl();
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @return generalCategoryNames
     */
    @NotNull
    @JsonProperty("generalCategoryNames")
    public List<String> getGeneralCategoryNames();

    /**
     *  <p>The product name that was used to generate recommendations.</p>
     * @param productName value to be set
     */
    
    public void setProductName(final String productName);
    
    
    /**
     *  <p>The product image that was used to generate recommendations.</p>
     * @param productImageUrl value to be set
     */
    
    public void setProductImageUrl(final String productImageUrl);
    
    
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @param generalCategoryNames values to be set
     */
    
    @JsonIgnore
    public void setGeneralCategoryNames(final String ...generalCategoryNames);
    /**
     *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
     * @param generalCategoryNames values to be set
     */
    
    public void setGeneralCategoryNames(final List<String> generalCategoryNames);

    /**
     * factory method
     * @return instance of ProjectCategoryRecommendationMeta
     */
    public static ProjectCategoryRecommendationMeta of(){
        return new ProjectCategoryRecommendationMetaImpl();
    }
    

    /**
     * factory method to create a shallow copy ProjectCategoryRecommendationMeta
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectCategoryRecommendationMeta of(final ProjectCategoryRecommendationMeta template) {
        ProjectCategoryRecommendationMetaImpl instance = new ProjectCategoryRecommendationMetaImpl();
        instance.setProductName(template.getProductName());
        instance.setProductImageUrl(template.getProductImageUrl());
        instance.setGeneralCategoryNames(template.getGeneralCategoryNames());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectCategoryRecommendationMeta
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectCategoryRecommendationMeta deepCopy(@Nullable final ProjectCategoryRecommendationMeta template) {
        if (template == null) {
            return null;
        }
        ProjectCategoryRecommendationMetaImpl instance = new ProjectCategoryRecommendationMetaImpl();
        instance.setProductName(template.getProductName());
        instance.setProductImageUrl(template.getProductImageUrl());
        instance.setGeneralCategoryNames(Optional.ofNullable(template.getGeneralCategoryNames())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectCategoryRecommendationMeta
     * @return builder
     */
    public static ProjectCategoryRecommendationMetaBuilder builder() {
        return ProjectCategoryRecommendationMetaBuilder.of();
    }
    
    /**
     * create builder for ProjectCategoryRecommendationMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectCategoryRecommendationMetaBuilder builder(final ProjectCategoryRecommendationMeta template) {
        return ProjectCategoryRecommendationMetaBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectCategoryRecommendationMeta(Function<ProjectCategoryRecommendationMeta, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationMeta> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationMeta>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendationMeta>";
            }
        };
    }
}
