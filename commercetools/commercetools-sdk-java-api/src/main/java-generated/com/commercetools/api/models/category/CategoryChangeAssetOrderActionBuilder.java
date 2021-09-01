
package com.commercetools.api.models.category;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeAssetOrderActionBuilder implements Builder<CategoryChangeAssetOrderAction> {

    private java.util.List<String> assetOrder;

    public CategoryChangeAssetOrderActionBuilder assetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
        return this;
    }

    public CategoryChangeAssetOrderActionBuilder assetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
        return this;
    }

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public CategoryChangeAssetOrderAction build() {
        Objects.requireNonNull(assetOrder, CategoryChangeAssetOrderAction.class + ": assetOrder is missing");
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }

    /**
     * builds CategoryChangeAssetOrderAction without checking for non null required values
     */
    public CategoryChangeAssetOrderAction buildUnchecked() {
        return new CategoryChangeAssetOrderActionImpl(assetOrder);
    }

    public static CategoryChangeAssetOrderActionBuilder of() {
        return new CategoryChangeAssetOrderActionBuilder();
    }

    public static CategoryChangeAssetOrderActionBuilder of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionBuilder builder = new CategoryChangeAssetOrderActionBuilder();
        builder.assetOrder = template.getAssetOrder();
        return builder;
    }

}
