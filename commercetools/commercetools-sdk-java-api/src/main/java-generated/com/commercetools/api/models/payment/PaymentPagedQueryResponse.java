package com.commercetools.api.models.payment;

import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>PagedQueryResult with <code>results</code> containing an array of Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentPagedQueryResponse paymentPagedQueryResponse = PaymentPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PaymentPagedQueryResponseImpl.class)
public interface PaymentPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Payment> {


    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */
    
    @JsonProperty("total")
    public Long getTotal();
    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();
    /**
     *  <p>Payments matching the query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Payment> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */
    
    public void setLimit(final Long limit);
    
    
    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */
    
    public void setCount(final Long count);
    
    
    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     */
    
    public void setTotal(final Long total);
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */
    
    public void setOffset(final Long offset);
    
    
    /**
     *  <p>Payments matching the query.</p>
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final Payment ...results);
    /**
     *  <p>Payments matching the query.</p>
     * @param results values to be set
     */
    
    public void setResults(final List<Payment> results);

    /**
     * factory method
     * @return instance of PaymentPagedQueryResponse
     */
    public static PaymentPagedQueryResponse of(){
        return new PaymentPagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy PaymentPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentPagedQueryResponse of(final PaymentPagedQueryResponse template) {
        PaymentPagedQueryResponseImpl instance = new PaymentPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentPagedQueryResponse deepCopy(@Nullable final PaymentPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        PaymentPagedQueryResponseImpl instance = new PaymentPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.payment.Payment::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentPagedQueryResponse
     * @return builder
     */
    public static PaymentPagedQueryResponseBuilder builder() {
        return PaymentPagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for PaymentPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentPagedQueryResponseBuilder builder(final PaymentPagedQueryResponse template) {
        return PaymentPagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentPagedQueryResponse(Function<PaymentPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentPagedQueryResponse>";
            }
        };
    }
}
