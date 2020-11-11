package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
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
public final class CartClassificationTypeImpl implements CartClassificationType {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;
    
    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    @JsonCreator
    CartClassificationTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }
    public CartClassificationTypeImpl() {
       
    }

    
    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues(){
        return this.values;
    }

    public void setValues(final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue ...values){
       this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    public void setValues(final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values){
       this.values = values;
    }

}
