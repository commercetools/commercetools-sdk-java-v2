package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResults;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductProjectionPagedSearchResponseBuilder {

    
    private Long count;
    
    @Nullable
    private Long total;
    
    
    private Long offset;
    
    
    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;
    
    
    private com.commercetools.api.models.product.FacetResults facets;

    public ProductProjectionPagedSearchResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    public ProductProjectionPagedSearchResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }
    
    public ProductProjectionPagedSearchResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    public ProductProjectionPagedSearchResponseBuilder results( final com.commercetools.api.models.product.ProductProjection ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    public ProductProjectionPagedSearchResponseBuilder results( final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
        return this;
    }
    
    public ProductProjectionPagedSearchResponseBuilder facets( final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
        return this;
    }

    
    public Long getCount(){
        return this.count;
    }
    
    @Nullable
    public Long getTotal(){
        return this.total;
    }
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults(){
        return this.results;
    }
    
    
    public com.commercetools.api.models.product.FacetResults getFacets(){
        return this.facets;
    }

    public ProductProjectionPagedSearchResponse build() {
        return new ProductProjectionPagedSearchResponseImpl(count, total, offset, results, facets);
    }

    public static ProductProjectionPagedSearchResponseBuilder of() {
        return new ProductProjectionPagedSearchResponseBuilder();
    }

    public static ProductProjectionPagedSearchResponseBuilder of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseBuilder builder = new ProductProjectionPagedSearchResponseBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.facets = template.getFacets();
        return builder;
    }

}
