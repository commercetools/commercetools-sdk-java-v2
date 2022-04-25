
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionChangeNameActionImpl.class)
public interface ProductSelectionChangeNameAction extends ProductSelectionUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>The new name to be set for the Product Selection.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static ProductSelectionChangeNameAction of() {
        return new ProductSelectionChangeNameActionImpl();
    }

    public static ProductSelectionChangeNameAction of(final ProductSelectionChangeNameAction template) {
        ProductSelectionChangeNameActionImpl instance = new ProductSelectionChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ProductSelectionChangeNameActionBuilder builder() {
        return ProductSelectionChangeNameActionBuilder.of();
    }

    public static ProductSelectionChangeNameActionBuilder builder(final ProductSelectionChangeNameAction template) {
        return ProductSelectionChangeNameActionBuilder.of(template);
    }

    default <T> T withProductSelectionChangeNameAction(Function<ProductSelectionChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionChangeNameAction>";
            }
        };
    }
}
