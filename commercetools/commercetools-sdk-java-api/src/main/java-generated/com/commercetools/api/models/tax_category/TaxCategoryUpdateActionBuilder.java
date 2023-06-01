package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyAction;
import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryUpdateActionBuilder {

    public com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder addTaxRateBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder removeTaxRateBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder replaceTaxRateBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.tax_category.TaxCategorySetKeyActionBuilder.of();
    }

    /**
     * factory method for an instance of TaxCategoryUpdateActionBuilder
     * @return builder 
     */
    public static TaxCategoryUpdateActionBuilder of() {
        return new TaxCategoryUpdateActionBuilder();
    }

}
