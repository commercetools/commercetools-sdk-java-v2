
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Indicates whether the change was made by a user or the API client with or without an External user ID.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>Present only if the change was made using a token from an Anonymous Session.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>ID of the API Client that made the change. Present only if the change was made using an API Client.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p><code>true</code> if the change was made via Merchant Center or ImpEx.</p>
     * @return isPlatformClient
     */
    @NotNull
    @JsonProperty("isPlatformClient")
    public Boolean getIsPlatformClient();

    /**
     *  <p>ID of the Merchant Center user who made the change. Present only if the change was made in the Merchant Center.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Indicates whether the change was made by a user or the API client with or without an External user ID.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Reference to the Customer who made the change. Present only if the change was made using a token from the Password Flow.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>Present only if the change was made using a token from an Anonymous Session.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>ID of the API Client that made the change. Present only if the change was made using an API Client.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p><code>true</code> if the change was made via Merchant Center or ImpEx.</p>
     * @param isPlatformClient value to be set
     */

    public void setIsPlatformClient(final Boolean isPlatformClient);

    /**
     * factory method
     * @return instance of ModifiedBy
     */
    public static ModifiedBy of() {
        return new ModifiedByImpl();
    }

    /**
     * factory method to create a shallow copy ModifiedBy
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of ModifiedBy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ModifiedBy deepCopy(@Nullable final ModifiedBy template) {
        if (template == null) {
            return null;
        }
        ModifiedByImpl instance = new ModifiedByImpl();
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setClientId(template.getClientId());
        instance.setIsPlatformClient(template.getIsPlatformClient());
        return instance;
    }

    /**
     * builder factory method for ModifiedBy
     * @return builder
     */
    public static ModifiedByBuilder builder() {
        return ModifiedByBuilder.of();
    }

    /**
     * create builder for ModifiedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ModifiedByBuilder builder(final ModifiedBy template) {
        return ModifiedByBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withModifiedBy(Function<ModifiedBy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ModifiedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ModifiedBy>() {
            @Override
            public String toString() {
                return "TypeReference<ModifiedBy>";
            }
        };
    }
}
