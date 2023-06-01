package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResults;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FacetResultsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FacetResults facetResults = FacetResults.builder()
 *             ./^[a-z].*$/(/^[a-z].*$/Builder -> /^[a-z].*$/Builder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FacetResultsBuilder implements Builder<FacetResults> {

    
    
    private Map<String, com.commercetools.api.models.product.FacetResult> values = new HashMap<>();

    /**
     * assign pattern properties to the builder
     * @param values properties to be set
     * @return Builder
     */
    
    public FacetResultsBuilder values( final Map<String, com.commercetools.api.models.product.FacetResult> values){
        this.values = values;
        return this;
    }
    
    /**
     * assign a pattern property to the builder
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public FacetResultsBuilder addValue(final String key, final com.commercetools.api.models.product.FacetResult value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     * values of pattern properties
     * @return pattern properties
     */
    
    
    public Map<String, com.commercetools.api.models.product.FacetResult> getValues(){
        return this.values;
    }

    /**
     * builds FacetResults with checking for non-null required values
     * @return FacetResults
     */
    public FacetResults build() {
        return new FacetResultsImpl(values);
    }
    
    /**
     * builds FacetResults without checking for non-null required values
     * @return FacetResults
     */
    public FacetResults buildUnchecked() {
        return new FacetResultsImpl(values);
    }

    /**
     * factory method for an instance of FacetResultsBuilder
     * @return builder 
     */
    public static FacetResultsBuilder of() {
        return new FacetResultsBuilder();
    }

    /**
     * create builder for FacetResults instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FacetResultsBuilder of(final FacetResults template) {
        FacetResultsBuilder builder = new FacetResultsBuilder();
        builder.values = template.values();
        return builder;
    }

}
