
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionInputBuilder implements Builder<ExtensionInput> {

    private com.commercetools.api.models.extension.ExtensionAction action;

    private com.commercetools.api.models.common.Reference resource;

    public ExtensionInputBuilder action(final com.commercetools.api.models.extension.ExtensionAction action) {
        this.action = action;
        return this;
    }

    public ExtensionInputBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    public ExtensionInputBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.extension.ExtensionAction getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public ExtensionInput build() {
        Objects.requireNonNull(action, ExtensionInput.class + ": action is missing");
        Objects.requireNonNull(resource, ExtensionInput.class + ": resource is missing");
        return new ExtensionInputImpl(action, resource);
    }

    /**
     * builds ExtensionInput without checking for non null required values
     */
    public ExtensionInput buildUnchecked() {
        return new ExtensionInputImpl(action, resource);
    }

    public static ExtensionInputBuilder of() {
        return new ExtensionInputBuilder();
    }

    public static ExtensionInputBuilder of(final ExtensionInput template) {
        ExtensionInputBuilder builder = new ExtensionInputBuilder();
        builder.action = template.getAction();
        builder.resource = template.getResource();
        return builder;
    }

}
