
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Adding or updating a Custom Type on a Business Unit generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomTypeSetMessage" rel="nofollow">BusinessUnitCustomTypeSet</a> Message, removing one generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomTypeRemovedMessage" rel="nofollow">BusinessUnitCustomTypeRemoved</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetCustomTypeActionImpl.class)
public interface BusinessUnitSetCustomTypeAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the BusinessUnit with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> for the BusinessUnit.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the BusinessUnit with <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFields" rel="nofollow">Custom Fields</a>. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> for the BusinessUnit.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of BusinessUnitSetCustomTypeAction
     */
    public static BusinessUnitSetCustomTypeAction of() {
        return new BusinessUnitSetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetCustomTypeAction of(final BusinessUnitSetCustomTypeAction template) {
        BusinessUnitSetCustomTypeActionImpl instance = new BusinessUnitSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public BusinessUnitSetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetCustomTypeAction deepCopy(@Nullable final BusinessUnitSetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetCustomTypeActionImpl instance = new BusinessUnitSetCustomTypeActionImpl();
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetCustomTypeAction
     * @return builder
     */
    public static BusinessUnitSetCustomTypeActionBuilder builder() {
        return BusinessUnitSetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetCustomTypeActionBuilder builder(final BusinessUnitSetCustomTypeAction template) {
        return BusinessUnitSetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetCustomTypeAction(Function<BusinessUnitSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetCustomTypeAction>";
            }
        };
    }
}
