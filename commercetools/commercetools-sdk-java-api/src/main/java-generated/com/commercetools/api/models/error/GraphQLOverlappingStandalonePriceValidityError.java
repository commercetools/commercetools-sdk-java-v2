
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a given Price validity period conflicts with an existing one. Every Standalone Price associated with the same SKU and with the same combination of currency, country, Customer Group, and Channel, must have non-overlapping validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLOverlappingStandalonePriceValidityError graphQLOverlappingStandalonePriceValidityError = GraphQLOverlappingStandalonePriceValidityError.builder()
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLOverlappingStandalonePriceValidityErrorImpl.class)
public interface GraphQLOverlappingStandalonePriceValidityError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLOverlappingStandalonePriceValidityError
     */
    String OVERLAPPING_STANDALONE_PRICE_VALIDITY = "OverlappingStandalonePriceValidity";

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
     *  <p>Date and time (UTC) from which the conflicting Standalone Price is valid.</p>
     * @return conflictingValidFrom
     */

    @JsonProperty("conflictingValidFrom")
    public ZonedDateTime getConflictingValidFrom();

    /**
     *  <p>Date and time (UTC) until which the conflicting Standalone Price is valid.</p>
     * @return conflictingValidUntil
     */

    @JsonProperty("conflictingValidUntil")
    public ZonedDateTime getConflictingValidUntil();

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
     *  <p>Date and time (UTC) from which the conflicting Standalone Price is valid.</p>
     * @param conflictingValidFrom value to be set
     */

    public void setConflictingValidFrom(final ZonedDateTime conflictingValidFrom);

    /**
     *  <p>Date and time (UTC) until which the conflicting Standalone Price is valid.</p>
     * @param conflictingValidUntil value to be set
     */

    public void setConflictingValidUntil(final ZonedDateTime conflictingValidUntil);

    /**
     * factory method
     * @return instance of GraphQLOverlappingStandalonePriceValidityError
     */
    public static GraphQLOverlappingStandalonePriceValidityError of() {
        return new GraphQLOverlappingStandalonePriceValidityErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLOverlappingStandalonePriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLOverlappingStandalonePriceValidityError of(
            final GraphQLOverlappingStandalonePriceValidityError template) {
        GraphQLOverlappingStandalonePriceValidityErrorImpl instance = new GraphQLOverlappingStandalonePriceValidityErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingStandalonePrice(template.getConflictingStandalonePrice());
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setConflictingValidFrom(template.getConflictingValidFrom());
        instance.setConflictingValidUntil(template.getConflictingValidUntil());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLOverlappingStandalonePriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLOverlappingStandalonePriceValidityError deepCopy(
            @Nullable final GraphQLOverlappingStandalonePriceValidityError template) {
        if (template == null) {
            return null;
        }
        GraphQLOverlappingStandalonePriceValidityErrorImpl instance = new GraphQLOverlappingStandalonePriceValidityErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingStandalonePrice(com.commercetools.api.models.standalone_price.StandalonePriceReference
                .deepCopy(template.getConflictingStandalonePrice()));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setConflictingValidFrom(template.getConflictingValidFrom());
        instance.setConflictingValidUntil(template.getConflictingValidUntil());
        return instance;
    }

    /**
     * builder factory method for GraphQLOverlappingStandalonePriceValidityError
     * @return builder
     */
    public static GraphQLOverlappingStandalonePriceValidityErrorBuilder builder() {
        return GraphQLOverlappingStandalonePriceValidityErrorBuilder.of();
    }

    /**
     * create builder for GraphQLOverlappingStandalonePriceValidityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLOverlappingStandalonePriceValidityErrorBuilder builder(
            final GraphQLOverlappingStandalonePriceValidityError template) {
        return GraphQLOverlappingStandalonePriceValidityErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLOverlappingStandalonePriceValidityError(
            Function<GraphQLOverlappingStandalonePriceValidityError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLOverlappingStandalonePriceValidityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLOverlappingStandalonePriceValidityError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLOverlappingStandalonePriceValidityError>";
            }
        };
    }
}
