package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.AttributeBooleanType;
import com.commercetools.api.models.product_type.AttributeDateTimeType;
import com.commercetools.api.models.product_type.AttributeDateType;
import com.commercetools.api.models.product_type.AttributeEnumType;
import com.commercetools.api.models.product_type.AttributeLocalizableTextType;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumType;
import com.commercetools.api.models.product_type.AttributeMoneyType;
import com.commercetools.api.models.product_type.AttributeNestedType;
import com.commercetools.api.models.product_type.AttributeNumberType;
import com.commercetools.api.models.product_type.AttributeReferenceType;
import com.commercetools.api.models.product_type.AttributeSetType;
import com.commercetools.api.models.product_type.AttributeTextType;
import com.commercetools.api.models.product_type.AttributeTimeType;
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
public final class AttributeTypeImpl implements AttributeType {

    private String name;

    @JsonCreator
    AttributeTypeImpl(@JsonProperty("name") final String name) {
        this.name = name;
    }
    public AttributeTypeImpl() {
       
    }

    
    public String getName(){
        return this.name;
    }


}
