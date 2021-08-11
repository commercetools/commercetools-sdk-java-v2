
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionDraftBuilder implements Builder<ExtensionDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    @Nullable
    private Integer timeoutInMs;

    public ExtensionDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public ExtensionDraftBuilder destination(
            final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    public ExtensionDraftBuilder triggers(final com.commercetools.api.models.extension.ExtensionTrigger... triggers) {
        this.triggers = new ArrayList<>(Arrays.asList(triggers));
        return this;
    }

    public ExtensionDraftBuilder withTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        this.triggers = new ArrayList<>();
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    public ExtensionDraftBuilder plusTriggers(
            Function<com.commercetools.api.models.extension.ExtensionTriggerBuilder, com.commercetools.api.models.extension.ExtensionTriggerBuilder> builder) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(builder.apply(com.commercetools.api.models.extension.ExtensionTriggerBuilder.of()).build());
        return this;
    }

    public ExtensionDraftBuilder triggers(
            final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ExtensionDraftBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
        this.timeoutInMs = timeoutInMs;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers() {
        return this.triggers;
    }

    @Nullable
    public Integer getTimeoutInMs() {
        return this.timeoutInMs;
    }

    public ExtensionDraft build() {
        Objects.requireNonNull(destination, ExtensionDraft.class + ": destination is missing");
        Objects.requireNonNull(triggers, ExtensionDraft.class + ": triggers is missing");
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs);
    }

    /**
     * builds ExtensionDraft without checking for non null required values
     */
    public ExtensionDraft buildUnchecked() {
        return new ExtensionDraftImpl(key, destination, triggers, timeoutInMs);
    }

    public static ExtensionDraftBuilder of() {
        return new ExtensionDraftBuilder();
    }

    public static ExtensionDraftBuilder of(final ExtensionDraft template) {
        ExtensionDraftBuilder builder = new ExtensionDraftBuilder();
        builder.key = template.getKey();
        builder.destination = template.getDestination();
        builder.triggers = template.getTriggers();
        builder.timeoutInMs = template.getTimeoutInMs();
        return builder;
    }

}
