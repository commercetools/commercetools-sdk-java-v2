
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReplicaMyCartDraftImpl.class)
public interface ReplicaMyCartDraft {

    @NotNull
    @JsonProperty("reference")
    public Object getReference();

    public void setReference(final CartReference reference);

    public void setReference(final OrderReference reference);

    public void setReference(final Object reference);

    public static ReplicaMyCartDraft of() {
        return new ReplicaMyCartDraftImpl();
    }

    public static ReplicaMyCartDraft of(final ReplicaMyCartDraft template) {
        ReplicaMyCartDraftImpl instance = new ReplicaMyCartDraftImpl();
        instance.setReference(template.getReference());
        return instance;
    }

    public static ReplicaMyCartDraftBuilder builder() {
        return ReplicaMyCartDraftBuilder.of();
    }

    public static ReplicaMyCartDraftBuilder builder(final ReplicaMyCartDraft template) {
        return ReplicaMyCartDraftBuilder.of(template);
    }

    default <T> T withReplicaMyCartDraft(Function<ReplicaMyCartDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReplicaMyCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplicaMyCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReplicaMyCartDraft>";
            }
        };
    }
}
