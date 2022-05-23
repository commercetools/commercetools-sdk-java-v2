
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   RemoveParcelFromDeliveryDraft removeParcelFromDeliveryDraft = RemoveParcelFromDeliveryDraft.builder()
           .parcelId("{parcelId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryDraftBuilder implements Builder<RemoveParcelFromDeliveryDraft> {

    private String parcelId;

    public RemoveParcelFromDeliveryDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public RemoveParcelFromDeliveryDraft build() {
        Objects.requireNonNull(parcelId, RemoveParcelFromDeliveryDraft.class + ": parcelId is missing");
        return new RemoveParcelFromDeliveryDraftImpl(parcelId);
    }

    /**
     * builds RemoveParcelFromDeliveryDraft without checking for non null required values
     */
    public RemoveParcelFromDeliveryDraft buildUnchecked() {
        return new RemoveParcelFromDeliveryDraftImpl(parcelId);
    }

    public static RemoveParcelFromDeliveryDraftBuilder of() {
        return new RemoveParcelFromDeliveryDraftBuilder();
    }

    public static RemoveParcelFromDeliveryDraftBuilder of(final RemoveParcelFromDeliveryDraft template) {
        RemoveParcelFromDeliveryDraftBuilder builder = new RemoveParcelFromDeliveryDraftBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
