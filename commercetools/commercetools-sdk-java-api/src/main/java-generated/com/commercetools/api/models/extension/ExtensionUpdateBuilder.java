
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionUpdateBuilder {

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

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> getActions() {
        return this.actions;
    }

    public ExtensionUpdate build() {
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
