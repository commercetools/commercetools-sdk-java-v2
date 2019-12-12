package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetTypes;
import com.commercetools.api.generated.models.product.FilteredFacetResult;
import com.commercetools.api.generated.models.product.RangeFacetResult;
import com.commercetools.api.generated.models.product.TermFacetResult;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.FilteredFacetResultImpl.class, name = "filter"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.RangeFacetResultImpl.class, name = "range"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.TermFacetResultImpl.class, name = "terms")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = FacetResultImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface FacetResult  {


   


}