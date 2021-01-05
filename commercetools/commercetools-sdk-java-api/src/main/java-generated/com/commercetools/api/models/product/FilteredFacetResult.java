package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.FilteredFacetResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = FilteredFacetResultImpl.class)
public interface FilteredFacetResult extends FacetResult {

    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    
    @JsonProperty("productCount")
    public Long getProductCount();

    public void setCount(final Long count);
    
    public void setProductCount(final Long productCount);

    public static FilteredFacetResult of(){
        return new FilteredFacetResultImpl();
    }
    

    public static FilteredFacetResult of(final FilteredFacetResult template) {
        FilteredFacetResultImpl instance = new FilteredFacetResultImpl();
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public static FilteredFacetResultBuilder builder(){
        return FilteredFacetResultBuilder.of();
    }
    
    public static FilteredFacetResultBuilder builder(final FilteredFacetResult template){
        return FilteredFacetResultBuilder.of(template);
    }
    

    default <T> T withFilteredFacetResult(Function<FilteredFacetResult, T> helper) {
        return helper.apply(this);
    }
}
