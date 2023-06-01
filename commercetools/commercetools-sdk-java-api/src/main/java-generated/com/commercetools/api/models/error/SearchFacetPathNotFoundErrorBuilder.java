package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.SearchFacetPathNotFoundError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchFacetPathNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchFacetPathNotFoundError searchFacetPathNotFoundError = SearchFacetPathNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SearchFacetPathNotFoundErrorBuilder implements Builder<SearchFacetPathNotFoundError> {

    
    
    private String message;
    
    
    
    private Map<String, java.lang.Object> values = new HashMap<>();

    
    /**
     *  <p><code>"Facet path $path not found."</code></p>
     * @param message value to be set
     * @return Builder
     */
    
    public SearchFacetPathNotFoundErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public SearchFacetPathNotFoundErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public SearchFacetPathNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    

    /**
     *  <p><code>"Facet path $path not found."</code></p>
     * @return message
     */
    
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }

    /**
     * builds SearchFacetPathNotFoundError with checking for non-null required values
     * @return SearchFacetPathNotFoundError
     */
    public SearchFacetPathNotFoundError build() {
        Objects.requireNonNull(message, SearchFacetPathNotFoundError.class + ": message is missing");
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }
    
    /**
     * builds SearchFacetPathNotFoundError without checking for non-null required values
     * @return SearchFacetPathNotFoundError
     */
    public SearchFacetPathNotFoundError buildUnchecked() {
        return new SearchFacetPathNotFoundErrorImpl(message, values);
    }

    /**
     * factory method for an instance of SearchFacetPathNotFoundErrorBuilder
     * @return builder 
     */
    public static SearchFacetPathNotFoundErrorBuilder of() {
        return new SearchFacetPathNotFoundErrorBuilder();
    }

    /**
     * create builder for SearchFacetPathNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchFacetPathNotFoundErrorBuilder of(final SearchFacetPathNotFoundError template) {
        SearchFacetPathNotFoundErrorBuilder builder = new SearchFacetPathNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
