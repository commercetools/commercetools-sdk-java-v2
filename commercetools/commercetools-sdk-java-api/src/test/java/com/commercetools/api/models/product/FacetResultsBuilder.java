package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FacetResultsBuilder {

    
    
    private Map<String, com.commercetools.api.models.product.FacetResult> values;

    
    public FacetResultsBuilder values( final Map<String, com.commercetools.api.models.product.FacetResult> values){
        this.values = values;
        return this;
    }
    
    
    public FacetResultsBuilder addValue(final String key, final com.commercetools.api.models.product.FacetResult value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    
    
    public Map<String, com.commercetools.api.models.product.FacetResult> getValues(){
        return this.values;
    }

    public FacetResults build() {
        return new FacetResultsImpl(values);
    }

    public static FacetResultsBuilder of() {
        return new FacetResultsBuilder();
    }

    public static FacetResultsBuilder of(final FacetResults template) {
        FacetResultsBuilder builder = new FacetResultsBuilder();
        builder.values = template.values();
        return builder;
    }

}
