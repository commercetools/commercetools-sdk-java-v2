
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.standalone_price.StandalonePriceReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a given Price validity period conflicts with an existing one. Every Standalone Price associated with the same SKU and with the same combination of currency, country, Customer Group, and Channel, must have non-overlapping validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices:POST" rel="nofollow">Create StandalonePrice</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OverlappingStandalonePriceValidityError overlappingStandalonePriceValidityError = OverlappingStandalonePriceValidityError.builder()
 *             .message("{message}")
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OverlappingStandalonePriceValidity")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OverlappingStandalonePriceValidityErrorImpl.class)
public interface OverlappingStandalonePriceValidityError extends ErrorObject {

    /**
     * discriminator value for OverlappingStandalonePriceValidityError
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
     *  <p><code>Two standalone prices have overlapping validity periods."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @return conflictingStandalonePrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingStandalonePrice")
    public StandalonePriceReference getConflictingStandalonePrice();

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the conflicting Standalone Price is associated.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
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
     *  <p><code>Two standalone prices have overlapping validity periods."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Reference to the conflicting Standalone Price.</p>
     * @param conflictingStandalonePrice value to be set
     */

    public void setConflictingStandalonePrice(final StandalonePriceReference conflictingStandalonePrice);

    /**
     *  <p>SKU of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the conflicting Standalone Price is associated.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Standalone Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Standalone Price is valid.</p>
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
     * @return instance of OverlappingStandalonePriceValidityError
     */
    public static OverlappingStandalonePriceValidityError of() {
        return new OverlappingStandalonePriceValidityErrorImpl();
    }

    /**
     * factory method to create a shallow copy OverlappingStandalonePriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    public static OverlappingStandalonePriceValidityError of(final OverlappingStandalonePriceValidityError template) {
        OverlappingStandalonePriceValidityErrorImpl instance = new OverlappingStandalonePriceValidityErrorImpl();
        instance.setMessage(template.getMessage());
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

    public OverlappingStandalonePriceValidityError copyDeep();

    /**
     * factory method to create a deep copy of OverlappingStandalonePriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OverlappingStandalonePriceValidityError deepCopy(
            @Nullable final OverlappingStandalonePriceValidityError template) {
        if (template == null) {
            return null;
        }
        OverlappingStandalonePriceValidityErrorImpl instance = new OverlappingStandalonePriceValidityErrorImpl();
        instance.setMessage(template.getMessage());
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
     * builder factory method for OverlappingStandalonePriceValidityError
     * @return builder
     */
    public static OverlappingStandalonePriceValidityErrorBuilder builder() {
        return OverlappingStandalonePriceValidityErrorBuilder.of();
    }

    /**
     * create builder for OverlappingStandalonePriceValidityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OverlappingStandalonePriceValidityErrorBuilder builder(
            final OverlappingStandalonePriceValidityError template) {
        return OverlappingStandalonePriceValidityErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOverlappingStandalonePriceValidityError(
            Function<OverlappingStandalonePriceValidityError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError>() {
            @Override
            public String toString() {
                return "TypeReference<OverlappingStandalonePriceValidityError>";
            }
        };
    }
}
