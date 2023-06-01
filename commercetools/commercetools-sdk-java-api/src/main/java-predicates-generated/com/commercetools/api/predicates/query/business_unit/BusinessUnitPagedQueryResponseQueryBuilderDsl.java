package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class BusinessUnitPagedQueryResponseQueryBuilderDsl  {
    public BusinessUnitPagedQueryResponseQueryBuilderDsl() {
    }

    public static BusinessUnitPagedQueryResponseQueryBuilderDsl of() {
        return new BusinessUnitPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<BusinessUnitPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<BusinessUnitPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<BusinessUnitPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl.of())),
            BusinessUnitPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<BusinessUnitPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, BusinessUnitPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
