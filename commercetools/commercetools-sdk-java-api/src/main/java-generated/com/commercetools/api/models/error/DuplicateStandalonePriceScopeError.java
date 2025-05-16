
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
 *  <p>Returned when the given Price scope conflicts with the Price scope of an existing Standalone Price. Every Standalone Price associated with the same SKU must have a distinct combination of currency, country, Customer Group, Channel, and validity periods (<code>validFrom</code> and <code>validUntil</code>).</p>
 *  <p>The error is returned as a failed response to the Create StandalonePrice request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateStandalonePriceScopeError duplicateStandalonePriceScopeError = DuplicateStandalonePriceScopeError.builder()
 *             .message("{message}")
 *             .conflictingStandalonePrice(conflictingStandalonePriceBuilder -> conflictingStandalonePriceBuilder)
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateStandalonePriceScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateStandalonePriceScopeErrorImpl.class)
public interface DuplicateStandalonePriceScopeError extends ErrorObject {

    /**
     * discriminator value for DuplicateStandalonePriceScopeError
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
     *  <p><code>"Duplicate standalone price scope for SKU: $sku. The combination of SKU, currency, country, customerGroup, channel, validFrom and validUntil must be unique for each standalone price."</code></p>
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
     *  <p><code>"Duplicate standalone price scope for SKU: $sku. The combination of SKU, currency, country, customerGroup, channel, validFrom and validUntil must be unique for each standalone price."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

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
     * @return instance of DuplicateStandalonePriceScopeError
     */
    public static DuplicateStandalonePriceScopeError of() {
        return new DuplicateStandalonePriceScopeErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicateStandalonePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateStandalonePriceScopeError of(final DuplicateStandalonePriceScopeError template) {
        DuplicateStandalonePriceScopeErrorImpl instance = new DuplicateStandalonePriceScopeErrorImpl();
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
        return instance;
    }

    public DuplicateStandalonePriceScopeError copyDeep();

    /**
     * factory method to create a deep copy of DuplicateStandalonePriceScopeError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateStandalonePriceScopeError deepCopy(
            @Nullable final DuplicateStandalonePriceScopeError template) {
        if (template == null) {
            return null;
        }
        DuplicateStandalonePriceScopeErrorImpl instance = new DuplicateStandalonePriceScopeErrorImpl();
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
        return instance;
    }

    /**
     * builder factory method for DuplicateStandalonePriceScopeError
     * @return builder
     */
    public static DuplicateStandalonePriceScopeErrorBuilder builder() {
        return DuplicateStandalonePriceScopeErrorBuilder.of();
    }

    /**
     * create builder for DuplicateStandalonePriceScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateStandalonePriceScopeErrorBuilder builder(final DuplicateStandalonePriceScopeError template) {
        return DuplicateStandalonePriceScopeErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateStandalonePriceScopeError(Function<DuplicateStandalonePriceScopeError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateStandalonePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateStandalonePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateStandalonePriceScopeError>";
            }
        };
    }
}
