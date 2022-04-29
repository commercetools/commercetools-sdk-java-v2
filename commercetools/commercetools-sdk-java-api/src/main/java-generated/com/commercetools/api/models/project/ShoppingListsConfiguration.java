
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListsConfigurationImpl.class)
public interface ShoppingListsConfiguration {

    /**
    *  <p>Default value for the <code>deleteDaysAfterLastModification</code> parameter of the <a href="ctp:api:type:ShoppingListDraft">ShoppingListDraft</a>.
    *  This field may not be present on Projects created before January 2020.</p>
    */

    @JsonProperty("deleteDaysAfterLastModification")
    public Long getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);

    public static ShoppingListsConfiguration of() {
        return new ShoppingListsConfigurationImpl();
    }

    public static ShoppingListsConfiguration of(final ShoppingListsConfiguration template) {
        ShoppingListsConfigurationImpl instance = new ShoppingListsConfigurationImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    public static ShoppingListsConfigurationBuilder builder() {
        return ShoppingListsConfigurationBuilder.of();
    }

    public static ShoppingListsConfigurationBuilder builder(final ShoppingListsConfiguration template) {
        return ShoppingListsConfigurationBuilder.of(template);
    }

    default <T> T withShoppingListsConfiguration(Function<ShoppingListsConfiguration, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListsConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListsConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListsConfiguration>";
            }
        };
    }
}
