
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionResourceIdentifierQueryBuilderDsl {
    public ExtensionResourceIdentifierQueryBuilderDsl() {
    }

    public static ExtensionResourceIdentifierQueryBuilderDsl of() {
        return new ExtensionResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ExtensionResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ExtensionResourceIdentifierQueryBuilderDsl::of));
    }

}
