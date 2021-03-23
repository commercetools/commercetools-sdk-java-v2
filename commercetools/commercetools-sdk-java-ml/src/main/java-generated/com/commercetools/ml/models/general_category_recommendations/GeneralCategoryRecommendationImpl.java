
package com.commercetools.ml.models.general_category_recommendations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralCategoryRecommendationImpl implements GeneralCategoryRecommendation {

    private String categoryName;

    private Double confidence;

    @JsonCreator
    GeneralCategoryRecommendationImpl(@JsonProperty("categoryName") final String categoryName,
            @JsonProperty("confidence") final Double confidence) {
        this.categoryName = categoryName;
        this.confidence = confidence;
    }

    public GeneralCategoryRecommendationImpl() {
    }

    /**
    *  <p>An English category name that is recommended for a product.</p>
    */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
    *  <p>Probability score for the category recommendation.</p>
    */
    public Double getConfidence() {
        return this.confidence;
    }

    public void setCategoryName(final String categoryName) {
        this.categoryName = categoryName;
    }

    public void setConfidence(final Double confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GeneralCategoryRecommendationImpl that = (GeneralCategoryRecommendationImpl) o;

        return new EqualsBuilder().append(categoryName, that.categoryName)
                .append(confidence, that.confidence)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(categoryName).append(confidence).toHashCode();
    }

}
