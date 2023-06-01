package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.VariantValues;
import com.commercetools.api.models.error.GraphQLDuplicateVariantValuesError;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLDuplicateVariantValuesErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateVariantValuesError graphQLDuplicateVariantValuesError = GraphQLDuplicateVariantValuesError.builder()
 *             .variantValues(variantValuesBuilder -> variantValuesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicateVariantValuesErrorBuilder implements Builder<GraphQLDuplicateVariantValuesError> {

    
    
    private Map<String, java.lang.Object> values = new HashMap<>();
    
    
    
    private com.commercetools.api.models.error.VariantValues variantValues;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */
    
    public GraphQLDuplicateVariantValuesErrorBuilder values( final Map<String, java.lang.Object> values){
        this.values = values;
        return this;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */
    
    public GraphQLDuplicateVariantValuesErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }
    
    
    
    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param builder function to build the variantValues value
     * @return Builder
     */
    
    public GraphQLDuplicateVariantValuesErrorBuilder variantValues(Function<com.commercetools.api.models.error.VariantValuesBuilder, com.commercetools.api.models.error.VariantValuesBuilder> builder) {
        this.variantValues = builder.apply(com.commercetools.api.models.error.VariantValuesBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param builder function to build the variantValues value
     * @return Builder
     */
    
    public GraphQLDuplicateVariantValuesErrorBuilder withVariantValues(Function<com.commercetools.api.models.error.VariantValuesBuilder, com.commercetools.api.models.error.VariantValues> builder) {
        this.variantValues = builder.apply(com.commercetools.api.models.error.VariantValuesBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param variantValues value to be set
     * @return Builder
     */
    
    public GraphQLDuplicateVariantValuesErrorBuilder variantValues( final com.commercetools.api.models.error.VariantValues variantValues) {
        this.variantValues = variantValues;
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
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @return variantValues
     */
    
    
    public com.commercetools.api.models.error.VariantValues getVariantValues(){
        return this.variantValues;
    }

    /**
     * builds GraphQLDuplicateVariantValuesError with checking for non-null required values
     * @return GraphQLDuplicateVariantValuesError
     */
    public GraphQLDuplicateVariantValuesError build() {
        Objects.requireNonNull(variantValues, GraphQLDuplicateVariantValuesError.class + ": variantValues is missing");
        return new GraphQLDuplicateVariantValuesErrorImpl(values, variantValues);
    }
    
    /**
     * builds GraphQLDuplicateVariantValuesError without checking for non-null required values
     * @return GraphQLDuplicateVariantValuesError
     */
    public GraphQLDuplicateVariantValuesError buildUnchecked() {
        return new GraphQLDuplicateVariantValuesErrorImpl(values, variantValues);
    }

    /**
     * factory method for an instance of GraphQLDuplicateVariantValuesErrorBuilder
     * @return builder 
     */
    public static GraphQLDuplicateVariantValuesErrorBuilder of() {
        return new GraphQLDuplicateVariantValuesErrorBuilder();
    }

    /**
     * create builder for GraphQLDuplicateVariantValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateVariantValuesErrorBuilder of(final GraphQLDuplicateVariantValuesError template) {
        GraphQLDuplicateVariantValuesErrorBuilder builder = new GraphQLDuplicateVariantValuesErrorBuilder();
        builder.values = template.values();
        builder.variantValues = template.getVariantValues();
        return builder;
    }

}
