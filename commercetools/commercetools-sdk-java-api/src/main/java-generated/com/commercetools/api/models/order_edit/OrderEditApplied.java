
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Result of a successful application of <code>stagedActions</code> to the Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditApplied orderEditApplied = OrderEditApplied.builder()
 *             .appliedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .excerptBeforeEdit(excerptBeforeEditBuilder -> excerptBeforeEditBuilder)
 *             .excerptAfterEdit(excerptAfterEditBuilder -> excerptAfterEditBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Applied")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedImpl.class)
public interface OrderEditApplied extends OrderEditResult {

    /**
     * discriminator value for OrderEditApplied
     */
    String APPLIED = "Applied";

    /**
     *  <p>This field is queryable.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Date and time (UTC) the Order was edited.</p>
     * @return appliedAt
     */
    @NotNull
    @JsonProperty("appliedAt")
    public ZonedDateTime getAppliedAt();

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @return excerptBeforeEdit
     */
    @NotNull
    @Valid
    @JsonProperty("excerptBeforeEdit")
    public OrderExcerpt getExcerptBeforeEdit();

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @return excerptAfterEdit
     */
    @NotNull
    @Valid
    @JsonProperty("excerptAfterEdit")
    public OrderExcerpt getExcerptAfterEdit();

    /**
     *  <p>Date and time (UTC) the Order was edited.</p>
     * @param appliedAt value to be set
     */

    public void setAppliedAt(final ZonedDateTime appliedAt);

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @param excerptBeforeEdit value to be set
     */

    public void setExcerptBeforeEdit(final OrderExcerpt excerptBeforeEdit);

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @param excerptAfterEdit value to be set
     */

    public void setExcerptAfterEdit(final OrderExcerpt excerptAfterEdit);

    /**
     * factory method
     * @return instance of OrderEditApplied
     */
    public static OrderEditApplied of() {
        return new OrderEditAppliedImpl();
    }

    /**
     * factory method to create a shallow copy OrderEditApplied
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditApplied of(final OrderEditApplied template) {
        OrderEditAppliedImpl instance = new OrderEditAppliedImpl();
        instance.setAppliedAt(template.getAppliedAt());
        instance.setExcerptBeforeEdit(template.getExcerptBeforeEdit());
        instance.setExcerptAfterEdit(template.getExcerptAfterEdit());
        return instance;
    }

    public OrderEditApplied copyDeep();

    /**
     * factory method to create a deep copy of OrderEditApplied
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditApplied deepCopy(@Nullable final OrderEditApplied template) {
        if (template == null) {
            return null;
        }
        OrderEditAppliedImpl instance = new OrderEditAppliedImpl();
        instance.setAppliedAt(template.getAppliedAt());
        instance.setExcerptBeforeEdit(
            com.commercetools.api.models.order_edit.OrderExcerpt.deepCopy(template.getExcerptBeforeEdit()));
        instance.setExcerptAfterEdit(
            com.commercetools.api.models.order_edit.OrderExcerpt.deepCopy(template.getExcerptAfterEdit()));
        return instance;
    }

    /**
     * builder factory method for OrderEditApplied
     * @return builder
     */
    public static OrderEditAppliedBuilder builder() {
        return OrderEditAppliedBuilder.of();
    }

    /**
     * create builder for OrderEditApplied instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAppliedBuilder builder(final OrderEditApplied template) {
        return OrderEditAppliedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditApplied(Function<OrderEditApplied, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditApplied> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditApplied>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditApplied>";
            }
        };
    }
}
