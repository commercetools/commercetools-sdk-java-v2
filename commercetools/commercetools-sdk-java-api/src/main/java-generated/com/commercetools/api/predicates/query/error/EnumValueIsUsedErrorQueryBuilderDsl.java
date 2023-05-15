
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class EnumValueIsUsedErrorQueryBuilderDsl {
    public EnumValueIsUsedErrorQueryBuilderDsl() {
    }

    public static EnumValueIsUsedErrorQueryBuilderDsl of() {
        return new EnumValueIsUsedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EnumValueIsUsedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, EnumValueIsUsedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EnumValueIsUsedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, EnumValueIsUsedErrorQueryBuilderDsl::of));
    }
}
