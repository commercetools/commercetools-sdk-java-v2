package com.commercetools.models.Common;

import com.commercetools.models.Common.CentPrecisionMoneyDraft;
import com.commercetools.models.Common.HighPrecisionMoneyDraft;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.MoneyType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Common.CentPrecisionMoneyDraftImpl.class, name = "centPrecision"),
   @JsonSubTypes.Type(value = com.commercetools.models.Common.HighPrecisionMoneyDraftImpl.class, name = "highPrecision")
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
public interface TypedMoneyDraft extends Money {


   


}