
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeInputHintActionBuilder {

    private String attributeName;

    private com.commercetools.api.models.product_type.TextInputHint newValue;

    public ProductTypeChangeInputHintActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangeInputHintActionBuilder newValue(
            final com.commercetools.api.models.product_type.TextInputHint newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.TextInputHint getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangeInputHintAction build() {
        return new ProductTypeChangeInputHintActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangeInputHintActionBuilder of() {
        return new ProductTypeChangeInputHintActionBuilder();
    }

    public static ProductTypeChangeInputHintActionBuilder of(final ProductTypeChangeInputHintAction template) {
        ProductTypeChangeInputHintActionBuilder builder = new ProductTypeChangeInputHintActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
