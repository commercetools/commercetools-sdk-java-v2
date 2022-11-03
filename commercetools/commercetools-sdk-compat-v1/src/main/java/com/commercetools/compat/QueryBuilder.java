
package com.commercetools.compat;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.PagedQueryResourceRequest;

import com.commercetools.api.models.cart.CartPagedQueryResponse;
import io.sphere.sdk.cartdiscounts.queries.CartDiscountQuery;
import io.sphere.sdk.carts.queries.CartQuery;
import io.sphere.sdk.categories.queries.CategoryQuery;
import io.sphere.sdk.channels.queries.ChannelQuery;
import io.sphere.sdk.customergroups.queries.CustomerGroupQuery;
import io.sphere.sdk.customers.queries.CustomerQuery;
import io.sphere.sdk.customobjects.queries.CustomObjectQuery;
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
import io.sphere.sdk.productselections.queries.ProductSelectionQuery;
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
        return with(queryDsl.apply(CartQuery.of()));
    }

    public ByProjectKeyCartsGet cart(final Supplier<CartQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyCartDiscountsGet cartDiscount(final Function<CartDiscountQuery, CartDiscountQuery> queryDsl) {
        return with(queryDsl.apply(CartDiscountQuery.of()));
    }

    public ByProjectKeyCartDiscountsGet cartDiscount(final Supplier<CartDiscountQuery> queryDsl) {
        return with(queryDsl.get());
    }

    @Deprecated
    public <T> ByProjectKeyCustomObjectsGet customObject(Class<T> valueClass, final Function<CustomObjectQuery<T>, CustomObjectQuery<T>> queryDsl) {
        return with(queryDsl.apply(CustomObjectQuery.of(valueClass)));
    }

    @Deprecated
    public ByProjectKeyCustomObjectsGet customObject(final Supplier<CustomObjectQuery<?>> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyCustomersGet customer(final Function<CustomerQuery, CustomerQuery> queryDsl) {
        return with(queryDsl.apply(CustomerQuery.of()));
    }

    public ByProjectKeyCustomersGet customer(final Supplier<CustomerQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyDiscountCodesGet discountCode(final Function<DiscountCodeQuery, DiscountCodeQuery> queryDsl) {
        return with(queryDsl.apply(DiscountCodeQuery.of()));
    }

    public ByProjectKeyDiscountCodesGet discountCode(final Supplier<DiscountCodeQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyCategoriesGet category(final Function<CategoryQuery, CategoryQuery> queryDsl) {
        return with(queryDsl.apply(CategoryQuery.of()));
    }

    public ByProjectKeyCategoriesGet category(final Supplier<CategoryQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyChannelsGet channel(final Function<ChannelQuery, ChannelQuery> queryDsl) {
        return with(queryDsl.apply(ChannelQuery.of()));
    }

    public ByProjectKeyChannelsGet channel(final Supplier<ChannelQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyProductsGet products(final Function<ProductQuery, ProductQuery> queryDsl) {
        return with(queryDsl.apply(ProductQuery.of()));
    }

    public ByProjectKeyProductsGet products(final Supplier<ProductQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyProductProjectionsGet productProjections(
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return with(queryDsl.apply(ProductProjectionQuery.ofCurrent()));
    }

    public ByProjectKeyProductProjectionsGet productProjections(
            final Supplier<ProductProjectionQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyProductProjectionsGet productProjectionsStaged(
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return with(queryDsl.apply(ProductProjectionQuery.ofStaged()));
    }

    public ByProjectKeyProductProjectionsGet productProjections(final ProductProjectionType type,
            final Function<ProductProjectionQuery, ProductProjectionQuery> queryDsl) {
        return with(queryDsl.apply(ProductProjectionQuery.of(type)));
    }

    public ByProjectKeyCustomerGroupsGet customerGroups(
            final Function<CustomerGroupQuery, CustomerGroupQuery> queryDsl) {
        return with(queryDsl.apply(CustomerGroupQuery.of()));
    }

    public ByProjectKeyCustomerGroupsGet customerGroups(
            final Supplier<CustomerGroupQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyExtensionsGet extensions(final Function<ExtensionQuery, ExtensionQuery> queryDsl) {
        return with(queryDsl.apply(ExtensionQuery.of()));
    }

    public ByProjectKeyExtensionsGet extensions(final Supplier<ExtensionQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyInventoryGet inventory(final Function<InventoryEntryQuery, InventoryEntryQuery> queryDsl) {
        return with(queryDsl.apply(InventoryEntryQuery.of()));
    }

    public ByProjectKeyInventoryGet inventory(final Supplier<InventoryEntryQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyMessagesGet messages(final Function<MessageQuery, MessageQuery> queryDsl) {
        return with(queryDsl.apply(MessageQuery.of()));
    }

    public ByProjectKeyMessagesGet messages(final Supplier<MessageQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyOrdersGet orders(final Function<OrderQuery, OrderQuery> queryDsl) {
        return with(queryDsl.apply(OrderQuery.of()));
    }

    public ByProjectKeyOrdersGet orders(final Supplier<OrderQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyPaymentsGet payments(final Function<PaymentQuery, PaymentQuery> queryDsl) {
        return with(queryDsl.apply(PaymentQuery.of()));
    }

    public ByProjectKeyPaymentsGet payments(final Supplier<PaymentQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyProductDiscountsGet productDiscounts(
            final Function<ProductDiscountQuery, ProductDiscountQuery> queryDsl) {
        return with(queryDsl.apply(ProductDiscountQuery.of()));
    }

    public ByProjectKeyProductDiscountsGet productDiscounts(
            final Supplier<ProductDiscountQuery> queryDsl) {
        return with(queryDsl.get());
    }

    //    public ByProjectKeyProductSelectionsGet productSelections(Function<ProductSelectionQuery, ProductSelectionQuery> queryDsl) {
    //        return query(apiRoot.productSelections().get(), ProductSelectionQuery::of, queryDsl);
    //    }

    public ByProjectKeyProductTypesGet productTypes(final Function<ProductTypeQuery, ProductTypeQuery> queryDsl) {
        return with(queryDsl.apply(ProductTypeQuery.of()));
    }

    public ByProjectKeyProductTypesGet productTypes(final Supplier<ProductTypeQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyReviewsGet review(final Function<ReviewQuery, ReviewQuery> queryDsl) {
        return with(queryDsl.apply(ReviewQuery.of()));
    }

    public ByProjectKeyReviewsGet review(final Supplier<ReviewQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyShippingMethodsGet shippingMethods(
            final Function<ShippingMethodQuery, ShippingMethodQuery> queryDsl) {
        return with(queryDsl.apply(ShippingMethodQuery.of()));
    }

    public ByProjectKeyShippingMethodsGet shippingMethods(
            final Supplier<ShippingMethodQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyShoppingListsGet shoppingLists(final Function<ShoppingListQuery, ShoppingListQuery> queryDsl) {
        return with(queryDsl.apply(ShoppingListQuery.of()));
    }

    public ByProjectKeyShoppingListsGet shoppingLists(final Supplier<ShoppingListQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyStatesGet states(final Function<StateQuery, StateQuery> queryDsl) {
        return with(queryDsl.apply(StateQuery.of()));
    }

    public ByProjectKeyStatesGet states(final Supplier<StateQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyStoresGet stores(final Function<StoreQuery, StoreQuery> queryDsl) {
        return with(queryDsl.apply(StoreQuery.of()));
    }

    public ByProjectKeyStoresGet stores(final Supplier<StoreQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeySubscriptionsGet subscriptions(final Function<SubscriptionQuery, SubscriptionQuery> queryDsl) {
        return with(queryDsl.apply(SubscriptionQuery.of()));
    }

    public ByProjectKeySubscriptionsGet subscriptions(final Supplier<SubscriptionQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyTaxCategoriesGet taxCategories(final Function<TaxCategoryQuery, TaxCategoryQuery> queryDsl) {
        return with(queryDsl.apply(TaxCategoryQuery.of()));
    }

    public ByProjectKeyTaxCategoriesGet taxCategories(final Supplier<TaxCategoryQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyZonesGet zones(final Function<ZoneQuery, ZoneQuery> queryDsl) {
        return with(queryDsl.apply(ZoneQuery.of()));
    }

    public ByProjectKeyZonesGet zones(final Supplier<ZoneQuery> queryDsl) {
        return with(queryDsl.get());
    }

    public ByProjectKeyTypesGet types(final Function<TypeQuery, TypeQuery> queryDsl) {
        return with(queryDsl.apply(TypeQuery.of()));
    }

    public ByProjectKeyTypesGet types(final Supplier<TypeQuery> queryDsl) {
        return with(queryDsl.get());
    }

    //    public PagedQueryResourceRequest apiClient(final ApiClientQuery queryDsl) {
    //        return query(apiRoot.apiClients().get(), queryDsl);
    //    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCartsGet cart(final CartQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCartDiscountsGet cartDiscount(final CartDiscountQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCustomObjectsGet customObject(final CustomObjectQuery<?> queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCustomersGet customer(final CustomerQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyDiscountCodesGet discountCode(final DiscountCodeQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCategoriesGet category(final CategoryQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyChannelsGet channel(final ChannelQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyProductsGet products(final ProductQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyProductProjectionsGet productProjections(final ProductProjectionQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyCustomerGroupsGet customerGroups(final CustomerGroupQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyExtensionsGet extensions(final ExtensionQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyInventoryGet inventory(final InventoryEntryQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyMessagesGet messages(final MessageQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyOrdersGet orders(final OrderQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyPaymentsGet payments(final PaymentQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyProductDiscountsGet productDiscounts(final ProductDiscountQuery queryDsl) {
        return with(queryDsl);
    }

    //    public ByProjectKeyProductSelectionsGet productSelections(final ProductSelectionQuery queryDsl) {
    //        return query(apiRoot.productSelections().get(), queryDsl);
    //    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyProductTypesGet productTypes(final ProductTypeQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyReviewsGet review(final ReviewQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyShippingMethodsGet shippingMethods(final ShippingMethodQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyShoppingListsGet shoppingLists(final ShoppingListQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyStatesGet states(final StateQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyStoresGet stores(final StoreQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeySubscriptionsGet subscriptions(final SubscriptionQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyTaxCategoriesGet taxCategories(final TaxCategoryQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyZonesGet zones(final ZoneQuery queryDsl) {
        return with(queryDsl);
    }

    /**
     * @deprecated use with(queryDsl)
     */
    @Deprecated
    public ByProjectKeyTypesGet types(final TypeQuery queryDsl) {
        return with(queryDsl);
    }

    public ByProjectKeyCartsGet with(final CartQuery queryDsl) {
        return query(apiRoot.carts().get(), queryDsl);
    }

    public ByProjectKeyCartDiscountsGet with(final CartDiscountQuery queryDsl) {
        return query(apiRoot.cartDiscounts().get(), queryDsl);
    }

    @Deprecated
    public ByProjectKeyCustomObjectsGet with(final CustomObjectQuery<?> queryDsl) {
        return query(apiRoot.customObjects().get(), queryDsl);
    }

    public ByProjectKeyCustomersGet with(final CustomerQuery queryDsl) {
        return query(apiRoot.customers().get(), queryDsl);
    }

    public ByProjectKeyDiscountCodesGet with(final DiscountCodeQuery queryDsl) {
        return query(apiRoot.discountCodes().get(), queryDsl);
    }

    public ByProjectKeyCategoriesGet with(final CategoryQuery queryDsl) {
        return query(apiRoot.categories().get(), queryDsl);
    }

    public ByProjectKeyChannelsGet with(final ChannelQuery queryDsl) {
        return query(apiRoot.channels().get(), queryDsl);
    }

    public ByProjectKeyProductsGet with(final ProductQuery queryDsl) {
        return query(apiRoot.products().get(), queryDsl);
    }

    public ByProjectKeyProductProjectionsGet with(final ProductProjectionQuery queryDsl) {
        return query(apiRoot.productProjections().get(), queryDsl);
    }

    public ByProjectKeyCustomerGroupsGet with(final CustomerGroupQuery queryDsl) {
        return query(apiRoot.customerGroups().get(), queryDsl);
    }

    public ByProjectKeyExtensionsGet with(final ExtensionQuery queryDsl) {
        return query(apiRoot.extensions().get(), queryDsl);
    }

    public ByProjectKeyInventoryGet with(final InventoryEntryQuery queryDsl) {
        return query(apiRoot.inventory().get(), queryDsl);
    }

    public ByProjectKeyMessagesGet with(final MessageQuery queryDsl) {
        return query(apiRoot.messages().get(), queryDsl);
    }

    public ByProjectKeyOrdersGet with(final OrderQuery queryDsl) {
        return query(apiRoot.orders().get(), queryDsl);
    }

    public ByProjectKeyPaymentsGet with(final PaymentQuery queryDsl) {
        return query(apiRoot.payments().get(), queryDsl);
    }

    public ByProjectKeyProductDiscountsGet with(final ProductDiscountQuery queryDsl) {
        return query(apiRoot.productDiscounts().get(), queryDsl);
    }

//    public ByProjectKeyProductSelectionsGet with(final ProductSelectionQuery queryDsl) {
//        return query(apiRoot.productSelections().get(), queryDsl);
//    }

    public ByProjectKeyProductTypesGet with(final ProductTypeQuery queryDsl) {
        return query(apiRoot.productTypes().get(), queryDsl);
    }

    public ByProjectKeyReviewsGet with(final ReviewQuery queryDsl) {
        return query(apiRoot.reviews().get(), queryDsl);
    }

    public ByProjectKeyShippingMethodsGet with(final ShippingMethodQuery queryDsl) {
        return query(apiRoot.shippingMethods().get(), queryDsl);
    }

    public ByProjectKeyShoppingListsGet with(final ShoppingListQuery queryDsl) {
        return query(apiRoot.shoppingLists().get(), queryDsl);
    }

    public ByProjectKeyStatesGet with(final StateQuery queryDsl) {
        return query(apiRoot.states().get(), queryDsl);
    }

    public ByProjectKeyStoresGet with(final StoreQuery queryDsl) {
        return query(apiRoot.stores().get(), queryDsl);
    }

    public ByProjectKeySubscriptionsGet with(final SubscriptionQuery queryDsl) {
        return query(apiRoot.subscriptions().get(), queryDsl);
    }

    public ByProjectKeyTaxCategoriesGet with(final TaxCategoryQuery queryDsl) {
        return query(apiRoot.taxCategories().get(), queryDsl);
    }

    public ByProjectKeyZonesGet with(final ZoneQuery queryDsl) {
        return query(apiRoot.zones().get(), queryDsl);
    }

    public ByProjectKeyTypesGet with(final TypeQuery queryDsl) {
        return query(apiRoot.types().get(), queryDsl);
    }
}
