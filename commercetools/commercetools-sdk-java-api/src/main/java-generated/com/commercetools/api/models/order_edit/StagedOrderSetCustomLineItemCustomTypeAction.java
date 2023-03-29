
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomLineItemCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomLineItemCustomTypeAction stagedOrderSetCustomLineItemCustomTypeAction = StagedOrderSetCustomLineItemCustomTypeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomLineItemCustomTypeActionImpl.class)
public interface StagedOrderSetCustomLineItemCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomLineItemCustomTypeAction
     */
    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = "setCustomLineItemCustomType";

    /**
     *
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set customLineItemId
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomLineItemCustomTypeAction
     */
    public static StagedOrderSetCustomLineItemCustomTypeAction of() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomLineItemCustomTypeAction of(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        StagedOrderSetCustomLineItemCustomTypeActionImpl instance = new StagedOrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetCustomLineItemCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomLineItemCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetCustomLineItemCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomLineItemCustomTypeActionImpl instance = new StagedOrderSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomLineItemCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder builder() {
        return StagedOrderSetCustomLineItemCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomLineItemCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder builder(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        return StagedOrderSetCustomLineItemCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomLineItemCustomTypeAction(
            Function<StagedOrderSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomLineItemCustomTypeAction>";
            }
        };
    }
}
