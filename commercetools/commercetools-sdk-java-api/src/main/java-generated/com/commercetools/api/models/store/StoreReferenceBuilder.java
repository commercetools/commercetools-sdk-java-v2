
package com.commercetools.api.models.store;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.store.Store obj;

    public StoreReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public StoreReferenceBuilder obj(@Nullable final com.commercetools.api.models.store.Store obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.store.Store getObj() {
        return this.obj;
    }

    public StoreReference build() {
        return new StoreReferenceImpl(id, obj);
    }

    public static StoreReferenceBuilder of() {
        return new StoreReferenceBuilder();
    }

    public static StoreReferenceBuilder of(final StoreReference template) {
        StoreReferenceBuilder builder = new StoreReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
