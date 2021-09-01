
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneReferenceBuilder implements Builder<ZoneReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.zone.Zone obj;

    public ZoneReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ZoneReferenceBuilder obj(
            Function<com.commercetools.api.models.zone.ZoneBuilder, com.commercetools.api.models.zone.ZoneBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.zone.ZoneBuilder.of()).build();
        return this;
    }

    public ZoneReferenceBuilder obj(@Nullable final com.commercetools.api.models.zone.Zone obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.zone.Zone getObj() {
        return this.obj;
    }

    public ZoneReference build() {
        Objects.requireNonNull(id, ZoneReference.class + ": id is missing");
        return new ZoneReferenceImpl(id, obj);
    }

    /**
     * builds ZoneReference without checking for non null required values
     */
    public ZoneReference buildUnchecked() {
        return new ZoneReferenceImpl(id, obj);
    }

    public static ZoneReferenceBuilder of() {
        return new ZoneReferenceBuilder();
    }

    public static ZoneReferenceBuilder of(final ZoneReference template) {
        ZoneReferenceBuilder builder = new ZoneReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
