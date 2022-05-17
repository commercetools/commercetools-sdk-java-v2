package com.commercetools.compat;

import com.commercetools.api.client.ByProjectKeyCartDiscountsGet;
import com.commercetools.api.client.ByProjectKeyCustomersGet;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.PagedQueryResourceRequest;
import io.sphere.sdk.apiclient.queries.ApiClientQuery;
import io.sphere.sdk.cartdiscounts.queries.CartDiscountQuery;
import io.sphere.sdk.carts.queries.CartQuery;
import io.sphere.sdk.customers.queries.CustomerQuery;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.queries.MetaModelQueryDsl;
import io.sphere.sdk.queries.QueryPredicate;
import io.sphere.sdk.queries.QuerySort;

import java.util.function.Function;
import java.util.function.Supplier;

public class Query {
    private final ProjectApiRoot apiRoot;

    public Query(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public <T extends PagedQueryResourceRequest<T, TResult>, TResult> T customer(Function<CustomerQuery, CustomerQuery> queryDsl) {
        return query((T)apiRoot.customers().get(), CustomerQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult, TQuery extends MetaModelQueryDsl<?,?,?,?>> T query(T request, TQuery queryDsl) {
        request = queryDsl.limit() != null ? (T) request.withLimit(queryDsl.limit()) : request;
        request = queryDsl.offset() != null ? (T) request.withOffset(queryDsl.offset()) : request;
        request = queryDsl.fetchTotal() != null ?  (T) request.withWithTotal(queryDsl.fetchTotal()) : request;
        for (QuerySort<?> querySort : queryDsl.sort()) {
            request = (T) request.addSort(querySort.toSphereSort());
        }
        for (QueryPredicate<?> queryPredicate : queryDsl.predicates()) {
            request = (T) request.addWhere(queryPredicate.toSphereQuery());
        }
        for (ExpansionPath<?> expansionPath : queryDsl.expansionPaths()) {
            request = (T) request.addWhere(expansionPath.toSphereExpand());
        }
        return request;
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult, TQuery extends MetaModelQueryDsl<?,?,?,?>> T query(T request, Supplier<TQuery> createQueryDsl, Function<TQuery, TQuery> queryDsl) {
        MetaModelQueryDsl<?,?,?,?> customerQuery = queryDsl.apply(createQueryDsl.get());
        return query(request, customerQuery);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T apiClient(T request, Function<ApiClientQuery, ApiClientQuery> queryDsl) {
        return query(request, ApiClientQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T apiClient(ProjectApiRoot apiRoot, Function<ApiClientQuery, ApiClientQuery> queryDsl) {
        return query((T)apiRoot.carts().get(), ApiClientQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T cart(T request, Function<CartQuery, CartQuery> queryDsl) {
        return query(request, CartQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T cart(ProjectApiRoot apiRoot, Function<CartQuery, CartQuery> queryDsl) {
        return query((T)apiRoot.carts().get(), CartQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T customer(ByProjectKeyCustomersGet request, Function<CustomerQuery, CustomerQuery> queryDsl) {
        return query((T)request, CustomerQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T customer(ProjectApiRoot apiRoot, Function<CustomerQuery, CustomerQuery> queryDsl) {
        return query((T)apiRoot.customers().get(), CustomerQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T cartDiscount(ByProjectKeyCartDiscountsGet request, Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query((T)request, CartDiscountQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T cartDiscount(ProjectApiRoot apiRoot, Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query((T)apiRoot.cartDiscounts().get(), CartDiscountQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T customObject(ByProjectKeyCartDiscountsGet request, Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query((T)request, CartDiscountQuery::of, queryDsl);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult> T customObject(ProjectApiRoot apiRoot, Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query((T)apiRoot.cartDiscounts().get(), CartDiscountQuery::of, queryDsl);
    }
}
