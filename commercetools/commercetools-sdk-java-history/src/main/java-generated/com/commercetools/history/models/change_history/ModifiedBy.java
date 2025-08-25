
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Information about the user or API Client who performed the change. This is a variant of <a href="https://docs.commercetools.com/apis/ctp:api:type:LastModifiedBy" rel="nofollow">LastModifiedBy</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ModifiedBy modifiedBy = ModifiedBy.builder()
 *             .isPlatformClient(true)
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ModifiedByImpl.class)
public interface ModifiedBy {

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center.</p>
     * @return isPlatformClient
     */
    @NotNull
    @JsonProperty("isPlatformClient")
    public Boolean getIsPlatformClient();

    /**
     *  <p><span>ID</span> of the Merchant Center user who made the change.</p>
     *  <p>Present only if <code>isPlatformClient</code> is <code>true</code>.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an <span>external user ID</span>, the value is <code>"external-user"</code>.</li>
     *   <li>If the change was made by an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a>, the value is <code>"associate"</code>.</li>
     *  </ul>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p><span>ID</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>Present only if the change was made using a token from an <span>anonymous session</span>.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who made the change.</p>
     *  <p>Present only if the change was made using a token from the <span>password flow</span>.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> who made the change in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @return associate
     */
    @Valid
    @JsonProperty("associate")
    public Reference getAssociate();

    /**
     *  <p><code>true</code> if the change was made using the Merchant Center.</p>
     * @param isPlatformClient value to be set
     */

    public void setIsPlatformClient(final Boolean isPlatformClient);

    /**
     *  <p><span>ID</span> of the Merchant Center user who made the change.</p>
     *  <p>Present only if <code>isPlatformClient</code> is <code>true</code>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Indicates who performed the change.</p>
     *  <ul>
     *   <li>If the change was made by a user, the value is <code>"user"</code>.</li>
     *   <li>If the change was made by an API Client with or without an <span>external user ID</span>, the value is <code>"external-user"</code>.</li>
     *   <li>If the change was made by an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a>, the value is <code>"associate"</code>.</li>
     *  </ul>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p><span>ID</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> that made the change.</p>
     *  <p>Present only if the change was made using an API Client.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>Present only if the change was made using a token from an <span>anonymous session</span>.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who made the change.</p>
     *  <p>Present only if the change was made using a token from the <span>password flow</span>.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> who made the change in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @param associate value to be set
     */

    public void setAssociate(final Reference associate);

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
        instance.setIsPlatformClient(template.getIsPlatformClient());
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setClientId(template.getClientId());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setCustomer(template.getCustomer());
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public ModifiedBy copyDeep();

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
        instance.setIsPlatformClient(template.getIsPlatformClient());
        instance.setId(template.getId());
        instance.setType(template.getType());
        instance.setClientId(template.getClientId());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setCustomer(com.commercetools.history.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setAssociate(com.commercetools.history.models.common.Reference.deepCopy(template.getAssociate()));
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
