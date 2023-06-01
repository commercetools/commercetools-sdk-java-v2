package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Add To Category update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductAddedToCategoryMessagePayloadImpl implements ProductAddedToCategoryMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.category.CategoryReference category;
    
    
    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductAddedToCategoryMessagePayloadImpl(@JsonProperty("category") final com.commercetools.api.models.category.CategoryReference category, @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.type =  PRODUCT_ADDED_TO_CATEGORY;
    }
    /**
     * create empty instance
     */
    public ProductAddedToCategoryMessagePayloadImpl() {
        this.type =  PRODUCT_ADDED_TO_CATEGORY;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Category the Product was added to.</p>
     */
    
    public com.commercetools.api.models.category.CategoryReference getCategory(){
        return this.category;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */
    
    public Boolean getStaged(){
        return this.staged;
    }

    
    public void setCategory(final com.commercetools.api.models.category.CategoryReference category){
        this.category = category;
    }
    
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductAddedToCategoryMessagePayloadImpl that = (ProductAddedToCategoryMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(category, that.category)
                .append(staged, that.staged)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(category)
            .append(staged)
            .toHashCode();
    }

}
