
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Notification about changes to a resource. The payload format differs for resource creation, update, and deletion.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSubscription changeSubscription = ChangeSubscription.builder()
 *             .resourceTypeId(ChangeSubscriptionResourceTypeId.BUSINESS_UNIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeSubscriptionImpl.class)
public interface ChangeSubscription {

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     */
    @NotNull
    @JsonProperty("resourceTypeId")
    public ChangeSubscriptionResourceTypeId getResourceTypeId();

    public void setResourceTypeId(final ChangeSubscriptionResourceTypeId resourceTypeId);

    public static ChangeSubscription of() {
        return new ChangeSubscriptionImpl();
    }

    public static ChangeSubscription of(final ChangeSubscription template) {
        ChangeSubscriptionImpl instance = new ChangeSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        return instance;
    }

    public static ChangeSubscriptionBuilder builder() {
        return ChangeSubscriptionBuilder.of();
    }

    public static ChangeSubscriptionBuilder builder(final ChangeSubscription template) {
        return ChangeSubscriptionBuilder.of(template);
    }

    default <T> T withChangeSubscription(Function<ChangeSubscription, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeSubscription>";
            }
        };
    }
}
