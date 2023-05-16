
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class MessagesConfigurationDraftQueryBuilderDsl {
    public MessagesConfigurationDraftQueryBuilderDsl() {
    }

    public static MessagesConfigurationDraftQueryBuilderDsl of() {
        return new MessagesConfigurationDraftQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<MessagesConfigurationDraftQueryBuilderDsl> enabled() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("enabled")),
            p -> new CombinationQueryPredicate<>(p, MessagesConfigurationDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MessagesConfigurationDraftQueryBuilderDsl> deleteDaysAfterCreation() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterCreation")),
            p -> new CombinationQueryPredicate<>(p, MessagesConfigurationDraftQueryBuilderDsl::of));
    }

}
