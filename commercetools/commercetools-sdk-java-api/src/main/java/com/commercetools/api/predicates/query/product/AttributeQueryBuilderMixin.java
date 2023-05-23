
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;
import com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl;
import com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl;
import com.commercetools.api.predicates.query.product_type.AttributeLocalizedEnumValueQueryBuilderDsl;
import com.commercetools.api.predicates.query.product_type.AttributePlainEnumValueQueryBuilderDsl;

public interface AttributeQueryBuilderMixin {
    default CombinationQueryPredicate<AttributeQueryBuilderDsl> plainEnum(
            Function<AttributePlainEnumValueQueryBuilderDsl, CombinationQueryPredicate<AttributePlainEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate("value"))
                .inner(fn.apply(AttributePlainEnumValueQueryBuilderDsl.of())),
            AttributeQueryBuilderDsl::of);
    }

    default CombinationQueryPredicate<AttributeQueryBuilderDsl> localizedEnum(
            Function<AttributeLocalizedEnumValueQueryBuilderDsl, CombinationQueryPredicate<AttributeLocalizedEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate("value"))
                .inner(fn.apply(AttributeLocalizedEnumValueQueryBuilderDsl.of())),
            AttributeQueryBuilderDsl::of);
    }

    default CombinationQueryPredicate<AttributeQueryBuilderDsl> money(
            Function<MoneyQueryBuilderDsl, CombinationQueryPredicate<MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate("value"))
                .inner(fn.apply(MoneyQueryBuilderDsl.of())),
            AttributeQueryBuilderDsl::of);
    }

    default CombinationQueryPredicate<AttributeQueryBuilderDsl> reference(
            Function<ReferenceQueryBuilderDsl, CombinationQueryPredicate<ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(new ConstantQueryPredicate("value"))
                .inner(fn.apply(ReferenceQueryBuilderDsl.of())),
            AttributeQueryBuilderDsl::of);
    }

    default LongComparisonPredicateBuilder<AttributeQueryBuilderDsl> longNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, AttributeQueryBuilderDsl::of));
    }

    default DoubleComparisonPredicateBuilder<AttributeQueryBuilderDsl> doubleNumber() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, AttributeQueryBuilderDsl::of));
    }

    default StringComparisonPredicateBuilder<AttributeQueryBuilderDsl> string() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, AttributeQueryBuilderDsl::of));
    }

}
