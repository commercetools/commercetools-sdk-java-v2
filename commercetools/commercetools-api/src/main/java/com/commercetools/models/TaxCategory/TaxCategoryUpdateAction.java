package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryAddTaxRateAction;
import com.commercetools.models.TaxCategory.TaxCategoryChangeNameAction;
import com.commercetools.models.TaxCategory.TaxCategoryRemoveTaxRateAction;
import com.commercetools.models.TaxCategory.TaxCategoryReplaceTaxRateAction;
import com.commercetools.models.TaxCategory.TaxCategorySetDescriptionAction;
import com.commercetools.models.TaxCategory.TaxCategorySetKeyAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryAddTaxRateActionImpl.class, name = "addTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryRemoveTaxRateActionImpl.class, name = "removeTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategoryReplaceTaxRateActionImpl.class, name = "replaceTaxRate"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.TaxCategory.TaxCategorySetKeyActionImpl.class, name = "setKey")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TaxCategoryUpdateAction  {


   


}