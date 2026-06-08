
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/email-token:POST" rel="nofollow">Create email token for Customer</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/customers/email-token:POST" rel="nofollow">Create email token for Customer in Store</a> request. The <code>resource</code> property of the Message is a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerEmailTokenReference" rel="nofollow">CustomerEmailTokenReference</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenCreatedMessage customerEmailTokenCreatedMessage = CustomerEmailTokenCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .invalidateOlderTokens(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerEmailTokenCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailTokenCreatedMessageImpl.class)
public interface CustomerEmailTokenCreatedMessage extends Message {

    /**
     * discriminator value for CustomerEmailTokenCreatedMessage
     */
    String CUSTOMER_EMAIL_TOKEN_CREATED = "CustomerEmailTokenCreated";

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return customerId
     */
    @NotNull
    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @return value
     */

    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @return invalidateOlderTokens
     */
    @NotNull
    @JsonProperty("invalidateOlderTokens")
    public Boolean getInvalidateOlderTokens();

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @param invalidateOlderTokens value to be set
     */

    public void setInvalidateOlderTokens(final Boolean invalidateOlderTokens);

    /**
     * factory method
     * @return instance of CustomerEmailTokenCreatedMessage
     */
    public static CustomerEmailTokenCreatedMessage of() {
        return new CustomerEmailTokenCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailTokenCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailTokenCreatedMessage of(final CustomerEmailTokenCreatedMessage template) {
        CustomerEmailTokenCreatedMessageImpl instance = new CustomerEmailTokenCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setValue(template.getValue());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
        return instance;
    }

    public CustomerEmailTokenCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerEmailTokenCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailTokenCreatedMessage deepCopy(@Nullable final CustomerEmailTokenCreatedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerEmailTokenCreatedMessageImpl instance = new CustomerEmailTokenCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomerId(template.getCustomerId());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setValue(template.getValue());
        instance.setInvalidateOlderTokens(template.getInvalidateOlderTokens());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailTokenCreatedMessage
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessageBuilder builder() {
        return CustomerEmailTokenCreatedMessageBuilder.of();
    }

    /**
     * create builder for CustomerEmailTokenCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessageBuilder builder(final CustomerEmailTokenCreatedMessage template) {
        return CustomerEmailTokenCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailTokenCreatedMessage(Function<CustomerEmailTokenCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailTokenCreatedMessage>";
            }
        };
    }
}
