package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLDuplicatePriceKeyError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicatePriceKeyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicatePriceKeyError graphQLDuplicatePriceKeyError = GraphQLDuplicatePriceKeyError.builder()
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicatePriceKeyErrorBuilder implements Builder<GraphQLDuplicatePriceKeyError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLDuplicatePriceKeyErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLDuplicatePriceKeyErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */
    
    public GraphQLDuplicatePriceKeyErrorBuilder conflictingPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param builder function to build the conflictingPrice value
     * @return Builder
     */
    
    public GraphQLDuplicatePriceKeyErrorBuilder withConflictingPrice(Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.Price> builder) {
        this.conflictingPrice = builder.apply(com.commercetools.api.models.common.PriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     * @return Builder
     */
    
    public GraphQLDuplicatePriceKeyErrorBuilder conflictingPrice( final com.commercetools.api.models.common.Price conflictingPrice) {
        this.conflictingPrice = conflictingPrice;
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
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    
    
    public com.commercetools.api.models.common.Price getConflictingPrice(){
        return this.conflictingPrice;
    }

    /**
     * builds GraphQLDuplicatePriceKeyError with checking for non-null required values
     * @return GraphQLDuplicatePriceKeyError
     */
    public GraphQLDuplicatePriceKeyError build() {
        Objects.requireNonNull(conflictingPrice, GraphQLDuplicatePriceKeyError.class + ": conflictingPrice is missing");
        return new GraphQLDuplicatePriceKeyErrorImpl(values, conflictingPrice);
    }
    
    /**
     * builds GraphQLDuplicatePriceKeyError without checking for non-null required values
     * @return GraphQLDuplicatePriceKeyError
     */
    public GraphQLDuplicatePriceKeyError buildUnchecked() {
        return new GraphQLDuplicatePriceKeyErrorImpl(values, conflictingPrice);
    }

    /**
     * factory method for an instance of GraphQLDuplicatePriceKeyErrorBuilder
     * @return builder 
     */
    public static GraphQLDuplicatePriceKeyErrorBuilder of() {
        return new GraphQLDuplicatePriceKeyErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicatePriceKeyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicatePriceKeyErrorBuilder of(final GraphQLDuplicatePriceKeyError template) {
        GraphQLDuplicatePriceKeyErrorBuilder builder = new GraphQLDuplicatePriceKeyErrorBuilder();
        builder.values = template.values();
        builder.conflictingPrice = template.getConflictingPrice();
        return builder;
    }

}
