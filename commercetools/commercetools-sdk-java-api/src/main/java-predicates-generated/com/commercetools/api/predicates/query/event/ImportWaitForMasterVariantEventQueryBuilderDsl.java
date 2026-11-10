
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportWaitForMasterVariantEventQueryBuilderDsl {
    public ImportWaitForMasterVariantEventQueryBuilderDsl() {
    }

    public static ImportWaitForMasterVariantEventQueryBuilderDsl of() {
        return new ImportWaitForMasterVariantEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportWaitForMasterVariantEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportWaitForMasterVariantEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportWaitForMasterVariantEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportWaitForMasterVariantEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventDataQueryBuilderDsl
                            .of())),
            ImportWaitForMasterVariantEventQueryBuilderDsl::of);
    }

}
