package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEdit;
import com.commercetools.api.models.order_edit.OrderEditPagedQueryResponseImpl;

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
 * OrderEditPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPagedQueryResponse orderEditPagedQueryResponse = OrderEditPagedQueryResponse.builder()
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
@JsonDeserialize(as = OrderEditPagedQueryResponseImpl.class)
public interface OrderEditPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<OrderEdit> {


    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();
    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();
    /**
     *
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
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<OrderEdit> getResults();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */
    
    public void setLimit(final Long limit);
    
    
    /**
     * set count
     * @param count value to be set
     */
    
    public void setCount(final Long count);
    
    
    /**
     * set total
     * @param total value to be set
     */
    
    public void setTotal(final Long total);
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */
    
    public void setOffset(final Long offset);
    
    
    /**
     * set results
     * @param results values to be set
     */
    
    @JsonIgnore
    public void setResults(final OrderEdit ...results);
    /**
     * set results
     * @param results values to be set
     */
    
    public void setResults(final List<OrderEdit> results);

    /**
     * factory method
     * @return instance of OrderEditPagedQueryResponse
     */
    public static OrderEditPagedQueryResponse of(){
        return new OrderEditPagedQueryResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderEditPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderEditPagedQueryResponse of(final OrderEditPagedQueryResponse template) {
        OrderEditPagedQueryResponseImpl instance = new OrderEditPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderEditPagedQueryResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderEditPagedQueryResponse deepCopy(@Nullable final OrderEditPagedQueryResponse template) {
        if (template == null) {
            return null;
        }
        OrderEditPagedQueryResponseImpl instance = new OrderEditPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream().map(com.commercetools.api.models.order_edit.OrderEdit::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderEditPagedQueryResponse
     * @return builder
     */
    public static OrderEditPagedQueryResponseBuilder builder() {
        return OrderEditPagedQueryResponseBuilder.of();
    }
    
    /**
     * create builder for OrderEditPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPagedQueryResponseBuilder builder(final OrderEditPagedQueryResponse template) {
        return OrderEditPagedQueryResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderEditPagedQueryResponse(Function<OrderEditPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderEditPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderEditPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<OrderEditPagedQueryResponse>";
            }
        };
    }
}
