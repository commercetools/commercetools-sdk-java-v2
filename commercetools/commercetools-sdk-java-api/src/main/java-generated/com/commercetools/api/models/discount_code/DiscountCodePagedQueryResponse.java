package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.discount_code.DiscountCodePagedQueryResponseImpl;

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
@JsonDeserialize(as = DiscountCodePagedQueryResponseImpl.class)
public interface DiscountCodePagedQueryResponse  {

    
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
    public List<DiscountCode> getResults();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    public void setResults(final List<DiscountCode> results);

    public static DiscountCodePagedQueryResponseImpl of(){
        return new DiscountCodePagedQueryResponseImpl();
    }
    

    public static DiscountCodePagedQueryResponseImpl of(final DiscountCodePagedQueryResponse template) {
        DiscountCodePagedQueryResponseImpl instance = new DiscountCodePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T extends Accessor<DiscountCodePagedQueryResponse>> T withDiscountCodePagedQueryResponse(Function<DiscountCodePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
