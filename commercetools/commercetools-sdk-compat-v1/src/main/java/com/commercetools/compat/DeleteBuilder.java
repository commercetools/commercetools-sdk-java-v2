
package com.commercetools.compat;

import static java.util.Objects.requireNonNull;

import java.util.function.Function;
import java.util.function.Supplier;

import com.commercetools.api.client.*;
import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.customer.Customer;

import io.sphere.sdk.customers.commands.CustomerDeleteCommand;
import io.sphere.sdk.expansion.ExpansionPath;
import io.sphere.sdk.expansion.MetaModelReferenceExpansionDsl;
import io.vrap.rmf.base.client.ApiMethod;

public class DeleteBuilder {
    private final ProjectApiRoot apiRoot;

    private DeleteBuilder(final ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public static DeleteBuilder of(final ProjectApiRoot apiRoot) {
        return new DeleteBuilder(apiRoot);
    }

    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ?, ?>> T delete(
            final T request, final TQuery deleteDsl) {
        T updatedRequest = request;
        for (ExpansionPath<?> expansionPath : deleteDsl.expansionPaths()) {
            updatedRequest = (T) updatedRequest.addExpand(expansionPath.toSphereExpand());
        }
        return updatedRequest;
    }

    public static <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ?, ?>> T delete(
            final T request, final Supplier<TQuery> createDelete, final Function<TQuery, TQuery> deleteDsl) {
        MetaModelReferenceExpansionDsl<?, ?, ?> delete = deleteDsl.apply(createDelete.get());
        return delete(request, delete);
    }

    public <T extends ApiMethod<T, TResult> & ExpandableTrait<T>, TResult, TQuery extends MetaModelReferenceExpansionDsl<?, ?, ?>> T with(
            final Function<ProjectApiRoot, T> request, final Supplier<TQuery> createDeleteDsl,
            final Function<TQuery, TQuery> deleteDsl) {
        MetaModelReferenceExpansionDsl<?, ?, ?> delete = deleteDsl.apply(createDeleteDsl.get());
        return delete(request.apply(apiRoot), delete);
    }

    public ByProjectKeyCustomersKeyByKeyDelete customer(final String key, final Long version,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> getDsl) {
        requireNonNull(key);
        return delete(apiRoot.customers().withKey(key).delete(), () -> CustomerDeleteCommand.ofKey(key, version),
            getDsl);
    }

    public ByProjectKeyCustomersKeyByKeyDelete customer(final Versioned<Customer> customer,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> getDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(apiRoot.customers().withKey(customer.getId()).delete(),
            () -> CustomerDeleteCommand.of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion())),
            getDsl);
    }

    public ByProjectKeyCustomersKeyByKeyDelete customer(final String key, final Long version, final boolean eraseData,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> getDsl) {
        requireNonNull(key);
        return delete(apiRoot.customers().withKey(key).delete(),
            () -> CustomerDeleteCommand.ofKey(key, version, eraseData), getDsl);
    }

    public ByProjectKeyCustomersKeyByKeyDelete customer(final Versioned<Customer> customer, final boolean eraseData,
            final Function<CustomerDeleteCommand, CustomerDeleteCommand> getDsl) {
        requireNonNull(customer.getId());
        requireNonNull(customer.getVersion());
        return delete(apiRoot.customers().withKey(customer.getId()).delete(), () -> CustomerDeleteCommand
                .of(io.sphere.sdk.models.Versioned.of(customer.getId(), customer.getVersion()), eraseData),
            getDsl);
    }
}
