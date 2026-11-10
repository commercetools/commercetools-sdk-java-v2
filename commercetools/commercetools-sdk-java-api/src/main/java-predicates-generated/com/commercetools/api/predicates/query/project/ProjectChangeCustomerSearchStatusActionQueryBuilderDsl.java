
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeCustomerSearchStatusActionQueryBuilderDsl {
    public ProjectChangeCustomerSearchStatusActionQueryBuilderDsl() {
    }

    public static ProjectChangeCustomerSearchStatusActionQueryBuilderDsl of() {
        return new ProjectChangeCustomerSearchStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeCustomerSearchStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCustomerSearchStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeCustomerSearchStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCustomerSearchStatusActionQueryBuilderDsl::of));
    }

}
