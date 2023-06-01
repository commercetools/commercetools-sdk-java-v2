package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAttributeNameDoesNotExistError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAttributeNameDoesNotExistErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAttributeNameDoesNotExistError graphQLAttributeNameDoesNotExistError = GraphQLAttributeNameDoesNotExistError.builder()
 *             .invalidAttributeName("{invalidAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLAttributeNameDoesNotExistErrorBuilder implements Builder<GraphQLAttributeNameDoesNotExistError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String invalidAttributeName;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLAttributeNameDoesNotExistErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLAttributeNameDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Non-existent Attribute name.</p>
     * @param invalidAttributeName value to be set
     * @return Builder
     */
    
    public GraphQLAttributeNameDoesNotExistErrorBuilder invalidAttributeName( final String invalidAttributeName) {
        this.invalidAttributeName = invalidAttributeName;
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
     *  <p>Non-existent Attribute name.</p>
     * @return invalidAttributeName
     */
    
    
    public String getInvalidAttributeName(){
        return this.invalidAttributeName;
    }

    /**
     * builds GraphQLAttributeNameDoesNotExistError with checking for non-null required values
     * @return GraphQLAttributeNameDoesNotExistError
     */
    public GraphQLAttributeNameDoesNotExistError build() {
        Objects.requireNonNull(invalidAttributeName, GraphQLAttributeNameDoesNotExistError.class + ": invalidAttributeName is missing");
        return new GraphQLAttributeNameDoesNotExistErrorImpl(values, invalidAttributeName);
    }
    
    /**
     * builds GraphQLAttributeNameDoesNotExistError without checking for non-null required values
     * @return GraphQLAttributeNameDoesNotExistError
     */
    public GraphQLAttributeNameDoesNotExistError buildUnchecked() {
        return new GraphQLAttributeNameDoesNotExistErrorImpl(values, invalidAttributeName);
    }

    /**
     * factory method for an instance of GraphQLAttributeNameDoesNotExistErrorBuilder
     * @return builder 
     */
    public static GraphQLAttributeNameDoesNotExistErrorBuilder of() {
        return new GraphQLAttributeNameDoesNotExistErrorBuilder();
    }

    /**
     * create builder for GraphQLAttributeNameDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAttributeNameDoesNotExistErrorBuilder of(final GraphQLAttributeNameDoesNotExistError template) {
        GraphQLAttributeNameDoesNotExistErrorBuilder builder = new GraphQLAttributeNameDoesNotExistErrorBuilder();
        builder.values = template.values();
        builder.invalidAttributeName = template.getInvalidAttributeName();
        return builder;
    }

}
