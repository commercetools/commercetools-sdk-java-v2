package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetTypes;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FilteredFacetResultImpl implements FilteredFacetResult {

    private com.commercetools.api.models.product.FacetTypes type;
    
    private Long count;
    
    private Long productCount;

    @JsonCreator
    FilteredFacetResultImpl(@JsonProperty("count") final Long count, @JsonProperty("productCount") final Long productCount) {
        this.count = count;
        this.productCount = productCount;
        this.type = FacetTypes.findEnum("filter");
    }
    public FilteredFacetResultImpl() {
       
    }

    
    public com.commercetools.api.models.product.FacetTypes getType(){
        return this.type;
    }
    
    
    public Long getCount(){
        return this.count;
    }
    
    
    public Long getProductCount(){
        return this.productCount;
    }

    public void setCount(final Long count){
        this.count = count;
    }
    
    public void setProductCount(final Long productCount){
        this.productCount = productCount;
    }

}
