
package com.commercetools.api.predicates.expansion.attribute_group;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class AttributeGroupReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private AttributeGroupReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static AttributeGroupReferenceExpansionBuilderDsl of() {
        return new AttributeGroupReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static AttributeGroupReferenceExpansionBuilderDsl of(final List<String> path) {
        return new AttributeGroupReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.attribute_group.AttributeGroupExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.attribute_group.AttributeGroupExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
