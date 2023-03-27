
package com.commercetools.ml.models.general_category_recommendations;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralCategoryRecommendation
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralCategoryRecommendation generalCategoryRecommendation = GeneralCategoryRecommendation.builder()
 *             .categoryName("{categoryName}")
 *             .confidence(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeneralCategoryRecommendationImpl.class)
public interface GeneralCategoryRecommendation {

    /**
     *  <p>An English category name that is recommended for a product.</p>
     * @return categoryName
     */
    @NotNull
    @JsonProperty("categoryName")
    public String getCategoryName();

    /**
     *  <p>Probability score for the category recommendation.</p>
     * @return confidence
     */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();

    /**
     *  <p>An English category name that is recommended for a product.</p>
     * @param categoryName value to be set
     */

    public void setCategoryName(final String categoryName);

    /**
     *  <p>Probability score for the category recommendation.</p>
     * @param confidence value to be set
     */

    public void setConfidence(final Double confidence);

    /**
     * factory method
     * @return instance of GeneralCategoryRecommendation
     */
    public static GeneralCategoryRecommendation of() {
        return new GeneralCategoryRecommendationImpl();
    }

    /**
     * factory method to copy an instance of GeneralCategoryRecommendation
     * @param template instance to be copied
     * @return copy instance
     */
    public static GeneralCategoryRecommendation of(final GeneralCategoryRecommendation template) {
        GeneralCategoryRecommendationImpl instance = new GeneralCategoryRecommendationImpl();
        instance.setCategoryName(template.getCategoryName());
        instance.setConfidence(template.getConfidence());
        return instance;
    }

    /**
     * builder factory method for GeneralCategoryRecommendation
     * @return builder
     */
    public static GeneralCategoryRecommendationBuilder builder() {
        return GeneralCategoryRecommendationBuilder.of();
    }

    /**
     * create builder for GeneralCategoryRecommendation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralCategoryRecommendationBuilder builder(final GeneralCategoryRecommendation template) {
        return GeneralCategoryRecommendationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeneralCategoryRecommendation(Function<GeneralCategoryRecommendation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeneralCategoryRecommendation>() {
            @Override
            public String toString() {
                return "TypeReference<GeneralCategoryRecommendation>";
            }
        };
    }
}
