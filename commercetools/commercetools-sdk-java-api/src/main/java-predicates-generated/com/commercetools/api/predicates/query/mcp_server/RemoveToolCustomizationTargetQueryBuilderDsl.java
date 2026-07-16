
package com.commercetools.api.predicates.query.mcp_server;

import com.commercetools.api.predicates.query.*;

public class RemoveToolCustomizationTargetQueryBuilderDsl {
    public RemoveToolCustomizationTargetQueryBuilderDsl() {
    }

    public static RemoveToolCustomizationTargetQueryBuilderDsl of() {
        return new RemoveToolCustomizationTargetQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RemoveToolCustomizationTargetQueryBuilderDsl> tool() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tool")),
            p -> new CombinationQueryPredicate<>(p, RemoveToolCustomizationTargetQueryBuilderDsl::of));
    }

}
