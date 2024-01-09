
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;
import com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl;
import com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl;

public class FieldContainerValueQueryBuilderDsl {

    private final String fieldName;

    public FieldContainerValueQueryBuilderDsl(String fieldName) {
        this.fieldName = fieldName;
    }

    public CombinationQueryPredicate<FieldContainerQueryBuilderDsl> plainEnum(
            Function<CustomFieldEnumValueQueryBuilderDsl, CombinationQueryPredicate<CustomFieldEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate(fieldName))
                .inner(fn.apply(CustomFieldEnumValueQueryBuilderDsl.of())),
            FieldContainerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<FieldContainerQueryBuilderDsl> localizedEnum(
            Function<CustomFieldLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<CustomFieldLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(new ConstantQueryPredicate(fieldName))
                    .inner(fn.apply(CustomFieldLocalizedEnumValueQueryBuilderDsl.of())),
            FieldContainerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<FieldContainerQueryBuilderDsl> money(
            Function<MoneyQueryBuilderDsl, CombinationQueryPredicate<MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate(fieldName))
                .inner(fn.apply(MoneyQueryBuilderDsl.of())),
            FieldContainerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<FieldContainerQueryBuilderDsl> reference(
            Function<ReferenceQueryBuilderDsl, CombinationQueryPredicate<ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate(fieldName))
                .inner(fn.apply(ReferenceQueryBuilderDsl.of())),
            FieldContainerQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<FieldContainerQueryBuilderDsl> longNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate(fieldName)),
            p -> new CombinationQueryPredicate<>(p, FieldContainerQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<FieldContainerQueryBuilderDsl> doubleNumber() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate(fieldName)),
            p -> new CombinationQueryPredicate<>(p, FieldContainerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<FieldContainerQueryBuilderDsl> string() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate(fieldName)),
            p -> new CombinationQueryPredicate<>(p, FieldContainerQueryBuilderDsl::of));
    }
}
