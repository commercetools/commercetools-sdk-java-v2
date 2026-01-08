
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerShippingAddressRemovedMessageQueryBuilderDsl {
    public CustomerShippingAddressRemovedMessageQueryBuilderDsl() {
    }

    public static CustomerShippingAddressRemovedMessageQueryBuilderDsl of() {
        return new CustomerShippingAddressRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerShippingAddressRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerShippingAddressRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerShippingAddressRemovedMessageQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerShippingAddressRemovedMessageQueryBuilderDsl::of);
    }

}
