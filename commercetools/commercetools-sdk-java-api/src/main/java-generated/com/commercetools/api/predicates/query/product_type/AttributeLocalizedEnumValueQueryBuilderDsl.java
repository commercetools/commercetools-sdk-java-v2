
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AttributeLocalizedEnumValueQueryBuilderDsl {
    public AttributeLocalizedEnumValueQueryBuilderDsl() {
    }

    public static AttributeLocalizedEnumValueQueryBuilderDsl of() {
        return new AttributeLocalizedEnumValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeLocalizedEnumValueQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, AttributeLocalizedEnumValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AttributeLocalizedEnumValueQueryBuilderDsl> label(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("label"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeLocalizedEnumValueQueryBuilderDsl::of);
    }

}
