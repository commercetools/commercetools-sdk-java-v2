
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeChangeIsSearchableActionImpl.class)
public interface ProductTypeChangeIsSearchableAction extends ProductTypeUpdateAction {

    String CHANGE_IS_SEARCHABLE = "changeIsSearchable";

    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    public void setAttributeName(final String attributeName);

    public void setIsSearchable(final Boolean isSearchable);

    public static ProductTypeChangeIsSearchableAction of() {
        return new ProductTypeChangeIsSearchableActionImpl();
    }

    public static ProductTypeChangeIsSearchableAction of(final ProductTypeChangeIsSearchableAction template) {
        ProductTypeChangeIsSearchableActionImpl instance = new ProductTypeChangeIsSearchableActionImpl();
        instance.setAttributeName(template.getAttributeName());
        instance.setIsSearchable(template.getIsSearchable());
        return instance;
    }

    public static ProductTypeChangeIsSearchableActionBuilder builder() {
        return ProductTypeChangeIsSearchableActionBuilder.of();
    }

    public static ProductTypeChangeIsSearchableActionBuilder builder(
            final ProductTypeChangeIsSearchableAction template) {
        return ProductTypeChangeIsSearchableActionBuilder.of(template);
    }

    default <T> T withProductTypeChangeIsSearchableAction(Function<ProductTypeChangeIsSearchableAction, T> helper) {
        return helper.apply(this);
    }
}
