
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomFieldEnumTypeQueryBuilderDsl {
    public CustomFieldEnumTypeQueryBuilderDsl() {
    }

    public static CustomFieldEnumTypeQueryBuilderDsl of() {
        return new CustomFieldEnumTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomFieldEnumTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldEnumTypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomFieldEnumTypeQueryBuilderDsl> values(
            Function<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("values"))
                .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldEnumValueQueryBuilderDsl.of())),
            CustomFieldEnumTypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomFieldEnumTypeQueryBuilderDsl> values() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("values")),
            p -> new CombinationQueryPredicate<>(p, CustomFieldEnumTypeQueryBuilderDsl::of));
    }

}
