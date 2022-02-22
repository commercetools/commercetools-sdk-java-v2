
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionSetCustomFieldActionBuilder implements Builder<ProductSelectionSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ProductSelectionSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductSelectionSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ProductSelectionSetCustomFieldAction build() {
        Objects.requireNonNull(name, ProductSelectionSetCustomFieldAction.class + ": name is missing");
        return new ProductSelectionSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ProductSelectionSetCustomFieldAction without checking for non null required values
     */
    public ProductSelectionSetCustomFieldAction buildUnchecked() {
        return new ProductSelectionSetCustomFieldActionImpl(name, value);
    }

    public static ProductSelectionSetCustomFieldActionBuilder of() {
        return new ProductSelectionSetCustomFieldActionBuilder();
    }

    public static ProductSelectionSetCustomFieldActionBuilder of(final ProductSelectionSetCustomFieldAction template) {
        ProductSelectionSetCustomFieldActionBuilder builder = new ProductSelectionSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
