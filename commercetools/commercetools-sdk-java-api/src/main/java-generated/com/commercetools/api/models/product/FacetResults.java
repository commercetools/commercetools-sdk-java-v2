package com.commercetools.api.models.product;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.FacetResultsImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = FacetResultsImpl.class)
public interface FacetResults  {

    
    @NotNull
    @JsonAnyGetter
    public Map<String, JsonNode> values();

    @JsonAnySetter
    public void setValue(String key, JsonNode value);

    public static FacetResultsImpl of(){
        return new FacetResultsImpl();
    }
    

    public static FacetResultsImpl of(final FacetResults template) {
        FacetResultsImpl instance = new FacetResultsImpl();
        return instance;
    }

    default <T extends Accessor<FacetResults>> T withFacetResults(Function<FacetResults, T> helper) {
        return helper.apply(this);
    }
}
