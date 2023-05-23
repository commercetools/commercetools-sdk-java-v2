
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitShippingAddressAddedMessageQueryBuilderDsl {
    public BusinessUnitShippingAddressAddedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitShippingAddressAddedMessageQueryBuilderDsl of() {
        return new BusinessUnitShippingAddressAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitShippingAddressAddedMessageQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitShippingAddressAddedMessageQueryBuilderDsl::of);
    }

}
