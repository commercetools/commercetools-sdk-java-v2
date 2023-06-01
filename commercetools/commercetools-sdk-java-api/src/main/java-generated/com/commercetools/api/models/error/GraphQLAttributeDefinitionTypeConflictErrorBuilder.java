package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLAttributeDefinitionTypeConflictError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAttributeDefinitionTypeConflictErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAttributeDefinitionTypeConflictError graphQLAttributeDefinitionTypeConflictError = GraphQLAttributeDefinitionTypeConflictError.builder()
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLAttributeDefinitionTypeConflictErrorBuilder implements Builder<GraphQLAttributeDefinitionTypeConflictError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String conflictingProductTypeId;
    
    
    
    private String conflictingProductTypeName;
    
    
    
    private String conflictingAttributeName;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLAttributeDefinitionTypeConflictErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLAttributeDefinitionTypeConflictErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeId value to be set
     * @return Builder
     */
    
    public GraphQLAttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeId( final String conflictingProductTypeId) {
        this.conflictingProductTypeId = conflictingProductTypeId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeName value to be set
     * @return Builder
     */
    
    public GraphQLAttributeDefinitionTypeConflictErrorBuilder conflictingProductTypeName( final String conflictingProductTypeName) {
        this.conflictingProductTypeName = conflictingProductTypeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     * @return Builder
     */
    
    public GraphQLAttributeDefinitionTypeConflictErrorBuilder conflictingAttributeName( final String conflictingAttributeName) {
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
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeId
     */
    
    
    public String getConflictingProductTypeId(){
        return this.conflictingProductTypeId;
    }
    
    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeName
     */
    
    
    public String getConflictingProductTypeName(){
        return this.conflictingProductTypeName;
    }
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    
    
    public String getConflictingAttributeName(){
        return this.conflictingAttributeName;
    }

    /**
     * builds GraphQLAttributeDefinitionTypeConflictError with checking for non-null required values
     * @return GraphQLAttributeDefinitionTypeConflictError
     */
    public GraphQLAttributeDefinitionTypeConflictError build() {
        Objects.requireNonNull(conflictingProductTypeId, GraphQLAttributeDefinitionTypeConflictError.class + ": conflictingProductTypeId is missing");
        Objects.requireNonNull(conflictingProductTypeName, GraphQLAttributeDefinitionTypeConflictError.class + ": conflictingProductTypeName is missing");
        Objects.requireNonNull(conflictingAttributeName, GraphQLAttributeDefinitionTypeConflictError.class + ": conflictingAttributeName is missing");
        return new GraphQLAttributeDefinitionTypeConflictErrorImpl(values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }
    
    /**
     * builds GraphQLAttributeDefinitionTypeConflictError without checking for non-null required values
     * @return GraphQLAttributeDefinitionTypeConflictError
     */
    public GraphQLAttributeDefinitionTypeConflictError buildUnchecked() {
        return new GraphQLAttributeDefinitionTypeConflictErrorImpl(values, conflictingProductTypeId, conflictingProductTypeName, conflictingAttributeName);
    }

    /**
     * factory method for an instance of GraphQLAttributeDefinitionTypeConflictErrorBuilder
     * @return builder 
     */
    public static GraphQLAttributeDefinitionTypeConflictErrorBuilder of() {
        return new GraphQLAttributeDefinitionTypeConflictErrorBuilder();
    }

    /**
     * create builder for GraphQLAttributeDefinitionTypeConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAttributeDefinitionTypeConflictErrorBuilder of(final GraphQLAttributeDefinitionTypeConflictError template) {
        GraphQLAttributeDefinitionTypeConflictErrorBuilder builder = new GraphQLAttributeDefinitionTypeConflictErrorBuilder();
        builder.values = template.values();
        builder.conflictingProductTypeId = template.getConflictingProductTypeId();
        builder.conflictingProductTypeName = template.getConflictingProductTypeName();
        builder.conflictingAttributeName = template.getConflictingAttributeName();
        return builder;
    }

}
