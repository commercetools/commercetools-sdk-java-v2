package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductVariantSelectionExclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExcept;
import com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnly;
import com.commercetools.api.models.product_selection.ProductVariantSelectionInclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductVariantSelectionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantSelectionBuilder {

    public com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionBuilder exclusionBuilder() {
       return com.commercetools.api.models.product_selection.ProductVariantSelectionExclusionBuilder.of();
    }
    public com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExceptBuilder includeAllExceptBuilder() {
       return com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeAllExceptBuilder.of();
    }
    public com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnlyBuilder includeOnlyBuilder() {
       return com.commercetools.api.models.product_selection.ProductVariantSelectionIncludeOnlyBuilder.of();
    }
    public com.commercetools.api.models.product_selection.ProductVariantSelectionInclusionBuilder inclusionBuilder() {
       return com.commercetools.api.models.product_selection.ProductVariantSelectionInclusionBuilder.of();
    }

    /**
     * factory method for an instance of ProductVariantSelectionBuilder
     * @return builder 
     */
    public static ProductVariantSelectionBuilder of() {
        return new ProductVariantSelectionBuilder();
    }

}
