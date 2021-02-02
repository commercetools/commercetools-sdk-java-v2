
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionTriggerBuilder {

    private com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId;

    private java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions;

    public ExtensionTriggerBuilder resourceTypeId(
            final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
        return this;
    }

    public ExtensionTriggerBuilder actions(final com.commercetools.api.models.extension.ExtensionAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ExtensionTriggerBuilder actions(
            final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions) {
        this.actions = actions;
        return this;
    }

    public com.commercetools.api.models.extension.ExtensionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionAction> getActions() {
        return this.actions;
    }

    public ExtensionTrigger build() {
        return new ExtensionTriggerImpl(resourceTypeId, actions);
    }

    public static ExtensionTriggerBuilder of() {
        return new ExtensionTriggerBuilder();
    }

    public static ExtensionTriggerBuilder of(final ExtensionTrigger template) {
        ExtensionTriggerBuilder builder = new ExtensionTriggerBuilder();
        builder.resourceTypeId = template.getResourceTypeId();
        builder.actions = template.getActions();
        return builder;
    }

}
