package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.MoneyType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl.class, name = "centPrecision"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl.class, name = "highPrecision")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = TypedMoneyDraftImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface TypedMoneyDraft extends Money {





}
