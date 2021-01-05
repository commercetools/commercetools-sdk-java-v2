package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.FacetResultTermImpl;

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
@JsonDeserialize(as = FacetResultTermImpl.class)
public interface FacetResultTerm  {

    
    @NotNull
    @JsonProperty("term")
    public JsonNode getTerm();
    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    
    @JsonProperty("productCount")
    public Long getProductCount();

    public void setTerm(final JsonNode term);
    
    public void setCount(final Long count);
    
    public void setProductCount(final Long productCount);

    public static FacetResultTerm of(){
        return new FacetResultTermImpl();
    }
    

    public static FacetResultTerm of(final FacetResultTerm template) {
        FacetResultTermImpl instance = new FacetResultTermImpl();
        instance.setTerm(template.getTerm());
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public static FacetResultTermBuilder builder(){
        return FacetResultTermBuilder.of();
    }
    
    public static FacetResultTermBuilder builder(final FacetResultTerm template){
        return FacetResultTermBuilder.of(template);
    }
    

    default <T> T withFacetResultTerm(Function<FacetResultTerm, T> helper) {
        return helper.apply(this);
    }
}
