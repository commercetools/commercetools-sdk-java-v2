
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodPagedQueryResponseBuilder {

    @Nullable
    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    @Nullable
    private Long offset;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results;

    public ShippingMethodPagedQueryResponseBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    public ShippingMethodPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ShippingMethodPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ShippingMethodPagedQueryResponseBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    public ShippingMethodPagedQueryResponseBuilder results(
            final com.commercetools.api.models.shipping_method.ShippingMethod... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ShippingMethodPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> results) {
        this.results = results;
        return this;
    }

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingMethod> getResults() {
        return this.results;
    }

    public ShippingMethodPagedQueryResponse build() {
        return new ShippingMethodPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ShippingMethodPagedQueryResponseBuilder of() {
        return new ShippingMethodPagedQueryResponseBuilder();
    }

    public static ShippingMethodPagedQueryResponseBuilder of(final ShippingMethodPagedQueryResponse template) {
        ShippingMethodPagedQueryResponseBuilder builder = new ShippingMethodPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
