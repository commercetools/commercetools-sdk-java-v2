
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferencedResourceNotFoundErrorBuilder {

    private String message;

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ReferencedResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ReferencedResourceNotFoundErrorBuilder typeId(
            final com.commercetools.api.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    public ReferencedResourceNotFoundErrorBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ReferencedResourceNotFoundErrorBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReferencedResourceNotFoundError build() {
        return new ReferencedResourceNotFoundErrorImpl(message, typeId, id, key);
    }

    public static ReferencedResourceNotFoundErrorBuilder of() {
        return new ReferencedResourceNotFoundErrorBuilder();
    }

    public static ReferencedResourceNotFoundErrorBuilder of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorBuilder builder = new ReferencedResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.typeId = template.getTypeId();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
