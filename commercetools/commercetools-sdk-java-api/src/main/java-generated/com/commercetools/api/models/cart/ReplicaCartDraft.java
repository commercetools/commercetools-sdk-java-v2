package com.commercetools.api.models.cart;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart.ReplicaCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft  {

    
    @NotNull
    @JsonProperty("reference")
    public JsonNode getReference();
    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setReference(final JsonNode reference);
    
    public void setKey(final String key);

    public static ReplicaCartDraft of(){
        return new ReplicaCartDraftImpl();
    }
    

    public static ReplicaCartDraft of(final ReplicaCartDraft template) {
        ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
        instance.setReference(template.getReference());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReplicaCartDraftBuilder builder(){
        return ReplicaCartDraftBuilder.of();
    }
    
    public static ReplicaCartDraftBuilder builder(final ReplicaCartDraft template){
        return ReplicaCartDraftBuilder.of(template);
    }
    

    default <T> T withReplicaCartDraft(Function<ReplicaCartDraft, T> helper) {
        return helper.apply(this);
    }
}
