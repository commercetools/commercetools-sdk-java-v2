package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLNoMatchingProductDiscountFoundErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Returned when a Product Discount could not be found that could be applied to the Price of a Product Variant.</p>
 *  <p>The error is returned as a failed response to the Get Matching ProductDiscount request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLNoMatchingProductDiscountFoundError graphQLNoMatchingProductDiscountFoundError = GraphQLNoMatchingProductDiscountFoundError.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLNoMatchingProductDiscountFoundErrorImpl.class)
public interface GraphQLNoMatchingProductDiscountFoundError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLNoMatchingProductDiscountFoundError
     */
    String NO_MATCHING_PRODUCT_DISCOUNT_FOUND = "NoMatchingProductDiscountFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();


    /**
     * factory method
     * @return instance of GraphQLNoMatchingProductDiscountFoundError
     */
    public static GraphQLNoMatchingProductDiscountFoundError of(){
        return new GraphQLNoMatchingProductDiscountFoundErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLNoMatchingProductDiscountFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLNoMatchingProductDiscountFoundError of(final GraphQLNoMatchingProductDiscountFoundError template) {
        GraphQLNoMatchingProductDiscountFoundErrorImpl instance = new GraphQLNoMatchingProductDiscountFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLNoMatchingProductDiscountFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLNoMatchingProductDiscountFoundError deepCopy(@Nullable final GraphQLNoMatchingProductDiscountFoundError template) {
        if (template == null) {
            return null;
        }
        GraphQLNoMatchingProductDiscountFoundErrorImpl instance = new GraphQLNoMatchingProductDiscountFoundErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLNoMatchingProductDiscountFoundError
     * @return builder
     */
    public static GraphQLNoMatchingProductDiscountFoundErrorBuilder builder() {
        return GraphQLNoMatchingProductDiscountFoundErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLNoMatchingProductDiscountFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLNoMatchingProductDiscountFoundErrorBuilder builder(final GraphQLNoMatchingProductDiscountFoundError template) {
        return GraphQLNoMatchingProductDiscountFoundErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLNoMatchingProductDiscountFoundError(Function<GraphQLNoMatchingProductDiscountFoundError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLNoMatchingProductDiscountFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLNoMatchingProductDiscountFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLNoMatchingProductDiscountFoundError>";
            }
        };
    }
}
