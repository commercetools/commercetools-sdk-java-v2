package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.error.GraphQLDuplicateStandalonePriceScopeErrorImpl;

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
 *  <p>Returned when the given Price scope conflicts with the Price scope of an existing Standalone Price. Every Standalone Price associated with the same SKU must have a distinct combination of currency, country, Customer Group, Channel, and validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateStandalonePriceScopeError graphQLDuplicateStandalonePriceScopeError = GraphQLDuplicateStandalonePriceScopeError.builder()
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLDuplicateStandalonePriceScopeErrorImpl.class)
public interface GraphQLDuplicateStandalonePriceScopeError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateStandalonePriceScopeError
     */
    String DUPLICATE_STANDALONE_PRICE_SCOPE = "DuplicateStandalonePriceScope";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @return conflictingStandalonePrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingStandalonePrice")
    public StandalonePriceReference getConflictingStandalonePrice();
    /**
     *  <p>SKU of the ProductVariant to which the conflicting Standalone Price is associated.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Currency code of the country.</p>
     * @return currency
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();
    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */
    
    @JsonProperty("country")
    public String getCountry();
    /**
     *  <p>CustomerGroup for which the Standalone Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();
    /**
     *  <p>Channel for which the Standalone Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();
    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     * @return validFrom
     */
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     * @return validUntil
     */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @param conflictingStandalonePrice value to be set
     */
    
    public void setConflictingStandalonePrice(final StandalonePriceReference conflictingStandalonePrice);
    
    
    /**
     *  <p>SKU of the ProductVariant to which the conflicting Standalone Price is associated.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     */
    
    public void setCurrency(final String currency);
    
    
    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     */
    
    public void setCountry(final String country);
    
    
    /**
     *  <p>CustomerGroup for which the Standalone Price is valid.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
    
    
    /**
     *  <p>Channel for which the Standalone Price is valid.</p>
     * @param channel value to be set
     */
    
    public void setChannel(final ChannelResourceIdentifier channel);
    
    
    /**
     *  <p>Date and time (UTC) from which the Standalone Price is valid.</p>
     * @param validFrom value to be set
     */
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    
    /**
     *  <p>Date and time (UTC) until which the Standalone Price is valid.</p>
     * @param validUntil value to be set
     */
    
    public void setValidUntil(final ZonedDateTime validUntil);
    

    /**
     * factory method
     * @return instance of GraphQLDuplicateStandalonePriceScopeError
     */
    public static GraphQLDuplicateStandalonePriceScopeError of(){
        return new GraphQLDuplicateStandalonePriceScopeErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLDuplicateStandalonePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateStandalonePriceScopeError of(final GraphQLDuplicateStandalonePriceScopeError template) {
        GraphQLDuplicateStandalonePriceScopeErrorImpl instance = new GraphQLDuplicateStandalonePriceScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingStandalonePrice(template.getConflictingStandalonePrice());
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLDuplicateStandalonePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateStandalonePriceScopeError deepCopy(@Nullable final GraphQLDuplicateStandalonePriceScopeError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateStandalonePriceScopeErrorImpl instance = new GraphQLDuplicateStandalonePriceScopeErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingStandalonePrice(com.commercetools.api.models.standalone_price.StandalonePriceReference.deepCopy(template.getConflictingStandalonePrice()));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateStandalonePriceScopeError
     * @return builder
     */
    public static GraphQLDuplicateStandalonePriceScopeErrorBuilder builder() {
        return GraphQLDuplicateStandalonePriceScopeErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLDuplicateStandalonePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateStandalonePriceScopeErrorBuilder builder(final GraphQLDuplicateStandalonePriceScopeError template) {
        return GraphQLDuplicateStandalonePriceScopeErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateStandalonePriceScopeError(Function<GraphQLDuplicateStandalonePriceScopeError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateStandalonePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateStandalonePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateStandalonePriceScopeError>";
            }
        };
    }
}
