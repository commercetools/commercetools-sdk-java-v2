
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>IDs and references that last modified the resource. This is present on resources created or updated after 1 February 2019 except for events not tracked.</p>
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
public interface LastModifiedBy extends ClientLogging {

    /**
     *  <p><code>id</code> of the API Client which modified the resource.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header or <code>external_user_id:{externalUserId}</code> scope.</p>
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
     *  <p>Indicates the anonymous session during which the resource was modified.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Indicates if the resource was modified indirectly.</p>
     * @return attributedTo
     */
    @Valid
    @JsonProperty("attributedTo")
    public Attribution getAttributedTo();

    /**
     *  <p>Indicates the Customer who modified the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @return associate
     */
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p><code>id</code> of the API Client which modified the resource.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header or <code>external_user_id:{externalUserId}</code> scope.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Indicates the anonymous session during which the resource was modified.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     *  <p>Indicates if the resource was modified indirectly.</p>
     * @param attributedTo value to be set
     */

    public void setAttributedTo(final Attribution attributedTo);

    /**
     *  <p>Indicates the Customer who modified the resource in the context of a Business Unit. Only present when an Associate acts on behalf of a company using the associate endpoints.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

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
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAssociate(template.getAssociate());
        instance.setAttributedTo(template.getAttributedTo());
        return instance;
    }

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
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getAssociate()));
        instance.setAttributedTo(com.commercetools.api.models.common.Attribution.deepCopy(template.getAttributedTo()));
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
