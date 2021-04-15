
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetExternalIdActionImpl.class)
public interface CategorySetExternalIdAction extends CategoryUpdateAction {

    String SET_EXTERNAL_ID = "setExternalId";

    /**
    *  <p>If not defined, the external ID is unset.</p>
    */

    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static CategorySetExternalIdAction of() {
        return new CategorySetExternalIdActionImpl();
    }

    public static CategorySetExternalIdAction of(final CategorySetExternalIdAction template) {
        CategorySetExternalIdActionImpl instance = new CategorySetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public static CategorySetExternalIdActionBuilder builder() {
        return CategorySetExternalIdActionBuilder.of();
    }

    public static CategorySetExternalIdActionBuilder builder(final CategorySetExternalIdAction template) {
        return CategorySetExternalIdActionBuilder.of(template);
    }

    default <T> T withCategorySetExternalIdAction(Function<CategorySetExternalIdAction, T> helper) {
        return helper.apply(this);
    }
}
