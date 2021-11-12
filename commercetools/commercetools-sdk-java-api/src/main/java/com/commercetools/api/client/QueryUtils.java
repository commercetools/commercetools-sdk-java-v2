
package com.commercetools.api.client;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.annotation.Nonnull;

import com.commercetools.api.models.DomainResource;
import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.ResourcePagedQueryResponse;

public class QueryUtils {
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
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <S> type of the returned result of the callback function on every page.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> query,
            @Nonnull final Function<List<TElement>, S> pageMapper) {
        return queryAll(query, pageMapper, DEFAULT_PAGE_SIZE);
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
     * @param query query containing predicates and expansion paths
     * @param pageConsumer consumer applied on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer) {
        return queryAll(query, pageConsumer, DEFAULT_PAGE_SIZE);
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
     * @param query query containing predicates and expansion paths
     * @param pageMapper callback function that is called on every page queried
     * @param <TElement> type of one query result element
     * @param <TMethod> type of the query
     * @param <S> type of the returned result of the callback function on every page.
     * @param pageSize the page size.
     * @return a completion stage containing a list of mapped pages as a result.
     */
    @Nonnull
    public static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> CompletionStage<List<S>> queryAll(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> query,
            @Nonnull final Function<List<TElement>, S> pageMapper, final int pageSize) {
        final QueryAll<TMethod, TResult, TElement, S> queryAll = QueryAll.of(query, pageSize);
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
     * @param pageSize the page size
     * @return a completion stage containing void as a result after the consumer was applied on all
     *     pages.
     */
    @Nonnull
    public static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> CompletionStage<Void> queryAll(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> query,
            @Nonnull final Consumer<List<TElement>> pageConsumer, final int pageSize) {
        final QueryAll<TMethod, TResult, TElement, Void> queryAll = QueryAll.of(query, pageSize);
        return queryAll.run(pageConsumer);
    }
}
