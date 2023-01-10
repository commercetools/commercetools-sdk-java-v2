
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReplicaCartDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReplicaCartDraft replicaCartDraft = ReplicaCartDraft.builder()
 *             .reference(referenceBuilder -> referenceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft extends io.vrap.rmf.base.client.Draft<ReplicaCartDraft> {

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("reference")
    public Reference getReference();

    /**
     *  <p>User-specific unique identifier of the cart.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setReference(final Reference reference);

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

    @JsonIgnore
    @Deprecated
    public default void setReference(final Object reference) {
        setReference((Reference) reference);
    };

    public static com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReplicaCartDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReplicaCartDraft>";
            }
        };
    }
}
