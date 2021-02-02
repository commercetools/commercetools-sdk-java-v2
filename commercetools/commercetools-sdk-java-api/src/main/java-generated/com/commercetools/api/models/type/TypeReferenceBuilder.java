
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.type.Type obj;

    public TypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TypeReferenceBuilder obj(@Nullable final com.commercetools.api.models.type.Type obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.type.Type getObj() {
        return this.obj;
    }

    public TypeReference build() {
        return new TypeReferenceImpl(id, obj);
    }

    public static TypeReferenceBuilder of() {
        return new TypeReferenceBuilder();
    }

    public static TypeReferenceBuilder of(final TypeReference template) {
        TypeReferenceBuilder builder = new TypeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
