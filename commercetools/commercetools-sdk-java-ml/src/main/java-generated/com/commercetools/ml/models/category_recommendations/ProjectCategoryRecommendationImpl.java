
package com.commercetools.ml.models.category_recommendations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectCategoryRecommendationImpl implements ProjectCategoryRecommendation {

    private com.commercetools.ml.models.common.CategoryReference category;

    private Double confidence;

    private String path;

    @JsonCreator
    ProjectCategoryRecommendationImpl(
            @JsonProperty("category") final com.commercetools.ml.models.common.CategoryReference category,
            @JsonProperty("confidence") final Double confidence, @JsonProperty("path") final String path) {
        this.category = category;
        this.confidence = confidence;
        this.path = path;
    }

    public ProjectCategoryRecommendationImpl() {
    }

    /**
    *  <p>A category that is recommended for a product.</p>
    */
    public com.commercetools.ml.models.common.CategoryReference getCategory() {
        return this.category;
    }

    /**
    *  <p>Probability score for the category recommendation.</p>
    */
    public Double getConfidence() {
        return this.confidence;
    }

    /**
    *  <p>Breadcrumb path to the recommended category. This only picks up one language, not all available languages for the category. English is prioritized, but if English data is not available, an arbitrary language is selected. Do not use this to identify a category,use the category ID from the category reference instead.</p>
    */
    public String getPath() {
        return this.path;
    }

    public void setCategory(final com.commercetools.ml.models.common.CategoryReference category) {
        this.category = category;
    }

    public void setConfidence(final Double confidence) {
        this.confidence = confidence;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectCategoryRecommendationImpl that = (ProjectCategoryRecommendationImpl) o;

        return new EqualsBuilder().append(category, that.category).append(confidence, that.confidence).append(path,
            that.path).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(category).append(confidence).append(path).toHashCode();
    }

}
