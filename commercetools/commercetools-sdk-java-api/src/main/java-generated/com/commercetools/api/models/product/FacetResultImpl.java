package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.FilteredFacetResult;
import com.commercetools.api.models.product.RangeFacetResult;
import com.commercetools.api.models.product.TermFacetResult;
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
public final class FacetResultImpl implements FacetResult {

    private com.commercetools.api.models.product.FacetTypes type;

    @JsonCreator
    FacetResultImpl(@JsonProperty("type") final com.commercetools.api.models.product.FacetTypes type) {
        this.type = type;
    }
    public FacetResultImpl() {
       
    }

    
    public com.commercetools.api.models.product.FacetTypes getType(){
        return this.type;
    }


}
