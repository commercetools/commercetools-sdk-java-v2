package com.commercetools.ml.models.category_recommendations;

import com.commercetools.ml.models.common.CategoryReference;
import com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationImpl;

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
 * ProjectCategoryRecommendation
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendation projectCategoryRecommendation = ProjectCategoryRecommendation.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .confidence(0.3)
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProjectCategoryRecommendationImpl.class)
public interface ProjectCategoryRecommendation  {


    /**
     *  <p>A category that is recommended for a product.</p>
     * @return category
     */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();
    /**
     *  <p>Probability score for the category recommendation.</p>
     * @return confidence
     */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();
    /**
     *  <p>Breadcrumb path to the recommended category. This only picks up one language, not all available languages for the category. English is prioritized, but if English data is not available, an arbitrary language is selected. Do not use this to identify a category,use the category ID from the category reference instead.</p>
     * @return path
     */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    /**
     *  <p>A category that is recommended for a product.</p>
     * @param category value to be set
     */
    
    public void setCategory(final CategoryReference category);
    
    
    /**
     *  <p>Probability score for the category recommendation.</p>
     * @param confidence value to be set
     */
    
    public void setConfidence(final Double confidence);
    
    
    /**
     *  <p>Breadcrumb path to the recommended category. This only picks up one language, not all available languages for the category. English is prioritized, but if English data is not available, an arbitrary language is selected. Do not use this to identify a category,use the category ID from the category reference instead.</p>
     * @param path value to be set
     */
    
    public void setPath(final String path);
    

    /**
     * factory method
     * @return instance of ProjectCategoryRecommendation
     */
    public static ProjectCategoryRecommendation of(){
        return new ProjectCategoryRecommendationImpl();
    }
    

    /**
     * factory method to create a shallow copy ProjectCategoryRecommendation
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectCategoryRecommendation of(final ProjectCategoryRecommendation template) {
        ProjectCategoryRecommendationImpl instance = new ProjectCategoryRecommendationImpl();
        instance.setCategory(template.getCategory());
        instance.setConfidence(template.getConfidence());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectCategoryRecommendation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectCategoryRecommendation deepCopy(@Nullable final ProjectCategoryRecommendation template) {
        if (template == null) {
            return null;
        }
        ProjectCategoryRecommendationImpl instance = new ProjectCategoryRecommendationImpl();
        instance.setCategory(com.commercetools.ml.models.common.CategoryReference.deepCopy(template.getCategory()));
        instance.setConfidence(template.getConfidence());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * builder factory method for ProjectCategoryRecommendation
     * @return builder
     */
    public static ProjectCategoryRecommendationBuilder builder() {
        return ProjectCategoryRecommendationBuilder.of();
    }
    
    /**
     * create builder for ProjectCategoryRecommendation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectCategoryRecommendationBuilder builder(final ProjectCategoryRecommendation template) {
        return ProjectCategoryRecommendationBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectCategoryRecommendation(Function<ProjectCategoryRecommendation, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendation>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendation>";
            }
        };
    }
}
