
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Notification about changes to a resource. The payload format differs for resource creation, update, and deletion.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSubscription changeSubscription = ChangeSubscription.builder()
 *             .resourceTypeId(ChangeSubscriptionResourceTypeId.APPROVAL_FLOW)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeSubscriptionImpl.class)
public interface ChangeSubscription {

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     * @return resourceTypeId
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public ChangeSubscriptionResourceTypeId getResourceTypeId();

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     * @param resourceTypeId value to be set
     */

    public void setResourceTypeId(final ChangeSubscriptionResourceTypeId resourceTypeId);

    /**
     * factory method
     * @return instance of ChangeSubscription
     */
    public static ChangeSubscription of() {
        return new ChangeSubscriptionImpl();
    }

    /**
     * factory method to create a shallow copy ChangeSubscription
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeSubscription of(final ChangeSubscription template) {
        ChangeSubscriptionImpl instance = new ChangeSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeSubscription
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeSubscription deepCopy(@Nullable final ChangeSubscription template) {
        if (template == null) {
            return null;
        }
        ChangeSubscriptionImpl instance = new ChangeSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        return instance;
    }

    /**
     * builder factory method for ChangeSubscription
     * @return builder
     */
    public static ChangeSubscriptionBuilder builder() {
        return ChangeSubscriptionBuilder.of();
    }

    /**
     * create builder for ChangeSubscription instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSubscriptionBuilder builder(final ChangeSubscription template) {
        return ChangeSubscriptionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeSubscription(Function<ChangeSubscription, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeSubscription>";
            }
        };
    }
}
