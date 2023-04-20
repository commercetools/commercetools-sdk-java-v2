
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnInfoActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnInfoAction stagedOrderSetReturnInfoAction = StagedOrderSetReturnInfoAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetReturnInfoActionBuilder implements Builder<StagedOrderSetReturnInfoAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder items(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
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

    public StagedOrderSetReturnInfoActionBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder addItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraft> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetReturnInfoActionBuilder setItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraft> builder) {
        return items(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()));
    }

    /**
     * value of items}
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems() {
        return this.items;
    }

    /**
     * builds StagedOrderSetReturnInfoAction with checking for non-null required values
     * @return StagedOrderSetReturnInfoAction
     */
    public StagedOrderSetReturnInfoAction build() {
        return new StagedOrderSetReturnInfoActionImpl(items);
    }

    /**
     * builds StagedOrderSetReturnInfoAction without checking for non-null required values
     * @return StagedOrderSetReturnInfoAction
     */
    public StagedOrderSetReturnInfoAction buildUnchecked() {
        return new StagedOrderSetReturnInfoActionImpl(items);
    }

    /**
     * factory method for an instance of StagedOrderSetReturnInfoActionBuilder
     * @return builder
     */
    public static StagedOrderSetReturnInfoActionBuilder of() {
        return new StagedOrderSetReturnInfoActionBuilder();
    }

    /**
     * create builder for StagedOrderSetReturnInfoAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnInfoActionBuilder of(final StagedOrderSetReturnInfoAction template) {
        StagedOrderSetReturnInfoActionBuilder builder = new StagedOrderSetReturnInfoActionBuilder();
        builder.items = template.getItems();
        return builder;
    }

}
