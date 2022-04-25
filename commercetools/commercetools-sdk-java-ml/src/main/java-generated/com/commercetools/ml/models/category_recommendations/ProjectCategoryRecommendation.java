
package com.commercetools.ml.models.category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.CategoryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectCategoryRecommendationImpl.class)
public interface ProjectCategoryRecommendation {

    /**
    *  <p>A category that is recommended for a product.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("category")
    public CategoryReference getCategory();

    /**
    *  <p>Probability score for the category recommendation.</p>
    */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();

    /**
    *  <p>Breadcrumb path to the recommended category. This only picks up one language, not all available languages for the category. English is prioritized, but if English data is not available, an arbitrary language is selected. Do not use this to identify a category,use the category ID from the category reference instead.</p>
    */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    public void setCategory(final CategoryReference category);

    public void setConfidence(final Double confidence);

    public void setPath(final String path);

    public static ProjectCategoryRecommendation of() {
        return new ProjectCategoryRecommendationImpl();
    }

    public static ProjectCategoryRecommendation of(final ProjectCategoryRecommendation template) {
        ProjectCategoryRecommendationImpl instance = new ProjectCategoryRecommendationImpl();
        instance.setCategory(template.getCategory());
        instance.setConfidence(template.getConfidence());
        instance.setPath(template.getPath());
        return instance;
    }

    public static ProjectCategoryRecommendationBuilder builder() {
        return ProjectCategoryRecommendationBuilder.of();
    }

    public static ProjectCategoryRecommendationBuilder builder(final ProjectCategoryRecommendation template) {
        return ProjectCategoryRecommendationBuilder.of(template);
    }

    default <T> T withProjectCategoryRecommendation(Function<ProjectCategoryRecommendation, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendation>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendation>";
            }
        };
    }
}
