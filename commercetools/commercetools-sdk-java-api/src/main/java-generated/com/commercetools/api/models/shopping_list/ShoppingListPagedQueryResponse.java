
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListPagedQueryResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListPagedQueryResponse shoppingListPagedQueryResponse = ShoppingListPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListPagedQueryResponseImpl.class)
public interface ShoppingListPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ShoppingList> {

    /**
     *  <p>Number of results requested.</p>
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Actual number of results returned.</p>
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>ShoppingLists matching the query.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ShoppingList> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ShoppingList... results);

    public void setResults(final List<ShoppingList> results);

    public static ShoppingListPagedQueryResponse of() {
        return new ShoppingListPagedQueryResponseImpl();
    }

    public static ShoppingListPagedQueryResponse of(final ShoppingListPagedQueryResponse template) {
        ShoppingListPagedQueryResponseImpl instance = new ShoppingListPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ShoppingListPagedQueryResponseBuilder builder() {
        return ShoppingListPagedQueryResponseBuilder.of();
    }

    public static ShoppingListPagedQueryResponseBuilder builder(final ShoppingListPagedQueryResponse template) {
        return ShoppingListPagedQueryResponseBuilder.of(template);
    }

    default <T> T withShoppingListPagedQueryResponse(Function<ShoppingListPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListPagedQueryResponse>";
            }
        };
    }
}
