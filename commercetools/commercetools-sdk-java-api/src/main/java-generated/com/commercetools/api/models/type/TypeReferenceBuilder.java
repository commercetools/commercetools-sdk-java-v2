
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeReferenceBuilder implements Builder<TypeReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.type.Type obj;

    public TypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TypeReferenceBuilder obj(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build();
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
        Objects.requireNonNull(id, TypeReference.class + ": id is missing");
        return new TypeReferenceImpl(id, obj);
    }

    /**
     * builds TypeReference without checking for non null required values
     */
    public TypeReference buildUnchecked() {
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
