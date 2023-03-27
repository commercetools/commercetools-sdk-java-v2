
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
 *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
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
public interface CreatedBy extends ClientLogging {

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
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Indicates the anonymous session during which the resource was created.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p><code>id</code> of the APIClient which created the resource.</p>
     * @param clientId value to be set
     */

    public void setClientId(final String clientId);

    /**
     *  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>
     * @param externalUserId value to be set
     */

    public void setExternalUserId(final String externalUserId);

    /**
     *  <p>Indicates the Customer who created the resource using a token from the password flow.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Indicates the anonymous session during which the resource was created.</p>
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
     * factory method to copy an instance of CreatedBy
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
