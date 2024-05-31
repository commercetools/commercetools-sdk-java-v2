
package com.commercetools.api.predicates.expansion.associate_role;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AssociateRoleReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AssociateRoleReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AssociateRoleReferenceExpansionBuilderDsl of() {
        return new AssociateRoleReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static AssociateRoleReferenceExpansionBuilderDsl of(final List<String> path) {
        return new AssociateRoleReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.associate_role.AssociateRoleExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.associate_role.AssociateRoleExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
