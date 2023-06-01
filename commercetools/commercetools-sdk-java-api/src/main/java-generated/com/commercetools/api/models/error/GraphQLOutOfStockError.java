package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLOutOfStockErrorImpl;

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
 *  <p>Returned when some of the Line Items are out of stock at the time of placing an Order.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order by Import requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOutOfStockError graphQLOutOfStockError = GraphQLOutOfStockError.builder()
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusSkus(skusBuilder -> skusBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLOutOfStockErrorImpl.class)
public interface GraphQLOutOfStockError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLOutOfStockError
     */
    String OUT_OF_STOCK = "OutOfStock";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @return lineItems
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();
    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @return skus
     */
    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems values to be set
     */
    
    @JsonIgnore
    public void setLineItems(final String ...lineItems);
    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     * @param lineItems values to be set
     */
    
    public void setLineItems(final List<String> lineItems);
    
    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus values to be set
     */
    
    @JsonIgnore
    public void setSkus(final String ...skus);
    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     * @param skus values to be set
     */
    
    public void setSkus(final List<String> skus);

    /**
     * factory method
     * @return instance of GraphQLOutOfStockError
     */
    public static GraphQLOutOfStockError of(){
        return new GraphQLOutOfStockErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLOutOfStockError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLOutOfStockError of(final GraphQLOutOfStockError template) {
        GraphQLOutOfStockErrorImpl instance = new GraphQLOutOfStockErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(template.getLineItems());
        instance.setSkus(template.getSkus());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLOutOfStockError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLOutOfStockError deepCopy(@Nullable final GraphQLOutOfStockError template) {
        if (template == null) {
            return null;
        }
        GraphQLOutOfStockErrorImpl instance = new GraphQLOutOfStockErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(ArrayList::new)
                .orElse(null));
        instance.setSkus(Optional.ofNullable(template.getSkus())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLOutOfStockError
     * @return builder
     */
    public static GraphQLOutOfStockErrorBuilder builder() {
        return GraphQLOutOfStockErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLOutOfStockError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOutOfStockErrorBuilder builder(final GraphQLOutOfStockError template) {
        return GraphQLOutOfStockErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLOutOfStockError(Function<GraphQLOutOfStockError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLOutOfStockError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLOutOfStockError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLOutOfStockError>";
            }
        };
    }
}
