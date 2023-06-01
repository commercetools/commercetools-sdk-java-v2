package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class DiscountCodeUpdateActionQueryBuilderDsl  {
    public DiscountCodeUpdateActionQueryBuilderDsl() {
    }

    public static DiscountCodeUpdateActionQueryBuilderDsl of() {
        return new DiscountCodeUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, DiscountCodeUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asChangeCartDiscounts(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeCartDiscountsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeCartDiscountsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeCartDiscountsActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asChangeGroups(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeGroupsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeGroupsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeGroupsActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asChangeIsActive(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeIsActiveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeIsActiveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeChangeIsActiveActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetCartPredicate(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCartPredicateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCartPredicateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCartPredicateActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomFieldActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetCustomTypeActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetDescription(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetDescriptionActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetMaxApplications(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetMaxApplicationsPerCustomer(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetName(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetNameActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetValidFrom(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetValidFromAndUntil(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidFromAndUntilActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<DiscountCodeUpdateActionQueryBuilderDsl> asSetValidUntil(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeSetValidUntilActionQueryBuilderDsl.of()),
            DiscountCodeUpdateActionQueryBuilderDsl::of);
    }
}
