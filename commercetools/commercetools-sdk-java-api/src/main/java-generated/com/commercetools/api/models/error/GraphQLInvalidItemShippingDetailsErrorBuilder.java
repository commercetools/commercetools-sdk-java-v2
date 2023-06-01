package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLInvalidItemShippingDetailsError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidItemShippingDetailsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidItemShippingDetailsError graphQLInvalidItemShippingDetailsError = GraphQLInvalidItemShippingDetailsError.builder()
 *             .subject("{subject}")
 *             .itemId("{itemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLInvalidItemShippingDetailsErrorBuilder implements Builder<GraphQLInvalidItemShippingDetailsError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private String subject;
    
    
    
    private String itemId;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLInvalidItemShippingDetailsErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLInvalidItemShippingDetailsErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @param subject value to be set
     * @return Builder
     */
    
    public GraphQLInvalidItemShippingDetailsErrorBuilder subject( final String subject) {
        this.subject = subject;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @param itemId value to be set
     * @return Builder
     */
    
    public GraphQLInvalidItemShippingDetailsErrorBuilder itemId( final String itemId) {
        this.itemId = itemId;
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
     *  <p><code>"LineItem"</code> or <code>"CustomLineItem"</code></p>
     * @return subject
     */
    
    
    public String getSubject(){
        return this.subject;
    }
    
    /**
     *  <p>Unique identifier of the Line Item or Custom Line Item.</p>
     * @return itemId
     */
    
    
    public String getItemId(){
        return this.itemId;
    }

    /**
     * builds GraphQLInvalidItemShippingDetailsError with checking for non-null required values
     * @return GraphQLInvalidItemShippingDetailsError
     */
    public GraphQLInvalidItemShippingDetailsError build() {
        Objects.requireNonNull(subject, GraphQLInvalidItemShippingDetailsError.class + ": subject is missing");
        Objects.requireNonNull(itemId, GraphQLInvalidItemShippingDetailsError.class + ": itemId is missing");
        return new GraphQLInvalidItemShippingDetailsErrorImpl(values, subject, itemId);
    }
    
    /**
     * builds GraphQLInvalidItemShippingDetailsError without checking for non-null required values
     * @return GraphQLInvalidItemShippingDetailsError
     */
    public GraphQLInvalidItemShippingDetailsError buildUnchecked() {
        return new GraphQLInvalidItemShippingDetailsErrorImpl(values, subject, itemId);
    }

    /**
     * factory method for an instance of GraphQLInvalidItemShippingDetailsErrorBuilder
     * @return builder 
     */
    public static GraphQLInvalidItemShippingDetailsErrorBuilder of() {
        return new GraphQLInvalidItemShippingDetailsErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidItemShippingDetailsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidItemShippingDetailsErrorBuilder of(final GraphQLInvalidItemShippingDetailsError template) {
        GraphQLInvalidItemShippingDetailsErrorBuilder builder = new GraphQLInvalidItemShippingDetailsErrorBuilder();
        builder.values = template.values();
        builder.subject = template.getSubject();
        builder.itemId = template.getItemId();
        return builder;
    }

}
