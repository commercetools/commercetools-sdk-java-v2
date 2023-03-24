
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReturnInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReturnInfo returnInfo = ReturnInfo.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .returnTrackingId("{returnTrackingId}")
 *             .returnDate("{returnDate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnInfoBuilder implements Builder<ReturnInfo> {

    private java.util.List<com.commercetools.history.models.common.ReturnItem> items;

    private String returnTrackingId;

    private String returnDate;

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoBuilder items(final com.commercetools.history.models.common.ReturnItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoBuilder items(final java.util.List<com.commercetools.history.models.common.ReturnItem> items) {
        this.items = items;
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public ReturnInfoBuilder plusItems(final com.commercetools.history.models.common.ReturnItem... items) {
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

    public ReturnInfoBuilder plusItems(
            Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the items value
     * @return Builder
     */

    public ReturnInfoBuilder withItems(
            Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifies, which return tracking ID is connected to this particular return.</p>
     * @param returnTrackingId value to be set
     * @return Builder
     */

    public ReturnInfoBuilder returnTrackingId(final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    /**
     *
     * @param returnDate value to be set
     * @return Builder
     */

    public ReturnInfoBuilder returnDate(final String returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.ReturnItem> getItems() {
        return this.items;
    }

    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    public String getReturnDate() {
        return this.returnDate;
    }

    /**
     * builds ReturnInfo with checking for non-null required values
     * @return ReturnInfo
     */
    public ReturnInfo build() {
        Objects.requireNonNull(items, ReturnInfo.class + ": items is missing");
        Objects.requireNonNull(returnTrackingId, ReturnInfo.class + ": returnTrackingId is missing");
        Objects.requireNonNull(returnDate, ReturnInfo.class + ": returnDate is missing");
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    /**
     * builds ReturnInfo without checking for non-null required values
     * @return ReturnInfo
     */
    public ReturnInfo buildUnchecked() {
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    public static ReturnInfoBuilder of() {
        return new ReturnInfoBuilder();
    }

    public static ReturnInfoBuilder of(final ReturnInfo template) {
        ReturnInfoBuilder builder = new ReturnInfoBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
