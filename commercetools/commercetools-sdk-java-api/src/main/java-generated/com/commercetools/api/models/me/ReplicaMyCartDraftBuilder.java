
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReplicaMyCartDraftBuilder implements Builder<ReplicaMyCartDraft> {

    private java.lang.Object reference;

    public ReplicaMyCartDraftBuilder reference(final java.lang.Object reference) {
        this.reference = reference;
        return this;
    }

    public java.lang.Object getReference() {
        return this.reference;
    }

    public ReplicaMyCartDraft build() {
        Objects.requireNonNull(reference, ReplicaMyCartDraft.class + ": reference is missing");
        return new ReplicaMyCartDraftImpl(reference);
    }

    /**
     * builds ReplicaMyCartDraft without checking for non null required values
     */
    public ReplicaMyCartDraft buildUnchecked() {
        return new ReplicaMyCartDraftImpl(reference);
    }

    public static ReplicaMyCartDraftBuilder of() {
        return new ReplicaMyCartDraftBuilder();
    }

    public static ReplicaMyCartDraftBuilder of(final ReplicaMyCartDraft template) {
        ReplicaMyCartDraftBuilder builder = new ReplicaMyCartDraftBuilder();
        builder.reference = template.getReference();
        return builder;
    }

}
