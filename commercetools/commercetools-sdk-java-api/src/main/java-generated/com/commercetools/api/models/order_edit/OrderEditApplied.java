
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditApplied
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderEditAppliedImpl.class)
public interface OrderEditApplied extends OrderEditResult {

    /**
     * discriminator value for OrderEditApplied
     */
    String APPLIED = "Applied";

    /**
     *
     * @return appliedAt
     */
    @NotNull
    @JsonProperty("appliedAt")
    public ZonedDateTime getAppliedAt();

    /**
     *
     * @return excerptBeforeEdit
     */
    @NotNull
    @Valid
    @JsonProperty("excerptBeforeEdit")
    public OrderExcerpt getExcerptBeforeEdit();

    /**
     *
     * @return excerptAfterEdit
     */
    @NotNull
    @Valid
    @JsonProperty("excerptAfterEdit")
    public OrderExcerpt getExcerptAfterEdit();

    /**
     * set appliedAt
     * @param appliedAt value to be set
     */

    public void setAppliedAt(final ZonedDateTime appliedAt);

    /**
     * set excerptBeforeEdit
     * @param excerptBeforeEdit value to be set
     */

    public void setExcerptBeforeEdit(final OrderExcerpt excerptBeforeEdit);

    /**
     * set excerptAfterEdit
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
        instance.setExcerptBeforeEdit(Optional.ofNullable(template.getExcerptBeforeEdit())
                .map(com.commercetools.api.models.order_edit.OrderExcerpt::deepCopy)
                .orElse(null));
        instance.setExcerptAfterEdit(Optional.ofNullable(template.getExcerptAfterEdit())
                .map(com.commercetools.api.models.order_edit.OrderExcerpt::deepCopy)
                .orElse(null));
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
