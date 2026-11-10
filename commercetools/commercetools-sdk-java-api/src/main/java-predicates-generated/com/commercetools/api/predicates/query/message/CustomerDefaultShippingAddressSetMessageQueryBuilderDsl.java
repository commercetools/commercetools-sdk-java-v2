
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerDefaultShippingAddressSetMessageQueryBuilderDsl {
    public CustomerDefaultShippingAddressSetMessageQueryBuilderDsl() {
    }

    public static CustomerDefaultShippingAddressSetMessageQueryBuilderDsl of() {
        return new CustomerDefaultShippingAddressSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerDefaultShippingAddressSetMessageQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            CustomerDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }

}
