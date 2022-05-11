
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
*  <p>These objects represent information about which <a href="/../api/projects/api-clients">API Client</a> created or modified a resource. For more information, see <a href="/client-logging">Client Logging</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ClientLoggingImpl.class)
public interface ClientLogging {

    /**
    *  <p><code>id</code> of the <a href="ctp:api:type:ApiClient">APIClient</a> which created the resource.</p>
    */

    @JsonProperty("clientId")
    public String getClientId();

    /**
    *  <p><a href="/../api/client-logging#external-user-ids">External user ID</a> provided by <code>X-External-User-ID</code> HTTP Header.</p>
    */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
    *  <p>Indicates the <a href="ctp:api:type:Customer">Customer</a> who modified the resource using a token from the <a href="/authorization#password-flow">password flow</a>.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
    *  <p>Indicates that the resource was modified during an <a href="/../api/authorization#tokens-for-anonymous-sessions">anonymous session</a> with the logged ID.</p>
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
