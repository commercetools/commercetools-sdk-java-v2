
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeKeyActionBuilder implements Builder<TypeChangeKeyAction> {

    private String key;

    public TypeChangeKeyActionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public TypeChangeKeyAction build() {
        Objects.requireNonNull(key, TypeChangeKeyAction.class + ": key is missing");
        return new TypeChangeKeyActionImpl(key);
    }

    /**
     * builds TypeChangeKeyAction without checking for non null required values
     */
    public TypeChangeKeyAction buildUnchecked() {
        return new TypeChangeKeyActionImpl(key);
    }

    public static TypeChangeKeyActionBuilder of() {
        return new TypeChangeKeyActionBuilder();
    }

    public static TypeChangeKeyActionBuilder of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionBuilder builder = new TypeChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
