
package com.commercetools.api.models.tax_category;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public static TaxCategoryUpdateActionBuilder of() {
        return new TaxCategoryUpdateActionBuilder();
    }
}
