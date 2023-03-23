
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p><code>id</code> of the APIClient which created the resource.</p>
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

    public void setClientId(final String clientId);

    public void setExternalUserId(final String externalUserId);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public static ClientLogging of() {
        return new ClientLoggingImpl();
    }

    public static ClientLogging of(final ClientLogging template) {
        ClientLoggingImpl instance = new ClientLoggingImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static ClientLoggingBuilder builder() {
        return ClientLoggingBuilder.of();
    }

    public static ClientLoggingBuilder builder(final ClientLogging template) {
        return ClientLoggingBuilder.of(template);
    }

    default <T> T withClientLogging(Function<ClientLogging, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ClientLogging> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ClientLogging>() {
            @Override
            public String toString() {
                return "TypeReference<ClientLogging>";
            }
        };
    }
}
