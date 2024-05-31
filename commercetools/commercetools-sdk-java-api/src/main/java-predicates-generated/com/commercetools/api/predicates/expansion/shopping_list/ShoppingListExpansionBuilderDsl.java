
package com.commercetools.api.predicates.expansion.shopping_list;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ShoppingListExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ShoppingListExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ShoppingListExpansionBuilderDsl of() {
        return new ShoppingListExpansionBuilderDsl(Collections.emptyList());
    }

    public static ShoppingListExpansionBuilderDsl of(final List<String> path) {
        return new ShoppingListExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl customer() {
        return com.commercetools.api.predicates.expansion.customer.CustomerReferenceExpansionBuilderDsl
                .of(appendOne(path, "customer"));
    }

    public com.commercetools.api.predicates.expansion.shopping_list.ShoppingListLineItemExpansionBuilderDsl lineItems() {
        return com.commercetools.api.predicates.expansion.shopping_list.ShoppingListLineItemExpansionBuilderDsl
                .of(appendOne(path, "lineItems[*]"));
    }

    public com.commercetools.api.predicates.expansion.shopping_list.ShoppingListLineItemExpansionBuilderDsl lineItems(
            long index) {
        return com.commercetools.api.predicates.expansion.shopping_list.ShoppingListLineItemExpansionBuilderDsl
                .of(appendOne(path, "lineItems[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.shopping_list.TextLineItemExpansionBuilderDsl textLineItems() {
        return com.commercetools.api.predicates.expansion.shopping_list.TextLineItemExpansionBuilderDsl
                .of(appendOne(path, "textLineItems[*]"));
    }

    public com.commercetools.api.predicates.expansion.shopping_list.TextLineItemExpansionBuilderDsl textLineItems(
            long index) {
        return com.commercetools.api.predicates.expansion.shopping_list.TextLineItemExpansionBuilderDsl
                .of(appendOne(path, "textLineItems[" + index + "]"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }
}
