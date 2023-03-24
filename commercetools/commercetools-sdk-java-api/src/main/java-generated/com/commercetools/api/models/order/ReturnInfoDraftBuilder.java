
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfoDraft returnInfoDraft = ReturnInfoDraft.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnInfoDraftBuilder implements Builder<ReturnInfoDraft> {

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    @Nullable
    private String returnTrackingId;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder items(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder items(
            final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder plusItems(final com.commercetools.api.models.order.ReturnItemDraft... items) {
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

    public ReturnInfoDraftBuilder plusItems(
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

    public ReturnInfoDraftBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    /**
     *
     * @param returnDate value to be set
     * @return Builder
     */

    public ReturnInfoDraftBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    /**
     * builds ReturnInfoDraft with checking for non-null required values
     * @return ReturnInfoDraft
     */
    public ReturnInfoDraft build() {
        Objects.requireNonNull(items, ReturnInfoDraft.class + ": items is missing");
        return new ReturnInfoDraftImpl(items, returnTrackingId, returnDate);
    }

    /**
     * builds ReturnInfoDraft without checking for non-null required values
     * @return ReturnInfoDraft
     */
    public ReturnInfoDraft buildUnchecked() {
        return new ReturnInfoDraftImpl(items, returnTrackingId, returnDate);
    }

    public static ReturnInfoDraftBuilder of() {
        return new ReturnInfoDraftBuilder();
    }

    public static ReturnInfoDraftBuilder of(final ReturnInfoDraft template) {
        ReturnInfoDraftBuilder builder = new ReturnInfoDraftBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
