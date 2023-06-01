package com.commercetools.api.predicates.query.associate_role;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssociateRoleUpdateActionQueryBuilderDsl  {
    public AssociateRoleUpdateActionQueryBuilderDsl() {
    }

    public static AssociateRoleUpdateActionQueryBuilderDsl of() {
        return new AssociateRoleUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AssociateRoleUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, AssociateRoleUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asAddPermission(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleAddPermissionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleAddPermissionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleAddPermissionActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asChangeBuyerAssignable(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleChangeBuyerAssignableActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asRemovePermission(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleRemovePermissionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleRemovePermissionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleRemovePermissionActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomFieldActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleSetCustomTypeActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asSetName(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleSetNameActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<AssociateRoleUpdateActionQueryBuilderDsl> asSetPermissions(
        Function<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetPermissionsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.associate_role.AssociateRoleSetPermissionsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.associate_role.AssociateRoleSetPermissionsActionQueryBuilderDsl.of()),
            AssociateRoleUpdateActionQueryBuilderDsl::of);
    }
}
