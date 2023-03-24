
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDeliveryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDeliveryDraft removeDeliveryDraft = RemoveDeliveryDraft.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveDeliveryDraftBuilder implements Builder<RemoveDeliveryDraft> {

    private String id;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public RemoveDeliveryDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    /**
     * builds RemoveDeliveryDraft with checking for non-null required values
     * @return RemoveDeliveryDraft
     */
    public RemoveDeliveryDraft build() {
        Objects.requireNonNull(id, RemoveDeliveryDraft.class + ": id is missing");
        return new RemoveDeliveryDraftImpl(id);
    }

    /**
     * builds RemoveDeliveryDraft without checking for non-null required values
     * @return RemoveDeliveryDraft
     */
    public RemoveDeliveryDraft buildUnchecked() {
        return new RemoveDeliveryDraftImpl(id);
    }

    public static RemoveDeliveryDraftBuilder of() {
        return new RemoveDeliveryDraftBuilder();
    }

    public static RemoveDeliveryDraftBuilder of(final RemoveDeliveryDraft template) {
        RemoveDeliveryDraftBuilder builder = new RemoveDeliveryDraftBuilder();
        builder.id = template.getId();
        return builder;
    }

}
