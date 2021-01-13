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
    
    @Nullable
    private String key;

    public ReplicaCartDraftBuilder reference( final com.fasterxml.jackson.databind.JsonNode reference) {
        this.reference = reference;
        return this;
    }
    
    public ReplicaCartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    
    public com.fasterxml.jackson.databind.JsonNode getReference(){
        return this.reference;
    }
    
    @Nullable
    public String getKey(){
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
