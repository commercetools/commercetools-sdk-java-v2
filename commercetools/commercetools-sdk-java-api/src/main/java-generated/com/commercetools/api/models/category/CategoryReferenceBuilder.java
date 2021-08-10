
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryReferenceBuilder implements Builder<CategoryReference> {

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
        Objects.requireNonNull(id);
        return new CategoryReferenceImpl(id, obj);
    }

    /**
     * builds CategoryReference without checking for non null required values
     */
    public CategoryReference buildUnchecked() {
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
