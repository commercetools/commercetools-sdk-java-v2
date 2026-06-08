
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Applies Cart Discounts to recurring and non-recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AnyOrderDraft anyOrderDraft = AnyOrderDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AnyOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AnyOrderDraftImpl.class)
public interface AnyOrderDraft extends RecurringOrderScopeDraft, io.vrap.rmf.base.client.Draft<AnyOrderDraft> {

    /**
     * discriminator value for AnyOrderDraft
     */
    String ANY_ORDER = "AnyOrder";

    /**
     * factory method
     * @return instance of AnyOrderDraft
     */
    public static AnyOrderDraft of() {
        return new AnyOrderDraftImpl();
    }

    /**
     * factory method to create a shallow copy AnyOrderDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static AnyOrderDraft of(final AnyOrderDraft template) {
        AnyOrderDraftImpl instance = new AnyOrderDraftImpl();
        return instance;
    }

    public AnyOrderDraft copyDeep();

    /**
     * factory method to create a deep copy of AnyOrderDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AnyOrderDraft deepCopy(@Nullable final AnyOrderDraft template) {
        if (template == null) {
            return null;
        }
        AnyOrderDraftImpl instance = new AnyOrderDraftImpl();
        return instance;
    }

    /**
     * builder factory method for AnyOrderDraft
     * @return builder
     */
    public static AnyOrderDraftBuilder builder() {
        return AnyOrderDraftBuilder.of();
    }

    /**
     * create builder for AnyOrderDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AnyOrderDraftBuilder builder(final AnyOrderDraft template) {
        return AnyOrderDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAnyOrderDraft(Function<AnyOrderDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AnyOrderDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AnyOrderDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AnyOrderDraft>";
            }
        };
    }
}
