
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAttributeInAllVariantsActionImpl.class)
public interface ProductSetAttributeInAllVariantsAction extends ProductUpdateAction {

    String SET_ATTRIBUTE_IN_ALL_VARIANTS = "setAttributeInAllVariants";

    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>The same update behavior as for Set Attribute applies.</p>
    */

    @JsonProperty("value")
    public Object getValue();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setName(final String name);

    public void setValue(final Object value);

    public void setStaged(final Boolean staged);

    public static ProductSetAttributeInAllVariantsAction of() {
        return new ProductSetAttributeInAllVariantsActionImpl();
    }

    public static ProductSetAttributeInAllVariantsAction of(final ProductSetAttributeInAllVariantsAction template) {
        ProductSetAttributeInAllVariantsActionImpl instance = new ProductSetAttributeInAllVariantsActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetAttributeInAllVariantsActionBuilder builder() {
        return ProductSetAttributeInAllVariantsActionBuilder.of();
    }

    public static ProductSetAttributeInAllVariantsActionBuilder builder(
            final ProductSetAttributeInAllVariantsAction template) {
        return ProductSetAttributeInAllVariantsActionBuilder.of(template);
    }

    default <T> T withProductSetAttributeInAllVariantsAction(
            Function<ProductSetAttributeInAllVariantsAction, T> helper) {
        return helper.apply(this);
    }
}
