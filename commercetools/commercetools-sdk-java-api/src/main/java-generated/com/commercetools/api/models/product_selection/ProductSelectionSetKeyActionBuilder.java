
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionSetKeyActionBuilder implements Builder<ProductSelectionSetKeyAction> {

    @Nullable
    private String key;

    public ProductSelectionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductSelectionSetKeyAction build() {
        return new ProductSelectionSetKeyActionImpl(key);
    }

    /**
     * builds ProductSelectionSetKeyAction without checking for non null required values
     */
    public ProductSelectionSetKeyAction buildUnchecked() {
        return new ProductSelectionSetKeyActionImpl(key);
    }

    public static ProductSelectionSetKeyActionBuilder of() {
        return new ProductSelectionSetKeyActionBuilder();
    }

    public static ProductSelectionSetKeyActionBuilder of(final ProductSelectionSetKeyAction template) {
        ProductSelectionSetKeyActionBuilder builder = new ProductSelectionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
