package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLEnumKeyDoesNotExistErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumKeyDoesNotExistError graphQLEnumKeyDoesNotExistError = GraphQLEnumKeyDoesNotExistError.builder()
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLEnumKeyDoesNotExistErrorBuilder implements Builder<GraphQLEnumKeyDoesNotExistError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String conflictingEnumKey;
    
    
    
    private String conflictingAttributeName;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLEnumKeyDoesNotExistErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLEnumKeyDoesNotExistErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     * @return Builder
     */
    
    public GraphQLEnumKeyDoesNotExistErrorBuilder conflictingEnumKey( final String conflictingEnumKey) {
        this.conflictingEnumKey = conflictingEnumKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */
    
    public GraphQLEnumKeyDoesNotExistErrorBuilder conflictingAttributeName( final String conflictingAttributeName) {
        this.conflictingAttributeName = conflictingAttributeName;
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
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */
    
    
    public String getConflictingEnumKey(){
        return this.conflictingEnumKey;
    }
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    /**
     * builds GraphQLEnumKeyDoesNotExistError with checking for non-null required values
     * @return GraphQLEnumKeyDoesNotExistError
     */
    public GraphQLEnumKeyDoesNotExistError build() {
        Objects.requireNonNull(conflictingEnumKey, GraphQLEnumKeyDoesNotExistError.class + ": conflictingEnumKey is missing");
        Objects.requireNonNull(conflictingAttributeName, GraphQLEnumKeyDoesNotExistError.class + ": conflictingAttributeName is missing");
        return new GraphQLEnumKeyDoesNotExistErrorImpl(values, conflictingEnumKey, conflictingAttributeName);
    }
    
    /**
     * builds GraphQLEnumKeyDoesNotExistError without checking for non-null required values
     * @return GraphQLEnumKeyDoesNotExistError
     */
    public GraphQLEnumKeyDoesNotExistError buildUnchecked() {
        return new GraphQLEnumKeyDoesNotExistErrorImpl(values, conflictingEnumKey, conflictingAttributeName);
    }

    /**
     * factory method for an instance of GraphQLEnumKeyDoesNotExistErrorBuilder
     * @return builder 
     */
    public static GraphQLEnumKeyDoesNotExistErrorBuilder of() {
        return new GraphQLEnumKeyDoesNotExistErrorBuilder();
    }

    /**
     * create builder for GraphQLEnumKeyDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumKeyDoesNotExistErrorBuilder of(final GraphQLEnumKeyDoesNotExistError template) {
        GraphQLEnumKeyDoesNotExistErrorBuilder builder = new GraphQLEnumKeyDoesNotExistErrorBuilder();
        builder.values = template.values();
        builder.conflictingEnumKey = template.getConflictingEnumKey();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
