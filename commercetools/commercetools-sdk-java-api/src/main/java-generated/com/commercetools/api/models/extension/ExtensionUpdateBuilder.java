
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionUpdateBuilder implements Builder<ExtensionUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions;

    public ExtensionUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ExtensionUpdateBuilder actions(
            final com.commercetools.api.models.extension.ExtensionUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ExtensionUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public ExtensionUpdateBuilder plusActions(
            final com.commercetools.api.models.extension.ExtensionUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public ExtensionUpdateBuilder plusActions(
            Function<com.commercetools.api.models.extension.ExtensionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder.of()).build());
        return this;
    }

    public ExtensionUpdateBuilder withActions(
            Function<com.commercetools.api.models.extension.ExtensionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> getActions() {
        return this.actions;
    }

    public ExtensionUpdate build() {
        Objects.requireNonNull(version, ExtensionUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ExtensionUpdate.class + ": actions is missing");
        return new ExtensionUpdateImpl(version, actions);
    }

    /**
     * builds ExtensionUpdate without checking for non null required values
     */
    public ExtensionUpdate buildUnchecked() {
        return new ExtensionUpdateImpl(version, actions);
    }

    public static ExtensionUpdateBuilder of() {
        return new ExtensionUpdateBuilder();
    }

    public static ExtensionUpdateBuilder of(final ExtensionUpdate template) {
        ExtensionUpdateBuilder builder = new ExtensionUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
