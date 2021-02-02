
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionChangeTriggersActionBuilder {

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    public ExtensionChangeTriggersActionBuilder triggers(
            final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
        return this;
    }

    public ExtensionChangeTriggersActionBuilder triggers(
            final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    public ExtensionChangeTriggersAction build() {
        return new ExtensionChangeTriggersActionImpl(triggers);
    }

    public static ExtensionChangeTriggersActionBuilder of() {
        return new ExtensionChangeTriggersActionBuilder();
    }

    public static ExtensionChangeTriggersActionBuilder of(final ExtensionChangeTriggersAction template) {
        ExtensionChangeTriggersActionBuilder builder = new ExtensionChangeTriggersActionBuilder();
        builder.triggers = template.getTriggers();
        return builder;
    }

}
