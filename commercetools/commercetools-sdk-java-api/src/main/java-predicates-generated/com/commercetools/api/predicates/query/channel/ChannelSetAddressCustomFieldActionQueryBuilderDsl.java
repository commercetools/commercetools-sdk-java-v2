package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelSetAddressCustomFieldActionQueryBuilderDsl  {
    public ChannelSetAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static ChannelSetAddressCustomFieldActionQueryBuilderDsl of() {
        return new ChannelSetAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ChannelSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ChannelSetAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ChannelSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ChannelSetAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ChannelSetAddressCustomFieldActionQueryBuilderDsl::of));
    }
    
}
