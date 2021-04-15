
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetProductPriceCustomFieldActionBuilder {

    private String priceId;

    @Nullable
    private Boolean staged;

    private String name;

    @Nullable
    private java.lang.Object value;

    public ProductSetProductPriceCustomFieldActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductSetProductPriceCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetProductPriceCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ProductSetProductPriceCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ProductSetProductPriceCustomFieldAction build() {
        return new ProductSetProductPriceCustomFieldActionImpl(priceId, staged, name, value);
    }

    public static ProductSetProductPriceCustomFieldActionBuilder of() {
        return new ProductSetProductPriceCustomFieldActionBuilder();
    }

    public static ProductSetProductPriceCustomFieldActionBuilder of(
            final ProductSetProductPriceCustomFieldAction template) {
        ProductSetProductPriceCustomFieldActionBuilder builder = new ProductSetProductPriceCustomFieldActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
