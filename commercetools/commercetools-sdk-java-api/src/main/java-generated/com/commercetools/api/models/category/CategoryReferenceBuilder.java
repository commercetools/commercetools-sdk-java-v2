
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.category.Category obj;

    public CategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CategoryReferenceBuilder obj(@Nullable final com.commercetools.api.models.category.Category obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.category.Category getObj() {
        return this.obj;
    }

    public CategoryReference build() {
        return new CategoryReferenceImpl(id, obj);
    }

    public static CategoryReferenceBuilder of() {
        return new CategoryReferenceBuilder();
    }

    public static CategoryReferenceBuilder of(final CategoryReference template) {
        CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
