package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleDraftQueryBuilderDsl  {
    public AssociateRoleDraftQueryBuilderDsl() {
    }

    public static AssociateRoleDraftQueryBuilderDsl of() {
        return new AssociateRoleDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleDraftQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<AssociateRoleDraftQueryBuilderDsl> buyerAssignable() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerAssignable")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleDraftQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<AssociateRoleDraftQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AssociateRoleDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            AssociateRoleDraftQueryBuilderDsl::of);
    }
    
    
}
