package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyAction;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateActionImpl.class, name = "addTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionImpl.class, name = "removeTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateActionImpl.class, name = "replaceTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.tax_category.TaxCategorySetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = TaxCategoryUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TaxCategoryUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<TaxCategoryUpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withTaxCategoryUpdateAction(Function<TaxCategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
