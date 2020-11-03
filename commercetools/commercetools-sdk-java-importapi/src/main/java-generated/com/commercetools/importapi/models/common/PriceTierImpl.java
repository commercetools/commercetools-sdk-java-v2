package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.TypedMoney;
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


/**
*  <p>A price tier is selected instead of the default price when a certain quantity of the ProductVariant is added to a cart and ordered.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceTierImpl implements PriceTier {

    private Long minimumQuantity;
    
    private com.commercetools.importapi.models.common.TypedMoney value;

    @JsonCreator
    PriceTierImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity, @JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }
    public PriceTierImpl() {
       
    }

    /**
    *  <p>The minimum quantity this price tier is valid for.</p>
    */
    public Long getMinimumQuantity(){
        return this.minimumQuantity;
    }
    
    /**
    *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
    */
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }

    public void setMinimumQuantity(final Long minimumQuantity){
        this.minimumQuantity = minimumQuantity;
    }
    
    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value){
        this.value = value;
    }

}
