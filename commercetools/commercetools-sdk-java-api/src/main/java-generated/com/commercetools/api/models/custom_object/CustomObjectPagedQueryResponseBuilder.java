
package com.commercetools.api.models.custom_object;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomObjectPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.custom_object.CustomObject> results;

    public CustomObjectPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder results(
            final com.commercetools.api.models.custom_object.CustomObject... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public CustomObjectPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.custom_object.CustomObject> results) {
        this.results = results;
        return this;
    }

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

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.custom_object.CustomObject> getResults() {
        return this.results;
    }

    public CustomObjectPagedQueryResponse build() {
        return new CustomObjectPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static CustomObjectPagedQueryResponseBuilder of() {
        return new CustomObjectPagedQueryResponseBuilder();
    }

    public static CustomObjectPagedQueryResponseBuilder of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseBuilder builder = new CustomObjectPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
