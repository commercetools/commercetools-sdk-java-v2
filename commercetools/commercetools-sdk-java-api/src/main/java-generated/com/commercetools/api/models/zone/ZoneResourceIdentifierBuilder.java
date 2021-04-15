
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ZoneResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ZoneResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ZoneResourceIdentifier build() {
        return new ZoneResourceIdentifierImpl(id, key);
    }

    public static ZoneResourceIdentifierBuilder of() {
        return new ZoneResourceIdentifierBuilder();
    }

    public static ZoneResourceIdentifierBuilder of(final ZoneResourceIdentifier template) {
        ZoneResourceIdentifierBuilder builder = new ZoneResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
