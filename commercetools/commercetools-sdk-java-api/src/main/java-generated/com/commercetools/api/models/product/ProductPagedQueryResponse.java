
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductPagedQueryResponseImpl.class)
public interface ProductPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Product> {

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
    public List<Product> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Product... results);

    public void setResults(final List<Product> results);

    public static ProductPagedQueryResponse of() {
        return new ProductPagedQueryResponseImpl();
    }

    public static ProductPagedQueryResponse of(final ProductPagedQueryResponse template) {
        ProductPagedQueryResponseImpl instance = new ProductPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ProductPagedQueryResponseBuilder builder() {
        return ProductPagedQueryResponseBuilder.of();
    }

    public static ProductPagedQueryResponseBuilder builder(final ProductPagedQueryResponse template) {
        return ProductPagedQueryResponseBuilder.of(template);
    }

    default <T> T withProductPagedQueryResponse(Function<ProductPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPagedQueryResponse>";
            }
        };
    }
}
