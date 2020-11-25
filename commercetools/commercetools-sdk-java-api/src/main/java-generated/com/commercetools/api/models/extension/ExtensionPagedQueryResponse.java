package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.extension.ExtensionPagedQueryResponseImpl;

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
@JsonDeserialize(as = ExtensionPagedQueryResponseImpl.class)
public interface ExtensionPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Extension> {

    
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
    public List<Extension> getResults();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    @JsonIgnore
    public void setResults(final Extension ...results);
    public void setResults(final List<Extension> results);

    public static ExtensionPagedQueryResponseImpl of(){
        return new ExtensionPagedQueryResponseImpl();
    }
    

    public static ExtensionPagedQueryResponseImpl of(final ExtensionPagedQueryResponse template) {
        ExtensionPagedQueryResponseImpl instance = new ExtensionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T> T withExtensionPagedQueryResponse(Function<ExtensionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
