
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryReferenceBuilder {

    private String id;

    public CategoryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public CategoryReference build() {
        return new CategoryReferenceImpl(id);
    }

    public static CategoryReferenceBuilder of() {
        return new CategoryReferenceBuilder();
    }

    public static CategoryReferenceBuilder of(final CategoryReference template) {
        CategoryReferenceBuilder builder = new CategoryReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
