package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryDraftImpl.class)
public interface TaxCategoryDraft  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("description")
    public String getDescription();
    
    @NotNull
    @Valid
    @JsonProperty("rates")
    public List<TaxRateDraft> getRates();
    
    
    @JsonProperty("key")
    public String getKey();

    public void setName(final String name);
    
    public void setDescription(final String description);
    
    public void setRates(final List<TaxRateDraft> rates);
    
    public void setKey(final String key);

    public static TaxCategoryDraftImpl of(){
        return new TaxCategoryDraftImpl();
    }
    

    public static TaxCategoryDraftImpl of(final TaxCategoryDraft template) {
        TaxCategoryDraftImpl instance = new TaxCategoryDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

}
