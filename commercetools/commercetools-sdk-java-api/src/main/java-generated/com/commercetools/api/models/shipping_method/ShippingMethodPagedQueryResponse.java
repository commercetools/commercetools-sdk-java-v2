
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShippingMethodPagedQueryResponseImpl.class)
public interface ShippingMethodPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ShippingMethod> {

    @JsonProperty("limit")
    public Long getLimit();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("total")
    public Long getTotal();

    @JsonProperty("offset")
    public Long getOffset();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ShippingMethod> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ShippingMethod... results);

    public void setResults(final List<ShippingMethod> results);

    public static ShippingMethodPagedQueryResponse of() {
        return new ShippingMethodPagedQueryResponseImpl();
    }

    public static ShippingMethodPagedQueryResponse of(final ShippingMethodPagedQueryResponse template) {
        ShippingMethodPagedQueryResponseImpl instance = new ShippingMethodPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ShippingMethodPagedQueryResponseBuilder builder() {
        return ShippingMethodPagedQueryResponseBuilder.of();
    }

    public static ShippingMethodPagedQueryResponseBuilder builder(final ShippingMethodPagedQueryResponse template) {
        return ShippingMethodPagedQueryResponseBuilder.of(template);
    }

    default <T> T withShippingMethodPagedQueryResponse(Function<ShippingMethodPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
