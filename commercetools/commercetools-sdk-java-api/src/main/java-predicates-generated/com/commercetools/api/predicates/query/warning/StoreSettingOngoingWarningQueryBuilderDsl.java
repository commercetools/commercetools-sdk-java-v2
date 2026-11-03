
package com.commercetools.api.predicates.query.warning;

import com.commercetools.api.predicates.query.*;

public class StoreSettingOngoingWarningQueryBuilderDsl {
    public StoreSettingOngoingWarningQueryBuilderDsl() {
    }

    public static StoreSettingOngoingWarningQueryBuilderDsl of() {
        return new StoreSettingOngoingWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSettingOngoingWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, StoreSettingOngoingWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreSettingOngoingWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, StoreSettingOngoingWarningQueryBuilderDsl::of));
    }

}
