
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetReturnInfoActionBuilder implements Builder<StagedOrderSetReturnInfoAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    public StagedOrderSetReturnInfoActionBuilder items(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public StagedOrderSetReturnInfoActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        return this;
    }

    public StagedOrderSetReturnInfoActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public StagedOrderSetReturnInfoActionBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderSetReturnInfoActionBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems() {
        return this.items;
    }

    public StagedOrderSetReturnInfoAction build() {
        return new StagedOrderSetReturnInfoActionImpl(items);
    }

    /**
     * builds StagedOrderSetReturnInfoAction without checking for non null required values
     */
    public StagedOrderSetReturnInfoAction buildUnchecked() {
        return new StagedOrderSetReturnInfoActionImpl(items);
    }

    public static StagedOrderSetReturnInfoActionBuilder of() {
        return new StagedOrderSetReturnInfoActionBuilder();
    }

    public static StagedOrderSetReturnInfoActionBuilder of(final StagedOrderSetReturnInfoAction template) {
        StagedOrderSetReturnInfoActionBuilder builder = new StagedOrderSetReturnInfoActionBuilder();
        builder.items = template.getItems();
        return builder;
    }

}
