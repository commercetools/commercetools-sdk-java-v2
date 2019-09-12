package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetTypes;
import com.commercetools.models.Product.FilteredFacetResult;
import com.commercetools.models.Product.RangeFacetResult;
import com.commercetools.models.Product.TermFacetResult;


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
   @JsonSubTypes.Type(value = com.commercetools.models.Product.FilteredFacetResultImpl.class, name = "filter"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.RangeFacetResultImpl.class, name = "range"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.TermFacetResultImpl.class, name = "terms")
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