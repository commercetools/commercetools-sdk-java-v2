package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleResourceIdentifierQueryBuilderDsl  {
    public AssociateRoleResourceIdentifierQueryBuilderDsl() {
    }

    public static AssociateRoleResourceIdentifierQueryBuilderDsl of() {
        return new AssociateRoleResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRoleResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleResourceIdentifierQueryBuilderDsl::of));
    }
    
}
