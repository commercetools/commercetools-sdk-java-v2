
package com.commercetools.ml.models.category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectCategoryRecommendationMetaImpl.class)
public interface ProjectCategoryRecommendationMeta {

    /**
    *  <p>The product name that was used to generate recommendations.</p>
    */

    @JsonProperty("productName")
    public String getProductName();

    /**
    *  <p>The product image that was used to generate recommendations.</p>
    */

    @JsonProperty("productImageUrl")
    public String getProductImageUrl();

    /**
    *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
    */
    @NotNull
    @JsonProperty("generalCategoryNames")
    public List<String> getGeneralCategoryNames();

    public void setProductName(final String productName);

    public void setProductImageUrl(final String productImageUrl);

    @JsonIgnore
    public void setGeneralCategoryNames(final String... generalCategoryNames);

    public void setGeneralCategoryNames(final List<String> generalCategoryNames);

    public static ProjectCategoryRecommendationMeta of() {
        return new ProjectCategoryRecommendationMetaImpl();
    }

    public static ProjectCategoryRecommendationMeta of(final ProjectCategoryRecommendationMeta template) {
        ProjectCategoryRecommendationMetaImpl instance = new ProjectCategoryRecommendationMetaImpl();
        instance.setProductName(template.getProductName());
        instance.setProductImageUrl(template.getProductImageUrl());
        instance.setGeneralCategoryNames(template.getGeneralCategoryNames());
        return instance;
    }

    public static ProjectCategoryRecommendationMetaBuilder builder() {
        return ProjectCategoryRecommendationMetaBuilder.of();
    }

    public static ProjectCategoryRecommendationMetaBuilder builder(final ProjectCategoryRecommendationMeta template) {
        return ProjectCategoryRecommendationMetaBuilder.of(template);
    }

    default <T> T withProjectCategoryRecommendationMeta(Function<ProjectCategoryRecommendationMeta, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationMeta> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectCategoryRecommendationMeta>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectCategoryRecommendationMeta>";
            }
        };
    }
}
