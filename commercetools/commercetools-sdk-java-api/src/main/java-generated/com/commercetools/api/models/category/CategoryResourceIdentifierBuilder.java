
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public CategoryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public CategoryResourceIdentifierBuilder key(@Nullable final String key) {
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

    public CategoryResourceIdentifier build() {
        return new CategoryResourceIdentifierImpl(id, key);
    }

    public static CategoryResourceIdentifierBuilder of() {
        return new CategoryResourceIdentifierBuilder();
    }

    public static CategoryResourceIdentifierBuilder of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierBuilder builder = new CategoryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
