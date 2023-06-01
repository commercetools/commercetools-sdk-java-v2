package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl  {
    public AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl() {
    }

    public static AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl of() {
        return new AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl> buyerAssignable() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("buyerAssignable")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleBuyerAssignableChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
