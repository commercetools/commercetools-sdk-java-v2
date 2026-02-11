
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a modification is already in progress for the combination of SKU and price scope fields (but potentially different validity period) for a Standalone Price. Retry the same request after 300 ms.</p>
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
 *     GraphQLValidityLockConflictError graphQLValidityLockConflictError = GraphQLValidityLockConflictError.builder()
 *             .sku("{sku}")
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ValidityLockConflict")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLValidityLockConflictErrorImpl.class)
public interface GraphQLValidityLockConflictError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLValidityLockConflictError
     */
    String VALIDITY_LOCK_CONFLICT = "ValidityLockConflict";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @return recurrencePolicy
     */
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyResourceIdentifier getRecurrencePolicy();

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicy" rel="nofollow">RecurrencePolicy</a> for which the Standalone Price is valid.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyResourceIdentifier recurrencePolicy);

    /**
     * factory method
     * @return instance of GraphQLValidityLockConflictError
     */
    public static GraphQLValidityLockConflictError of() {
        return new GraphQLValidityLockConflictErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLValidityLockConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLValidityLockConflictError of(final GraphQLValidityLockConflictError template) {
        GraphQLValidityLockConflictErrorImpl instance = new GraphQLValidityLockConflictErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public GraphQLValidityLockConflictError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLValidityLockConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLValidityLockConflictError deepCopy(@Nullable final GraphQLValidityLockConflictError template) {
        if (template == null) {
            return null;
        }
        GraphQLValidityLockConflictErrorImpl instance = new GraphQLValidityLockConflictErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setSku(template.getSku());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for GraphQLValidityLockConflictError
     * @return builder
     */
    public static GraphQLValidityLockConflictErrorBuilder builder() {
        return GraphQLValidityLockConflictErrorBuilder.of();
    }

    /**
     * create builder for GraphQLValidityLockConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLValidityLockConflictErrorBuilder builder(final GraphQLValidityLockConflictError template) {
        return GraphQLValidityLockConflictErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLValidityLockConflictError(Function<GraphQLValidityLockConflictError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLValidityLockConflictError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLValidityLockConflictError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLValidityLockConflictError>";
            }
        };
    }
}
