
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListReferenceImpl.class)
public interface ShoppingListReference extends Reference, com.commercetools.api.models.Identifiable<ShoppingList> {

    String SHOPPING_LIST = "shopping-list";

    @Valid
    @JsonProperty("obj")
    public ShoppingList getObj();

    public void setObj(final ShoppingList obj);

    public static ShoppingListReference of() {
        return new ShoppingListReferenceImpl();
    }

    public static ShoppingListReference of(final ShoppingListReference template) {
        ShoppingListReferenceImpl instance = new ShoppingListReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ShoppingListReferenceBuilder builder() {
        return ShoppingListReferenceBuilder.of();
    }

    public static ShoppingListReferenceBuilder builder(final ShoppingListReference template) {
        return ShoppingListReferenceBuilder.of(template);
    }

    default <T> T withShoppingListReference(Function<ShoppingListReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListReference>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListReference>";
            }
        };
    }
}
