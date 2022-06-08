
package com.commercetools.compat;

import static java.util.Objects.requireNonNull;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer_group.CustomerGroup;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.product.Product;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.shipping_method.ShippingMethod;
import com.commercetools.api.models.shopping_list.ShoppingList;
import com.commercetools.api.models.state.State;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.subscription.Subscription;
import com.commercetools.api.models.tax_category.TaxCategory;
import com.commercetools.api.models.type.Type;
import com.commercetools.api.models.zone.Zone;

import io.sphere.sdk.cartdiscounts.queries.CartDiscountByIdGet;
import io.sphere.sdk.carts.queries.CartByIdGet;
import io.sphere.sdk.categories.queries.CategoryByIdGet;
import io.sphere.sdk.channels.queries.ChannelByIdGet;
import io.sphere.sdk.customergroups.queries.CustomerGroupByIdGet;
import io.sphere.sdk.customers.queries.CustomerByIdGet;
import io.sphere.sdk.discountcodes.queries.DiscountCodeByIdGet;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.extensions.queries.ExtensionByIdGet;
import io.sphere.sdk.inventory.queries.InventoryEntryByIdGet;
import io.sphere.sdk.messages.queries.MessageByIdGet;
import io.sphere.sdk.orders.queries.OrderByIdGet;
import io.sphere.sdk.payments.queries.PaymentByIdGet;
import io.sphere.sdk.productdiscounts.queries.ProductDiscountByIdGet;
import io.sphere.sdk.products.ProductProjectionType;
import io.sphere.sdk.products.queries.ProductByIdGet;
import io.sphere.sdk.products.queries.ProductProjectionByIdGet;
import io.sphere.sdk.producttypes.queries.ProductTypeByIdGet;
import io.sphere.sdk.queries.MetaModelGetDsl;
import io.sphere.sdk.reviews.queries.ReviewByIdGet;
import io.sphere.sdk.shippingmethods.queries.ShippingMethodByIdGet;
import io.sphere.sdk.shoppinglists.queries.ShoppingListByIdGet;
import io.sphere.sdk.states.queries.StateByIdGet;
import io.sphere.sdk.stores.queries.StoreByIdGet;
import io.sphere.sdk.subscriptions.queries.SubscriptionByIdGet;
import io.sphere.sdk.taxcategories.queries.TaxCategoryByIdGet;
import io.sphere.sdk.types.queries.TypeByIdGet;
import io.sphere.sdk.zones.queries.ZoneByIdGet;
import io.vrap.rmf.base.client.ApiMethod;

public class GetByIdBuilder {
    private final ProjectApiRoot apiRoot;

    private GetByIdBuilder(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static GetByIdBuilder of(final ProjectApiRoot apiRoot) {
        return new GetByIdBuilder(apiRoot);
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

    public ByProjectKeyCustomersByIDGet customer(final String id,
            final Function<CustomerByIdGet, CustomerByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.customers().withId(id).get(), () -> CustomerByIdGet.of(id), getDsl);
    }

    public ByProjectKeyCustomersByIDGet customer(final Identifiable<Customer> identifiable,
            final Function<CustomerByIdGet, CustomerByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.customers().withId(identifiable.getId()).get(),
            () -> CustomerByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCustomersByIDGet customer(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.customers.Customer> identifiable,
            final Function<CustomerByIdGet, CustomerByIdGet> getDsl) {
        requireNonNull(identifiable);
        return get(apiRoot.customers().withId(identifiable.getId()).get(),
            () -> CustomerByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCartsByIDGet cart(final String id, final Function<CartByIdGet, CartByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.carts().withId(id).get(), () -> CartByIdGet.of(id), getDsl);
    }

    public ByProjectKeyCartsByIDGet cart(final Identifiable<Cart> identifiable,
            final Function<CartByIdGet, CartByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.carts().withId(identifiable.getId()).get(), () -> CartByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyCartsByIDGet cart(final io.sphere.sdk.models.Identifiable<io.sphere.sdk.carts.Cart> identifiable,
            final Function<CartByIdGet, CartByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.carts().withId(identifiable.getId()).get(), () -> CartByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyCartDiscountsByIDGet cartDiscount(final String id,
            final Function<CartDiscountByIdGet, CartDiscountByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.cartDiscounts().withId(id).get(), () -> CartDiscountByIdGet.of(id), getDsl);
    }

    public ByProjectKeyCartDiscountsByIDGet cartDiscount(final Identifiable<CartDiscount> identifiable,
            final Function<CartDiscountByIdGet, CartDiscountByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.cartDiscounts().withId(identifiable.getId()).get(),
            () -> CartDiscountByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCartDiscountsByIDGet cartDiscount(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.cartdiscounts.CartDiscount> identifiable,
            final Function<CartDiscountByIdGet, CartDiscountByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.cartDiscounts().withId(identifiable.getId()).get(),
            () -> CartDiscountByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyDiscountCodesByIDGet discountCode(final String id,
            final Function<DiscountCodeByIdGet, DiscountCodeByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.discountCodes().withId(id).get(), () -> DiscountCodeByIdGet.of(id), getDsl);
    }

    public ByProjectKeyDiscountCodesByIDGet discountCode(final Identifiable<DiscountCode> identifiable,
            final Function<DiscountCodeByIdGet, DiscountCodeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.discountCodes().withId(identifiable.getId()).get(),
            () -> DiscountCodeByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyDiscountCodesByIDGet discountCode(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.discountcodes.DiscountCode> identifiable,
            final Function<DiscountCodeByIdGet, DiscountCodeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.discountCodes().withId(identifiable.getId()).get(),
            () -> DiscountCodeByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCategoriesByIDGet category(final String id,
            final Function<CategoryByIdGet, CategoryByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.categories().withId(id).get(), () -> CategoryByIdGet.of(id), getDsl);
    }

    public ByProjectKeyCategoriesByIDGet category(final Identifiable<Category> identifiable,
            final Function<CategoryByIdGet, CategoryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.categories().withId(identifiable.getId()).get(),
            () -> CategoryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCategoriesByIDGet category(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.categories.Category> identifiable,
            final Function<CategoryByIdGet, CategoryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.categories().withId(identifiable.getId()).get(),
            () -> CategoryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyChannelsByIDGet channel(final String id, final Function<ChannelByIdGet, ChannelByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.channels().withId(id).get(), () -> ChannelByIdGet.of(id), getDsl);
    }

    public ByProjectKeyChannelsByIDGet channel(final Identifiable<Channel> identifiable,
            final Function<ChannelByIdGet, ChannelByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.channels().withId(identifiable.getId()).get(), () -> ChannelByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyChannelsByIDGet channel(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.channels.Channel> identifiable,
            final Function<ChannelByIdGet, ChannelByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.channels().withId(identifiable.getId()).get(), () -> ChannelByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyProductsByIDGet product(final String id, final Function<ProductByIdGet, ProductByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.products().withId(id).get(), () -> ProductByIdGet.of(id), getDsl);
    }

    public ByProjectKeyProductsByIDGet product(final Identifiable<Product> identifiable,
            final Function<ProductByIdGet, ProductByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.products().withId(identifiable.getId()).get(), () -> ProductByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyProductsByIDGet product(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.products.Product> identifiable,
            final Function<ProductByIdGet, ProductByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.products().withId(identifiable.getId()).get(), () -> ProductByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(final String id,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.productProjections().withId(id).get(), () -> ProductProjectionByIdGet.ofCurrent(id), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(final Identifiable<ProductProjection> identifiable,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.ofCurrent(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.ofCurrent(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(final String id,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.productProjections().withId(id).get(), () -> ProductProjectionByIdGet.of(id, projectionType),
            getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(final Identifiable<ProductProjection> identifiable,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.of(identifiable.getId(), projectionType), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjection(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final ProductProjectionType projectionType,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.of(identifiable.getId(), projectionType), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjectionStaged(final String id,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.productProjections().withId(id).get(), () -> ProductProjectionByIdGet.ofStaged(id), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjectionStaged(
            final Identifiable<ProductProjection> identifiable,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.ofStaged(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductProjectionsByIDGet productProjectionStaged(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.products.ProductProjection> identifiable,
            final Function<ProductProjectionByIdGet, ProductProjectionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productProjections().withId(identifiable.getId()).get(),
            () -> ProductProjectionByIdGet.ofStaged(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCustomerGroupsByIDGet customerGroup(final String id,
            final Function<CustomerGroupByIdGet, CustomerGroupByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.customerGroups().withId(id).get(), () -> CustomerGroupByIdGet.of(id), getDsl);
    }

    public ByProjectKeyCustomerGroupsByIDGet customerGroup(final Identifiable<CustomerGroup> identifiable,
            final Function<CustomerGroupByIdGet, CustomerGroupByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.customerGroups().withId(identifiable.getId()).get(),
            () -> CustomerGroupByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyCustomerGroupsByIDGet customerGroup(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.customergroups.CustomerGroup> identifiable,
            final Function<CustomerGroupByIdGet, CustomerGroupByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.customerGroups().withId(identifiable.getId()).get(),
            () -> CustomerGroupByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyExtensionsByIDGet extension(final String id,
            final Function<ExtensionByIdGet, ExtensionByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.extensions().withId(id).get(), () -> ExtensionByIdGet.of(id), getDsl);
    }

    public ByProjectKeyExtensionsByIDGet extension(final Identifiable<Extension> identifiable,
            final Function<ExtensionByIdGet, ExtensionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.extensions().withId(identifiable.getId()).get(),
            () -> ExtensionByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyExtensionsByIDGet extension(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.extensions.Extension> identifiable,
            final Function<ExtensionByIdGet, ExtensionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.extensions().withId(identifiable.getId()).get(),
            () -> ExtensionByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyInventoryByIDGet inventory(final String id,
            final Function<InventoryEntryByIdGet, InventoryEntryByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.inventory().withId(id).get(), () -> InventoryEntryByIdGet.of(id), getDsl);
    }

    public ByProjectKeyInventoryByIDGet inventory(final Identifiable<InventoryEntry> identifiable,
            final Function<InventoryEntryByIdGet, InventoryEntryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.inventory().withId(identifiable.getId()).get(),
            () -> InventoryEntryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyInventoryByIDGet inventory(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.inventory.InventoryEntry> identifiable,
            final Function<InventoryEntryByIdGet, InventoryEntryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.inventory().withId(identifiable.getId()).get(),
            () -> InventoryEntryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyMessagesByIDGet message(final String id, final Function<MessageByIdGet, MessageByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.messages().withId(id).get(), () -> MessageByIdGet.of(id), getDsl);
    }

    public ByProjectKeyMessagesByIDGet message(final Identifiable<Message> identifiable,
            final Function<MessageByIdGet, MessageByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.messages().withId(identifiable.getId()).get(), () -> MessageByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyMessagesByIDGet message(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.messages.Message> identifiable,
            final Function<MessageByIdGet, MessageByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.messages().withId(identifiable.getId()).get(), () -> MessageByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyOrdersByIDGet order(final String id, final Function<OrderByIdGet, OrderByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.orders().withId(id).get(), () -> OrderByIdGet.of(id), getDsl);
    }

    public ByProjectKeyOrdersByIDGet order(final Identifiable<Order> identifiable,
            final Function<OrderByIdGet, OrderByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.orders().withId(identifiable.getId()).get(), () -> OrderByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyOrdersByIDGet order(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.orders.Order> identifiable,
            final Function<OrderByIdGet, OrderByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.orders().withId(identifiable.getId()).get(), () -> OrderByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyPaymentsByIDGet payment(final String id, final Function<PaymentByIdGet, PaymentByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.payments().withId(id).get(), () -> PaymentByIdGet.of(id), getDsl);
    }

    public ByProjectKeyPaymentsByIDGet payment(final Identifiable<Payment> identifiable,
            final Function<PaymentByIdGet, PaymentByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.payments().withId(identifiable.getId()).get(), () -> PaymentByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyPaymentsByIDGet payment(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.payments.Payment> identifiable,
            final Function<PaymentByIdGet, PaymentByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.payments().withId(identifiable.getId()).get(), () -> PaymentByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyProductDiscountsByIDGet productDiscount(final String id,
            final Function<ProductDiscountByIdGet, ProductDiscountByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.productDiscounts().withId(id).get(), () -> ProductDiscountByIdGet.of(id), getDsl);
    }

    public ByProjectKeyProductDiscountsByIDGet productDiscount(final Identifiable<ProductDiscount> identifiable,
            final Function<ProductDiscountByIdGet, ProductDiscountByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productDiscounts().withId(identifiable.getId()).get(),
            () -> ProductDiscountByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductDiscountsByIDGet productDiscount(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.productdiscounts.ProductDiscount> identifiable,
            final Function<ProductDiscountByIdGet, ProductDiscountByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productDiscounts().withId(identifiable.getId()).get(),
            () -> ProductDiscountByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductTypesByIDGet productType(final String id,
            final Function<ProductTypeByIdGet, ProductTypeByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.productTypes().withId(id).get(), () -> ProductTypeByIdGet.of(id), getDsl);
    }

    public ByProjectKeyProductTypesByIDGet productType(final Identifiable<ProductType> identifiable,
            final Function<ProductTypeByIdGet, ProductTypeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productTypes().withId(identifiable.getId()).get(),
            () -> ProductTypeByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyProductTypesByIDGet productType(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.producttypes.ProductType> identifiable,
            final Function<ProductTypeByIdGet, ProductTypeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.productTypes().withId(identifiable.getId()).get(),
            () -> ProductTypeByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyReviewsByIDGet review(final String id, final Function<ReviewByIdGet, ReviewByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.reviews().withId(id).get(), () -> ReviewByIdGet.of(id), getDsl);
    }

    public ByProjectKeyReviewsByIDGet review(final Identifiable<Review> identifiable,
            final Function<ReviewByIdGet, ReviewByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.reviews().withId(identifiable.getId()).get(), () -> ReviewByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyReviewsByIDGet review(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.reviews.Review> identifiable,
            final Function<ReviewByIdGet, ReviewByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.reviews().withId(identifiable.getId()).get(), () -> ReviewByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyShippingMethodsByIDGet shippingMethod(final String id,
            final Function<ShippingMethodByIdGet, ShippingMethodByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.shippingMethods().withId(id).get(), () -> ShippingMethodByIdGet.of(id), getDsl);
    }

    public ByProjectKeyShippingMethodsByIDGet shippingMethod(final Identifiable<ShippingMethod> identifiable,
            final Function<ShippingMethodByIdGet, ShippingMethodByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.shippingMethods().withId(identifiable.getId()).get(),
            () -> ShippingMethodByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyShippingMethodsByIDGet shippingMethod(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.shippingmethods.ShippingMethod> identifiable,
            final Function<ShippingMethodByIdGet, ShippingMethodByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.shippingMethods().withId(identifiable.getId()).get(),
            () -> ShippingMethodByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyShoppingListsByIDGet shoppingList(final String id,
            final Function<ShoppingListByIdGet, ShoppingListByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.shoppingLists().withId(id).get(), () -> ShoppingListByIdGet.of(id), getDsl);
    }

    public ByProjectKeyShoppingListsByIDGet shoppingList(final Identifiable<ShoppingList> identifiable,
            final Function<ShoppingListByIdGet, ShoppingListByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.shoppingLists().withId(identifiable.getId()).get(),
            () -> ShoppingListByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyShoppingListsByIDGet shoppingList(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.shoppinglists.ShoppingList> identifiable,
            final Function<ShoppingListByIdGet, ShoppingListByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.shoppingLists().withId(identifiable.getId()).get(),
            () -> ShoppingListByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyStatesByIDGet state(final String id, final Function<StateByIdGet, StateByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.states().withId(id).get(), () -> StateByIdGet.of(id), getDsl);
    }

    public ByProjectKeyStatesByIDGet state(final Identifiable<State> identifiable,
            final Function<StateByIdGet, StateByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.states().withId(identifiable.getId()).get(), () -> StateByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyStatesByIDGet state(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.states.State> identifiable,
            final Function<StateByIdGet, StateByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.states().withId(identifiable.getId()).get(), () -> StateByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyStoresByIDGet store(final String id, final Function<StoreByIdGet, StoreByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.stores().withId(id).get(), () -> StoreByIdGet.of(id), getDsl);
    }

    public ByProjectKeyStoresByIDGet store(final Identifiable<Store> identifiable,
            final Function<StoreByIdGet, StoreByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.stores().withId(identifiable.getId()).get(), () -> StoreByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyStoresByIDGet store(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.stores.Store> identifiable,
            final Function<StoreByIdGet, StoreByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.stores().withId(identifiable.getId()).get(), () -> StoreByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeySubscriptionsByIDGet subscription(final String id,
            final Function<SubscriptionByIdGet, SubscriptionByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.subscriptions().withId(id).get(), () -> SubscriptionByIdGet.of(id), getDsl);
    }

    public ByProjectKeySubscriptionsByIDGet subscription(final Identifiable<Subscription> identifiable,
            final Function<SubscriptionByIdGet, SubscriptionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.subscriptions().withId(identifiable.getId()).get(),
            () -> SubscriptionByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeySubscriptionsByIDGet subscription(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.subscriptions.Subscription> identifiable,
            final Function<SubscriptionByIdGet, SubscriptionByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.subscriptions().withId(identifiable.getId()).get(),
            () -> SubscriptionByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyTaxCategoriesByIDGet taxCategory(final String id,
            final Function<TaxCategoryByIdGet, TaxCategoryByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.taxCategories().withId(id).get(), () -> TaxCategoryByIdGet.of(id), getDsl);
    }

    public ByProjectKeyTaxCategoriesByIDGet taxCategory(final Identifiable<TaxCategory> identifiable,
            final Function<TaxCategoryByIdGet, TaxCategoryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.taxCategories().withId(identifiable.getId()).get(),
            () -> TaxCategoryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyTaxCategoriesByIDGet taxCategory(
            final io.sphere.sdk.models.Identifiable<io.sphere.sdk.taxcategories.TaxCategory> identifiable,
            final Function<TaxCategoryByIdGet, TaxCategoryByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.taxCategories().withId(identifiable.getId()).get(),
            () -> TaxCategoryByIdGet.of(identifiable.getId()), getDsl);
    }

    public ByProjectKeyZonesByIDGet zone(final String id, final Function<ZoneByIdGet, ZoneByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.zones().withId(id).get(), () -> ZoneByIdGet.of(id), getDsl);
    }

    public ByProjectKeyZonesByIDGet zone(final Identifiable<Zone> identifiable,
            final Function<ZoneByIdGet, ZoneByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.zones().withId(identifiable.getId()).get(), () -> ZoneByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyZonesByIDGet zone(final io.sphere.sdk.models.Identifiable<io.sphere.sdk.zones.Zone> identifiable,
            final Function<ZoneByIdGet, ZoneByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.zones().withId(identifiable.getId()).get(), () -> ZoneByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyTypesByIDGet type(final String id, final Function<TypeByIdGet, TypeByIdGet> getDsl) {
        requireNonNull(id);
        return get(apiRoot.types().withId(id).get(), () -> TypeByIdGet.of(id), getDsl);
    }

    public ByProjectKeyTypesByIDGet type(final Identifiable<Type> identifiable,
            final Function<TypeByIdGet, TypeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.types().withId(identifiable.getId()).get(), () -> TypeByIdGet.of(identifiable.getId()),
            getDsl);
    }

    public ByProjectKeyTypesByIDGet type(final io.sphere.sdk.models.Identifiable<io.sphere.sdk.types.Type> identifiable,
            final Function<TypeByIdGet, TypeByIdGet> getDsl) {
        requireNonNull(identifiable.getId());
        return get(apiRoot.types().withId(identifiable.getId()).get(), () -> TypeByIdGet.of(identifiable.getId()),
            getDsl);
    }
}
