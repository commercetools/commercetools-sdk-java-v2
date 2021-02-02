
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
public final class ProjectCategoryRecommendationMetaImpl implements ProjectCategoryRecommendationMeta {

    private String productName;

    private String productImageUrl;

    private java.util.List<String> generalCategoryNames;

    @JsonCreator
    ProjectCategoryRecommendationMetaImpl(@JsonProperty("productName") final String productName,
            @JsonProperty("productImageUrl") final String productImageUrl,
            @JsonProperty("generalCategoryNames") final java.util.List<String> generalCategoryNames) {
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.generalCategoryNames = generalCategoryNames;
    }

    public ProjectCategoryRecommendationMetaImpl() {
    }

    /**
    *  <p>The product name that was used to generate recommendations.</p>
    */
    public String getProductName() {
        return this.productName;
    }

    /**
    *  <p>The product image that was used to generate recommendations.</p>
    */
    public String getProductImageUrl() {
        return this.productImageUrl;
    }

    /**
    *  <p>Top 5 general categories that were used internally to generate the project-specific categories. These category names are not related to the categories defined in the project, but they provide additional information to understand the project-specific categories in the results section.</p>
    */
    public java.util.List<String> getGeneralCategoryNames() {
        return this.generalCategoryNames;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public void setProductImageUrl(final String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public void setGeneralCategoryNames(final String... generalCategoryNames) {
        this.generalCategoryNames = new ArrayList<>(Arrays.asList(generalCategoryNames));
    }

    public void setGeneralCategoryNames(final java.util.List<String> generalCategoryNames) {
        this.generalCategoryNames = generalCategoryNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectCategoryRecommendationMetaImpl that = (ProjectCategoryRecommendationMetaImpl) o;

        return new EqualsBuilder().append(productName, that.productName).append(productImageUrl,
            that.productImageUrl).append(generalCategoryNames, that.generalCategoryNames).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productName).append(productImageUrl).append(
            generalCategoryNames).toHashCode();
    }

}
