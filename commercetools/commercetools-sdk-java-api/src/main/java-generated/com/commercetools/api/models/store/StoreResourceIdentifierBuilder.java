
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public StoreResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public StoreResourceIdentifierBuilder key(@Nullable final String key) {
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

    public StoreResourceIdentifier build() {
        return new StoreResourceIdentifierImpl(id, key);
    }

    public static StoreResourceIdentifierBuilder of() {
        return new StoreResourceIdentifierBuilder();
    }

    public static StoreResourceIdentifierBuilder of(final StoreResourceIdentifier template) {
        StoreResourceIdentifierBuilder builder = new StoreResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
