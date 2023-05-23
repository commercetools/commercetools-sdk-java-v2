
package com.commercetools.api.predicates.query.common;

import java.util.Locale;

import com.commercetools.api.predicates.query.*;

public class LocalizedStringQueryBuilderDsl {
    public LocalizedStringQueryBuilderDsl() {
    }

    public StringComparisonPredicateBuilder<LocalizedStringQueryBuilderDsl> with(Locale locale) {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate(locale.toLanguageTag())),
            p -> new CombinationQueryPredicate<>(p, LocalizedStringQueryBuilderDsl::of));
    }

    public static LocalizedStringQueryBuilderDsl of() {
        return new LocalizedStringQueryBuilderDsl();
    }
}
