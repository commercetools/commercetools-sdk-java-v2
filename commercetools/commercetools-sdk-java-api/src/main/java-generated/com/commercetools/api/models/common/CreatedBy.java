
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
*  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CreatedByImpl.class)
public interface CreatedBy extends ClientLogging {

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
    *  <p>Indicates the <a href="ctp:api:type:Customer">Customer</a> who created the resource using a token from the <a href="/authorization#password-flow">password flow</a>.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
    *  <p>Indicates the <a href="/../api/authorization#tokens-for-anonymous-sessions">anonymous session</a> during which the resource was created.</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    public void setClientId(final String clientId);

    public void setExternalUserId(final String externalUserId);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public static CreatedBy of() {
        return new CreatedByImpl();
    }

    public static CreatedBy of(final CreatedBy template) {
        CreatedByImpl instance = new CreatedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static CreatedByBuilder builder() {
        return CreatedByBuilder.of();
    }

    public static CreatedByBuilder builder(final CreatedBy template) {
        return CreatedByBuilder.of(template);
    }

    default <T> T withCreatedBy(Function<CreatedBy, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CreatedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CreatedBy>() {
            @Override
            public String toString() {
                return "TypeReference<CreatedBy>";
            }
        };
    }
}
