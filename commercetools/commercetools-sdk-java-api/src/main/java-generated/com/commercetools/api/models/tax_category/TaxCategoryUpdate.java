package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryUpdateImpl.class)
public interface TaxCategoryUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<TaxCategoryUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<TaxCategoryUpdateAction> actions);

    public static TaxCategoryUpdateImpl of(){
        return new TaxCategoryUpdateImpl();
    }
    

    public static TaxCategoryUpdateImpl of(final TaxCategoryUpdate template) {
        TaxCategoryUpdateImpl instance = new TaxCategoryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withTaxCategoryUpdate(Function<TaxCategoryUpdate, T> helper) {
        return helper.apply(this);
    }
}
