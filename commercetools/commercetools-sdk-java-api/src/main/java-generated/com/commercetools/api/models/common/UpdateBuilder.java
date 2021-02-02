
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class UpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.common.UpdateAction> actions;

    public UpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public UpdateBuilder actions(final com.commercetools.api.models.common.UpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public UpdateBuilder actions(final java.util.List<com.commercetools.api.models.common.UpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.common.UpdateAction> getActions() {
        return this.actions;
    }

    public Update build() {
        return new UpdateImpl(version, actions);
    }

    public static UpdateBuilder of() {
        return new UpdateBuilder();
    }

    public static UpdateBuilder of(final Update template) {
        UpdateBuilder builder = new UpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
