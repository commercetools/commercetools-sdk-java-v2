
package com.commercetools.history.models.change_history;

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
 *  <p>Information about the user or the API client who performed the change. This is a variant of LastModifiedBy.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ModifiedBy modifiedBy = ModifiedBy.builder()
 *             .id("{id}")
 *             .type("{type}")
 *             .isPlatformClient(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ModifiedByImpl.class)
public interface ModifiedBy {

    /**
     *  <p>ID of the Merchant Center user who made the change. Present only if the change was made in the Merchant Center.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Indicates whether the change was made by a user or the API client with or without an External user ID.</p>
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>
     */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>Present only if the change was made using a token from an Anonymous Session.</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>ID of the API Client that made the change. Present only if the change was made using an API Client.</p>
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p><code>true</code> if the change was made via Merchant Center or ImpEx.</p>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ModifiedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ModifiedBy>() {
            @Override
            public String toString() {
                return "TypeReference<ModifiedBy>";
            }
        };
    }
}
