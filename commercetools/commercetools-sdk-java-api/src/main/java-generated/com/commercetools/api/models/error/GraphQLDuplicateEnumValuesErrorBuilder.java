package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLDuplicateEnumValuesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateEnumValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateEnumValuesError graphQLDuplicateEnumValuesError = GraphQLDuplicateEnumValuesError.builder()
 *             .plusDuplicates(duplicatesBuilder -> duplicatesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicateEnumValuesErrorBuilder implements Builder<GraphQLDuplicateEnumValuesError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private java.util.List<String> duplicates;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLDuplicateEnumValuesErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLDuplicateEnumValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateEnumValuesErrorBuilder duplicates( final String ...duplicates) {
        this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
        return this;
    }
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateEnumValuesErrorBuilder duplicates( final java.util.List<String> duplicates) {
        this.duplicates = duplicates;
        return this;
    }
    
    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateEnumValuesErrorBuilder plusDuplicates( final String ...duplicates) {
        if (this.duplicates == null) {
            this.duplicates = new ArrayList<>();
        }
        this.duplicates.addAll(Arrays.asList(duplicates));
        return this;
    }
    
    
    

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */
    
    
    public Map<String, java.lang.Object> getValues(){
        return this.values;
    }
    
    /**
     *  <p>Duplicate keys.</p>
     * @return duplicates
     */
    
    
    public java.util.List<String> getDuplicates(){
        return this.duplicates;
    }

    /**
     * builds GraphQLDuplicateEnumValuesError with checking for non-null required values
     * @return GraphQLDuplicateEnumValuesError
     */
    public GraphQLDuplicateEnumValuesError build() {
        Objects.requireNonNull(duplicates, GraphQLDuplicateEnumValuesError.class + ": duplicates is missing");
        return new GraphQLDuplicateEnumValuesErrorImpl(values, duplicates);
    }
    
    /**
     * builds GraphQLDuplicateEnumValuesError without checking for non-null required values
     * @return GraphQLDuplicateEnumValuesError
     */
    public GraphQLDuplicateEnumValuesError buildUnchecked() {
        return new GraphQLDuplicateEnumValuesErrorImpl(values, duplicates);
    }

    /**
     * factory method for an instance of GraphQLDuplicateEnumValuesErrorBuilder
     * @return builder 
     */
    public static GraphQLDuplicateEnumValuesErrorBuilder of() {
        return new GraphQLDuplicateEnumValuesErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateEnumValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateEnumValuesErrorBuilder of(final GraphQLDuplicateEnumValuesError template) {
        GraphQLDuplicateEnumValuesErrorBuilder builder = new GraphQLDuplicateEnumValuesErrorBuilder();
        builder.values = template.values();
        builder.duplicates = template.getDuplicates();
        return builder;
    }

}
