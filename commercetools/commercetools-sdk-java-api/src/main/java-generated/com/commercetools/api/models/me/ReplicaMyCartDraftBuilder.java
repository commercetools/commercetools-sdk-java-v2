
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReplicaMyCartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReplicaMyCartDraft replicaMyCartDraft = ReplicaMyCartDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReplicaMyCartDraftBuilder implements Builder<ReplicaMyCartDraft> {

    private java.lang.Object reference;

    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @param reference value to be set
     * @return Builder
     */

    public ReplicaMyCartDraftBuilder reference(final java.lang.Object reference) {
        this.reference = reference;
        return this;
    }

    /**
     *  <p>Reference to a Cart or Order that is replicated.</p>
     * @return reference
     */

    public java.lang.Object getReference() {
        return this.reference;
    }

    /**
     * builds ReplicaMyCartDraft with checking for non-null required values
     * @return ReplicaMyCartDraft
     */
    public ReplicaMyCartDraft build() {
        Objects.requireNonNull(reference, ReplicaMyCartDraft.class + ": reference is missing");
        return new ReplicaMyCartDraftImpl(reference);
    }

    /**
     * builds ReplicaMyCartDraft without checking for non-null required values
     * @return ReplicaMyCartDraft
     */
    public ReplicaMyCartDraft buildUnchecked() {
        return new ReplicaMyCartDraftImpl(reference);
    }

    /**
     * factory method for an instance of ReplicaMyCartDraftBuilder
     * @return builder
     */
    public static ReplicaMyCartDraftBuilder of() {
        return new ReplicaMyCartDraftBuilder();
    }

    /**
     * create builder for ReplicaMyCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReplicaMyCartDraftBuilder of(final ReplicaMyCartDraft template) {
        ReplicaMyCartDraftBuilder builder = new ReplicaMyCartDraftBuilder();
        builder.reference = template.getReference();
        return builder;
    }

}
