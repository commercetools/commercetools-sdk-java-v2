
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class KeyReferenceQueryBuilderDsl {
    public KeyReferenceQueryBuilderDsl() {
    }

    public static KeyReferenceQueryBuilderDsl of() {
        return new KeyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<KeyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, KeyReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<KeyReferenceQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, KeyReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<KeyReferenceQueryBuilderDsl> asAssociateRole(
            Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.associate_role.AssociateRoleKeyReferenceQueryBuilderDsl.of()),
            KeyReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<KeyReferenceQueryBuilderDsl> asBusinessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of()),
            KeyReferenceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<KeyReferenceQueryBuilderDsl> asStore(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of()),
            KeyReferenceQueryBuilderDsl::of);
    }
}
