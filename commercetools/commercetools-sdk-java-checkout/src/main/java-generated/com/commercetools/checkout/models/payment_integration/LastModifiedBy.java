
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Information regarding IDs and references that last modified the Payment Integration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LastModifiedBy lastModifiedBy = LastModifiedBy.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LastModifiedByImpl.class)
public interface LastModifiedBy {

    /**
     *  <p>ID of the API client that last modified the PaymentIntegration.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>Session ID associated with the modification of the PaymentIntegration.</p>
     * @return sessionId
     */

    @JsonProperty("sessionId")
    public String getSessionId();

    /**
     *  <p>External user ID that last modified the PaymentIntegration.</p>
     * @return externalUserId
     */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
     *  <p>Anonymous ID if the resource was last modified by an anonymous user.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     * @return associate
     */
    @Valid
    @JsonProperty("associate")
    public Reference getAssociate();

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     * @return user
     */
    @Valid
    @JsonProperty("user")
    public Reference getUser();

    /**
     *  <p>Indicates whether the resource was last modified by a platform client.</p>
     * @return isPlatformClient
     */

    @JsonProperty("isPlatformClient")
    public Boolean getIsPlatformClient();

    /**
     *  <p>ID of the API client that last modified the PaymentIntegration.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>Session ID associated with the modification of the PaymentIntegration.</p>
     * @param sessionId value to be set
     */

    public void setSessionId(final String sessionId);

    /**
     *  <p>External user ID that last modified the PaymentIntegration.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Anonymous ID if the resource was last modified by an anonymous user.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Customer reference or customer ID if the resource was last modified by a customer.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>Associate (customer) reference if the resource was last modified by an associate.</p>
     * @param associate value to be set
     */

    public void setAssociate(final Reference associate);

    /**
     *  <p>User reference if the resource was last modified by a platform user.</p>
     * @param user value to be set
     */

    public void setUser(final Reference user);

    /**
     *  <p>Indicates whether the resource was last modified by a platform client.</p>
     * @param isPlatformClient value to be set
     */

    public void setIsPlatformClient(final Boolean isPlatformClient);

    /**
     * factory method
     * @return instance of LastModifiedBy
     */
    public static LastModifiedBy of() {
        return new LastModifiedByImpl();
    }

    /**
     * factory method to create a shallow copy LastModifiedBy
     * @param template instance to be copied
     * @return copy instance
     */
    public static LastModifiedBy of(final LastModifiedBy template) {
        LastModifiedByImpl instance = new LastModifiedByImpl();
        instance.setClientId(template.getClientId());
        instance.setSessionId(template.getSessionId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setCustomer(template.getCustomer());
        instance.setAssociate(template.getAssociate());
        instance.setUser(template.getUser());
        instance.setIsPlatformClient(template.getIsPlatformClient());
        return instance;
    }

    public LastModifiedBy copyDeep();

    /**
     * factory method to create a deep copy of LastModifiedBy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LastModifiedBy deepCopy(@Nullable final LastModifiedBy template) {
        if (template == null) {
            return null;
        }
        LastModifiedByImpl instance = new LastModifiedByImpl();
        instance.setClientId(template.getClientId());
        instance.setSessionId(template.getSessionId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setCustomer(com.commercetools.checkout.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setAssociate(com.commercetools.checkout.models.common.Reference.deepCopy(template.getAssociate()));
        instance.setUser(com.commercetools.checkout.models.common.Reference.deepCopy(template.getUser()));
        instance.setIsPlatformClient(template.getIsPlatformClient());
        return instance;
    }

    /**
     * builder factory method for LastModifiedBy
     * @return builder
     */
    public static LastModifiedByBuilder builder() {
        return LastModifiedByBuilder.of();
    }

    /**
     * create builder for LastModifiedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LastModifiedByBuilder builder(final LastModifiedBy template) {
        return LastModifiedByBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLastModifiedBy(Function<LastModifiedBy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LastModifiedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LastModifiedBy>() {
            @Override
            public String toString() {
                return "TypeReference<LastModifiedBy>";
            }
        };
    }
}
