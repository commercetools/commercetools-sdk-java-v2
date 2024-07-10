
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl {
    public BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl() {
    }

    public static BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl of() {
        return new BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl> addressId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitAddressCustomTypeSetMessageQueryBuilderDsl::of));
    }

}
