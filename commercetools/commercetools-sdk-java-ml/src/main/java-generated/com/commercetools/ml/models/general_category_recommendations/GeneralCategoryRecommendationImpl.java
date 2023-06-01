package com.commercetools.ml.models.general_category_recommendations;


import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * GeneralCategoryRecommendation
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeneralCategoryRecommendationImpl implements GeneralCategoryRecommendation, ModelBase {

    
    private String categoryName;
    
    
    private Double confidence;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GeneralCategoryRecommendationImpl(@JsonProperty("categoryName") final String categoryName, @JsonProperty("confidence") final Double confidence) {
        this.categoryName = categoryName;
        this.confidence = confidence;
    }
    /**
     * create empty instance
     */
    public GeneralCategoryRecommendationImpl() {
    }

    /**
     *  <p>An English category name that is recommended for a product.</p>
     */
    
    public String getCategoryName(){
        return this.categoryName;
    }
    
    /**
     *  <p>Probability score for the category recommendation.</p>
     */
    
    public Double getConfidence(){
        return this.confidence;
    }

    
    public void setCategoryName(final String categoryName){
        this.categoryName = categoryName;
    }
    
    
    public void setConfidence(final Double confidence){
        this.confidence = confidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GeneralCategoryRecommendationImpl that = (GeneralCategoryRecommendationImpl) o;
    
        return new EqualsBuilder()
                .append(categoryName, that.categoryName)
                .append(confidence, that.confidence)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(categoryName)
            .append(confidence)
            .toHashCode();
    }

}
