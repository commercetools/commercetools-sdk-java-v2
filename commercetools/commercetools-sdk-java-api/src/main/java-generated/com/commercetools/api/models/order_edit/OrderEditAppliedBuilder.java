
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
     *  <p>Date and time (UTC) the Order was edited.</p>
     * @param appliedAt value to be set
     * @return Builder
     */

    public OrderEditAppliedBuilder appliedAt(final java.time.ZonedDateTime appliedAt) {
        this.appliedAt = appliedAt;
        return this;
    }

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @param builder function to build the excerptBeforeEdit value
     * @return Builder
     */

    public OrderEditAppliedBuilder excerptBeforeEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerptBuilder> builder) {
        this.excerptBeforeEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @param builder function to build the excerptBeforeEdit value
     * @return Builder
     */

    public OrderEditAppliedBuilder withExcerptBeforeEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerpt> builder) {
        this.excerptBeforeEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of());
        return this;
    }

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @param excerptBeforeEdit value to be set
     * @return Builder
     */

    public OrderEditAppliedBuilder excerptBeforeEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptBeforeEdit) {
        this.excerptBeforeEdit = excerptBeforeEdit;
        return this;
    }

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @param builder function to build the excerptAfterEdit value
     * @return Builder
     */

    public OrderEditAppliedBuilder excerptAfterEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerptBuilder> builder) {
        this.excerptAfterEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @param builder function to build the excerptAfterEdit value
     * @return Builder
     */

    public OrderEditAppliedBuilder withExcerptAfterEdit(
            Function<com.commercetools.api.models.order_edit.OrderExcerptBuilder, com.commercetools.api.models.order_edit.OrderExcerpt> builder) {
        this.excerptAfterEdit = builder.apply(com.commercetools.api.models.order_edit.OrderExcerptBuilder.of());
        return this;
    }

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @param excerptAfterEdit value to be set
     * @return Builder
     */

    public OrderEditAppliedBuilder excerptAfterEdit(
            final com.commercetools.api.models.order_edit.OrderExcerpt excerptAfterEdit) {
        this.excerptAfterEdit = excerptAfterEdit;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order was edited.</p>
     * @return appliedAt
     */

    public java.time.ZonedDateTime getAppliedAt() {
        return this.appliedAt;
    }

    /**
     *  <p>Prices of the Order before the edit.</p>
     * @return excerptBeforeEdit
     */

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptBeforeEdit() {
        return this.excerptBeforeEdit;
    }

    /**
     *  <p>Prices of the Order after the edit.</p>
     * @return excerptAfterEdit
     */

    public com.commercetools.api.models.order_edit.OrderExcerpt getExcerptAfterEdit() {
        return this.excerptAfterEdit;
    }

    /**
     * builds OrderEditApplied with checking for non-null required values
     * @return OrderEditApplied
     */
    public OrderEditApplied build() {
        Objects.requireNonNull(appliedAt, OrderEditApplied.class + ": appliedAt is missing");
        Objects.requireNonNull(excerptBeforeEdit, OrderEditApplied.class + ": excerptBeforeEdit is missing");
        Objects.requireNonNull(excerptAfterEdit, OrderEditApplied.class + ": excerptAfterEdit is missing");
        return new OrderEditAppliedImpl(appliedAt, excerptBeforeEdit, excerptAfterEdit);
    }

    /**
     * builds OrderEditApplied without checking for non-null required values
     * @return OrderEditApplied
     */
    public OrderEditApplied buildUnchecked() {
        return new OrderEditAppliedImpl(appliedAt, excerptBeforeEdit, excerptAfterEdit);
    }

    /**
     * factory method for an instance of OrderEditAppliedBuilder
     * @return builder
     */
    public static OrderEditAppliedBuilder of() {
        return new OrderEditAppliedBuilder();
    }

    /**
     * create builder for OrderEditApplied instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAppliedBuilder of(final OrderEditApplied template) {
        OrderEditAppliedBuilder builder = new OrderEditAppliedBuilder();
        builder.appliedAt = template.getAppliedAt();
        builder.excerptBeforeEdit = template.getExcerptBeforeEdit();
        builder.excerptAfterEdit = template.getExcerptAfterEdit();
        return builder;
    }

}
