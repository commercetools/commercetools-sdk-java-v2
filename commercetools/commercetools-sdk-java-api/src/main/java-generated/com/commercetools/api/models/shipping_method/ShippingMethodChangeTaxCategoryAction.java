package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShippingMethodChangeTaxCategoryActionImpl.class)
public interface ShippingMethodChangeTaxCategoryAction extends ShippingMethodUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public static ShippingMethodChangeTaxCategoryAction of(){
        return new ShippingMethodChangeTaxCategoryActionImpl();
    }
    

    public static ShippingMethodChangeTaxCategoryAction of(final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionImpl instance = new ShippingMethodChangeTaxCategoryActionImpl();
        instance.setTaxCategory(template.getTaxCategory());
        return instance;
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder builder(){
        return ShippingMethodChangeTaxCategoryActionBuilder.of();
    }
    
    public static ShippingMethodChangeTaxCategoryActionBuilder builder(final ShippingMethodChangeTaxCategoryAction template){
        return ShippingMethodChangeTaxCategoryActionBuilder.of(template);
    }
    

    default <T> T withShippingMethodChangeTaxCategoryAction(Function<ShippingMethodChangeTaxCategoryAction, T> helper) {
        return helper.apply(this);
    }
}
