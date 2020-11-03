package com.commercetools.api.models.common;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.product.FacetResults;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.common.PagedQueryResponseImpl;

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
@JsonDeserialize(as = PagedQueryResponseImpl.class)
public interface PagedQueryResponse  {

    
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    
    @JsonProperty("total")
    public Long getTotal();
    
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<BaseResource> getResults();
    
    @Valid
    @JsonProperty("facets")
    public FacetResults getFacets();
    
    @Valid
    @JsonProperty("meta")
    public JsonNode getMeta();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    @JsonIgnore
    public void setResults(final BaseResource ...results);
    public void setResults(final List<BaseResource> results);
    
    public void setFacets(final FacetResults facets);
    
    public void setMeta(final JsonNode meta);

    public static PagedQueryResponseImpl of(){
        return new PagedQueryResponseImpl();
    }
    

    public static PagedQueryResponseImpl of(final PagedQueryResponse template) {
        PagedQueryResponseImpl instance = new PagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setFacets(template.getFacets());
        instance.setMeta(template.getMeta());
        return instance;
    }

    default <T> T withPagedQueryResponse(Function<PagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
