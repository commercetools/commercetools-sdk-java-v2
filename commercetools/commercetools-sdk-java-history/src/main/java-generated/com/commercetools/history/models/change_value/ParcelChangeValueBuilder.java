
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelChangeValueBuilder {

    private String id;

    private String createdAt;

    public ParcelChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ParcelChangeValueBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public ParcelChangeValue build() {
        return new ParcelChangeValueImpl(id, createdAt);
    }

    public static ParcelChangeValueBuilder of() {
        return new ParcelChangeValueBuilder();
    }

    public static ParcelChangeValueBuilder of(final ParcelChangeValue template) {
        ParcelChangeValueBuilder builder = new ParcelChangeValueBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
