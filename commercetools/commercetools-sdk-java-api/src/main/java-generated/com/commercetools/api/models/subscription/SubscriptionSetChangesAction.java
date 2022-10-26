
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

    String SET_CHANGES = "setChanges";

    /**
     *  <p>Value to set. Can only be unset if <code>messages</code> is set.</p>
     */
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    public void setChanges(final List<ChangeSubscription> changes);

    public static SubscriptionSetChangesAction of() {
        return new SubscriptionSetChangesActionImpl();
    }

    public static SubscriptionSetChangesAction of(final SubscriptionSetChangesAction template) {
        SubscriptionSetChangesActionImpl instance = new SubscriptionSetChangesActionImpl();
        instance.setChanges(template.getChanges());
        return instance;
    }

    public static SubscriptionSetChangesActionBuilder builder() {
        return SubscriptionSetChangesActionBuilder.of();
    }

    public static SubscriptionSetChangesActionBuilder builder(final SubscriptionSetChangesAction template) {
        return SubscriptionSetChangesActionBuilder.of(template);
    }

    default <T> T withSubscriptionSetChangesAction(Function<SubscriptionSetChangesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetChangesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetChangesAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionSetChangesAction>";
            }
        };
    }
}
