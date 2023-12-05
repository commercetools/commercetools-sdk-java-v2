
package com.commercetools.compat;

import static java.util.Objects.requireNonNull;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.order.OrderResourceIdentifier;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.product_discount.ProductDiscountResourceIdentifier;
import com.commercetools.api.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.models.review.ReviewResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;

import io.sphere.sdk.cartdiscounts.queries.CartDiscountByKeyGet;
import io.sphere.sdk.carts.queries.CartByKeyGet;
import io.sphere.sdk.categories.queries.CategoryByKeyGet;
import io.sphere.sdk.customergroups.queries.CustomerGroupByKeyGet;
import io.sphere.sdk.customers.queries.CustomerByKeyGet;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.orders.queries.OrderByOrderNumberGet;
import io.sphere.sdk.payments.queries.PaymentByKeyGet;
import io.sphere.sdk.productdiscounts.queries.ProductDiscountByKeyGet;
import io.sphere.sdk.products.ProductProjectionType;
import io.sphere.sdk.products.queries.ProductByKeyGet;
import io.sphere.sdk.products.queries.ProductProjectionByKeyGet;
import io.sphere.sdk.producttypes.queries.ProductTypeByKeyGet;
import io.sphere.sdk.queries.MetaModelGetDsl;
import io.sphere.sdk.reviews.queries.ReviewByKeyGet;
import io.sphere.sdk.shippingmethods.queries.ShippingMethodByKeyGet;
import io.sphere.sdk.shoppinglists.queries.ShoppingListByKeyGet;
import io.sphere.sdk.states.queries.StateByKeyGet;
import io.sphere.sdk.stores.queries.StoreByKeyGet;
import io.sphere.sdk.taxcategories.queries.TaxCategoryByKeyGet;
import io.sphere.sdk.zones.queries.ZoneByKeyGet;
import io.vrap.rmf.base.client.ApiMethod;

public class GetByKeyBuilder {
    private final ProjectApiRoot apiRoot;

    private GetByKeyBuilder(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static GetByKeyBuilder of(final ProjectApiRoot apiRoot) {
        return new GetByKeyBuilder(apiRoot);
    }

    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelGetDsl<?, ?, ?, ?>> T get(
            final T request, final TQuery getDsl) {
        T updatedRequest = request;
        for (ExpansionPath<?> expansionPath : getDsl.expansionPaths()) {
            updatedRequest = (T) updatedRequest.addExpand(expansionPath.toSphereExpand());
        }
        return updatedRequest;
    }

    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelGetDsl<?, ?, ?, ?>> T get(
            final T request, final Supplier<TQuery> createGetDsl, final Function<TQuery, TQuery> getDsl) {
        MetaModelGetDsl<?, ?, ?, ?> get = getDsl.apply(createGetDsl.get());
        return get(request, get);
    }

    public <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelGetDsl<?, ?, ?, ?>> T with(
            final Function<ProjectApiRoot, T> request, final Supplier<TQuery> createGetDsl,
            final Function<TQuery, TQuery> getDsl) {
        MetaModelGetDsl<?, ?, ?, ?> get = getDsl.apply(createGetDsl.get());
        return get(request.apply(apiRoot), get);
    }

    public ByProjectKeyCustomersKeyByKeyGet customer(final String key,
            final Function<CustomerByKeyGet, CustomerByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.customers().withKey(key).get(), () -> CustomerByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyCustomersKeyByKeyGet customer(final CustomerResourceIdentifier identifiable,
            final Function<CustomerByKeyGet, CustomerByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.customers().withKey(identifiable.getKey()).get(),
            () -> CustomerByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyCustomersKeyByKeyGet customer(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.customers.Customer> identifiable,
            final Function<CustomerByKeyGet, CustomerByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.customers().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CustomerByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyCartsKeyByKeyGet cart(final String key, final Function<CartByKeyGet, CartByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.carts().withKey(key).get(), () -> CartByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyCartsKeyByKeyGet cart(final CartResourceIdentifier identifiable,
            final Function<CartByKeyGet, CartByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.carts().withKey(identifiable.getKey()).get(), () -> CartByKeyGet.of(identifiable.getKey()),
            getDsl);
    }

    public ByProjectKeyCartsKeyByKeyGet cart(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.carts.Cart> identifiable,
            final Function<CartByKeyGet, CartByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.carts().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CartByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyCartDiscountsKeyByKeyGet cartDiscount(final String key,
            final Function<CartDiscountByKeyGet, CartDiscountByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.cartDiscounts().withKey(key).get(), () -> CartDiscountByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyCartDiscountsKeyByKeyGet cartDiscount(final CartDiscountResourceIdentifier identifiable,
            final Function<CartDiscountByKeyGet, CartDiscountByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.cartDiscounts().withKey(identifiable.getKey()).get(),
            () -> CartDiscountByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyCartDiscountsKeyByKeyGet cartDiscount(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.cartdiscounts.CartDiscount> identifiable,
            final Function<CartDiscountByKeyGet, CartDiscountByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.cartDiscounts().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CartDiscountByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyCategoriesKeyByKeyGet category(final String key,
            final Function<CategoryByKeyGet, CategoryByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.categories().withKey(key).get(), () -> CategoryByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyCategoriesKeyByKeyGet category(final CategoryResourceIdentifier identifiable,
            final Function<CategoryByKeyGet, CategoryByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.categories().withKey(identifiable.getKey()).get(),
            () -> CategoryByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyCategoriesKeyByKeyGet category(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.categories.Category> identifiable,
            final Function<CategoryByKeyGet, CategoryByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.categories().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CategoryByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyProductsKeyByKeyGet product(final String key,
            final Function<ProductByKeyGet, ProductByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.products().withKey(key).get(), () -> ProductByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyProductsKeyByKeyGet product(final ProductResourceIdentifier identifiable,
            final Function<ProductByKeyGet, ProductByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.products().withKey(identifiable.getKey()).get(),
            () -> ProductByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyProductsKeyByKeyGet product(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.products.Product> identifiable,
            final Function<ProductByKeyGet, ProductByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.products().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(final String key,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.productProjections().withKey(key).get(), () -> ProductProjectionByKeyGet.ofCurrent(key),
            getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(final ProductResourceIdentifier identifiable,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.productProjections().withKey(identifiable.getKey()).get(),
            () -> ProductProjectionByKeyGet.ofCurrent(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.productProjections().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductProjectionByKeyGet.ofCurrent(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(final String key,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.productProjections().withKey(key).get(),
            () -> ProductProjectionByKeyGet.of(key, projectionType), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(final ProductResourceIdentifier identifiable,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.productProjections().withKey(identifiable.getKey()).get(),
            () -> ProductProjectionByKeyGet.of(identifiable.getKey(), projectionType), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjection(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.productProjections().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductProjectionByKeyGet.of(identifiable.toResourceIdentifier().getKey(), projectionType), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjectionStaged(final String key,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.productProjections().withKey(key).get(), () -> ProductProjectionByKeyGet.ofStaged(key),
            getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjectionStaged(
            final ProductResourceIdentifier identifiable,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.productProjections().withKey(identifiable.getKey()).get(),
            () -> ProductProjectionByKeyGet.ofStaged(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet productProjectionStaged(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final Function<ProductProjectionByKeyGet, ProductProjectionByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.productProjections().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductProjectionByKeyGet.ofStaged(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyGet customerGroup(final String key,
            final Function<CustomerGroupByKeyGet, CustomerGroupByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.customerGroups().withKey(key).get(), () -> CustomerGroupByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyGet customerGroup(final CustomerGroupResourceIdentifier identifiable,
            final Function<CustomerGroupByKeyGet, CustomerGroupByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.customerGroups().withKey(identifiable.getKey()).get(),
            () -> CustomerGroupByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyGet customerGroup(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.customergroups.CustomerGroup> identifiable,
            final Function<CustomerGroupByKeyGet, CustomerGroupByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.customerGroups().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CustomerGroupByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyExtensionsKeyByKeyGet extension(final String key) {
        requireNonNull(key);
        return apiRoot.extensions().withKey(key).get();
    }

    public ByProjectKeyExtensionsKeyByKeyGet extension(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.extensions.Extension> identifiable) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return apiRoot.extensions().withKey(identifiable.toResourceIdentifier().getKey()).get();
    }

    public ByProjectKeyOrdersOrderNumberByOrderNumberGet order(final String key,
            final Function<OrderByOrderNumberGet, OrderByOrderNumberGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.orders().withOrderNumber(key).get(), () -> OrderByOrderNumberGet.of(key), getDsl);
    }

    @Deprecated
    public ByProjectKeyOrdersOrderNumberByOrderNumberGet order(final OrderResourceIdentifier identifiable,
            final Function<OrderByOrderNumberGet, OrderByOrderNumberGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.orders().withOrderNumber(identifiable.getKey()).get(),
            () -> OrderByOrderNumberGet.of(identifiable.getKey()), getDsl);
    }

    @Deprecated
    public ByProjectKeyOrdersOrderNumberByOrderNumberGet order(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.orders.Order> identifiable,
            final Function<OrderByOrderNumberGet, OrderByOrderNumberGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.orders().withOrderNumber(identifiable.toResourceIdentifier().getKey()).get(),
            () -> OrderByOrderNumberGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyPaymentsKeyByKeyGet payment(final String key,
            final Function<PaymentByKeyGet, PaymentByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.payments().withKey(key).get(), () -> PaymentByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyPaymentsKeyByKeyGet payment(final PaymentResourceIdentifier identifiable,
            final Function<PaymentByKeyGet, PaymentByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.payments().withKey(identifiable.getKey()).get(),
            () -> PaymentByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyPaymentsKeyByKeyGet payment(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.payments.Payment> identifiable,
            final Function<PaymentByKeyGet, PaymentByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.payments().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> PaymentByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyProductDiscountsKeyByKeyGet productDiscount(final String key,
            final Function<ProductDiscountByKeyGet, ProductDiscountByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.productDiscounts().withKey(key).get(), () -> ProductDiscountByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyProductDiscountsKeyByKeyGet productDiscount(final ProductDiscountResourceIdentifier identifiable,
            final Function<ProductDiscountByKeyGet, ProductDiscountByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.productDiscounts().withKey(identifiable.getKey()).get(),
            () -> ProductDiscountByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyProductDiscountsKeyByKeyGet productDiscount(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.productdiscounts.ProductDiscount> identifiable,
            final Function<ProductDiscountByKeyGet, ProductDiscountByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.productDiscounts().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductDiscountByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyProductTypesKeyByKeyGet productType(final String key,
            final Function<ProductTypeByKeyGet, ProductTypeByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.productTypes().withKey(key).get(), () -> ProductTypeByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyProductTypesKeyByKeyGet productType(final ProductTypeResourceIdentifier identifiable,
            final Function<ProductTypeByKeyGet, ProductTypeByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.productTypes().withKey(identifiable.getKey()).get(),
            () -> ProductTypeByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyProductTypesKeyByKeyGet productType(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.producttypes.ProductType> identifiable,
            final Function<ProductTypeByKeyGet, ProductTypeByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.productTypes().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ProductTypeByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyReviewsKeyByKeyGet review(final String key,
            final Function<ReviewByKeyGet, ReviewByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.reviews().withKey(key).get(), () -> ReviewByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyReviewsKeyByKeyGet review(final ReviewResourceIdentifier identifiable,
            final Function<ReviewByKeyGet, ReviewByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.reviews().withKey(identifiable.getKey()).get(),
            () -> ReviewByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyReviewsKeyByKeyGet review(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.reviews.Review> identifiable,
            final Function<ReviewByKeyGet, ReviewByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.reviews().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ReviewByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyShippingMethodsKeyByKeyGet shippingMethod(final String key,
            final Function<ShippingMethodByKeyGet, ShippingMethodByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.shippingMethods().withKey(key).get(), () -> ShippingMethodByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyShippingMethodsKeyByKeyGet shippingMethod(final ShippingMethodResourceIdentifier identifiable,
            final Function<ShippingMethodByKeyGet, ShippingMethodByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.shippingMethods().withKey(identifiable.getKey()).get(),
            () -> ShippingMethodByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyShippingMethodsKeyByKeyGet shippingMethod(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.shippingmethods.ShippingMethod> identifiable,
            final Function<ShippingMethodByKeyGet, ShippingMethodByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.shippingMethods().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ShippingMethodByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyShoppingListsKeyByKeyGet shoppingList(final String key,
            final Function<ShoppingListByKeyGet, ShoppingListByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.shoppingLists().withKey(key).get(), () -> ShoppingListByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyShoppingListsKeyByKeyGet shoppingList(final ShoppingListResourceIdentifier identifiable,
            final Function<ShoppingListByKeyGet, ShoppingListByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.shoppingLists().withKey(identifiable.getKey()).get(),
            () -> ShoppingListByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyShoppingListsKeyByKeyGet shoppingList(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.shoppinglists.ShoppingList> identifiable,
            final Function<ShoppingListByKeyGet, ShoppingListByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.shoppingLists().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ShoppingListByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyStatesKeyByKeyGet state(final String key, final Function<StateByKeyGet, StateByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.states().withKey(key).get(), () -> StateByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyStatesKeyByKeyGet state(final StateResourceIdentifier identifiable,
            final Function<StateByKeyGet, StateByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.states().withKey(identifiable.getKey()).get(), () -> StateByKeyGet.of(identifiable.getKey()),
            getDsl);
    }

    public ByProjectKeyStatesKeyByKeyGet state(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.states.State> identifiable,
            final Function<StateByKeyGet, StateByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.states().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> StateByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyStoresKeyByKeyGet store(final String key, final Function<StoreByKeyGet, StoreByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.stores().withKey(key).get(), () -> StoreByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyStoresKeyByKeyGet store(final StoreResourceIdentifier identifiable,
            final Function<StoreByKeyGet, StoreByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.stores().withKey(identifiable.getKey()).get(), () -> StoreByKeyGet.of(identifiable.getKey()),
            getDsl);
    }

    public ByProjectKeyStoresKeyByKeyGet store(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.stores.Store> identifiable,
            final Function<StoreByKeyGet, StoreByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.stores().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> StoreByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeySubscriptionsKeyByKeyGet subscription(final String key) {
        requireNonNull(key);
        return apiRoot.subscriptions().withKey(key).get();
    }

    public ByProjectKeySubscriptionsKeyByKeyGet subscription(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.subscriptions.Subscription> identifiable) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return apiRoot.subscriptions().withKey(identifiable.toResourceIdentifier().getKey()).get();
    }

    public ByProjectKeyTaxCategoriesKeyByKeyGet taxCategory(final String key,
            final Function<TaxCategoryByKeyGet, TaxCategoryByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.taxCategories().withKey(key).get(), () -> TaxCategoryByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyGet taxCategory(final TaxCategoryResourceIdentifier identifiable,
            final Function<TaxCategoryByKeyGet, TaxCategoryByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.taxCategories().withKey(identifiable.getKey()).get(),
            () -> TaxCategoryByKeyGet.of(identifiable.getKey()), getDsl);
    }

    public ByProjectKeyTaxCategoriesKeyByKeyGet taxCategory(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.taxcategories.TaxCategory> identifiable,
            final Function<TaxCategoryByKeyGet, TaxCategoryByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.taxCategories().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> TaxCategoryByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }

    public ByProjectKeyZonesKeyByKeyGet zone(final String key, final Function<ZoneByKeyGet, ZoneByKeyGet> getDsl) {
        requireNonNull(key);
        return get(apiRoot.zones().withKey(key).get(), () -> ZoneByKeyGet.of(key), getDsl);
    }

    public ByProjectKeyZonesKeyByKeyGet zone(final ZoneResourceIdentifier identifiable,
            final Function<ZoneByKeyGet, ZoneByKeyGet> getDsl) {
        requireNonNull(identifiable.getKey());
        return get(apiRoot.zones().withKey(identifiable.getKey()).get(), () -> ZoneByKeyGet.of(identifiable.getKey()),
            getDsl);
    }

    public ByProjectKeyZonesKeyByKeyGet zone(
            final io.sphere.sdk.models.ResourceIdentifiable<io.sphere.sdk.zones.Zone> identifiable,
            final Function<ZoneByKeyGet, ZoneByKeyGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.zones().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> ZoneByKeyGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }
}
