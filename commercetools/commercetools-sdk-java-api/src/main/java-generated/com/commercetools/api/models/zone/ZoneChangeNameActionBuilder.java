
package com.commercetools.api.models.zone;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneChangeNameActionBuilder implements Builder<ZoneChangeNameAction> {

    private String name;

    public ZoneChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ZoneChangeNameAction build() {
        Objects.requireNonNull(name, ZoneChangeNameAction.class + ": name is missing");
        return new ZoneChangeNameActionImpl(name);
    }

    /**
     * builds ZoneChangeNameAction without checking for non null required values
     */
    public ZoneChangeNameAction buildUnchecked() {
        return new ZoneChangeNameActionImpl(name);
    }

    public static ZoneChangeNameActionBuilder of() {
        return new ZoneChangeNameActionBuilder();
    }

    public static ZoneChangeNameActionBuilder of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionBuilder builder = new ZoneChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
