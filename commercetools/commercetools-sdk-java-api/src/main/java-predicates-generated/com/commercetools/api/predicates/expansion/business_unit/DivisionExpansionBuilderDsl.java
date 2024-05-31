
package com.commercetools.api.predicates.expansion.business_unit;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class DivisionExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private DivisionExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static DivisionExpansionBuilderDsl of() {
        return new DivisionExpansionBuilderDsl(Collections.emptyList());
    }

    public static DivisionExpansionBuilderDsl of(final List<String> path) {
        return new DivisionExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.business_unit.AssociateExpansionBuilderDsl associates() {
        return com.commercetools.api.predicates.expansion.business_unit.AssociateExpansionBuilderDsl
                .of(appendOne(path, "associates[*]"));
    }

    public com.commercetools.api.predicates.expansion.business_unit.AssociateExpansionBuilderDsl associates(
            long index) {
        return com.commercetools.api.predicates.expansion.business_unit.AssociateExpansionBuilderDsl
                .of(appendOne(path, "associates[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.business_unit.InheritedAssociateExpansionBuilderDsl inheritedAssociates() {
        return com.commercetools.api.predicates.expansion.business_unit.InheritedAssociateExpansionBuilderDsl
                .of(appendOne(path, "inheritedAssociates[*]"));
    }

    public com.commercetools.api.predicates.expansion.business_unit.InheritedAssociateExpansionBuilderDsl inheritedAssociates(
            long index) {
        return com.commercetools.api.predicates.expansion.business_unit.InheritedAssociateExpansionBuilderDsl
                .of(appendOne(path, "inheritedAssociates[" + index + "]"));
    }
}
