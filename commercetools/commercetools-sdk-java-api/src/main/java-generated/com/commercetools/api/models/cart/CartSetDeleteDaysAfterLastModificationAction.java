
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface CartSetDeleteDaysAfterLastModificationAction extends CartUpdateAction {

    String SET_DELETE_DAYS_AFTER_LAST_MODIFICATION = "setDeleteDaysAfterLastModification";

    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    public static CartSetDeleteDaysAfterLastModificationAction of() {
        return new CartSetDeleteDaysAfterLastModificationActionImpl();
    }

    public static CartSetDeleteDaysAfterLastModificationAction of(
            final CartSetDeleteDaysAfterLastModificationAction template) {
        CartSetDeleteDaysAfterLastModificationActionImpl instance = new CartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static CartSetDeleteDaysAfterLastModificationActionBuilder builder() {
        return CartSetDeleteDaysAfterLastModificationActionBuilder.of();
    }

    public static CartSetDeleteDaysAfterLastModificationActionBuilder builder(
            final CartSetDeleteDaysAfterLastModificationAction template) {
        return CartSetDeleteDaysAfterLastModificationActionBuilder.of(template);
    }

    default <T> T withCartSetDeleteDaysAfterLastModificationAction(
            Function<CartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDeleteDaysAfterLastModificationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDeleteDaysAfterLastModificationAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDeleteDaysAfterLastModificationAction>";
            }
        };
    }
}
