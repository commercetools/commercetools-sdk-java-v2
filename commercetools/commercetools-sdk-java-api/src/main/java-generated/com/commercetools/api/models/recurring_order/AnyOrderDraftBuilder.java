
package com.commercetools.api.models.recurring_order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AnyOrderDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnyOrderDraft anyOrderDraft = AnyOrderDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AnyOrderDraftBuilder implements Builder<AnyOrderDraft> {

    /**
     * builds AnyOrderDraft with checking for non-null required values
     * @return AnyOrderDraft
     */
    public AnyOrderDraft build() {
        return new AnyOrderDraftImpl();
    }

    /**
     * builds AnyOrderDraft without checking for non-null required values
     * @return AnyOrderDraft
     */
    public AnyOrderDraft buildUnchecked() {
        return new AnyOrderDraftImpl();
    }

    /**
     * factory method for an instance of AnyOrderDraftBuilder
     * @return builder
     */
    public static AnyOrderDraftBuilder of() {
        return new AnyOrderDraftBuilder();
    }

    /**
     * create builder for AnyOrderDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnyOrderDraftBuilder of(final AnyOrderDraft template) {
        AnyOrderDraftBuilder builder = new AnyOrderDraftBuilder();
        return builder;
    }

}
