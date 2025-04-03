
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportWaitForMasterVariantEventDataQueryBuilderDsl {
    public ImportWaitForMasterVariantEventDataQueryBuilderDsl() {
    }

    public static ImportWaitForMasterVariantEventDataQueryBuilderDsl of() {
        return new ImportWaitForMasterVariantEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventDataQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventDataQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImportWaitForMasterVariantEventDataQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventDataQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventDataQueryBuilderDsl> importContainerKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("importContainerKey")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventDataQueryBuilderDsl::of));
    }

}
