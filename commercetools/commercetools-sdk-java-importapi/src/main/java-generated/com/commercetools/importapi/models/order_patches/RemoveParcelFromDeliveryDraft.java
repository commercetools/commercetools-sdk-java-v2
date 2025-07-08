
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     *  <p><code>id</code> of the Parcel to be removed from the Delivery.</p>
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>id</code> of the Parcel to be removed from the Delivery.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * factory method
     * @return instance of RemoveParcelFromDeliveryDraft
     */
    public static RemoveParcelFromDeliveryDraft of() {
        return new RemoveParcelFromDeliveryDraftImpl();
    }

    /**
     * factory method to create a shallow copy RemoveParcelFromDeliveryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveParcelFromDeliveryDraft of(final RemoveParcelFromDeliveryDraft template) {
        RemoveParcelFromDeliveryDraftImpl instance = new RemoveParcelFromDeliveryDraftImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    public RemoveParcelFromDeliveryDraft copyDeep();

    /**
     * factory method to create a deep copy of RemoveParcelFromDeliveryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveParcelFromDeliveryDraft deepCopy(@Nullable final RemoveParcelFromDeliveryDraft template) {
        if (template == null) {
            return null;
        }
        RemoveParcelFromDeliveryDraftImpl instance = new RemoveParcelFromDeliveryDraftImpl();
        instance.setParcelId(template.getParcelId());
        return instance;
    }

    /**
     * builder factory method for RemoveParcelFromDeliveryDraft
     * @return builder
     */
    public static RemoveParcelFromDeliveryDraftBuilder builder() {
        return RemoveParcelFromDeliveryDraftBuilder.of();
    }

    /**
     * create builder for RemoveParcelFromDeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveParcelFromDeliveryDraftBuilder builder(final RemoveParcelFromDeliveryDraft template) {
        return RemoveParcelFromDeliveryDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveParcelFromDeliveryDraft(Function<RemoveParcelFromDeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveParcelFromDeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveParcelFromDeliveryDraft>";
            }
        };
    }
}
