
package com.commercetools.api.predicates.expansion.shopping_list;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class TextLineItemExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private TextLineItemExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static TextLineItemExpansionBuilderDsl of() {
        return new TextLineItemExpansionBuilderDsl(Collections.emptyList());
    }

    public static TextLineItemExpansionBuilderDsl of(final List<String> path) {
        return new TextLineItemExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
