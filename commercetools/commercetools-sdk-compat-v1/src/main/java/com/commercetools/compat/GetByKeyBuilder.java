
package com.commercetools.compat;

import static java.util.Objects.requireNonNull;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;

import io.sphere.sdk.carts.queries.CartByIdGet;
import io.sphere.sdk.carts.queries.CartByKeyGet;
import io.sphere.sdk.customers.queries.CustomerByIdGet;
import io.sphere.sdk.customers.queries.CustomerByKeyGet;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.models.ResourceIdentifiable;
import io.sphere.sdk.queries.MetaModelGetDsl;
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

    public ByProjectKeyCustomersKeyByKeyGet customer(final ResourceIdentifiable<Customer> identifiable,
            final Function<CustomerByIdGet, CustomerByIdGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.customers().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CustomerByIdGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
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

    public ByProjectKeyCartsKeyByKeyGet cart(final ResourceIdentifiable<Cart> identifiable,
            final Function<CartByIdGet, CartByIdGet> getDsl) {
        requireNonNull(identifiable.toResourceIdentifier().getKey());
        return get(apiRoot.carts().withKey(identifiable.toResourceIdentifier().getKey()).get(),
            () -> CartByIdGet.of(identifiable.toResourceIdentifier().getKey()), getDsl);
    }
}
