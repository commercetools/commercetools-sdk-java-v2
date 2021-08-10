
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeAddAttributeDefinitionActionBuilder
        implements Builder<ProductTypeAddAttributeDefinitionAction> {

    private com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute;

    public ProductTypeAddAttributeDefinitionActionBuilder attribute(
            final com.commercetools.api.models.product_type.AttributeDefinitionDraft attribute) {
        this.attribute = attribute;
        return this;
    }

    public com.commercetools.api.models.product_type.AttributeDefinitionDraft getAttribute() {
        return this.attribute;
    }

    public ProductTypeAddAttributeDefinitionAction build() {
        Objects.requireNonNull(attribute);
        return new ProductTypeAddAttributeDefinitionActionImpl(attribute);
    }

    /**
     * builds ProductTypeAddAttributeDefinitionAction without checking for non null required values
     */
    public ProductTypeAddAttributeDefinitionAction buildUnchecked() {
        return new ProductTypeAddAttributeDefinitionActionImpl(attribute);
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder of() {
        return new ProductTypeAddAttributeDefinitionActionBuilder();
    }

    public static ProductTypeAddAttributeDefinitionActionBuilder of(
            final ProductTypeAddAttributeDefinitionAction template) {
        ProductTypeAddAttributeDefinitionActionBuilder builder = new ProductTypeAddAttributeDefinitionActionBuilder();
        builder.attribute = template.getAttribute();
        return builder;
    }

}
