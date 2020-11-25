package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.custom_object.CustomObject;
import com.commercetools.api.models.custom_object.CustomObjectPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomObjectPagedQueryResponseImpl.class)
public interface CustomObjectPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<CustomObject> {

    
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    
    
    @JsonProperty("total")
    public Long getTotal();
    
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<CustomObject> getResults();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    @JsonIgnore
    public void setResults(final CustomObject ...results);
    public void setResults(final List<CustomObject> results);

    public static CustomObjectPagedQueryResponseImpl of(){
        return new CustomObjectPagedQueryResponseImpl();
    }
    

    public static CustomObjectPagedQueryResponseImpl of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseImpl instance = new CustomObjectPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T> T withCustomObjectPagedQueryResponse(Function<CustomObjectPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
