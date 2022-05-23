
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductSelectionSetCustomTypeAction productSelectionSetCustomTypeAction = ProductSelectionSetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetCustomTypeActionImpl.class)
public interface ProductSelectionSetCustomTypeAction extends ProductSelectionUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the ProductSelection with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ProductSelection.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the ProductSelection.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static ProductSelectionSetCustomTypeAction of() {
        return new ProductSelectionSetCustomTypeActionImpl();
    }

    public static ProductSelectionSetCustomTypeAction of(final ProductSelectionSetCustomTypeAction template) {
        ProductSelectionSetCustomTypeActionImpl instance = new ProductSelectionSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ProductSelectionSetCustomTypeActionBuilder builder() {
        return ProductSelectionSetCustomTypeActionBuilder.of();
    }

    public static ProductSelectionSetCustomTypeActionBuilder builder(
            final ProductSelectionSetCustomTypeAction template) {
        return ProductSelectionSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withProductSelectionSetCustomTypeAction(Function<ProductSelectionSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetCustomTypeAction>";
            }
        };
    }
}
