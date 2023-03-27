
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDeliveryDraft
 *
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
@JsonDeserialize(as = RemoveDeliveryDraftImpl.class)
public interface RemoveDeliveryDraft extends io.vrap.rmf.base.client.Draft<RemoveDeliveryDraft> {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of RemoveDeliveryDraft
     */
    public static RemoveDeliveryDraft of() {
        return new RemoveDeliveryDraftImpl();
    }

    /**
     * factory method to copy an instance of RemoveDeliveryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveDeliveryDraft of(final RemoveDeliveryDraft template) {
        RemoveDeliveryDraftImpl instance = new RemoveDeliveryDraftImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for RemoveDeliveryDraft
     * @return builder
     */
    public static RemoveDeliveryDraftBuilder builder() {
        return RemoveDeliveryDraftBuilder.of();
    }

    /**
     * create builder for RemoveDeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDeliveryDraftBuilder builder(final RemoveDeliveryDraft template) {
        return RemoveDeliveryDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveDeliveryDraft(Function<RemoveDeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveDeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveDeliveryDraft>";
            }
        };
    }
}
