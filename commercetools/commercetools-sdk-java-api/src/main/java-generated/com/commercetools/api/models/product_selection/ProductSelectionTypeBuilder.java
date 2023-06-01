package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionType;
import com.commercetools.api.models.product_selection.IndividualProductSelectionType;
import com.commercetools.api.models.product_selection.ProductSelectionTypeEnum;
import com.commercetools.api.models.product_selection.ProductSelectionType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionTypeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@Deprecated
public class ProductSelectionTypeBuilder {

    public com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeBuilder individualExclusionBuilder() {
       return com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeBuilder.of();
    }
    public com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder individualBuilder() {
       return com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder.of();
    }

    /**
     * factory method for an instance of ProductSelectionTypeBuilder
     * @return builder 
     */
    public static ProductSelectionTypeBuilder of() {
        return new ProductSelectionTypeBuilder();
    }

}
