package com.commercetools.api.models.cart;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart.ReplicaCartDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReplicaCartDraftBuilder {

    
    private com.fasterxml.jackson.databind.JsonNode reference;

    public ReplicaCartDraftBuilder reference( final com.fasterxml.jackson.databind.JsonNode reference) {
        this.reference = reference;
        return this;
    }

    
    public com.fasterxml.jackson.databind.JsonNode getReference(){
        return this.reference;
    }

    public ReplicaCartDraft build() {
        return new ReplicaCartDraftImpl(reference);
    }

    public static ReplicaCartDraftBuilder of() {
        return new ReplicaCartDraftBuilder();
    }

    public static ReplicaCartDraftBuilder of(final ReplicaCartDraft template) {
        ReplicaCartDraftBuilder builder = new ReplicaCartDraftBuilder();
        builder.reference = template.getReference();
        return builder;
    }

}
