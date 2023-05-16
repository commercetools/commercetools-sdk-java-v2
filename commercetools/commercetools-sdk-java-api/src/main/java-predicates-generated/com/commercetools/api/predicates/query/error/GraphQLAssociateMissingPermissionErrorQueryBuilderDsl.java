
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLAssociateMissingPermissionErrorQueryBuilderDsl {
    public GraphQLAssociateMissingPermissionErrorQueryBuilderDsl() {
    }

    public static GraphQLAssociateMissingPermissionErrorQueryBuilderDsl of() {
        return new GraphQLAssociateMissingPermissionErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAssociateMissingPermissionErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAssociateMissingPermissionErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLAssociateMissingPermissionErrorQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associate"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            GraphQLAssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLAssociateMissingPermissionErrorQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            GraphQLAssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLAssociateMissingPermissionErrorQueryBuilderDsl> associateOnBehalf(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateOnBehalf"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            GraphQLAssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<GraphQLAssociateMissingPermissionErrorQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAssociateMissingPermissionErrorQueryBuilderDsl::of));
    }

}
