
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreFaqUrlSetMessagePayloadQueryBuilderDsl {
    public StoreFaqUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreFaqUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreFaqUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreFaqUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreFaqUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreFaqUrlSetMessagePayloadQueryBuilderDsl> faqUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("faqUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreFaqUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
