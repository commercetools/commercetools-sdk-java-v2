
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportOperationRejectedEventDataQueryBuilderDsl {
    public ImportOperationRejectedEventDataQueryBuilderDsl() {
    }

    public static ImportOperationRejectedEventDataQueryBuilderDsl of() {
        return new ImportOperationRejectedEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportOperationRejectedEventDataQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventDataQueryBuilderDsl::of));
    }

}
