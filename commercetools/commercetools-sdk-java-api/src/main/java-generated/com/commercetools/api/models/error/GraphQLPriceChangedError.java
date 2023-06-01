package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLPriceChangedErrorImpl;

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
 *  <p>Returned when the Price, Tax Rate, or Shipping Rate of some Line Items changed since they were last added to the Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLPriceChangedError graphQLPriceChangedError = GraphQLPriceChangedError.builder()
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .shipping(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLPriceChangedErrorImpl.class)
public interface GraphQLPriceChangedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLPriceChangedError
     */
    String PRICE_CHANGED = "PriceChanged";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @return lineItems
     */
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();
    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @return shipping
     */
    @NotNull
    @JsonProperty("shipping")
    public Boolean getShipping();

    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems values to be set
     */
    
    @JsonIgnore
    public void setLineItems(final String ...lineItems);
    /**
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     * @param lineItems values to be set
     */
    
    public void setLineItems(final List<String> lineItems);
    
    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     * @param shipping value to be set
     */
    
    public void setShipping(final Boolean shipping);
    

    /**
     * factory method
     * @return instance of GraphQLPriceChangedError
     */
    public static GraphQLPriceChangedError of(){
        return new GraphQLPriceChangedErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLPriceChangedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLPriceChangedError of(final GraphQLPriceChangedError template) {
        GraphQLPriceChangedErrorImpl instance = new GraphQLPriceChangedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(template.getLineItems());
        instance.setShipping(template.getShipping());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLPriceChangedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLPriceChangedError deepCopy(@Nullable final GraphQLPriceChangedError template) {
        if (template == null) {
            return null;
        }
        GraphQLPriceChangedErrorImpl instance = new GraphQLPriceChangedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(ArrayList::new)
                .orElse(null));
        instance.setShipping(template.getShipping());
        return instance;
    }

    /**
     * builder factory method for GraphQLPriceChangedError
     * @return builder
     */
    public static GraphQLPriceChangedErrorBuilder builder() {
        return GraphQLPriceChangedErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLPriceChangedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLPriceChangedErrorBuilder builder(final GraphQLPriceChangedError template) {
        return GraphQLPriceChangedErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLPriceChangedError(Function<GraphQLPriceChangedError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLPriceChangedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLPriceChangedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLPriceChangedError>";
            }
        };
    }
}
