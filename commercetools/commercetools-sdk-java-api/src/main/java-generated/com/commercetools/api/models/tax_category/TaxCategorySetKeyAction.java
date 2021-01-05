package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategorySetKeyActionImpl;

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
@JsonDeserialize(as = TaxCategorySetKeyActionImpl.class)
public interface TaxCategorySetKeyAction extends TaxCategoryUpdateAction {

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, it is removed if it exists.</p>
    */
    
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static TaxCategorySetKeyAction of(){
        return new TaxCategorySetKeyActionImpl();
    }
    

    public static TaxCategorySetKeyAction of(final TaxCategorySetKeyAction template) {
        TaxCategorySetKeyActionImpl instance = new TaxCategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static TaxCategorySetKeyActionBuilder builder(){
        return TaxCategorySetKeyActionBuilder.of();
    }
    
    public static TaxCategorySetKeyActionBuilder builder(final TaxCategorySetKeyAction template){
        return TaxCategorySetKeyActionBuilder.of(template);
    }
    

    default <T> T withTaxCategorySetKeyAction(Function<TaxCategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
