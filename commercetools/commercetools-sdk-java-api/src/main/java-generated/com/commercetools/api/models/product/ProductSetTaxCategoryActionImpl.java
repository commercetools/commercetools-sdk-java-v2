package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetTaxCategoryActionImpl implements ProductSetTaxCategoryAction {

    private String action;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @JsonCreator
    ProductSetTaxCategoryActionImpl(@JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        this.action = "setTaxCategory";
    }
    public ProductSetTaxCategoryActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If left blank or set to <code>null</code>, the tax category is unset/removed.</p>
    */
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }

    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }

}
