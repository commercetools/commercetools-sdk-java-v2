
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypeUpdateBuilder implements Builder<TypeUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.type.TypeUpdateAction> actions;

    public TypeUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public TypeUpdateBuilder actions(final com.commercetools.api.models.type.TypeUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public TypeUpdateBuilder actions(final java.util.List<com.commercetools.api.models.type.TypeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public TypeUpdateBuilder plusActions(final com.commercetools.api.models.type.TypeUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    public TypeUpdateBuilder plusActions(
            Function<com.commercetools.api.models.type.TypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.type.TypeUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.type.TypeUpdateActionBuilder.of()).build());
        return this;
    }

    public TypeUpdateBuilder withActions(
            Function<com.commercetools.api.models.type.TypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.type.TypeUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.type.TypeUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.type.TypeUpdateAction> getActions() {
        return this.actions;
    }

    public TypeUpdate build() {
        Objects.requireNonNull(version, TypeUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, TypeUpdate.class + ": actions is missing");
        return new TypeUpdateImpl(version, actions);
    }

    /**
     * builds TypeUpdate without checking for non null required values
     */
    public TypeUpdate buildUnchecked() {
        return new TypeUpdateImpl(version, actions);
    }

    public static TypeUpdateBuilder of() {
        return new TypeUpdateBuilder();
    }

    public static TypeUpdateBuilder of(final TypeUpdate template) {
        TypeUpdateBuilder builder = new TypeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
