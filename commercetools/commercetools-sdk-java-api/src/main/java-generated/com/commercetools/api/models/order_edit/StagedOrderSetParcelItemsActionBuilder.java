
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelItemsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelItemsAction stagedOrderSetParcelItemsAction = StagedOrderSetParcelItemsAction.builder()
 *             .parcelId("{parcelId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelItemsActionBuilder implements Builder<StagedOrderSetParcelItemsAction> {

    private String parcelId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetParcelItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds StagedOrderSetParcelItemsAction with checking for non-null required values
     * @return StagedOrderSetParcelItemsAction
     */
    public StagedOrderSetParcelItemsAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelItemsAction.class + ": parcelId is missing");
        Objects.requireNonNull(items, StagedOrderSetParcelItemsAction.class + ": items is missing");
        return new StagedOrderSetParcelItemsActionImpl(parcelId, items);
    }

    /**
     * builds StagedOrderSetParcelItemsAction without checking for non-null required values
     * @return StagedOrderSetParcelItemsAction
     */
    public StagedOrderSetParcelItemsAction buildUnchecked() {
        return new StagedOrderSetParcelItemsActionImpl(parcelId, items);
    }

    /**
     * factory method for an instance of StagedOrderSetParcelItemsActionBuilder
     * @return builder
     */
    public static StagedOrderSetParcelItemsActionBuilder of() {
        return new StagedOrderSetParcelItemsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetParcelItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelItemsActionBuilder of(final StagedOrderSetParcelItemsAction template) {
        StagedOrderSetParcelItemsActionBuilder builder = new StagedOrderSetParcelItemsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
