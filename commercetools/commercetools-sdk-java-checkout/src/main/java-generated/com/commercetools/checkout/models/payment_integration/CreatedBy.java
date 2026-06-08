
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Information regarding IDs and references that created the Payment Integration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CreatedBy createdBy = CreatedBy.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CreatedByImpl.class)
public interface CreatedBy {

    /**
     *  <p>ID of the API client that created the PaymentIntegration.</p>
     * @return clientId
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     *  <p>External user ID that created the PaymentIntegration.</p>
     * @return externalUserId
     */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
     *  <p>Customer reference if created by a customer.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public Reference getCustomer();

    /**
     *  <p>Anonymous ID if created by an anonymous user.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>ID of the API client that created the PaymentIntegration.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>External user ID that created the PaymentIntegration.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Customer reference if created by a customer.</p>
     * @param customer value to be set
     */

    public void setCustomer(final Reference customer);

    /**
     *  <p>Anonymous ID if created by an anonymous user.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     * factory method
     * @return instance of CreatedBy
     */
    public static CreatedBy of() {
        return new CreatedByImpl();
    }

    /**
     * factory method to create a shallow copy CreatedBy
     * @param template instance to be copied
     * @return copy instance
     */
    public static CreatedBy of(final CreatedBy template) {
        CreatedByImpl instance = new CreatedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public CreatedBy copyDeep();

    /**
     * factory method to create a deep copy of CreatedBy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CreatedBy deepCopy(@Nullable final CreatedBy template) {
        if (template == null) {
            return null;
        }
        CreatedByImpl instance = new CreatedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(com.commercetools.checkout.models.common.Reference.deepCopy(template.getCustomer()));
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    /**
     * builder factory method for CreatedBy
     * @return builder
     */
    public static CreatedByBuilder builder() {
        return CreatedByBuilder.of();
    }

    /**
     * create builder for CreatedBy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CreatedByBuilder builder(final CreatedBy template) {
        return CreatedByBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCreatedBy(Function<CreatedBy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CreatedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CreatedBy>() {
            @Override
            public String toString() {
                return "TypeReference<CreatedBy>";
            }
        };
    }
}
