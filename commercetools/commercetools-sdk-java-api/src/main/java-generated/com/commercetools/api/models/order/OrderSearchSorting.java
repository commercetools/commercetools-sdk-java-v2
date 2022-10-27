
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSorting
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchSorting orderSearchSorting = OrderSearchSorting.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSearchSortingImpl.class)
public interface OrderSearchSorting {

    public static OrderSearchSorting of() {
        return new OrderSearchSortingImpl();
    }

    public static OrderSearchSorting of(final OrderSearchSorting template) {
        OrderSearchSortingImpl instance = new OrderSearchSortingImpl();
        return instance;
    }

    public static OrderSearchSortingBuilder builder() {
        return OrderSearchSortingBuilder.of();
    }

    public static OrderSearchSortingBuilder builder(final OrderSearchSorting template) {
        return OrderSearchSortingBuilder.of(template);
    }

    default <T> T withOrderSearchSorting(Function<OrderSearchSorting, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSearchSorting> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSearchSorting>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSearchSorting>";
            }
        };
    }
}
