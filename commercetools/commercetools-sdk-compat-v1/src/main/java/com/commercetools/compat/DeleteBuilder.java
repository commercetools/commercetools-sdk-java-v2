
package com.commercetools.compat;

import static java.util.Objects.requireNonNull;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart_discount.CartDiscount;
import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.discount_code.DiscountCode;
import com.commercetools.api.models.extension.Extension;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.product.Product;
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

import io.sphere.sdk.cartdiscounts.commands.CartDiscountDeleteCommand;
import io.sphere.sdk.carts.commands.CartDeleteCommand;
import io.sphere.sdk.categories.commands.CategoryDeleteCommand;
import io.sphere.sdk.channels.commands.ChannelDeleteCommand;
import io.sphere.sdk.commands.DeleteCommand;
import io.sphere.sdk.customergroups.CustomerGroup;
import io.sphere.sdk.customergroups.commands.CustomerGroupDeleteCommand;
import io.sphere.sdk.customers.commands.CustomerDeleteCommand;
import io.sphere.sdk.discountcodes.commands.DiscountCodeDeleteCommand;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.expansion.MetaModelReferenceExpansionDsl;
import io.sphere.sdk.inventory.commands.InventoryEntryDeleteCommand;
import io.sphere.sdk.orders.commands.OrderDeleteCommand;
import io.sphere.sdk.payments.commands.PaymentDeleteCommand;
import io.sphere.sdk.productdiscounts.commands.ProductDiscountDeleteCommand;
import io.sphere.sdk.products.commands.ProductDeleteCommand;
import io.sphere.sdk.producttypes.commands.ProductTypeDeleteCommand;
import io.sphere.sdk.reviews.commands.ReviewDeleteCommand;
import io.sphere.sdk.shippingmethods.commands.ShippingMethodDeleteCommand;
import io.sphere.sdk.shoppinglists.commands.ShoppingListDeleteCommand;
import io.sphere.sdk.states.commands.StateDeleteCommand;
import io.sphere.sdk.stores.commands.StoreDeleteCommand;
import io.sphere.sdk.taxcategories.commands.TaxCategoryDeleteCommand;
import io.sphere.sdk.types.commands.TypeDeleteCommand;
import io.sphere.sdk.zones.commands.ZoneDeleteCommand;
import io.vrap.rmf.base.client.ApiMethod;

public class DeleteBuilder {
    private final ProjectApiRoot apiRoot;

    private DeleteBuilder(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static DeleteBuilder of(final ProjectApiRoot apiRoot) {
        return new DeleteBuilder(apiRoot);
    }

    @SuppressWarnings("unchecked")
    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T> & VersionedTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ? extends DeleteCommand<?>, ?>> T delete(
            final T request, final long version, final TQuery deleteDsl) {
        T deleteRequest = (T) request.withVersion(version);
        for (ExpansionPath<?> expansionPath : deleteDsl.expansionPaths()) {
            deleteRequest = (T) deleteRequest.addExpand(expansionPath.toSphereExpand());
        }
        return deleteRequest;
    }

    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T> & VersionedTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ? extends DeleteCommand<?>, ?>> T delete(
            final T request, final long version, final Supplier<TQuery> createDelete,
            final Function<TQuery, TQuery> deleteDsl) {
        MetaModelReferenceExpansionDsl<?, ? extends DeleteCommand<?>, ?> delete = deleteDsl.apply(createDelete.get());
        return delete(request, version, delete);
    }

    public <T extends ApiMethod<T, TResult> & ExpandableTrait<T> & VersionedTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ? extends DeleteCommand<?>, ?>> T with(
            final Function<ProjectApiRoot, T> request, final long version, final Supplier<TQuery> createDeleteDsl,
            final Function<TQuery, TQuery> deleteDsl) {
        MetaModelReferenceExpansionDsl<?, ? extends DeleteCommand<?>, ?> delete = deleteDsl
                .apply(createDeleteDsl.get());
        return delete(request.apply(apiRoot), version, delete);
    }

    public ByProjectKeyCustomersByIDDelete customer(final String id, final Long version,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.customers().withId(id).delete(), version,
            () -> CustomerDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyCustomersByIDDelete customer(final Versioned<Customer> customer,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(apiRoot.customers().withId(customer.getId()).delete(), customer.getVersion(),
            () -> CustomerDeleteCommand.of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCustomersByIDDelete customer(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.customers.Customer> customer,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(apiRoot.customers().withId(customer.getId()).delete(), customer.getVersion(),
            () -> CustomerDeleteCommand.of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCustomersByIDDelete customer(final String id, final Long version, final boolean eraseData,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.customers().withId(id).delete(), version,
            () -> CustomerDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version), eraseData), deleteDsl);
    }

    public ByProjectKeyCustomersByIDDelete customer(final Versioned<Customer> customer, final boolean eraseData,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(
            apiRoot.customers().withId(customer.getId()).delete(), customer.getVersion(), () -> CustomerDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion()), eraseData),
            deleteDsl);
    }

    public ByProjectKeyCustomersByIDDelete customer(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.customers.Customer> customer, final boolean eraseData,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> deleteDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(
            apiRoot.customers().withId(customer.getId()).delete(), customer.getVersion(), () -> CustomerDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion()), eraseData),
            deleteDsl);
    }

    public ByProjectKeyCartsByIDDelete cart(final String id, final Long version,
            final Function<CartDeleteCommand, CartDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.carts().withId(id).delete(), version,
            () -> CartDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyCartsByIDDelete cart(final Versioned<Cart> cart,
            final Function<CartDeleteCommand, CartDeleteCommand> deleteDsl) {
        requireNonNull(cart.getId());
        requireNonNull(cart.getVersion());
        return delete(apiRoot.carts().withId(cart.getId()).delete(), cart.getVersion(),
            () -> CartDeleteCommand.of(io.sphere.sdk.models.Versioned.of(cart.getId(), cart.getVersion())), deleteDsl);
    }

    public ByProjectKeyCartsByIDDelete cart(final io.sphere.sdk.models.Versioned<io.sphere.sdk.carts.Cart> cart,
            final Function<CartDeleteCommand, CartDeleteCommand> deleteDsl) {
        requireNonNull(cart.getId());
        requireNonNull(cart.getVersion());
        return delete(apiRoot.carts().withId(cart.getId()).delete(), cart.getVersion(),
            () -> CartDeleteCommand.of(io.sphere.sdk.models.Versioned.of(cart.getId(), cart.getVersion())), deleteDsl);
    }

    public ByProjectKeyCartDiscountsByIDDelete cartDiscount(final String id, final Long version,
            final Function<CartDiscountDeleteCommand, CartDiscountDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.cartDiscounts().withId(id).delete(), version,
            () -> CartDiscountDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyCartDiscountsByIDDelete cartDiscount(final Versioned<CartDiscount> cartDiscount,
            final Function<CartDiscountDeleteCommand, CartDiscountDeleteCommand> deleteDsl) {
        requireNonNull(cartDiscount.getId());
        requireNonNull(cartDiscount.getVersion());
        return delete(apiRoot.cartDiscounts().withId(cartDiscount.getId()).delete(), cartDiscount.getVersion(),
            () -> CartDiscountDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(cartDiscount.getId(), cartDiscount.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCartDiscountsByIDDelete cartDiscount(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.cartdiscounts.CartDiscount> cartDiscount,
            final Function<CartDiscountDeleteCommand, CartDiscountDeleteCommand> deleteDsl) {
        requireNonNull(cartDiscount.getId());
        requireNonNull(cartDiscount.getVersion());
        return delete(apiRoot.cartDiscounts().withId(cartDiscount.getId()).delete(), cartDiscount.getVersion(),
            () -> CartDiscountDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(cartDiscount.getId(), cartDiscount.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCategoriesByIDDelete category(final String id, final Long version,
            final Function<CategoryDeleteCommand, CategoryDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.categories().withId(id).delete(), version,
            () -> CategoryDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyCategoriesByIDDelete category(final Versioned<Category> category,
            final Function<CategoryDeleteCommand, CategoryDeleteCommand> deleteDsl) {
        requireNonNull(category.getId());
        requireNonNull(category.getVersion());
        return delete(apiRoot.categories().withId(category.getId()).delete(), category.getVersion(),
            () -> CategoryDeleteCommand.of(io.sphere.sdk.models.Versioned.of(category.getId(), category.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCategoriesByIDDelete category(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.categories.Category> category,
            final Function<CategoryDeleteCommand, CategoryDeleteCommand> deleteDsl) {
        requireNonNull(category.getId());
        requireNonNull(category.getVersion());
        return delete(apiRoot.categories().withId(category.getId()).delete(), category.getVersion(),
            () -> CategoryDeleteCommand.of(io.sphere.sdk.models.Versioned.of(category.getId(), category.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyDiscountCodesByIDDelete discountCode(final String id, final Long version,
            final Function<DiscountCodeDeleteCommand, DiscountCodeDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.discountCodes().withId(id).delete(), version,
            () -> DiscountCodeDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyDiscountCodesByIDDelete discountCode(final Versioned<DiscountCode> discountCode,
            final Function<DiscountCodeDeleteCommand, DiscountCodeDeleteCommand> deleteDsl) {
        requireNonNull(discountCode.getId());
        requireNonNull(discountCode.getVersion());
        return delete(apiRoot.discountCodes().withId(discountCode.getId()).delete(), discountCode.getVersion(),
            () -> DiscountCodeDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(discountCode.getId(), discountCode.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyDiscountCodesByIDDelete discountCode(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.discountcodes.DiscountCode> discountCode,
            final Function<DiscountCodeDeleteCommand, DiscountCodeDeleteCommand> deleteDsl) {
        requireNonNull(discountCode.getId());
        requireNonNull(discountCode.getVersion());
        return delete(apiRoot.discountCodes().withId(discountCode.getId()).delete(), discountCode.getVersion(),
            () -> DiscountCodeDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(discountCode.getId(), discountCode.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyChannelsByIDDelete channel(final String id, final Long version,
            final Function<ChannelDeleteCommand, ChannelDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.channels().withId(id).delete(), version,
            () -> ChannelDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyChannelsByIDDelete channel(final Versioned<Channel> channel,
            final Function<ChannelDeleteCommand, ChannelDeleteCommand> deleteDsl) {
        requireNonNull(channel.getId());
        requireNonNull(channel.getVersion());
        return delete(apiRoot.channels().withId(channel.getId()).delete(), channel.getVersion(),
            () -> ChannelDeleteCommand.of(io.sphere.sdk.models.Versioned.of(channel.getId(), channel.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyChannelsByIDDelete channel(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.channels.Channel> channel,
            final Function<ChannelDeleteCommand, ChannelDeleteCommand> deleteDsl) {
        requireNonNull(channel.getId());
        requireNonNull(channel.getVersion());
        return delete(apiRoot.channels().withId(channel.getId()).delete(), channel.getVersion(),
            () -> ChannelDeleteCommand.of(io.sphere.sdk.models.Versioned.of(channel.getId(), channel.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductsByIDDelete product(final String id, final Long version,
            final Function<ProductDeleteCommand, ProductDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.products().withId(id).delete(), version,
            () -> ProductDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyProductsByIDDelete product(final Versioned<Product> product,
            final Function<ProductDeleteCommand, ProductDeleteCommand> deleteDsl) {
        requireNonNull(product.getId());
        requireNonNull(product.getVersion());
        return delete(apiRoot.products().withId(product.getId()).delete(), product.getVersion(),
            () -> ProductDeleteCommand.of(io.sphere.sdk.models.Versioned.of(product.getId(), product.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductsByIDDelete product(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.products.Product> product,
            final Function<ProductDeleteCommand, ProductDeleteCommand> deleteDsl) {
        requireNonNull(product.getId());
        requireNonNull(product.getVersion());
        return delete(apiRoot.products().withId(product.getId()).delete(), product.getVersion(),
            () -> ProductDeleteCommand.of(io.sphere.sdk.models.Versioned.of(product.getId(), product.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCustomerGroupsByIDDelete customerGroup(final String id, final Long version,
            final Function<CustomerGroupDeleteCommand, CustomerGroupDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.customerGroups().withId(id).delete(), version,
            () -> CustomerGroupDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyCustomerGroupsByIDDelete customerGroup(final Versioned<CustomerGroup> customerGroup,
            final Function<CustomerGroupDeleteCommand, CustomerGroupDeleteCommand> deleteDsl) {
        requireNonNull(customerGroup.getId());
        requireNonNull(customerGroup.getVersion());
        return delete(apiRoot.customerGroups().withId(customerGroup.getId()).delete(), customerGroup.getVersion(),
            () -> CustomerGroupDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(customerGroup.getId(), customerGroup.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyCustomerGroupsByIDDelete customerGroup(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.customergroups.CustomerGroup> customerGroup,
            final Function<CustomerGroupDeleteCommand, CustomerGroupDeleteCommand> deleteDsl) {
        requireNonNull(customerGroup.getId());
        requireNonNull(customerGroup.getVersion());
        return delete(apiRoot.customerGroups().withId(customerGroup.getId()).delete(), customerGroup.getVersion(),
            () -> CustomerGroupDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(customerGroup.getId(), customerGroup.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyExtensionsByIDDelete extension(final String id, final Long version) {
        requireNonNull(id);
        return apiRoot.extensions().withId(id).delete().withVersion(version);
    }

    public ByProjectKeyExtensionsByIDDelete extension(final Versioned<Extension> extension) {
        requireNonNull(extension.getId());
        requireNonNull(extension.getVersion());
        return apiRoot.extensions().withId(extension.getId()).delete().withVersion(extension.getVersion());
    }

    public ByProjectKeyExtensionsByIDDelete extension(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.extensions.Extension> extension) {
        requireNonNull(extension.getId());
        requireNonNull(extension.getVersion());
        return apiRoot.extensions().withId(extension.getId()).delete().withVersion(extension.getVersion());
    }

    public ByProjectKeyInventoryByIDDelete inventory(final String id, final Long version,
            final Function<InventoryEntryDeleteCommand, InventoryEntryDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.inventory().withId(id).delete(), version,
            () -> InventoryEntryDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyInventoryByIDDelete inventory(final Versioned<InventoryEntry> inventory,
            final Function<InventoryEntryDeleteCommand, InventoryEntryDeleteCommand> deleteDsl) {
        requireNonNull(inventory.getId());
        requireNonNull(inventory.getVersion());
        return delete(apiRoot.inventory().withId(inventory.getId()).delete(), inventory.getVersion(),
            () -> InventoryEntryDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(inventory.getId(), inventory.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyInventoryByIDDelete inventory(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.inventory.InventoryEntry> inventory,
            final Function<InventoryEntryDeleteCommand, InventoryEntryDeleteCommand> deleteDsl) {
        requireNonNull(inventory.getId());
        requireNonNull(inventory.getVersion());
        return delete(apiRoot.inventory().withId(inventory.getId()).delete(), inventory.getVersion(),
            () -> InventoryEntryDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(inventory.getId(), inventory.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyOrdersByIDDelete order(final String id, final Long version,
            final Function<OrderDeleteCommand, OrderDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.orders().withId(id).delete(), version,
            () -> OrderDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyOrdersByIDDelete order(final Versioned<Order> order,
            final Function<OrderDeleteCommand, OrderDeleteCommand> deleteDsl) {
        requireNonNull(order.getId());
        requireNonNull(order.getVersion());
        return delete(apiRoot.orders().withId(order.getId()).delete(), order.getVersion(),
            () -> OrderDeleteCommand.of(io.sphere.sdk.models.Versioned.of(order.getId(), order.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyOrdersByIDDelete order(final io.sphere.sdk.models.Versioned<io.sphere.sdk.orders.Order> order,
            final Function<OrderDeleteCommand, OrderDeleteCommand> deleteDsl) {
        requireNonNull(order.getId());
        requireNonNull(order.getVersion());
        return delete(apiRoot.orders().withId(order.getId()).delete(), order.getVersion(),
            () -> OrderDeleteCommand.of(io.sphere.sdk.models.Versioned.of(order.getId(), order.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyPaymentsByIDDelete payment(final String id, final Long version,
            final Function<PaymentDeleteCommand, PaymentDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.payments().withId(id).delete(), version,
            () -> PaymentDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyPaymentsByIDDelete payment(final Versioned<Payment> payment,
            final Function<PaymentDeleteCommand, PaymentDeleteCommand> deleteDsl) {
        requireNonNull(payment.getId());
        requireNonNull(payment.getVersion());
        return delete(apiRoot.payments().withId(payment.getId()).delete(), payment.getVersion(),
            () -> PaymentDeleteCommand.of(io.sphere.sdk.models.Versioned.of(payment.getId(), payment.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyPaymentsByIDDelete payment(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.payments.Payment> payment,
            final Function<PaymentDeleteCommand, PaymentDeleteCommand> deleteDsl) {
        requireNonNull(payment.getId());
        requireNonNull(payment.getVersion());
        return delete(apiRoot.payments().withId(payment.getId()).delete(), payment.getVersion(),
            () -> PaymentDeleteCommand.of(io.sphere.sdk.models.Versioned.of(payment.getId(), payment.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductDiscountsByIDDelete productDiscount(final String id, final Long version,
            final Function<ProductDiscountDeleteCommand, ProductDiscountDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.productDiscounts().withId(id).delete(), version,
            () -> ProductDiscountDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyProductDiscountsByIDDelete productDiscount(final Versioned<ProductDiscount> productDiscount,
            final Function<ProductDiscountDeleteCommand, ProductDiscountDeleteCommand> deleteDsl) {
        requireNonNull(productDiscount.getId());
        requireNonNull(productDiscount.getVersion());
        return delete(apiRoot.productDiscounts().withId(productDiscount.getId()).delete(), productDiscount.getVersion(),
            () -> ProductDiscountDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(productDiscount.getId(), productDiscount.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductDiscountsByIDDelete productDiscount(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.productdiscounts.ProductDiscount> productDiscount,
            final Function<ProductDiscountDeleteCommand, ProductDiscountDeleteCommand> deleteDsl) {
        requireNonNull(productDiscount.getId());
        requireNonNull(productDiscount.getVersion());
        return delete(apiRoot.productDiscounts().withId(productDiscount.getId()).delete(), productDiscount.getVersion(),
            () -> ProductDiscountDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(productDiscount.getId(), productDiscount.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductTypesByIDDelete productType(final String id, final Long version,
            final Function<ProductTypeDeleteCommand, ProductTypeDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.productTypes().withId(id).delete(), version,
            () -> ProductTypeDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyProductTypesByIDDelete productType(final Versioned<ProductType> productType,
            final Function<ProductTypeDeleteCommand, ProductTypeDeleteCommand> deleteDsl) {
        requireNonNull(productType.getId());
        requireNonNull(productType.getVersion());
        return delete(apiRoot.productTypes().withId(productType.getId()).delete(), productType.getVersion(),
            () -> ProductTypeDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(productType.getId(), productType.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyProductTypesByIDDelete productType(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.producttypes.ProductType> productType,
            final Function<ProductTypeDeleteCommand, ProductTypeDeleteCommand> deleteDsl) {
        requireNonNull(productType.getId());
        requireNonNull(productType.getVersion());
        return delete(apiRoot.productTypes().withId(productType.getId()).delete(), productType.getVersion(),
            () -> ProductTypeDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(productType.getId(), productType.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyReviewsByIDDelete review(final String id, final Long version,
            final Function<ReviewDeleteCommand, ReviewDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.reviews().withId(id).delete(), version,
            () -> ReviewDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyReviewsByIDDelete review(final Versioned<Review> review,
            final Function<ReviewDeleteCommand, ReviewDeleteCommand> deleteDsl) {
        requireNonNull(review.getId());
        requireNonNull(review.getVersion());
        return delete(apiRoot.reviews().withId(review.getId()).delete(), review.getVersion(),
            () -> ReviewDeleteCommand.of(io.sphere.sdk.models.Versioned.of(review.getId(), review.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyReviewsByIDDelete review(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.reviews.Review> review,
            final Function<ReviewDeleteCommand, ReviewDeleteCommand> deleteDsl) {
        requireNonNull(review.getId());
        requireNonNull(review.getVersion());
        return delete(apiRoot.reviews().withId(review.getId()).delete(), review.getVersion(),
            () -> ReviewDeleteCommand.of(io.sphere.sdk.models.Versioned.of(review.getId(), review.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyShippingMethodsByIDDelete shippingMethod(final String id, final Long version,
            final Function<ShippingMethodDeleteCommand, ShippingMethodDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.shippingMethods().withId(id).delete(), version,
            () -> ShippingMethodDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyShippingMethodsByIDDelete shippingMethod(final Versioned<ShippingMethod> shippingMethod,
            final Function<ShippingMethodDeleteCommand, ShippingMethodDeleteCommand> deleteDsl) {
        requireNonNull(shippingMethod.getId());
        requireNonNull(shippingMethod.getVersion());
        return delete(apiRoot.shippingMethods().withId(shippingMethod.getId()).delete(), shippingMethod.getVersion(),
            () -> ShippingMethodDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(shippingMethod.getId(), shippingMethod.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyShippingMethodsByIDDelete shippingMethod(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.shippingmethods.ShippingMethod> shippingMethod,
            final Function<ShippingMethodDeleteCommand, ShippingMethodDeleteCommand> deleteDsl) {
        requireNonNull(shippingMethod.getId());
        requireNonNull(shippingMethod.getVersion());
        return delete(apiRoot.shippingMethods().withId(shippingMethod.getId()).delete(), shippingMethod.getVersion(),
            () -> ShippingMethodDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(shippingMethod.getId(), shippingMethod.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyShoppingListsByIDDelete shoppingList(final String id, final Long version,
            final Function<ShoppingListDeleteCommand, ShoppingListDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.shoppingLists().withId(id).delete(), version,
            () -> ShoppingListDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyShoppingListsByIDDelete shoppingList(final Versioned<ShoppingList> shoppingList,
            final Function<ShoppingListDeleteCommand, ShoppingListDeleteCommand> deleteDsl) {
        requireNonNull(shoppingList.getId());
        requireNonNull(shoppingList.getVersion());
        return delete(apiRoot.shoppingLists().withId(shoppingList.getId()).delete(), shoppingList.getVersion(),
            () -> ShoppingListDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(shoppingList.getId(), shoppingList.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyShoppingListsByIDDelete shoppingList(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.shoppinglists.ShoppingList> shoppingList,
            final Function<ShoppingListDeleteCommand, ShoppingListDeleteCommand> deleteDsl) {
        requireNonNull(shoppingList.getId());
        requireNonNull(shoppingList.getVersion());
        return delete(apiRoot.shoppingLists().withId(shoppingList.getId()).delete(), shoppingList.getVersion(),
            () -> ShoppingListDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(shoppingList.getId(), shoppingList.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyStatesByIDDelete state(final String id, final Long version,
            final Function<StateDeleteCommand, StateDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.states().withId(id).delete(), version,
            () -> StateDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyStatesByIDDelete state(final Versioned<State> state,
            final Function<StateDeleteCommand, StateDeleteCommand> deleteDsl) {
        requireNonNull(state.getId());
        requireNonNull(state.getVersion());
        return delete(apiRoot.states().withId(state.getId()).delete(), state.getVersion(),
            () -> StateDeleteCommand.of(io.sphere.sdk.models.Versioned.of(state.getId(), state.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyStatesByIDDelete state(final io.sphere.sdk.models.Versioned<io.sphere.sdk.states.State> state,
            final Function<StateDeleteCommand, StateDeleteCommand> deleteDsl) {
        requireNonNull(state.getId());
        requireNonNull(state.getVersion());
        return delete(apiRoot.states().withId(state.getId()).delete(), state.getVersion(),
            () -> StateDeleteCommand.of(io.sphere.sdk.models.Versioned.of(state.getId(), state.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyStoresByIDDelete store(final String id, final Long version,
            final Function<StoreDeleteCommand, StoreDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.stores().withId(id).delete(), version,
            () -> StoreDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyStoresByIDDelete store(final Versioned<Store> store,
            final Function<StoreDeleteCommand, StoreDeleteCommand> deleteDsl) {
        requireNonNull(store.getId());
        requireNonNull(store.getVersion());
        return delete(apiRoot.stores().withId(store.getId()).delete(), store.getVersion(),
            () -> StoreDeleteCommand.of(io.sphere.sdk.models.Versioned.of(store.getId(), store.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyStoresByIDDelete store(final io.sphere.sdk.models.Versioned<io.sphere.sdk.stores.Store> store,
            final Function<StoreDeleteCommand, StoreDeleteCommand> deleteDsl) {
        requireNonNull(store.getId());
        requireNonNull(store.getVersion());
        return delete(apiRoot.stores().withId(store.getId()).delete(), store.getVersion(),
            () -> StoreDeleteCommand.of(io.sphere.sdk.models.Versioned.of(store.getId(), store.getVersion())),
            deleteDsl);
    }

    public ByProjectKeySubscriptionsByIDDelete subscription(final String id, final Long version) {
        requireNonNull(id);
        return apiRoot.subscriptions().withId(id).delete().withVersion(version);
    }

    public ByProjectKeySubscriptionsByIDDelete subscription(final Versioned<Subscription> subscription) {
        requireNonNull(subscription.getId());
        requireNonNull(subscription.getVersion());
        return apiRoot.subscriptions().withId(subscription.getId()).delete().withVersion(subscription.getVersion());
    }

    public ByProjectKeySubscriptionsByIDDelete subscription(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.subscriptions.Subscription> subscription) {
        requireNonNull(subscription.getId());
        requireNonNull(subscription.getVersion());
        return apiRoot.subscriptions().withId(subscription.getId()).delete().withVersion(subscription.getVersion());
    }

    public ByProjectKeyTaxCategoriesByIDDelete taxCategory(final String id, final Long version,
            final Function<TaxCategoryDeleteCommand, TaxCategoryDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.taxCategories().withId(id).delete(), version,
            () -> TaxCategoryDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyTaxCategoriesByIDDelete taxCategory(final Versioned<TaxCategory> taxCategory,
            final Function<TaxCategoryDeleteCommand, TaxCategoryDeleteCommand> deleteDsl) {
        requireNonNull(taxCategory.getId());
        requireNonNull(taxCategory.getVersion());
        return delete(apiRoot.taxCategories().withId(taxCategory.getId()).delete(), taxCategory.getVersion(),
            () -> TaxCategoryDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(taxCategory.getId(), taxCategory.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyTaxCategoriesByIDDelete taxCategory(
            final io.sphere.sdk.models.Versioned<io.sphere.sdk.taxcategories.TaxCategory> taxCategory,
            final Function<TaxCategoryDeleteCommand, TaxCategoryDeleteCommand> deleteDsl) {
        requireNonNull(taxCategory.getId());
        requireNonNull(taxCategory.getVersion());
        return delete(apiRoot.taxCategories().withId(taxCategory.getId()).delete(), taxCategory.getVersion(),
            () -> TaxCategoryDeleteCommand
                    .of(io.sphere.sdk.models.Versioned.of(taxCategory.getId(), taxCategory.getVersion())),
            deleteDsl);
    }

    public ByProjectKeyZonesByIDDelete zone(final String id, final Long version,
            final Function<ZoneDeleteCommand, ZoneDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.zones().withId(id).delete(), version,
            () -> ZoneDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyZonesByIDDelete zone(final Versioned<Zone> zone,
            final Function<ZoneDeleteCommand, ZoneDeleteCommand> deleteDsl) {
        requireNonNull(zone.getId());
        requireNonNull(zone.getVersion());
        return delete(apiRoot.zones().withId(zone.getId()).delete(), zone.getVersion(),
            () -> ZoneDeleteCommand.of(io.sphere.sdk.models.Versioned.of(zone.getId(), zone.getVersion())), deleteDsl);
    }

    public ByProjectKeyZonesByIDDelete zone(final io.sphere.sdk.models.Versioned<io.sphere.sdk.zones.Zone> zone,
            final Function<ZoneDeleteCommand, ZoneDeleteCommand> deleteDsl) {
        requireNonNull(zone.getId());
        requireNonNull(zone.getVersion());
        return delete(apiRoot.zones().withId(zone.getId()).delete(), zone.getVersion(),
            () -> ZoneDeleteCommand.of(io.sphere.sdk.models.Versioned.of(zone.getId(), zone.getVersion())), deleteDsl);
    }

    public ByProjectKeyTypesByIDDelete type(final String id, final Long version,
            final Function<TypeDeleteCommand, TypeDeleteCommand> deleteDsl) {
        requireNonNull(id);
        return delete(apiRoot.types().withId(id).delete(), version,
            () -> TypeDeleteCommand.of(io.sphere.sdk.models.Versioned.of(id, version)), deleteDsl);
    }

    public ByProjectKeyTypesByIDDelete type(final Versioned<Type> type,
            final Function<TypeDeleteCommand, TypeDeleteCommand> deleteDsl) {
        requireNonNull(type.getId());
        requireNonNull(type.getVersion());
        return delete(apiRoot.types().withId(type.getId()).delete(), type.getVersion(),
            () -> TypeDeleteCommand.of(io.sphere.sdk.models.Versioned.of(type.getId(), type.getVersion())), deleteDsl);
    }

    public ByProjectKeyTypesByIDDelete type(final io.sphere.sdk.models.Versioned<io.sphere.sdk.types.Type> type,
            final Function<TypeDeleteCommand, TypeDeleteCommand> deleteDsl) {
        requireNonNull(type.getId());
        requireNonNull(type.getVersion());
        return delete(apiRoot.types().withId(type.getId()).delete(), type.getVersion(),
            () -> TypeDeleteCommand.of(io.sphere.sdk.models.Versioned.of(type.getId(), type.getVersion())), deleteDsl);
    }
}
