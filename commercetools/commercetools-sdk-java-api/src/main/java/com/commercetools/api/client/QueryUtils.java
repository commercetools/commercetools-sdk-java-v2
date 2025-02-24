
package com.commercetools.api.client;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.annotation.Nonnull;

import com.commercetools.api.models.DomainResource;
import com.commercetools.api.models.ResourcePagedQueryResponse;

public class QueryUtils {

    public enum SortOrder {
        ASCENDING("asc"), DESCENDING("desc");

        private final String value;

        SortOrder(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    static int DEFAULT_PAGE_SIZE = 500;
    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and a page size 500. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a callback {@link java.util.function.Function} that returns a result of type {@code <S>} that
     * is returned on every page of elements queried. Eventually, the method returns a {@link
     * java.util.concurrent.CompletionStage} that contains a list of all the results of the callbacks returned from every
     * page.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param <S> type of the returned result of the callback function on every page.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Function<List<TElement>, S> pageMapper) {
        return queryAll(query, pageMapper, DEFAULT_PAGE_SIZE);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and a page size 500. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a callback {@link java.util.function.Function} that returns a result of type {@code <S>} that
     * is returned on every page of elements queried. Eventually, the method returns a {@link
     * java.util.concurrent.CompletionStage} that contains a list of all the results of the callbacks returned from every
     * page.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param sortField field the results should sort on
     * @param sortOrder order of the results
     * @param elementIdentifierFn function to retrieve the sort order field from an element
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param <S> type of the returned result of the callback function on every page.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Function<List<TElement>, S> pageMapper, final String sortField, final SortOrder sortOrder,
            final Function<TElement, String> elementIdentifierFn) {
        return queryAll(query, pageMapper, DEFAULT_PAGE_SIZE, sortField, sortOrder, elementIdentifierFn);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and a page size 500. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a consumer {@link Consumer} that is applied on every page of elements
     * queried.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageConsumer consumer applied on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer) {
        return queryAll(query, pageConsumer, DEFAULT_PAGE_SIZE);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and a page size 500. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a consumer {@link Consumer} that is applied on every page of elements
     * queried.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageConsumer consumer applied on every page queried
     * @param sortField field the results should sort on
     * @param sortOrder order of the results
     * @param elementIdentifierFn function to retrieve the sort order field from an element
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer, final String sortField, final SortOrder sortOrder,
            final Function<TElement, String> elementIdentifierFn) {
        return queryAll(query, pageConsumer, DEFAULT_PAGE_SIZE, sortField, sortOrder, elementIdentifierFn);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and the supplied {@code pageSize}. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a callback {@link Function} that returns a result of type {@code <S>} that
     * is returned on every page of elements queried. Eventually, the method returns a {@link
     * CompletionStage} that contains a list of all the results of the callbacks returned from every
     * page.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param <S> type of the returned result of the callback function on every page.
     * @param pageSize the page size.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Function<List<TElement>, S> pageMapper, final int pageSize) {
        final QueryAll<TMethod, TResult, TElement, S> queryAll = QueryAll.of(query, pageSize);
        return queryAll.run(pageMapper);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and the supplied {@code pageSize}. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a callback {@link Function} that returns a result of type {@code <S>} that
     * is returned on every page of elements queried. Eventually, the method returns a {@link
     * CompletionStage} that contains a list of all the results of the callbacks returned from every
     * page.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param sortField field the results should sort on
     * @param sortOrder order of the results
     * @param elementIdentifierFn function to retrieve the sort order field from an element
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param <S> type of the returned result of the callback function on every page.
     * @param pageSize the page size.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Function<List<TElement>, S> pageMapper, final int pageSize, final String sortField,
            final SortOrder sortOrder, final Function<TElement, String> elementIdentifierFn) {
        final QueryAll<TMethod, TResult, TElement, S> queryAll = QueryAll.of(query, pageSize, sortField, sortOrder,
            elementIdentifierFn);
        return queryAll.run(pageMapper);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and the supplied {@code pageSize}. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a {@link java.util.function.Consumer} that is applied on every page of the queried elements.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * @param query query containing predicates and expansion paths
     * @param pageConsumer consumer applied on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param pageSize the page size
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer, final int pageSize) {
        final QueryAll<TMethod, TResult, TElement, Void> queryAll = QueryAll.of(query, pageSize);
        return queryAll.run(pageConsumer);
    }

    /**
     * <p>Queries all elements matching a query by using a limit based pagination with a combination of
     * id sorting and the supplied {@code pageSize}. More on the algorithm can be found here:
     * <a href="https://docs.commercetools.com/api/general-concepts#iterating-over-all-elements">Iterating all elements</a>.</p>
     *
     * <p>The method takes a {@link java.util.function.Consumer} that is applied on every page of the queried elements.
     *
     * <p>NOTE: This method fetches all paged results sequentially as opposed to fetching the pages in
     * parallel.
     *
     * <p>NOTE: Please be aware that using a non-unique field for sorting may return incomplete results</p>
     *
     * @param query query containing predicates and expansion paths
     * @param pageConsumer consumer applied on every page queried
     * @param sortField field the results should sort on
     * @param sortOrder order of the results
     * @param elementIdentifierFn function to retrieve the sort order field from an element
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <TResult> type of the result
     * @param pageSize the page size
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends SimplePagedQueryResourceRequest<TMethod, TResult, ?>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final SimplePagedQueryResourceRequest<TMethod, TResult, ?> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer, final int pageSize, final String sortField,
            final SortOrder sortOrder, final Function<TElement, String> elementIdentifierFn) {
        final QueryAll<TMethod, TResult, TElement, Void> queryAll = QueryAll.of(query, pageSize, sortField, sortOrder,
            elementIdentifierFn);
        return queryAll.run(pageConsumer);
    }
}
