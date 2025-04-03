
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportUnresolvedEventDataQueryBuilderDsl {
    public ImportUnresolvedEventDataQueryBuilderDsl() {
    }

    public static ImportUnresolvedEventDataQueryBuilderDsl of() {
        return new ImportUnresolvedEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventDataQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventDataQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImportUnresolvedEventDataQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventDataQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventDataQueryBuilderDsl> importContainerKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("importContainerKey")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventDataQueryBuilderDsl::of));
    }

}
