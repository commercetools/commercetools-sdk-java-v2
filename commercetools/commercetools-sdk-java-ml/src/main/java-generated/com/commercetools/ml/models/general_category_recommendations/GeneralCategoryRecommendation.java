
package com.commercetools.ml.models.general_category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GeneralCategoryRecommendationImpl.class)
public interface GeneralCategoryRecommendation {

    /**
    *  <p>An English category name that is recommended for a product.</p>
    */
    @NotNull
    @JsonProperty("categoryName")
    public String getCategoryName();

    /**
    *  <p>Probability score for the category recommendation.</p>
    */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();

    public void setCategoryName(final String categoryName);

    public void setConfidence(final Double confidence);

    public static GeneralCategoryRecommendation of() {
        return new GeneralCategoryRecommendationImpl();
    }

    public static GeneralCategoryRecommendation of(final GeneralCategoryRecommendation template) {
        GeneralCategoryRecommendationImpl instance = new GeneralCategoryRecommendationImpl();
        instance.setCategoryName(template.getCategoryName());
        instance.setConfidence(template.getConfidence());
        return instance;
    }

    public static GeneralCategoryRecommendationBuilder builder() {
        return GeneralCategoryRecommendationBuilder.of();
    }

    public static GeneralCategoryRecommendationBuilder builder(final GeneralCategoryRecommendation template) {
        return GeneralCategoryRecommendationBuilder.of(template);
    }

    default <T> T withGeneralCategoryRecommendation(Function<GeneralCategoryRecommendation, T> helper) {
        return helper.apply(this);
    }
}
