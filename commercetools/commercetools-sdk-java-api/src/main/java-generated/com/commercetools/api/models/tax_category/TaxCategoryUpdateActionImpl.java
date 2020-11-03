package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategoryReplaceTaxRateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetDescriptionAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryUpdateActionImpl implements TaxCategoryUpdateAction {

    private String action;

    @JsonCreator
    TaxCategoryUpdateActionImpl() {
        this.action = "null";
    }
    

    
    public String getAction(){
        return this.action;
    }


}
