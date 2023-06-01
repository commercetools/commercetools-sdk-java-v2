package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MessagesConfigurationQueryBuilderDsl  {
    public MessagesConfigurationQueryBuilderDsl() {
    }

    public static MessagesConfigurationQueryBuilderDsl of() {
        return new MessagesConfigurationQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<MessagesConfigurationQueryBuilderDsl> enabled() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("enabled")),
        p -> new CombinationQueryPredicate<>(p, MessagesConfigurationQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MessagesConfigurationQueryBuilderDsl> deleteDaysAfterCreation() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterCreation")),
        p -> new CombinationQueryPredicate<>(p, MessagesConfigurationQueryBuilderDsl::of));
    }
    
}
