
package com.commercetools.api.client;

import static java.util.concurrent.CompletableFuture.completedFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.annotation.Nonnull;

import com.commercetools.api.models.DomainResource;
import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.ResourcePagedQueryResponse;

import io.vrap.rmf.base.client.ApiHttpResponse;

final class QueryAll<TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> {
    private final PagedQueryResourceRequest<TMethod, TResult> baseQuery;
    private final long pageSize;

    private Function<List<TElement>, S> pageMapper;
    private final List<S> mappedResultsTillNow;

    private Consumer<List<TElement>> pageConsumer;

    private QueryAll(@Nonnull final PagedQueryResourceRequest<TMethod, TResult> baseQuery, final int pageSize) {

        this.baseQuery = withDefaults(baseQuery, pageSize);
        this.pageSize = pageSize;
        this.mappedResultsTillNow = new ArrayList<>();
    }

    @Nonnull
    private static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>> PagedQueryResourceRequest<TMethod, TResult> withDefaults(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> request, final int pageSize) {

        final PagedQueryResourceRequest<TMethod, TResult> withLimit = request.withLimit(pageSize).withWithTotal(false);
        return !withLimit.getQueryParam("sort").isEmpty() ? withLimit : withLimit.withSort("id asc");
    }

    @Nonnull
    static <TMethod extends PagedQueryResourceRequest<TMethod, TResult>, TResult extends ResourcePagedQueryResponse<TElement>, TElement extends DomainResource<TElement>, S> QueryAll<TMethod, TResult, TElement, S> of(
            @Nonnull final PagedQueryResourceRequest<TMethod, TResult> baseQuery, final int pageSize) {

        return new QueryAll<>(baseQuery, pageSize);
    }

    /**
     * Given a {@link Function} to a page of resources of type {@code TElement} that returns a mapped result
     * of type {@code S}, this method sets this instance's {@code pageMapper} to the supplied value,
     * then it makes requests to fetch the entire result space of the resource {@code TElement} on CTP, while
     * applying the function on each fetched page.
     *
     * @param pageMapper the function to apply on each fetched page of the result space.
     * @return a future containing a list of mapped results of type {@code S}, after the function
     *     applied all the pages.
     */
    @Nonnull
    CompletionStage<List<S>> run(@Nonnull final Function<List<TElement>, S> pageMapper) {
        this.pageMapper = pageMapper;
        final CompletionStage<ApiHttpResponse<TResult>> firstPage = baseQuery.execute();
        return queryNextPages(firstPage).thenApply(voidResult -> this.mappedResultsTillNow);
    }

    /**
     * Given a {@link Consumer} to a page of resources of type {@code TElement}, this method sets this
     * instance's {@code pageConsumer} to the supplied value, then it makes requests to fetch the
     * entire result space of the resource {@code TElement} on CTP, while accepting the consumer on each
     * fetched page.
     *
     * @param pageConsumer the consumer to accept on each fetched page of the result space.
     * @return a future containing void after the consumer accepted all the pages.
     */
    @Nonnull
    CompletionStage<Void> run(@Nonnull final Consumer<List<TElement>> pageConsumer) {
        this.pageConsumer = pageConsumer;
        final CompletionStage<ApiHttpResponse<TResult>> firstPage = baseQuery.execute();
        return queryNextPages(firstPage).thenAccept(voidResult -> {
        });
    }

    /**
     * Given a completion stage {@code currentPageStage} containing a current page result {@link
     * ResourcePagedQueryResponse}, this method composes the completion stage by first checking if the result is
     * null or not. If it is not, then it recursivley (by calling itself with the next page's
     * completion stage result) composes to the supplied stage, stages of the all next pages'
     * processing. If there is no next page, then the result of the {@code currentPageStage} would be
     * null and this method would just return a completed future containing containing null result,
     * which in turn signals the last page of processing.
     *
     * @param currentPageStage a future containing a result {@link ResourcePagedQueryResponse}.
     */
    @Nonnull
    private CompletionStage<Void> queryNextPages(
            @Nonnull final CompletionStage<ApiHttpResponse<TResult>> currentPageStage) {
        return currentPageStage.thenCompose(
            currentPage -> currentPage != null ? queryNextPages(processPageAndGetNext(currentPage.getBody()))
                    : completedFuture(null));
    }

    /**
     * Given a page result {@link ResourcePagedQueryResponse}, this method checks if there are elements in the
     * result (size > 0), then it maps or consumes the resultant list using this instance's {@code
     * pageMapper} or {code pageConsumer} whichever is available. Then it attempts to fetch the next
     * page if it exists and returns a completion stage containing the result of the next page. If
     * there is a next page, then a new future of the next page is returned. If there are no more
     * results, the method returns a completed future containing null.
     *
     * @param page the current page result.
     * @return If there is a next page, then a new future of the next page is returned. If there are
     *     no more results, the method returns a completed future containing null.
     */
    @Nonnull
    private CompletionStage<ApiHttpResponse<TResult>> processPageAndGetNext(
            @Nonnull final ResourcePagedQueryResponse<TElement> page) {
        final List<TElement> currentPageElements = page.getResults();
        if (!currentPageElements.isEmpty()) {
            mapOrConsume(currentPageElements);
            return getNextPageStage(currentPageElements);
        }
        return completedFuture(null);
    }

    /**
     * Given a list of page elements of resource {@code TElement}, this method checks if this instance's
     * {@code pageConsumer} or {@code pageMapper} is set (not null). The one which is set is then
     * applied on the list of page elements.
     *
     * @param pageElements list of page elements of resource {@code T}.
     */
    private void mapOrConsume(@Nonnull final List<TElement> pageElements) {
        if (pageConsumer != null) {
            pageConsumer.accept(pageElements);
        }
        else {
            mappedResultsTillNow.add(pageMapper.apply(pageElements));
        }
    }

    /**
     * Given a list of page elements of resource {@code TElement}, this method checks if this page is the
     * last page or not by checking if the result size is equal to this instance's {@code pageSize}).
     * If It is, then it means there might be still more results. However, if not, then it means for
     * sure there are no more results and this is the last page. If there is a next page, the id of
     * the last element in the list is fetched and a future is created containing the fetched results
     * which have an id greater than the id of the last element in the list and this future is
     * returned. If there are no more results, the method returns a completed future containing null.
     *
     * @param pageElements list of page elements of resource {@code TElement}.
     * @return a future containing the fetched results which have an id greater than the id of the
     *     last element in the list.
     */
    @Nonnull
    private CompletionStage<ApiHttpResponse<TResult>> getNextPageStage(@Nonnull final List<TElement> pageElements) {
        if (pageElements.size() == pageSize) {
            final String lastElementId = pageElements.get(pageElements.size() - 1).getId();
            return baseQuery.addWhere("id > :lastId", "lastId", lastElementId).execute();
        }
        return completedFuture(null);
    }
}
