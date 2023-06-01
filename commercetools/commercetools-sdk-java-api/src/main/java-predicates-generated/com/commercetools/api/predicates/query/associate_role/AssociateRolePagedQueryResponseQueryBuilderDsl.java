package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRolePagedQueryResponseQueryBuilderDsl  {
    public AssociateRolePagedQueryResponseQueryBuilderDsl() {
    }

    public static AssociateRolePagedQueryResponseQueryBuilderDsl of() {
        return new AssociateRolePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AssociateRolePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRolePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRolePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AssociateRolePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRolePagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleQueryBuilderDsl.of())),
            AssociateRolePagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AssociateRolePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, AssociateRolePagedQueryResponseQueryBuilderDsl::of));
    }
    
}
