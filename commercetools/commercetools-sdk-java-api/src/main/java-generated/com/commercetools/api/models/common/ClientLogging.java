
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>These objects represent information about which API Client created or modified a resource. For more information, see Client Logging.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClientLogging clientLogging = ClientLogging.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ClientLoggingImpl.class)
public interface ClientLogging {

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @return externalUserId
     */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Indicates that the resource was modified during an anonymous session with the logged ID.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @return associate
     */
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p><code>id</code> of the API Client which created the resource.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Indicates that the resource was modified during an anonymous session with the logged ID.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Indicates the Customer who created or modified the resource in the context of a Business Unit. Only available for B2B-enabled Projects when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

    /**
     * factory method
     * @return instance of ClientLogging
     */
    public static ClientLogging of() {
        return new ClientLoggingImpl();
    }

    /**
     * factory method to create a shallow copy ClientLogging
     * @param template instance to be copied
     * @return copy instance
     */
    public static ClientLogging of(final ClientLogging template) {
        ClientLoggingImpl instance = new ClientLoggingImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public ClientLogging copyDeep();

    /**
     * factory method to create a deep copy of ClientLogging
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ClientLogging deepCopy(@Nullable final ClientLogging template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ClientLoggingImpl)) {
            return template.copyDeep();
        }
        ClientLoggingImpl instance = new ClientLoggingImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for ClientLogging
     * @return builder
     */
    public static ClientLoggingBuilder builder() {
        return ClientLoggingBuilder.of();
    }

    /**
     * create builder for ClientLogging instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClientLoggingBuilder builder(final ClientLogging template) {
        return ClientLoggingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withClientLogging(Function<ClientLogging, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ClientLogging> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClientLogging>() {
            @Override
            public String toString() {
                return "TypeReference<ClientLogging>";
            }
        };
    }
}
