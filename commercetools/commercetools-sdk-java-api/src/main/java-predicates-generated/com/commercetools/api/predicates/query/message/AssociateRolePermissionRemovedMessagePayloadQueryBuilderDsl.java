package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl  {
    public AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl> permission() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permission")),
        p -> new CombinationQueryPredicate<>(p, AssociateRolePermissionRemovedMessagePayloadQueryBuilderDsl::of));
    }
    
}
