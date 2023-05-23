
package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

public class ChannelSetCustomFieldActionQueryBuilderDsl {
    public ChannelSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ChannelSetCustomFieldActionQueryBuilderDsl of() {
        return new ChannelSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ChannelSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ChannelSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetCustomFieldActionQueryBuilderDsl::of));
    }

}
