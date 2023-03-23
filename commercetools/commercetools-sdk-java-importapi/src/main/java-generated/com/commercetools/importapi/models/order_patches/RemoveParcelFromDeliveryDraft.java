
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveParcelFromDeliveryDraft
 *
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
@JsonDeserialize(as = RemoveParcelFromDeliveryDraftImpl.class)
public interface RemoveParcelFromDeliveryDraft extends io.vrap.rmf.base.client.Draft<RemoveParcelFromDeliveryDraft> {

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    public void setParcelId(final String parcelId);

    public static RemoveParcelFromDeliveryDraft of() {
        return new RemoveParcelFromDeliveryDraftImpl();
    }

    public static RemoveParcelFromDeliveryDraft of(final RemoveParcelFromDeliveryDraft template) {
        RemoveParcelFromDeliveryDraftImpl instance = new RemoveParcelFromDeliveryDraftImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    public static RemoveParcelFromDeliveryDraftBuilder builder() {
        return RemoveParcelFromDeliveryDraftBuilder.of();
    }

    public static RemoveParcelFromDeliveryDraftBuilder builder(final RemoveParcelFromDeliveryDraft template) {
        return RemoveParcelFromDeliveryDraftBuilder.of(template);
    }

    default <T> T withRemoveParcelFromDeliveryDraft(Function<RemoveParcelFromDeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveParcelFromDeliveryDraft>";
            }
        };
    }
}
