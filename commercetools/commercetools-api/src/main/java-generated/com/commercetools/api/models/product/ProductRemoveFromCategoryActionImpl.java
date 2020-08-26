package com.commercetools.api.models.product;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRemoveFromCategoryActionImpl implements ProductRemoveFromCategoryAction {

    private String action;
    
    private com.commercetools.api.models.category.CategoryResourceIdentifier category;
    
    private Boolean staged;

    @JsonCreator
    ProductRemoveFromCategoryActionImpl(@JsonProperty("category") final com.commercetools.api.models.category.CategoryResourceIdentifier category, @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.action = "removeFromCategory";
    }
    public ProductRemoveFromCategoryActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory(){
        return this.category;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setCategory(final com.commercetools.api.models.category.CategoryResourceIdentifier category){
        this.category = category;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
