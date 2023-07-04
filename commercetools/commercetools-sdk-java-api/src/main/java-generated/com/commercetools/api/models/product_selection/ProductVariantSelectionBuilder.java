
package com.commercetools.api.models.product_selection;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionBuilder {

    public com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExceptBuilder includeAllExceptBuilder() {
        return com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExceptBuilder.of();
    }

    public com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnlyBuilder includeOnlyBuilder() {
        return com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnlyBuilder.of();
    }

    /**
     * factory method for an instance of ProductVariantSelectionBuilder
     * @return builder
     */
    public static ProductVariantSelectionBuilder of() {
        return new ProductVariantSelectionBuilder();
    }

}
