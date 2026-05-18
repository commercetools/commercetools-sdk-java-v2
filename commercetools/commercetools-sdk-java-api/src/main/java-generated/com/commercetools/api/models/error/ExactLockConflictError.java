
package com.commercetools.api.models.error;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a modification is already in progress for the exact combination of SKU and price scope fields for a Standalone Price. Retry the same request after 300 ms.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices:POST" rel="nofollow">Create StandalonePrice</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices/{id}:POST" rel="nofollow">Update StandalonePrice by ID</a></li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/standalone-prices/key={key}:POST" rel="nofollow">Update StandalonePrice by Key</a></li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExactLockConflictError exactLockConflictError = ExactLockConflictError.builder()
 *             .message("{message}")
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExactLockConflict")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExactLockConflictErrorImpl.class)
public interface ExactLockConflictError extends ErrorObject {

    /**
     * discriminator value for ExactLockConflictError
     */
    String EXACT_LOCK_CONFLICT = "ExactLockConflict";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Modification already in progress for the combination of SKU and price scope fields."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>SKU for which the modification conflict occurred.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Currency code of the Standalone Price.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @return recurrencePolicy
     */
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyReference getRecurrencePolicy();

    /**
     *  <p><code>"Modification already in progress for the combination of SKU and price scope fields."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>SKU for which the modification conflict occurred.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Currency code of the Standalone Price.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> that applies to the Standalone Price.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyReference recurrencePolicy);

    /**
     * factory method
     * @return instance of ExactLockConflictError
     */
    public static ExactLockConflictError of() {
        return new ExactLockConflictErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExactLockConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExactLockConflictError of(final ExactLockConflictError template) {
        ExactLockConflictErrorImpl instance = new ExactLockConflictErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public ExactLockConflictError copyDeep();

    /**
     * factory method to create a deep copy of ExactLockConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExactLockConflictError deepCopy(@Nullable final ExactLockConflictError template) {
        if (template == null) {
            return null;
        }
        ExactLockConflictErrorImpl instance = new ExactLockConflictErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for ExactLockConflictError
     * @return builder
     */
    public static ExactLockConflictErrorBuilder builder() {
        return ExactLockConflictErrorBuilder.of();
    }

    /**
     * create builder for ExactLockConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExactLockConflictErrorBuilder builder(final ExactLockConflictError template) {
        return ExactLockConflictErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExactLockConflictError(Function<ExactLockConflictError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExactLockConflictError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExactLockConflictError>() {
            @Override
            public String toString() {
                return "TypeReference<ExactLockConflictError>";
            }
        };
    }
}
