
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a given Price validity period conflicts with an existing one. Every Price of a Product Variant with the same combination of currency, country, Customer Group, and Channel must have non-overlapping validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Create Product</a> or <span>Update Product</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OverlappingPriceValidityError overlappingPriceValidityError = OverlappingPriceValidityError.builder()
 *             .message("{message}")
 *             .conflictingPrice("{conflictingPrice}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OverlappingPriceValidity")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OverlappingPriceValidityErrorImpl.class)
public interface OverlappingPriceValidityError extends ErrorObject {

    /**
     * discriminator value for OverlappingPriceValidityError
     */
    String OVERLAPPING_PRICE_VALIDITY = "OverlappingPriceValidity";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Two prices have overlapping validity periods."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    @NotNull
    @JsonProperty("conflictingPrice")
    public String getConflictingPrice();

    /**
     *  <p>Currency code of the Price.</p>
     * @return currency
     */
    @NotNull
    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Country code of the Price.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Date and time (UTC) from which the Embedded Price is valid.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Date and time (UTC) until which the Embedded Price is valid.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Date and time (UTC) from which the conflicting Embedded Price is valid.</p>
     * @return conflictingValidFrom
     */

    @JsonProperty("conflictingValidFrom")
    public ZonedDateTime getConflictingValidFrom();

    /**
     *  <p>Date and time (UTC) until which the conflicting Embedded Price is valid.</p>
     * @return conflictingValidUntil
     */

    @JsonProperty("conflictingValidUntil")
    public ZonedDateTime getConflictingValidUntil();

    /**
     *  <p><code>"Two prices have overlapping validity periods."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the conflicting Embedded Price.</p>
     * @param conflictingPrice value to be set
     */

    public void setConflictingPrice(final String conflictingPrice);

    /**
     *  <p>Currency code of the Price.</p>
     * @param currency value to be set
     */

    public void setCurrency(final String currency);

    /**
     *  <p>Country code of the Price.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for which the Price is valid.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for which the Price is valid.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     *  <p>Date and time (UTC) from which the Embedded Price is valid.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Date and time (UTC) until which the Embedded Price is valid.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     *  <p>Date and time (UTC) from which the conflicting Embedded Price is valid.</p>
     * @param conflictingValidFrom value to be set
     */

    public void setConflictingValidFrom(final ZonedDateTime conflictingValidFrom);

    /**
     *  <p>Date and time (UTC) until which the conflicting Embedded Price is valid.</p>
     * @param conflictingValidUntil value to be set
     */

    public void setConflictingValidUntil(final ZonedDateTime conflictingValidUntil);

    /**
     * factory method
     * @return instance of OverlappingPriceValidityError
     */
    public static OverlappingPriceValidityError of() {
        return new OverlappingPriceValidityErrorImpl();
    }

    /**
     * factory method to create a shallow copy OverlappingPriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    public static OverlappingPriceValidityError of(final OverlappingPriceValidityError template) {
        OverlappingPriceValidityErrorImpl instance = new OverlappingPriceValidityErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
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

    public OverlappingPriceValidityError copyDeep();

    /**
     * factory method to create a deep copy of OverlappingPriceValidityError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OverlappingPriceValidityError deepCopy(@Nullable final OverlappingPriceValidityError template) {
        if (template == null) {
            return null;
        }
        OverlappingPriceValidityErrorImpl instance = new OverlappingPriceValidityErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingPrice(template.getConflictingPrice());
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
     * builder factory method for OverlappingPriceValidityError
     * @return builder
     */
    public static OverlappingPriceValidityErrorBuilder builder() {
        return OverlappingPriceValidityErrorBuilder.of();
    }

    /**
     * create builder for OverlappingPriceValidityError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OverlappingPriceValidityErrorBuilder builder(final OverlappingPriceValidityError template) {
        return OverlappingPriceValidityErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOverlappingPriceValidityError(Function<OverlappingPriceValidityError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<OverlappingPriceValidityError> typeReference() {
        return new tools.jackson.core.type.TypeReference<OverlappingPriceValidityError>() {
            @Override
            public String toString() {
                return "TypeReference<OverlappingPriceValidityError>";
            }
        };
    }
}
