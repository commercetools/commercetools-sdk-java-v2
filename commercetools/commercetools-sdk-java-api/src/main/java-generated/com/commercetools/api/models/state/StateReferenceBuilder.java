
package com.commercetools.api.models.state;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.state.State obj;

    public StateReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public StateReferenceBuilder obj(@Nullable final com.commercetools.api.models.state.State obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.state.State getObj() {
        return this.obj;
    }

    public StateReference build() {
        return new StateReferenceImpl(id, obj);
    }

    public static StateReferenceBuilder of() {
        return new StateReferenceBuilder();
    }

    public static StateReferenceBuilder of(final StateReference template) {
        StateReferenceBuilder builder = new StateReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
