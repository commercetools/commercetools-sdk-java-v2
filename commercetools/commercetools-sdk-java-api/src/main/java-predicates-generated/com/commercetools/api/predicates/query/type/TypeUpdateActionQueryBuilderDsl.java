
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeUpdateActionQueryBuilderDsl {
    public TypeUpdateActionQueryBuilderDsl() {
    }

    public static TypeUpdateActionQueryBuilderDsl of() {
        return new TypeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, TypeUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asAddEnumValue(
            Function<com.commercetools.api.predicates.query.type.TypeAddEnumValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeAddEnumValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeAddEnumValueActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asAddFieldDefinition(
            Function<com.commercetools.api.predicates.query.type.TypeAddFieldDefinitionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeAddFieldDefinitionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeAddFieldDefinitionActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asAddLocalizedEnumValue(
            Function<com.commercetools.api.predicates.query.type.TypeAddLocalizedEnumValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeAddLocalizedEnumValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeAddLocalizedEnumValueActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeEnumValueLabel(
            Function<com.commercetools.api.predicates.query.type.TypeChangeEnumValueLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeEnumValueLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeEnumValueLabelActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeEnumValueOrder(
            Function<com.commercetools.api.predicates.query.type.TypeChangeEnumValueOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeEnumValueOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeEnumValueOrderActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeFieldDefinitionOrder(
            Function<com.commercetools.api.predicates.query.type.TypeChangeFieldDefinitionOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeFieldDefinitionOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.type.TypeChangeFieldDefinitionOrderActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeInputHint(
            Function<com.commercetools.api.predicates.query.type.TypeChangeInputHintActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeInputHintActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeInputHintActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeKey(
            Function<com.commercetools.api.predicates.query.type.TypeChangeKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeKeyActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeLabel(
            Function<com.commercetools.api.predicates.query.type.TypeChangeLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeLabelActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeLocalizedEnumValueLabel(
            Function<com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueLabelActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeLocalizedEnumValueOrder(
            Function<com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.type.TypeChangeLocalizedEnumValueOrderActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.type.TypeChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeChangeNameActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asRemoveFieldDefinition(
            Function<com.commercetools.api.predicates.query.type.TypeRemoveFieldDefinitionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeRemoveFieldDefinitionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeRemoveFieldDefinitionActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.type.TypeSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.type.TypeSetDescriptionActionQueryBuilderDsl.of()),
            TypeUpdateActionQueryBuilderDsl::of);
    }
}
