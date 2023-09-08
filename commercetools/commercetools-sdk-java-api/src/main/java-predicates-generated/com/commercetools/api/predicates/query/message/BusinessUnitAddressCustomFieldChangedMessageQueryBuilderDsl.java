
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl {
    public BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl> oldValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldValue")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomFieldChangedMessageQueryBuilderDsl::of));
    }

}
