
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionChangeTriggersActionBuilder implements Builder<ExtensionChangeTriggersAction> {

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

    public ExtensionChangeTriggersActionBuilder plusTriggers(
            final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.addAll(Arrays.asList(triggers));
        return this;
    }

    public ExtensionChangeTriggersActionBuilder plusTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    public ExtensionChangeTriggersActionBuilder withTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        this.triggers = new ArrayList<>();
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    public ExtensionChangeTriggersAction build() {
        Objects.requireNonNull(triggers, ExtensionChangeTriggersAction.class + ": triggers is missing");
        return new ExtensionChangeTriggersActionImpl(triggers);
    }

    /**
     * builds ExtensionChangeTriggersAction without checking for non null required values
     */
    public ExtensionChangeTriggersAction buildUnchecked() {
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
