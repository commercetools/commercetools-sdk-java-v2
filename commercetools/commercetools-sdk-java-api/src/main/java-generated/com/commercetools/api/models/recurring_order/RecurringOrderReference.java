
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a RecurringOrder.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderReference recurringOrderReference = RecurringOrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("recurring-order")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderReferenceImpl.class)
public interface RecurringOrderReference extends Reference {

    /**
     * discriminator value for RecurringOrderReference
     */
    String RECURRING_ORDER = "recurring-order";

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public RecurringOrder getObj();

    /**
     *  <p>Unique identifier of the referenced RecurringOrder.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded RecurringOrder. Only present in responses to requests with Reference Expansion for RecurringOrders.</p>
     * @param obj value to be set
     */

    public void setObj(final RecurringOrder obj);

    /**
     *  <p>Unique identifier of the referenced RecurringOrder.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of RecurringOrderReference
     */
    public static RecurringOrderReference of() {
        return new RecurringOrderReferenceImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderReference of(final RecurringOrderReference template) {
        RecurringOrderReferenceImpl instance = new RecurringOrderReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public RecurringOrderReference copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderReference deepCopy(@Nullable final RecurringOrderReference template) {
        if (template == null) {
            return null;
        }
        RecurringOrderReferenceImpl instance = new RecurringOrderReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.recurring_order.RecurringOrder.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderReference
     * @return builder
     */
    public static RecurringOrderReferenceBuilder builder() {
        return RecurringOrderReferenceBuilder.of();
    }

    /**
     * create builder for RecurringOrderReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderReferenceBuilder builder(final RecurringOrderReference template) {
        return RecurringOrderReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderReference(Function<RecurringOrderReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderReference>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderReference>";
            }
        };
    }
}
