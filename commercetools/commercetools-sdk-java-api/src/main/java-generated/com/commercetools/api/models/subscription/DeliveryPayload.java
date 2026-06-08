
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>All payloads for the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> share these common fields.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryPayload deliveryPayload = DeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DeliveryPayload extends SubscriptionNotification {

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Useful for processing notifications if the Destination receives them from multiple Projects.</p>
     * @return projectKey
     */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
     *  <p>Reference to the resource that triggered the notification.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @return resourceUserProvidedIdentifiers
     */
    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>. Useful for processing notifications if the Destination receives them from multiple Projects.</p>
     * @param projectKey value to be set
     */

    public void setProjectKey(final String projectKey);

    /**
     *  <p>Reference to the resource that triggered the notification.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>User-defined unique identifiers of the resource.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     */

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    public DeliveryPayload copyDeep();

    /**
     * factory method to create a deep copy of DeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DeliveryPayload deepCopy(@Nullable final DeliveryPayload template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof DeliveryPayloadImpl)) {
            return template.copyDeep();
        }
        DeliveryPayloadImpl instance = new DeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDeliveryPayload(Function<DeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryPayload>";
            }
        };
    }
}
