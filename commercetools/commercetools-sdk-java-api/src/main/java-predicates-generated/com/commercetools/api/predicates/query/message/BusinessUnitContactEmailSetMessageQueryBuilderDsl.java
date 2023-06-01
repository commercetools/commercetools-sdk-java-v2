package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitContactEmailSetMessageQueryBuilderDsl  {
    public BusinessUnitContactEmailSetMessageQueryBuilderDsl() {
    }

    public static BusinessUnitContactEmailSetMessageQueryBuilderDsl of() {
        return new BusinessUnitContactEmailSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitContactEmailSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitContactEmailSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitContactEmailSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitContactEmailSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitContactEmailSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitContactEmailSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitContactEmailSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitContactEmailSetMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<BusinessUnitContactEmailSetMessageQueryBuilderDsl> contactEmail() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactEmail")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitContactEmailSetMessageQueryBuilderDsl::of));
    }
    
}
