
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeKeyReferenceBuilder implements Builder<TypeKeyReference> {

    private String key;

    public TypeKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TypeKeyReference build() {
        Objects.requireNonNull(key, TypeKeyReference.class + ": key is missing");
        return new TypeKeyReferenceImpl(key);
    }

    /**
     * builds TypeKeyReference without checking for non null required values
     */
    public TypeKeyReference buildUnchecked() {
        return new TypeKeyReferenceImpl(key);
    }

    public static TypeKeyReferenceBuilder of() {
        return new TypeKeyReferenceBuilder();
    }

    public static TypeKeyReferenceBuilder of(final TypeKeyReference template) {
        TypeKeyReferenceBuilder builder = new TypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
