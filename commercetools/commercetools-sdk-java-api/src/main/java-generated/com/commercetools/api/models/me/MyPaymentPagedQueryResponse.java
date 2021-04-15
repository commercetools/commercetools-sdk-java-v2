
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyPaymentPagedQueryResponseImpl.class)
public interface MyPaymentPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<MyPayment> {

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
    public List<MyPayment> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final MyPayment... results);

    public void setResults(final List<MyPayment> results);

    public static MyPaymentPagedQueryResponse of() {
        return new MyPaymentPagedQueryResponseImpl();
    }

    public static MyPaymentPagedQueryResponse of(final MyPaymentPagedQueryResponse template) {
        MyPaymentPagedQueryResponseImpl instance = new MyPaymentPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static MyPaymentPagedQueryResponseBuilder builder() {
        return MyPaymentPagedQueryResponseBuilder.of();
    }

    public static MyPaymentPagedQueryResponseBuilder builder(final MyPaymentPagedQueryResponse template) {
        return MyPaymentPagedQueryResponseBuilder.of(template);
    }

    default <T> T withMyPaymentPagedQueryResponse(Function<MyPaymentPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
