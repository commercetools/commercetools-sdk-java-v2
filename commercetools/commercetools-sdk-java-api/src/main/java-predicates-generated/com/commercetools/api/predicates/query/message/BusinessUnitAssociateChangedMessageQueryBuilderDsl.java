
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAssociateChangedMessageQueryBuilderDsl {
    public BusinessUnitAssociateChangedMessageQueryBuilderDsl() {
    }

    public static BusinessUnitAssociateChangedMessageQueryBuilderDsl of() {
        return new BusinessUnitAssociateChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAssociateChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAssociateChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAssociateChangedMessageQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            BusinessUnitAssociateChangedMessageQueryBuilderDsl::of);
    }

}
