package com.commercetools.api.predicates.query.type;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class FieldTypeQueryBuilderDsl  {
    public FieldTypeQueryBuilderDsl() {
    }

    public static FieldTypeQueryBuilderDsl of() {
        return new FieldTypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<FieldTypeQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, FieldTypeQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asBoolean(
        Function<com.commercetools.api.predicates.query.type.CustomFieldBooleanTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldBooleanTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldBooleanTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asDateTime(
        Function<com.commercetools.api.predicates.query.type.CustomFieldDateTimeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldDateTimeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldDateTimeTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asDate(
        Function<com.commercetools.api.predicates.query.type.CustomFieldDateTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldDateTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldDateTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asEnum(
        Function<com.commercetools.api.predicates.query.type.CustomFieldEnumTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldEnumTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldEnumTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asLocalizedEnum(
        Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldLocalizedEnumTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asLocalizedString(
        Function<com.commercetools.api.predicates.query.type.CustomFieldLocalizedStringTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldLocalizedStringTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldLocalizedStringTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asMoney(
        Function<com.commercetools.api.predicates.query.type.CustomFieldMoneyTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldMoneyTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldMoneyTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asNumber(
        Function<com.commercetools.api.predicates.query.type.CustomFieldNumberTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldNumberTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldNumberTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asReference(
        Function<com.commercetools.api.predicates.query.type.CustomFieldReferenceTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldReferenceTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldReferenceTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asSet(
        Function<com.commercetools.api.predicates.query.type.CustomFieldSetTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldSetTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldSetTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asString(
        Function<com.commercetools.api.predicates.query.type.CustomFieldStringTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldStringTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldStringTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<FieldTypeQueryBuilderDsl> asTime(
        Function<com.commercetools.api.predicates.query.type.CustomFieldTimeTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldTimeTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldTimeTypeQueryBuilderDsl.of()),
            FieldTypeQueryBuilderDsl::of);
    }
}
