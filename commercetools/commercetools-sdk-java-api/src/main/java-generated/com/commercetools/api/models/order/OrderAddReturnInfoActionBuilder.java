
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddReturnInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddReturnInfoAction orderAddReturnInfoAction = OrderAddReturnInfoAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddReturnInfoActionBuilder implements Builder<OrderAddReturnInfoAction> {

    @Nullable
    private String returnTrackingId;

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    /**
     *
     * @param returnTrackingId value to be set
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder items(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder plusItems(
            final com.commercetools.api.models.order.ReturnItemDraft... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param returnDate value to be set
     * @return Builder
     */

    public OrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    /**
     * builds OrderAddReturnInfoAction with checking for non-null required values
     * @return OrderAddReturnInfoAction
     */
    public OrderAddReturnInfoAction build() {
        Objects.requireNonNull(items, OrderAddReturnInfoAction.class + ": items is missing");
        return new OrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    /**
     * builds OrderAddReturnInfoAction without checking for non-null required values
     * @return OrderAddReturnInfoAction
     */
    public OrderAddReturnInfoAction buildUnchecked() {
        return new OrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    public static OrderAddReturnInfoActionBuilder of() {
        return new OrderAddReturnInfoActionBuilder();
    }

    public static OrderAddReturnInfoActionBuilder of(final OrderAddReturnInfoAction template) {
        OrderAddReturnInfoActionBuilder builder = new OrderAddReturnInfoActionBuilder();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.items = template.getItems();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
