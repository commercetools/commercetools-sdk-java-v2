
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>These objects represent information about which <span>API Client</span> created or modified a resource. For more information, see <span>Client Logging</span>.</p>
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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> which created the resource.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p><span>External user ID</span> provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @return externalUserId
     */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
     *  <p>Indicates the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who modified the resource using a token from the <span>password flow</span>.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Indicates that the resource was modified during an <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">anonymous session</a> with the logged ID.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Indicates the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who created or modified the resource in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
     * @return associate
     */
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApiClient" rel="nofollow">API Client</a> which created the resource.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p><span>External user ID</span> provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Indicates the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who modified the resource using a token from the <span>password flow</span>.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Indicates that the resource was modified during an <a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">anonymous session</a> with the logged ID.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Indicates the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who created or modified the resource in the context of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>. Only available for <span>B2B</span>-enabled Projects when an Associate acts on behalf of a company using the <span>associate endpoints</span>.</p>
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
        ClientLoggingImpl instance = new ClientLoggingImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(
            com.commercetools.history.models.common.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAssociate(
            com.commercetools.history.models.common.CustomerReference.deepCopy(template.getAssociate()));
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
