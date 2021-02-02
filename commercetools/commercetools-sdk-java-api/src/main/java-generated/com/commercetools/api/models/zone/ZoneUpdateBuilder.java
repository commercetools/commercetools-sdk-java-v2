
package com.commercetools.api.models.zone;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> actions;

    public ZoneUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public ZoneUpdateBuilder actions(final com.commercetools.api.models.zone.ZoneUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public ZoneUpdateBuilder actions(final java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.zone.ZoneUpdateAction> getActions() {
        return this.actions;
    }

    public ZoneUpdate build() {
        return new ZoneUpdateImpl(version, actions);
    }

    public static ZoneUpdateBuilder of() {
        return new ZoneUpdateBuilder();
    }

    public static ZoneUpdateBuilder of(final ZoneUpdate template) {
        ZoneUpdateBuilder builder = new ZoneUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
