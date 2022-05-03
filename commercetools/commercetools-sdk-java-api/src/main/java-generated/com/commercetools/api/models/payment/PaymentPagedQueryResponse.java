
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PaymentPagedQueryResponseImpl.class)
public interface PaymentPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Payment> {

    /**
    *  <p>Number of <a href="/../api/general-concepts#limit">results requested</a>.</p>
    */
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
    public List<Payment> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Payment... results);

    public void setResults(final List<Payment> results);

    public static PaymentPagedQueryResponse of() {
        return new PaymentPagedQueryResponseImpl();
    }

    public static PaymentPagedQueryResponse of(final PaymentPagedQueryResponse template) {
        PaymentPagedQueryResponseImpl instance = new PaymentPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static PaymentPagedQueryResponseBuilder builder() {
        return PaymentPagedQueryResponseBuilder.of();
    }

    public static PaymentPagedQueryResponseBuilder builder(final PaymentPagedQueryResponse template) {
        return PaymentPagedQueryResponseBuilder.of(template);
    }

    default <T> T withPaymentPagedQueryResponse(Function<PaymentPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentPagedQueryResponse>";
            }
        };
    }
}
