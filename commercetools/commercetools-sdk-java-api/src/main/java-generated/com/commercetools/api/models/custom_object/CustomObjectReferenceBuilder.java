
package com.commercetools.api.models.custom_object;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.custom_object.CustomObject obj;

    public CustomObjectReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomObjectReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.custom_object.CustomObject obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.custom_object.CustomObject getObj() {
        return this.obj;
    }

    public CustomObjectReference build() {
        return new CustomObjectReferenceImpl(id, obj);
    }

    public static CustomObjectReferenceBuilder of() {
        return new CustomObjectReferenceBuilder();
    }

    public static CustomObjectReferenceBuilder of(final CustomObjectReference template) {
        CustomObjectReferenceBuilder builder = new CustomObjectReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
