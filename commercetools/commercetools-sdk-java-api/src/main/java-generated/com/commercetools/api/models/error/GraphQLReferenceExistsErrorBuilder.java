package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLReferenceExistsError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLReferenceExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLReferenceExistsError graphQLReferenceExistsError = GraphQLReferenceExistsError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLReferenceExistsErrorBuilder implements Builder<GraphQLReferenceExistsError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    @Nullable
    private com.commercetools.api.models.common.ReferenceTypeId referencedBy;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLReferenceExistsErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLReferenceExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Type of referenced resource.</p>
     * @param referencedBy value to be set
     * @return Builder
     */
    
    public GraphQLReferenceExistsErrorBuilder referencedBy(@Nullable final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.referencedBy = referencedBy;
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
     *  <p>Type of referenced resource.</p>
     * @return referencedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.ReferenceTypeId getReferencedBy(){
        return this.referencedBy;
    }

    /**
     * builds GraphQLReferenceExistsError with checking for non-null required values
     * @return GraphQLReferenceExistsError
     */
    public GraphQLReferenceExistsError build() {
        return new GraphQLReferenceExistsErrorImpl(values, referencedBy);
    }
    
    /**
     * builds GraphQLReferenceExistsError without checking for non-null required values
     * @return GraphQLReferenceExistsError
     */
    public GraphQLReferenceExistsError buildUnchecked() {
        return new GraphQLReferenceExistsErrorImpl(values, referencedBy);
    }

    /**
     * factory method for an instance of GraphQLReferenceExistsErrorBuilder
     * @return builder 
     */
    public static GraphQLReferenceExistsErrorBuilder of() {
        return new GraphQLReferenceExistsErrorBuilder();
    }

    /**
     * create builder for GraphQLReferenceExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLReferenceExistsErrorBuilder of(final GraphQLReferenceExistsError template) {
        GraphQLReferenceExistsErrorBuilder builder = new GraphQLReferenceExistsErrorBuilder();
        builder.values = template.values();
        builder.referencedBy = template.getReferencedBy();
        return builder;
    }

}
