
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionUpdateActionBuilder {

    public com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder addProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionAddProductActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionChangeNameActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionExcludeProductActionBuilder excludeProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionExcludeProductActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder removeProductBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionRemoveProductActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomFieldActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetCustomTypeActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionActionBuilder setVariantExclusionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetVariantExclusionActionBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder setVariantSelectionBuilder() {
        return com.commercetools.api.models.product_selection.ProductSelectionSetVariantSelectionActionBuilder.of();
    }

    /**
     * factory method for an instance of ProductSelectionUpdateActionBuilder
     * @return builder
     */
    public static ProductSelectionUpdateActionBuilder of() {
        return new ProductSelectionUpdateActionBuilder();
    }
}
