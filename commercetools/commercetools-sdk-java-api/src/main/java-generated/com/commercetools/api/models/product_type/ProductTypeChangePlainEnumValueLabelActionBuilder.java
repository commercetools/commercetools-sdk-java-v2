
package com.commercetools.api.models.product_type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangePlainEnumValueLabelActionBuilder {

    private String attributeName;

    private com.commercetools.api.models.product_type.AttributePlainEnumValue newValue;

    public ProductTypeChangePlainEnumValueLabelActionBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ProductTypeChangePlainEnumValueLabelActionBuilder newValue(
            final com.commercetools.api.models.product_type.AttributePlainEnumValue newValue) {
        this.newValue = newValue;
        return this;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.api.models.product_type.AttributePlainEnumValue getNewValue() {
        return this.newValue;
    }

    public ProductTypeChangePlainEnumValueLabelAction build() {
        return new ProductTypeChangePlainEnumValueLabelActionImpl(attributeName, newValue);
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder of() {
        return new ProductTypeChangePlainEnumValueLabelActionBuilder();
    }

    public static ProductTypeChangePlainEnumValueLabelActionBuilder of(
            final ProductTypeChangePlainEnumValueLabelAction template) {
        ProductTypeChangePlainEnumValueLabelActionBuilder builder = new ProductTypeChangePlainEnumValueLabelActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.newValue = template.getNewValue();
        return builder;
    }

}
