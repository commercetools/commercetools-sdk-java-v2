
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssociateMissingPermissionErrorQueryBuilderDsl {
    public AssociateMissingPermissionErrorQueryBuilderDsl() {
    }

    public static AssociateMissingPermissionErrorQueryBuilderDsl of() {
        return new AssociateMissingPermissionErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateMissingPermissionErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AssociateMissingPermissionErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AssociateMissingPermissionErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AssociateMissingPermissionErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AssociateMissingPermissionErrorQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associate"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            AssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateMissingPermissionErrorQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            AssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssociateMissingPermissionErrorQueryBuilderDsl> associateOnBehalf(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("associateOnBehalf"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            AssociateMissingPermissionErrorQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<AssociateMissingPermissionErrorQueryBuilderDsl> permissions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("permissions")),
            p -> new CombinationQueryPredicate<>(p, AssociateMissingPermissionErrorQueryBuilderDsl::of));
    }
}
