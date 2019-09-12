package com.commercetools.models.Project;

import com.commercetools.models.Project.CartClassificationType;
import com.commercetools.models.Project.CartScoreType;
import com.commercetools.models.Project.CartValueType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Project.CartClassificationTypeImpl.class, name = "CartClassification"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.CartScoreTypeImpl.class, name = "CartScore"),
   @JsonSubTypes.Type(value = com.commercetools.models.Project.CartValueTypeImpl.class, name = "CartValue")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ShippingRateInputType  {


   


}