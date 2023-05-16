
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitUpdateActionQueryBuilderDsl {
    public MyBusinessUnitUpdateActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitUpdateActionQueryBuilderDsl of() {
        return new MyBusinessUnitUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asAddAddress(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitAddAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitAddAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitAddAddressActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asAddBillingAddressId(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyBusinessUnitAddBillingAddressIdActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asAddShippingAddressId(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyBusinessUnitAddShippingAddressIdActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asChangeAddress(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAddressActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asChangeAssociate(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAssociateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAssociateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitChangeAssociateActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitChangeNameActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asChangeParentUnit(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeParentUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitChangeParentUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyBusinessUnitChangeParentUnitActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asRemoveAddress(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAddressActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asRemoveAssociate(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAssociateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAssociateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveAssociateActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asRemoveBillingAddressId(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveBillingAddressIdActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asRemoveShippingAddressId(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyBusinessUnitRemoveShippingAddressIdActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetAddressCustomField(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomFieldActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetAddressCustomType(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.me.MyBusinessUnitSetAddressCustomTypeActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetContactEmail(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetContactEmailActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetContactEmailActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitSetContactEmailActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomFieldActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.me.MyBusinessUnitSetCustomTypeActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetDefaultBillingAddress(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultBillingAddressActionQueryBuilderDsl.of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyBusinessUnitUpdateActionQueryBuilderDsl> asSetDefaultShippingAddress(
            Function<com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.me.MyBusinessUnitSetDefaultShippingAddressActionQueryBuilderDsl
                    .of()),
            MyBusinessUnitUpdateActionQueryBuilderDsl::of);
    }
}
