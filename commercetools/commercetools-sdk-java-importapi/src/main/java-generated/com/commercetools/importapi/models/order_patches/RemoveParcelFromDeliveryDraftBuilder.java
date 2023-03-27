
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveParcelFromDeliveryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveParcelFromDeliveryDraft removeParcelFromDeliveryDraft = RemoveParcelFromDeliveryDraft.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryDraftBuilder implements Builder<RemoveParcelFromDeliveryDraft> {

    private String parcelId;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public RemoveParcelFromDeliveryDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     * builds RemoveParcelFromDeliveryDraft with checking for non-null required values
     * @return RemoveParcelFromDeliveryDraft
     */
    public RemoveParcelFromDeliveryDraft build() {
        Objects.requireNonNull(parcelId, RemoveParcelFromDeliveryDraft.class + ": parcelId is missing");
        return new RemoveParcelFromDeliveryDraftImpl(parcelId);
    }

    /**
     * builds RemoveParcelFromDeliveryDraft without checking for non-null required values
     * @return RemoveParcelFromDeliveryDraft
     */
    public RemoveParcelFromDeliveryDraft buildUnchecked() {
        return new RemoveParcelFromDeliveryDraftImpl(parcelId);
    }

    /**
     * factory method for an instance of RemoveParcelFromDeliveryDraftBuilder
     * @return builder
     */
    public static RemoveParcelFromDeliveryDraftBuilder of() {
        return new RemoveParcelFromDeliveryDraftBuilder();
    }

    /**
     * create builder for RemoveParcelFromDeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveParcelFromDeliveryDraftBuilder of(final RemoveParcelFromDeliveryDraft template) {
        RemoveParcelFromDeliveryDraftBuilder builder = new RemoveParcelFromDeliveryDraftBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
