
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
     * @param reference value to be set
     * @return Builder
     */

    public ReplicaCartDraftBuilder reference(final com.commercetools.api.models.common.Reference reference) {
        this.reference = reference;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param builder function to build the reference value
     * @return Builder
     */

    public ReplicaCartDraftBuilder reference(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.reference = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReplicaCartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @return reference
     */

    public com.commercetools.api.models.common.Reference getReference() {
        return this.reference;
    }

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ReplicaCartDraft with checking for non-null required values
     * @return ReplicaCartDraft
     */
    public ReplicaCartDraft build() {
        Objects.requireNonNull(reference, ReplicaCartDraft.class + ": reference is missing");
        return new ReplicaCartDraftImpl(reference, key);
    }

    /**
     * builds ReplicaCartDraft without checking for non-null required values
     * @return ReplicaCartDraft
     */
    public ReplicaCartDraft buildUnchecked() {
        return new ReplicaCartDraftImpl(reference, key);
    }

    /**
     * factory method for an instance of ReplicaCartDraftBuilder
     * @return builder
     */
    public static ReplicaCartDraftBuilder of() {
        return new ReplicaCartDraftBuilder();
    }

    /**
     * create builder for ReplicaCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReplicaCartDraftBuilder of(final ReplicaCartDraft template) {
        ReplicaCartDraftBuilder builder = new ReplicaCartDraftBuilder();
        builder.reference = template.getReference();
        builder.key = template.getKey();
        return builder;
    }

}
