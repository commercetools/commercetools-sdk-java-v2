
package com.commercetools.api.models.business_unit;

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
 * BusinessUnitSetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomTypeAction businessUnitSetCustomTypeAction = BusinessUnitSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetCustomTypeActionImpl.class)
public interface BusinessUnitSetCustomTypeAction extends BusinessUnitUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static BusinessUnitSetCustomTypeAction of() {
        return new BusinessUnitSetCustomTypeActionImpl();
    }

    public static BusinessUnitSetCustomTypeAction of(final BusinessUnitSetCustomTypeAction template) {
        BusinessUnitSetCustomTypeActionImpl instance = new BusinessUnitSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static BusinessUnitSetCustomTypeActionBuilder builder() {
        return BusinessUnitSetCustomTypeActionBuilder.of();
    }

    public static BusinessUnitSetCustomTypeActionBuilder builder(final BusinessUnitSetCustomTypeAction template) {
        return BusinessUnitSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetCustomTypeAction(Function<BusinessUnitSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetCustomTypeAction>";
            }
        };
    }
}
