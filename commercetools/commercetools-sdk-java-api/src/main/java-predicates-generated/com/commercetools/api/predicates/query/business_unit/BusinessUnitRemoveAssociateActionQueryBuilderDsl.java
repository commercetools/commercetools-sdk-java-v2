
package com.commercetools.api.predicates.query.business_unit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitRemoveAssociateActionQueryBuilderDsl {
    public BusinessUnitRemoveAssociateActionQueryBuilderDsl() {
    }

    public static BusinessUnitRemoveAssociateActionQueryBuilderDsl of() {
        return new BusinessUnitRemoveAssociateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitRemoveAssociateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitRemoveAssociateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitRemoveAssociateActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            BusinessUnitRemoveAssociateActionQueryBuilderDsl::of);
    }

}
