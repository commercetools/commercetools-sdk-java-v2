
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReplicaCartDraftBuilder
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
public class ReplicaCartDraftBuilder implements Builder<ReplicaCartDraft> {

    private com.commercetools.api.models.common.Reference reference;

    @Nullable
    private String key;

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public ReplicaCartDraftBuilder reference(final com.commercetools.api.models.common.Reference reference) {
        this.reference = reference;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public ReplicaCartDraftBuilder reference(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.reference = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-specific unique identifier of the cart.</p>
     */

    public ReplicaCartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public com.commercetools.api.models.common.Reference getReference() {
        return this.reference;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReplicaCartDraft build() {
        Objects.requireNonNull(reference, ReplicaCartDraft.class + ": reference is missing");
        return new ReplicaCartDraftImpl(reference, key);
    }

    /**
     * builds ReplicaCartDraft without checking for non null required values
     */
    public ReplicaCartDraft buildUnchecked() {
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
