
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReferenceBuilder implements Builder<Reference> {

    private String id;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    public ReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ReferenceBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public Reference build() {
        Objects.requireNonNull(id, Reference.class + ": id is missing");
        Objects.requireNonNull(typeId, Reference.class + ": typeId is missing");
        return new ReferenceImpl(id, typeId);
    }

    /**
     * builds Reference without checking for non null required values
     */
    public Reference buildUnchecked() {
        return new ReferenceImpl(id, typeId);
    }

    public static ReferenceBuilder of() {
        return new ReferenceBuilder();
    }

    public static ReferenceBuilder of(final Reference template) {
        ReferenceBuilder builder = new ReferenceBuilder();
        builder.id = template.getId();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
