package com.commercetools.api.models.project;


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
public final class CartsConfigurationImpl implements CartsConfiguration {

    private Boolean countryTaxRateFallbackEnabled;

    @JsonCreator
    CartsConfigurationImpl(@JsonProperty("countryTaxRateFallbackEnabled") final Boolean countryTaxRateFallbackEnabled) {
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }
    public CartsConfigurationImpl() {
    }

    /**
    *  <p>if country - no state tax rate fallback should be used when a shipping address state is not explicitly covered in the rates lists of all tax categories of a cart line items. Default value 'false'</p>
    */
    public Boolean getCountryTaxRateFallbackEnabled(){
        return this.countryTaxRateFallbackEnabled;
    }

    public void setCountryTaxRateFallbackEnabled(final Boolean countryTaxRateFallbackEnabled){
        this.countryTaxRateFallbackEnabled = countryTaxRateFallbackEnabled;
    }

}
