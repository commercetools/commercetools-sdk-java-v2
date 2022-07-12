
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionTriggerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionTrigger extensionTrigger = ExtensionTrigger.builder()
 *             .resourceTypeId(ExtensionResourceTypeId.CART)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionTriggerBuilder implements Builder<ExtensionTrigger> {

    private com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId;

    private java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions;

    @Nullable
    private String condition;

    /**
     *  <p><code>cart</code>, <code>order</code>, <code>payment</code>, and <code>customer</code> are supported.</p>
     */

    public ExtensionTriggerBuilder resourceTypeId(
            final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     */

    public ExtensionTriggerBuilder actions(final com.commercetools.api.models.extension.ExtensionAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     */

    public ExtensionTriggerBuilder actions(
            final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p><code>Create</code> and <code>Update</code> requests are supported.</p>
     */

    public ExtensionTriggerBuilder plusActions(
            final com.commercetools.api.models.extension.ExtensionAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Valid predicate that controls the conditions under which the API Extension is called. The Extension is not triggered when the specified condition is not fulfilled.</p>
     */

    public ExtensionTriggerBuilder condition(@Nullable final String condition) {
        this.condition = condition;
        return this;
    }

    public com.commercetools.api.models.extension.ExtensionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionAction> getActions() {
        return this.actions;
    }

    @Nullable
    public String getCondition() {
        return this.condition;
    }

    public ExtensionTrigger build() {
        Objects.requireNonNull(resourceTypeId, ExtensionTrigger.class + ": resourceTypeId is missing");
        Objects.requireNonNull(actions, ExtensionTrigger.class + ": actions is missing");
        return new ExtensionTriggerImpl(resourceTypeId, actions, condition);
    }

    /**
     * builds ExtensionTrigger without checking for non null required values
     */
    public ExtensionTrigger buildUnchecked() {
        return new ExtensionTriggerImpl(resourceTypeId, actions, condition);
    }

    public static ExtensionTriggerBuilder of() {
        return new ExtensionTriggerBuilder();
    }

    public static ExtensionTriggerBuilder of(final ExtensionTrigger template) {
        ExtensionTriggerBuilder builder = new ExtensionTriggerBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        builder.actions = template.getActions();
        builder.condition = template.getCondition();
        return builder;
    }

}
