package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.tax_category.TaxCategoryReferenceImpl;

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
@JsonDeserialize(as = TaxCategoryReferenceImpl.class)
public interface TaxCategoryReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public TaxCategory getObj();

    public void setObj(final TaxCategory obj);

    public static TaxCategoryReference of(){
        return new TaxCategoryReferenceImpl();
    }
    

    public static TaxCategoryReference of(final TaxCategoryReference template) {
        TaxCategoryReferenceImpl instance = new TaxCategoryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static TaxCategoryReferenceBuilder builder(){
        return TaxCategoryReferenceBuilder.of();
    }
    
    public static TaxCategoryReferenceBuilder builder(final TaxCategoryReference template){
        return TaxCategoryReferenceBuilder.of(template);
    }
    

    default <T> T withTaxCategoryReference(Function<TaxCategoryReference, T> helper) {
        return helper.apply(this);
    }
}
