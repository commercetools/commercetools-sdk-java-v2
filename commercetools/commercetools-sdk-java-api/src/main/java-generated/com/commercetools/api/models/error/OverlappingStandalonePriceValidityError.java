
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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
 *     OverlappingStandalonePriceValidityError overlappingStandalonePriceValidityError = OverlappingStandalonePriceValidityError.builder()
 *             .message("{message}")
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OverlappingStandalonePriceValidityErrorImpl.class)
public interface OverlappingStandalonePriceValidityError extends ErrorObject {

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

    public void setMessage(final String message);

    public void setConflictingStandalonePrice(final StandalonePriceReference conflictingStandalonePrice);

    public void setSku(final String sku);

    public void setCurrency(final String currency);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public void setConflictingValidFrom(final ZonedDateTime conflictingValidFrom);

    public void setConflictingValidUntil(final ZonedDateTime conflictingValidUntil);

    public static OverlappingStandalonePriceValidityError of() {
        return new OverlappingStandalonePriceValidityErrorImpl();
    }

    public static OverlappingStandalonePriceValidityError of(final OverlappingStandalonePriceValidityError template) {
        OverlappingStandalonePriceValidityErrorImpl instance = new OverlappingStandalonePriceValidityErrorImpl();
        instance.setMessage(template.getMessage());

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

    public static OverlappingStandalonePriceValidityErrorBuilder builder() {
        return OverlappingStandalonePriceValidityErrorBuilder.of();
    }

    public static OverlappingStandalonePriceValidityErrorBuilder builder(
            final OverlappingStandalonePriceValidityError template) {
        return OverlappingStandalonePriceValidityErrorBuilder.of(template);
    }

    default <T> T withOverlappingStandalonePriceValidityError(
            Function<OverlappingStandalonePriceValidityError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OverlappingStandalonePriceValidityError>() {
            @Override
            public String toString() {
                return "TypeReference<OverlappingStandalonePriceValidityError>";
            }
        };
    }
}
