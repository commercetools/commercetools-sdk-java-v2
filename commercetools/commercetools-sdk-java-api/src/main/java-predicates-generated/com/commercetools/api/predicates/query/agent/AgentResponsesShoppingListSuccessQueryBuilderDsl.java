
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesShoppingListSuccessQueryBuilderDsl {
    public AgentResponsesShoppingListSuccessQueryBuilderDsl() {
    }

    public static AgentResponsesShoppingListSuccessQueryBuilderDsl of() {
        return new AgentResponsesShoppingListSuccessQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesShoppingListSuccessQueryBuilderDsl> entityType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("entityType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesShoppingListSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesShoppingListSuccessQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            AgentResponsesShoppingListSuccessQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesShoppingListSuccessQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesShoppingListSuccessQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesShoppingListSuccessQueryBuilderDsl> threadId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("threadId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesShoppingListSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesShoppingListSuccessQueryBuilderDsl> entity(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("entity"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListQueryBuilderDsl.of())),
            AgentResponsesShoppingListSuccessQueryBuilderDsl::of);
    }

}
