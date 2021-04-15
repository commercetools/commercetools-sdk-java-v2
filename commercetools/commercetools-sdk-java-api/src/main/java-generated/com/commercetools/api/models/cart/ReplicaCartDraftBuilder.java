
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReplicaCartDraftBuilder {

    private java.lang.Object reference;

    @Nullable
    private String key;

    public ReplicaCartDraftBuilder reference(final java.lang.Object reference) {
        this.reference = reference;
        return this;
    }

    public ReplicaCartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public java.lang.Object getReference() {
        return this.reference;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReplicaCartDraft build() {
        return new ReplicaCartDraftImpl(reference, key);
    }

    public static ReplicaCartDraftBuilder of() {
        return new ReplicaCartDraftBuilder();
    }

    public static ReplicaCartDraftBuilder of(final ReplicaCartDraft template) {
        ReplicaCartDraftBuilder builder = new ReplicaCartDraftBuilder();
        builder.reference = template.getReference();
        builder.key = template.getKey();
        return builder;
    }

}
