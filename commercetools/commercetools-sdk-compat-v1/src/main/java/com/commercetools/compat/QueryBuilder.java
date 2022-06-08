
package com.commercetools.compat;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.PagedQueryResourceRequest;

import io.sphere.sdk.cartdiscounts.queries.CartDiscountQuery;
import io.sphere.sdk.carts.queries.CartQuery;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.channels.queries.ChannelQuery;
import io.sphere.sdk.customergroups.queries.CustomerGroupQuery;
import io.sphere.sdk.customers.queries.CustomerQuery;
import io.sphere.sdk.discountcodes.queries.DiscountCodeQuery;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.extensions.queries.ExtensionQuery;
import io.sphere.sdk.inventory.queries.InventoryEntryQuery;
import io.sphere.sdk.messages.queries.MessageQuery;
import io.sphere.sdk.orders.queries.OrderQuery;
import io.sphere.sdk.payments.queries.PaymentQuery;
import io.sphere.sdk.productdiscounts.queries.ProductDiscountQuery;
import io.sphere.sdk.products.ProductProjectionType;
import io.sphere.sdk.products.queries.ProductProjectionQuery;
import io.sphere.sdk.products.queries.ProductQuery;
import io.sphere.sdk.producttypes.queries.ProductTypeQuery;
import io.sphere.sdk.queries.MetaModelQueryDsl;
import io.sphere.sdk.queries.QueryPredicate;
import io.sphere.sdk.queries.QuerySort;
import io.sphere.sdk.reviews.queries.ReviewQuery;
import io.sphere.sdk.shippingmethods.queries.ShippingMethodQuery;
import io.sphere.sdk.shoppinglists.queries.ShoppingListQuery;
import io.sphere.sdk.states.queries.StateQuery;
import io.sphere.sdk.stores.queries.StoreQuery;
import io.sphere.sdk.subscriptions.queries.SubscriptionQuery;
import io.sphere.sdk.taxcategories.queries.TaxCategoryQuery;
import io.sphere.sdk.types.queries.TypeQuery;
import io.sphere.sdk.zones.queries.ZoneQuery;

public class QueryBuilder {
    private final ProjectApiRoot apiRoot;

    private QueryBuilder(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static QueryBuilder of(final ProjectApiRoot apiRoot) {
        return new QueryBuilder(apiRoot);
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult, TQuery extends MetaModelQueryDsl<?, ?, ?, ?>> T query(
            final T request, final TQuery queryDsl) {
        PagedQueryResourceRequest<T, TResult> updatedRequest = queryDsl.limit() != null
                ? request.withLimit(queryDsl.limit())
                : request;
        updatedRequest = queryDsl.offset() != null ? updatedRequest.withOffset(queryDsl.offset()) : updatedRequest;
        updatedRequest = queryDsl.fetchTotal() != null ? updatedRequest.withWithTotal(queryDsl.fetchTotal())
                : updatedRequest;
        for (QuerySort<?> querySort : queryDsl.sort()) {
            updatedRequest = updatedRequest.addSort(querySort.toSphereSort());
        }
        for (QueryPredicate<?> queryPredicate : queryDsl.predicates()) {
            updatedRequest = updatedRequest.addWhere(queryPredicate.toSphereQuery());
        }
        for (ExpansionPath<?> expansionPath : queryDsl.expansionPaths()) {
            updatedRequest = updatedRequest.addWhere(expansionPath.toSphereExpand());
        }
        return updatedRequest.asPagedQueryResourceRequestToBaseType();
    }

    public static <T extends PagedQueryResourceRequest<T, TResult>, TResult, TQuery extends MetaModelQueryDsl<?, ?, ?, ?>> T query(
            final T request, final Supplier<TQuery> createQueryDsl, final Function<TQuery, TQuery> queryDsl) {
        MetaModelQueryDsl<?, ?, ?, ?> query = queryDsl.apply(createQueryDsl.get());
        return query(request, query);
    }

    public <T extends PagedQueryResourceRequest<T, TResult>, TResult, TQuery extends MetaModelQueryDsl<?, ?, ?, ?>> T with(
            final Function<ProjectApiRoot, T> request, final Supplier<TQuery> createQueryDsl,
            final Function<TQuery, TQuery> queryDsl) {
        MetaModelQueryDsl<?, ?, ?, ?> query = queryDsl.apply(createQueryDsl.get());
        return query(request.apply(apiRoot), query);
    }

    //    public PagedQueryResourceRequest apiClient(final Function<ApiClientQuery, ApiClientQuery> queryDsl) {
    //        return query(apiRoot.apiClients().get(), ApiClientQuery::of, queryDsl);
    //    }

    public ByProjectKeyCartsGet cart(final Function<CartQuery, CartQuery> queryDsl) {
        return query(apiRoot.carts().get(), CartQuery::of, queryDsl);
    }

    public ByProjectKeyCartDiscountsGet cartDiscount(final Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query(apiRoot.cartDiscounts().get(), CartDiscountQuery::of, queryDsl);
    }

    public ByProjectKeyCartDiscountsGet customObject(final Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return query(apiRoot.cartDiscounts().get(), CartDiscountQuery::of, queryDsl);
    }

    public ByProjectKeyCustomersGet customer(final Function<CustomerQuery, CustomerQuery> queryDsl) {
        return query(apiRoot.customers().get(), CustomerQuery::of, queryDsl);
    }

    public ByProjectKeyDiscountCodesGet discountCode(final Function<DiscountCodeQuery, DiscountCodeQuery> queryDsl) {
        return query(apiRoot.discountCodes().get(), DiscountCodeQuery::of, queryDsl);
    }

    public ByProjectKeyCategoriesGet category(final Function<CategoryQuery, CategoryQuery> queryDsl) {
        return query(apiRoot.categories().get(), CategoryQuery::of, queryDsl);
    }

    public ByProjectKeyChannelsGet channel(final Function<ChannelQuery, ChannelQuery> queryDsl) {
        return query(apiRoot.channels().get(), ChannelQuery::of, queryDsl);
    }

    public ByProjectKeyProductsGet products(final Function<ProductQuery, ProductQuery> queryDsl) {
        return query(apiRoot.products().get(), ProductQuery::of, queryDsl);
    }

    public ByProjectKeyProductProjectionsGet productProjections(
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return query(apiRoot.productProjections().get(), ProductProjectionQuery::ofCurrent, queryDsl);
    }

    public ByProjectKeyProductProjectionsGet productProjectionsStaged(
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return query(apiRoot.productProjections().get(), ProductProjectionQuery::ofStaged, queryDsl);
    }

    public ByProjectKeyProductProjectionsGet productProjections(final ProductProjectionType type,
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return query(apiRoot.productProjections().get(), () -> ProductProjectionQuery.of(type), queryDsl);
    }

    public ByProjectKeyCustomerGroupsGet customerGroups(
            final Function<CustomerGroupQuery, CustomerGroupQuery> queryDsl) {
        return query(apiRoot.customerGroups().get(), CustomerGroupQuery::of, queryDsl);
    }

    public ByProjectKeyExtensionsGet extensions(final Function<ExtensionQuery, ExtensionQuery> queryDsl) {
        return query(apiRoot.extensions().get(), ExtensionQuery::of, queryDsl);
    }

    public ByProjectKeyInventoryGet inventory(final Function<InventoryEntryQuery, InventoryEntryQuery> queryDsl) {
        return query(apiRoot.inventory().get(), InventoryEntryQuery::of, queryDsl);
    }

    public ByProjectKeyMessagesGet messages(final Function<MessageQuery, MessageQuery> queryDsl) {
        return query(apiRoot.messages().get(), MessageQuery::of, queryDsl);
    }

    public ByProjectKeyOrdersGet orders(final Function<OrderQuery, OrderQuery> queryDsl) {
        return query(apiRoot.orders().get(), OrderQuery::of, queryDsl);
    }

    public ByProjectKeyPaymentsGet payments(final Function<PaymentQuery, PaymentQuery> queryDsl) {
        return query(apiRoot.payments().get(), PaymentQuery::of, queryDsl);
    }

    public ByProjectKeyProductDiscountsGet productDiscounts(
            final Function<ProductDiscountQuery, ProductDiscountQuery> queryDsl) {
        return query(apiRoot.productDiscounts().get(), ProductDiscountQuery::of, queryDsl);
    }

    //    public ByProjectKeyProductSelectionsGet productSelections(Function<ProductSelectionQuery, ProductSelectionQuery> queryDsl) {
    //        return query(apiRoot.productSelections().get(), ProductSelectionQuery::of, queryDsl);
    //    }

    public ByProjectKeyProductTypesGet productTypes(final Function<ProductTypeQuery, ProductTypeQuery> queryDsl) {
        return query(apiRoot.productTypes().get(), ProductTypeQuery::of, queryDsl);
    }

    public ByProjectKeyReviewsGet review(final Function<ReviewQuery, ReviewQuery> queryDsl) {
        return query(apiRoot.reviews().get(), ReviewQuery::of, queryDsl);
    }

    public ByProjectKeyShippingMethodsGet shippingMethods(
            final Function<ShippingMethodQuery, ShippingMethodQuery> queryDsl) {
        return query(apiRoot.shippingMethods().get(), ShippingMethodQuery::of, queryDsl);
    }

    public ByProjectKeyShoppingListsGet shoppingLists(final Function<ShoppingListQuery, ShoppingListQuery> queryDsl) {
        return query(apiRoot.shoppingLists().get(), ShoppingListQuery::of, queryDsl);
    }

    public ByProjectKeyStatesGet states(final Function<StateQuery, StateQuery> queryDsl) {
        return query(apiRoot.states().get(), StateQuery::of, queryDsl);
    }

    public ByProjectKeyStoresGet stores(final Function<StoreQuery, StoreQuery> queryDsl) {
        return query(apiRoot.stores().get(), StoreQuery::of, queryDsl);
    }

    public ByProjectKeySubscriptionsGet subscriptions(final Function<SubscriptionQuery, SubscriptionQuery> queryDsl) {
        return query(apiRoot.subscriptions().get(), SubscriptionQuery::of, queryDsl);
    }

    public ByProjectKeyTaxCategoriesGet taxCategories(final Function<TaxCategoryQuery, TaxCategoryQuery> queryDsl) {
        return query(apiRoot.taxCategories().get(), TaxCategoryQuery::of, queryDsl);
    }

    public ByProjectKeyZonesGet zones(final Function<ZoneQuery, ZoneQuery> queryDsl) {
        return query(apiRoot.zones().get(), ZoneQuery::of, queryDsl);
    }

    public ByProjectKeyTypesGet types(final Function<TypeQuery, TypeQuery> queryDsl) {
        return query(apiRoot.types().get(), TypeQuery::of, queryDsl);
    }

    //    public PagedQueryResourceRequest apiClient(final ApiClientQuery queryDsl) {
    //        return query(apiRoot.apiClients().get(), queryDsl);
    //    }

    public ByProjectKeyCartsGet cart(final CartQuery queryDsl) {
        return query(apiRoot.carts().get(), queryDsl);
    }

    public ByProjectKeyCartDiscountsGet cartDiscount(final CartDiscountQuery queryDsl) {
        return query(apiRoot.cartDiscounts().get(), queryDsl);
    }

    public ByProjectKeyCartDiscountsGet customObject(final CartDiscountQuery queryDsl) {
        return query(apiRoot.cartDiscounts().get(), queryDsl);
    }

    public ByProjectKeyCustomersGet customer(final CustomerQuery queryDsl) {
        return query(apiRoot.customers().get(), queryDsl);
    }

    public ByProjectKeyDiscountCodesGet discountCode(final DiscountCodeQuery queryDsl) {
        return query(apiRoot.discountCodes().get(), queryDsl);
    }

    public ByProjectKeyCategoriesGet category(final CategoryQuery queryDsl) {
        return query(apiRoot.categories().get(), queryDsl);
    }

    public ByProjectKeyChannelsGet channel(final ChannelQuery queryDsl) {
        return query(apiRoot.channels().get(), queryDsl);
    }

    public ByProjectKeyProductsGet products(final ProductQuery queryDsl) {
        return query(apiRoot.products().get(), queryDsl);
    }

    public ByProjectKeyProductProjectionsGet productProjections(final ProductProjectionQuery queryDsl) {
        return query(apiRoot.productProjections().get(), queryDsl);
    }

    public ByProjectKeyCustomerGroupsGet customerGroups(final CustomerGroupQuery queryDsl) {
        return query(apiRoot.customerGroups().get(), queryDsl);
    }

    public ByProjectKeyExtensionsGet extensions(final ExtensionQuery queryDsl) {
        return query(apiRoot.extensions().get(), queryDsl);
    }

    public ByProjectKeyInventoryGet inventory(final InventoryEntryQuery queryDsl) {
        return query(apiRoot.inventory().get(), queryDsl);
    }

    public ByProjectKeyMessagesGet messages(final MessageQuery queryDsl) {
        return query(apiRoot.messages().get(), queryDsl);
    }

    public ByProjectKeyOrdersGet orders(final OrderQuery queryDsl) {
        return query(apiRoot.orders().get(), queryDsl);
    }

    public ByProjectKeyPaymentsGet payments(final PaymentQuery queryDsl) {
        return query(apiRoot.payments().get(), queryDsl);
    }

    public ByProjectKeyProductDiscountsGet productDiscounts(final ProductDiscountQuery queryDsl) {
        return query(apiRoot.productDiscounts().get(), queryDsl);
    }

    //    public ByProjectKeyProductSelectionsGet productSelections(final ProductSelectionQuery queryDsl) {
    //        return query(apiRoot.productSelections().get(), queryDsl);
    //    }

    public ByProjectKeyProductTypesGet productTypes(final ProductTypeQuery queryDsl) {
        return query(apiRoot.productTypes().get(), queryDsl);
    }

    public ByProjectKeyReviewsGet review(final ReviewQuery queryDsl) {
        return query(apiRoot.reviews().get(), queryDsl);
    }

    public ByProjectKeyShippingMethodsGet shippingMethods(final ShippingMethodQuery queryDsl) {
        return query(apiRoot.shippingMethods().get(), queryDsl);
    }

    public ByProjectKeyShoppingListsGet shoppingLists(final ShoppingListQuery queryDsl) {
        return query(apiRoot.shoppingLists().get(), queryDsl);
    }

    public ByProjectKeyStatesGet states(final StateQuery queryDsl) {
        return query(apiRoot.states().get(), queryDsl);
    }

    public ByProjectKeyStoresGet stores(final StoreQuery queryDsl) {
        return query(apiRoot.stores().get(), queryDsl);
    }

    public ByProjectKeySubscriptionsGet subscriptions(final SubscriptionQuery queryDsl) {
        return query(apiRoot.subscriptions().get(), queryDsl);
    }

    public ByProjectKeyTaxCategoriesGet taxCategories(final TaxCategoryQuery queryDsl) {
        return query(apiRoot.taxCategories().get(), queryDsl);
    }

    public ByProjectKeyZonesGet zones(final ZoneQuery queryDsl) {
        return query(apiRoot.zones().get(), queryDsl);
    }

    public ByProjectKeyTypesGet types(final TypeQuery queryDsl) {
        return query(apiRoot.types().get(), queryDsl);
    }
}
