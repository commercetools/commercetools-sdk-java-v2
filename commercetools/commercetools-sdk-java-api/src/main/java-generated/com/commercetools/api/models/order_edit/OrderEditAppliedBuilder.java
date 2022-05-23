
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditAppliedBuilder
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
public class OrderEditAppliedBuilder implements Builder<OrderEditApplied> {

    private java.time.ZonedDateTime appliedAt;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit;

    private com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit;

    /**
     <>
     */

    public OrderEditAppliedBuilder appliedAt(final java.time.ZonedDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     <>
     */

    public OrderEditAppliedBuilder excerptBeforeEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerptBuilder> builder) {
        this.excerptBeforeEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of())
                .build();
        return this;
    }

    /**
     <>
     */

    public OrderEditAppliedBuilder excerptBeforeEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit) {
        this.excerptBeforeEdit = excerptBeforeEdit;
        return this;
    }

    /**
     <>
     */

    public OrderEditAppliedBuilder excerptAfterEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerptBuilder> builder) {
        this.excerptAfterEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of()).build();
        return this;
    }

    /**
     <>
     */

    public OrderEditAppliedBuilder excerptAfterEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.excerptAfterEdit = excerptAfterEdit;
        return this;
    }

    public java.time.ZonedDateTime getAppliedAt() {
        return this.appliedAt;
    }

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptBeforeEdit() {
        return this.excerptBeforeEdit;
    }

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptAfterEdit() {
        return this.excerptAfterEdit;
    }

    public OrderEditApplied build() {
        Objects.requireNonNull(appliedAt, OrderEditApplied.class + ": appliedAt is missing");
        Objects.requireNonNull(excerptBeforeEdit, OrderEditApplied.class + ": excerptBeforeEdit is missing");
        Objects.requireNonNull(excerptAfterEdit, OrderEditApplied.class + ": excerptAfterEdit is missing");
        return new OrderEditAppliedImpl(appliedAt, excerptBeforeEdit, excerptAfterEdit);
    }

    /**
     * builds OrderEditApplied without checking for non null required values
     */
    public OrderEditApplied buildUnchecked() {
        return new OrderEditAppliedImpl(appliedAt, excerptBeforeEdit, excerptAfterEdit);
    }

    public static OrderEditAppliedBuilder of() {
        return new OrderEditAppliedBuilder();
    }

    public static OrderEditAppliedBuilder of(final OrderEditApplied template) {
        OrderEditAppliedBuilder builder = new OrderEditAppliedBuilder();
        builder.appliedAt = template.getAppliedAt();
        builder.excerptBeforeEdit = template.getExcerptBeforeEdit();
        builder.excerptAfterEdit = template.getExcerptAfterEdit();
        return builder;
    }

}
