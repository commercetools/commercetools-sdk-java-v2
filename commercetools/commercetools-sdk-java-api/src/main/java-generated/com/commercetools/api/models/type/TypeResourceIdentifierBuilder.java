
package com.commercetools.api.models.type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeResourceIdentifierBuilder implements Builder<TypeResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public TypeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public TypeResourceIdentifierBuilder key(@Nullable final String key) {
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

    public TypeResourceIdentifier build() {
        return new TypeResourceIdentifierImpl(id, key);
    }

    /**
     * builds TypeResourceIdentifier without checking for non null required values
     */
    public TypeResourceIdentifier buildUnchecked() {
        return new TypeResourceIdentifierImpl(id, key);
    }

    public static TypeResourceIdentifierBuilder of() {
        return new TypeResourceIdentifierBuilder();
    }

    public static TypeResourceIdentifierBuilder of(final TypeResourceIdentifier template) {
        TypeResourceIdentifierBuilder builder = new TypeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
