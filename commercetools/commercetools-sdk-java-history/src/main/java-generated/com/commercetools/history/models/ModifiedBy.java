
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Information about the user or the API client who performed the change. This is a variant of
*  <a href="/types#lastmodifiedby">LastModifiedBy</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ModifiedByImpl.class)
public interface ModifiedBy {

    /**
    *  <p><a href="/general-concepts#identifier">ID</a> of the Merchant Center user who made the change.
    *  Present only if the change was made in the Merchant Center.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Indicates whether the change was made by a user or the API client with or without an
    *  <a href="/client-logging#external-user-ids">External user ID</a>.</p>
    */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p><a href="/types#reference">Reference</a> to the
    *  <a href="/projects/customers#customer">Customer</a> who made the change. Present only if
    *  the change was made using a token from the <a href="/authorization#password-flow">Password
    *  Flow</a>.</p>
    */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
    *  <p>Present only if the change was made using a token from an <a href="/authorization#tokens-for-anonymous-sessions">Anonymous
    *  Session</a>.</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
    *  <p><a href="/general-concepts#identifier">ID</a> of the <a href="/projects/api-clients#apiclient">API
    *  Client</a> that made the change. Present only if
    *  the change was made using an API Client.</p>
    */

    @JsonProperty("clientId")
    public String getClientId();

    /**
    *  <p><code>true</code> if the change was made via Merchant Center or <a href="https://impex.europe-west1.gcp.commercetools.com/">ImpEx</a>.</p>
    */
    @NotNull
    @JsonProperty("isPlatformClient")
    public Boolean getIsPlatformClient();

    public void setId(final String id);

    public void setType(final String type);

    public void setCustomer(final Reference customer);

    public void setAnonymousId(final String anonymousId);

    public void setClientId(final String clientId);

    public void setIsPlatformClient(final Boolean isPlatformClient);

    public static ModifiedBy of() {
        return new ModifiedByImpl();
    }

    public static ModifiedBy of(final ModifiedBy template) {
        ModifiedByImpl instance = new ModifiedByImpl();
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setClientId(template.getClientId());
        instance.setIsPlatformClient(template.getIsPlatformClient());
        return instance;
    }

    public static ModifiedByBuilder builder() {
        return ModifiedByBuilder.of();
    }

    public static ModifiedByBuilder builder(final ModifiedBy template) {
        return ModifiedByBuilder.of(template);
    }

    default <T> T withModifiedBy(Function<ModifiedBy, T> helper) {
        return helper.apply(this);
    }
}
