package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl  {
    public BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl() {
    }

    public static BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl of() {
        return new BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            BusinessUnitDefaultShippingAddressSetMessageQueryBuilderDsl::of);
    }
    
    
}
