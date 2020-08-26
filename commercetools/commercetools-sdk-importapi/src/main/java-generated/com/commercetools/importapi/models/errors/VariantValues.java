package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.errors.VariantValuesImpl;

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
@JsonDeserialize(as = VariantValuesImpl.class)
public interface VariantValues  {

    
    
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceImport> getPrices();
    
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    public void setSku(final String sku);
    
    public void setPrices(final List<PriceImport> prices);
    
    public void setAttributes(final List<Attribute> attributes);

    public static VariantValuesImpl of(){
        return new VariantValuesImpl();
    }
    

    public static VariantValuesImpl of(final VariantValues template) {
        VariantValuesImpl instance = new VariantValuesImpl();
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

}
