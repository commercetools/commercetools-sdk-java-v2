package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeRemoveAttributeDefinitionActionImpl.class)
public interface ProductTypeRemoveAttributeDefinitionAction extends ProductTypeUpdateAction {

    /**
    *  <p>The name of the attribute to remove.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ProductTypeRemoveAttributeDefinitionActionImpl of(){
        return new ProductTypeRemoveAttributeDefinitionActionImpl();
    }
    

    public static ProductTypeRemoveAttributeDefinitionActionImpl of(final ProductTypeRemoveAttributeDefinitionAction template) {
        ProductTypeRemoveAttributeDefinitionActionImpl instance = new ProductTypeRemoveAttributeDefinitionActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    default <T extends Accessor<ProductTypeRemoveAttributeDefinitionAction>> T withProductTypeRemoveAttributeDefinitionAction(Function<ProductTypeRemoveAttributeDefinitionAction, T> helper) {
        return helper.apply(this);
    }
}
