package com.commercetools.models.product;

import com.commercetools.models.product.FacetTypes;
import com.commercetools.models.product.FilteredFacetResult;
import com.commercetools.models.product.RangeFacetResult;
import com.commercetools.models.product.TermFacetResult;


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
   @JsonSubTypes.Type(value = com.commercetools.models.product.FilteredFacetResultImpl.class, name = "filter"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.RangeFacetResultImpl.class, name = "range"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.TermFacetResultImpl.class, name = "terms")
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
public interface FacetResult  {


   


}