package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodChangeTaxCategoryActionBuilder {

    
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    
    public ShippingMethodChangeTaxCategoryActionBuilder taxCategory( final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    
    
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }

    public ShippingMethodChangeTaxCategoryAction build() {
        return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder of() {
        return new ShippingMethodChangeTaxCategoryActionBuilder();
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder of(final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionBuilder builder = new ShippingMethodChangeTaxCategoryActionBuilder();
        builder.taxCategory = template.getTaxCategory();
        return builder;
    }

}
