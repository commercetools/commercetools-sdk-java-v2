package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.shopping_list.ShoppingListPagedQueryResponseImpl;

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
@JsonDeserialize(as = ShoppingListPagedQueryResponseImpl.class)
public interface ShoppingListPagedQueryResponse  {

    
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
    public List<ShoppingList> getResults();

    public void setLimit(final Long limit);
    
    public void setCount(final Long count);
    
    public void setTotal(final Long total);
    
    public void setOffset(final Long offset);
    
    public void setResults(final List<ShoppingList> results);

    public static ShoppingListPagedQueryResponseImpl of(){
        return new ShoppingListPagedQueryResponseImpl();
    }
    

    public static ShoppingListPagedQueryResponseImpl of(final ShoppingListPagedQueryResponse template) {
        ShoppingListPagedQueryResponseImpl instance = new ShoppingListPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    default <T extends Accessor<ShoppingListPagedQueryResponse>> T withShoppingListPagedQueryResponse(Function<ShoppingListPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
