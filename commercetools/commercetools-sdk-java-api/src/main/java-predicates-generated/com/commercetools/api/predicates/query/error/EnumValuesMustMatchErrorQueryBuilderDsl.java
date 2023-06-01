package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class EnumValuesMustMatchErrorQueryBuilderDsl  {
    public EnumValuesMustMatchErrorQueryBuilderDsl() {
    }

    public static EnumValuesMustMatchErrorQueryBuilderDsl of() {
        return new EnumValuesMustMatchErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EnumValuesMustMatchErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, EnumValuesMustMatchErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<EnumValuesMustMatchErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, EnumValuesMustMatchErrorQueryBuilderDsl::of));
    }
    
}
