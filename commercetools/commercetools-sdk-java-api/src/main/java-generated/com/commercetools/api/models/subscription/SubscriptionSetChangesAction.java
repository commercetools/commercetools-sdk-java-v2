
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetChangesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetChangesAction subscriptionSetChangesAction = SubscriptionSetChangesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionSetChangesActionImpl.class)
public interface SubscriptionSetChangesAction extends SubscriptionUpdateAction {

    /**
     * discriminator value for SubscriptionSetChangesAction
     */
    String SET_CHANGES = "setChanges";

    /**
     *  <p>Value to set. Can only be unset if <code>messages</code> is set.</p>
     * @return changes
     */
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    /**
     *  <p>Value to set. Can only be unset if <code>messages</code> is set.</p>
     * @param changes values to be set
     */

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    /**
     *  <p>Value to set. Can only be unset if <code>messages</code> is set.</p>
     * @param changes values to be set
     */

    public void setChanges(final List<ChangeSubscription> changes);

    /**
     * factory method
     * @return instance of SubscriptionSetChangesAction
     */
    public static SubscriptionSetChangesAction of() {
        return new SubscriptionSetChangesActionImpl();
    }

    /**
     * factory method to copy an instance of SubscriptionSetChangesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionSetChangesAction of(final SubscriptionSetChangesAction template) {
        SubscriptionSetChangesActionImpl instance = new SubscriptionSetChangesActionImpl();
        instance.setChanges(template.getChanges());
        return instance;
    }

    /**
     * builder factory method for SubscriptionSetChangesAction
     * @return builder
     */
    public static SubscriptionSetChangesActionBuilder builder() {
        return SubscriptionSetChangesActionBuilder.of();
    }

    /**
     * create builder for SubscriptionSetChangesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetChangesActionBuilder builder(final SubscriptionSetChangesAction template) {
        return SubscriptionSetChangesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionSetChangesAction(Function<SubscriptionSetChangesAction, T> helper) {
        return helper.apply(this);
    }

    public static SubscriptionSetChangesAction ofUnset() {
        return SubscriptionSetChangesAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionSetChangesAction>";
            }
        };
    }
}
