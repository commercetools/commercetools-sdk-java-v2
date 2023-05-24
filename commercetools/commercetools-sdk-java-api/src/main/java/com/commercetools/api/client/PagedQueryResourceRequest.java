
package com.commercetools.api.client;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.commercetools.api.predicates.query.QueryPredicate;

import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

/**
 * Interface with common methods for query endpoints
 * @param <T> the type of the underlying request
 * @param <TResult> the type of the underlying result model, like category or product.
 */
public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult, TQuery>, TResult, TQuery>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult>,
        com.commercetools.api.models.PagedQueryResourceRequest<T, TResult> {
    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withPredicateVar(final String varName,
            final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addPredicateVar(final String varName,
            final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    List<ApiMethod.ParamEntry<String, String>> getQueryParams();

    List<String> getQueryParam(final String key);

    String getFirstQueryParam(final String key);

    default PagedQueryResourceRequest<T, TResult, TQuery> asPagedQueryResourceRequest() {
        return this;
    }

    TQuery queryDsl();

    @SuppressWarnings("unchecked")
    default T withQuery(Function<TQuery, QueryPredicate> fn) {
        return (T) withWhere(fn.apply(queryDsl()).render());
    }

    @SuppressWarnings("unchecked")
    default T addQuery(Function<TQuery, QueryPredicate> fn) {
        return (T) withWhere(fn.apply(queryDsl()).render());
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
    default T withWhere(final String where, final Map<String, Collection<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult, TQuery> request = withWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final Map<String, Collection<String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult, TQuery> request = addWhere(where);
        predicateVar.forEach(request::withPredicateVar);
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T withWhere(final String where, final Collection<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult, TQuery> request = withWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T addWhere(final String where, final Collection<Map.Entry<String, String>> predicateVar) {
        PagedQueryResourceRequest<T, TResult, TQuery> request = addWhere(where);
        predicateVar.forEach(pair -> request.withPredicateVar(pair.getKey(), pair.getValue()));
        return (T) request;
    }

    @SuppressWarnings("unchecked")
    default T asPagedQueryResourceRequestToBaseType() {
        return (T) this;
    }
}
