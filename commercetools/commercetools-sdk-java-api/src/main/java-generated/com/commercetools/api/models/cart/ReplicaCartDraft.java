
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft {

    @NotNull
    @JsonProperty("reference")
    public Object getReference();

    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setReference(final CartReference reference);

    public void setReference(final OrderReference reference);

    public void setReference(final Object reference);

    public void setKey(final String key);

    public static ReplicaCartDraft of() {
        return new ReplicaCartDraftImpl();
    }

    public static ReplicaCartDraft of(final ReplicaCartDraft template) {
        ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
        instance.setReference(template.getReference());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ReplicaCartDraftBuilder builder() {
        return ReplicaCartDraftBuilder.of();
    }

    public static ReplicaCartDraftBuilder builder(final ReplicaCartDraft template) {
        return ReplicaCartDraftBuilder.of(template);
    }

    default <T> T withReplicaCartDraft(Function<ReplicaCartDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReplicaCartDraft>";
            }
        };
    }
}
