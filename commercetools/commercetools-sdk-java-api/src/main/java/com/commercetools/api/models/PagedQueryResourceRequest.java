
package com.commercetools.api.models;

import java.util.List;
import java.util.Map;

import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult>, TResult>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult> {
    PagedQueryResourceRequest<T, TResult> withLimit(final int limit);

    PagedQueryResourceRequest<T, TResult> addLimit(final int limit);

    PagedQueryResourceRequest<T, TResult> withOffset(final int offset);

    PagedQueryResourceRequest<T, TResult> addOffset(final int offset);

    PagedQueryResourceRequest<T, TResult> withSort(final String sort);

    PagedQueryResourceRequest<T, TResult> addSort(final String sort);

    PagedQueryResourceRequest<T, TResult> withWhere(final String where);

    PagedQueryResourceRequest<T, TResult> addWhere(final String where);

    PagedQueryResourceRequest<T, TResult> withExpand(final String expand);

    PagedQueryResourceRequest<T, TResult> addExpand(final String expand);

    PagedQueryResourceRequest<T, TResult> withWithTotal(final boolean withTotal);

    PagedQueryResourceRequest<T, TResult> addWithTotal(final boolean withTotal);

    PagedQueryResourceRequest<T, TResult> withPredicateVar(final String varName, final String predicateVar);

    PagedQueryResourceRequest<T, TResult> addPredicateVar(final String varName, final String predicateVar);

    PagedQueryResourceRequest<T, TResult> withPredicateVar(final String varName, final List<String> predicateVar);

    PagedQueryResourceRequest<T, TResult> addPredicateVar(final String varName, final List<String> predicateVar);

    List<ApiMethod.ParamEntry<String, String>> getQueryParams();

    List<String> getQueryParam(final String key);

    String getFirstQueryParam(final String key);

    default PagedQueryResourceRequest<T, TResult> asPagedQueryResourceRequest() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final String predicateVar, final String predicateVarValue) {
        return (T) withWhere(where).withPredicateVar(predicateVar, predicateVarValue);
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final String predicateVar, final String predicateVarValue) {
        return (T) addWhere(where).withPredicateVar(predicateVar, predicateVarValue);
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final Map<String, List<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = withWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final Map<String, List<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = addWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final List<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = withWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final List<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult> request = addWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T asPagedQueryResourceRequestToBaseType() {
        return (T) this;
    }
}
